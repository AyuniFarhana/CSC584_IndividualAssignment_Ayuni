import model.ProfileBean;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/viewProfilesServlet")

public class viewProfilesServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        ArrayList<ProfileBean> profileList =
                new ArrayList<>();
        String keyword =
        request.getParameter("keyword");

        String sql;

if(keyword != null &&
   !keyword.trim().isEmpty()) {

    sql =
  "SELECT * FROM Profile " +
  "WHERE UPPER(studentid) LIKE UPPER(?) " +
  "OR UPPER(name) LIKE UPPER(?)";

} else {

    sql = "SELECT * FROM Profile";
}

        try(Connection conn =
        DBConnection.getConnection();

    PreparedStatement ps =
            conn.prepareStatement(sql)) {

    if(keyword != null &&
       !keyword.trim().isEmpty()) {

        ps.setString(1,
                "%" + keyword + "%");

        ps.setString(2,
                "%" + keyword + "%");
    }

    ResultSet rs = ps.executeQuery();

            while(rs.next()) {

                ProfileBean bean =
                        new ProfileBean();

                bean.setStudentid(
                        rs.getString("studentid"));

                bean.setName(
                        rs.getString("name"));

                bean.setProgram(
                        rs.getString("program"));

                bean.setEmail(
                        rs.getString("email"));

                bean.setHobbies(
                        rs.getString("hobbies"));

                bean.setIntro(
                        rs.getString("intro"));

                profileList.add(bean);
            }

        } catch(SQLException e) {

            throw new ServletException(
                    "Unable to retrieve profiles: "
                    + e.getMessage(), e);
        }

        request.setAttribute(
                "profileList",
                profileList);

        request.getRequestDispatcher(
                "viewProfiles.jsp")
                .forward(request, response);
    }
}