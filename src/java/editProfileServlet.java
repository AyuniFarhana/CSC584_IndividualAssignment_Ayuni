import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.ProfileBean;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/editProfileServlet")
public class editProfileServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        String studentid = request.getParameter("studentid");

        ProfileBean bean = null;

        String sql = "SELECT * FROM Profile WHERE studentid=?";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, studentid);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                bean = new ProfileBean(
                        rs.getString("studentid"),
                        rs.getString("name"),
                        rs.getString("program"),
                        rs.getString("email"),
                        rs.getString("hobbies"),
                        rs.getString("intro")
                );
            }

        } catch (SQLException e) {
            throw new ServletException("Error loading data", e);
        }

        request.setAttribute("profile", bean);
        request.getRequestDispatcher("editProfile.jsp")
                .forward(request, response);
    }
}