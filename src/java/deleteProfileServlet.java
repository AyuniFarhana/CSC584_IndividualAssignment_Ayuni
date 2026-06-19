import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/deleteProfileServlet")
public class deleteProfileServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        String studentid =
                request.getParameter("studentid");

        String sql =
                "DELETE FROM Profile WHERE studentid=?";

        try (Connection conn =
                DBConnection.getConnection();

             PreparedStatement ps =
                conn.prepareStatement(sql)) {

            ps.setString(1, studentid);

            ps.executeUpdate();

        } catch (SQLException e) {

            throw new ServletException(
                    "Delete failed: "
                    + e.getMessage(), e);
        }

        response.sendRedirect("viewProfilesServlet");
    }
}