import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/updateProfileServlet")
public class updateProfileServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        String studentid = request.getParameter("studentid");
        String name = request.getParameter("name");
        String program = request.getParameter("program");
        String email = request.getParameter("email");
        String hobbies = request.getParameter("hobbies");
        String intro = request.getParameter("intro");

        String sql =
            "UPDATE Profile SET name=?, program=?, email=?, hobbies=?, intro=? " +
            "WHERE studentid=?";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, name);
            ps.setString(2, program);
            ps.setString(3, email);
            ps.setString(4, hobbies);
            ps.setString(5, intro);
            ps.setString(6, studentid);

            ps.executeUpdate();

        } catch (SQLException e) {
            throw new ServletException("Update failed", e);
        }

        response.sendRedirect("viewProfilesServlet");
    }
}