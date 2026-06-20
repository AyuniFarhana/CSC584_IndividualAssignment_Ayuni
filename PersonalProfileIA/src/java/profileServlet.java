import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import model.ProfileBean;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/profileServlet")

public class profileServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        
        //Processing the submitted HTTP POST data by retrieving parameters
        String studentid = request.getParameter("studentid");
        String name = request.getParameter("name");
        String program = request.getParameter("program");
        String email = request.getParameter("email");
        String hobbies = request.getParameter("hobbies");
        String intro = request.getParameter("intro");
        
        //Create ProfileBean object
        ProfileBean bean = new ProfileBean(studentid, name, program, email, hobbies, intro);
        String sql = "INSERT INTO Profile (studentid, name, program, email, hobbies, intro)" + "VALUES (?,?,?,?,?,?)";
        
        try(Connection conn=DBConnection.getConnection();
            PreparedStatement ps=conn.prepareStatement(sql)){
              ps.setString(1, studentid);
              ps.setString(2, name);
              ps.setString(3, program);
              ps.setString(4, email);
              ps.setString(5, hobbies);
              ps.setString(6, intro);
              ps.executeUpdate();
        } catch (SQLException e) {

    // Derby duplicate key error code
    if (e.getSQLState().equals("23505")) {

        response.sendRedirect(
                "userInformation.html?error=duplicate"
        );

        return;
    }

    throw new ServletException(
            "Database insert failed: " + e.getMessage(), e);
}
        // Retrieve inserted data
        String selectSql =
                "SELECT * FROM Profile " +
                "WHERE studentid = ?";

        try(Connection conn =
                    DBConnection.getConnection();

            PreparedStatement ps =
                    conn.prepareStatement(selectSql)) {

            ps.setString(1, studentid);

            ResultSet rs = ps.executeQuery();

            if(rs.next()) {

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

            throw new ServletException(
                    "Database retrieve failed: "
                    + e.getMessage(), e);
        }
        
        //forwarding the processed data to the JSP page for display
        request.setAttribute("profile",bean);
        request.getRequestDispatcher("profile.jsp")
                .forward(request, response);
    }
}