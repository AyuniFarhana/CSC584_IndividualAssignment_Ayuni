<%-- 
    Document   : viewProfiles
    Created on : Jun 16, 2026, 9:39:55 PM
    Author     : user
--%>

<%@page contentType="text/html"
        pageEncoding="UTF-8"%>

<%@page import="java.util.ArrayList"%>
<%@page import="model.ProfileBean"%>

<%
    ArrayList<ProfileBean> profileList =
    (ArrayList<ProfileBean>)
    request.getAttribute("profileList");
%>

<!DOCTYPE html>
<html>
  <head>
    <title>All Student Profiles</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
          rel="stylesheet">
    <style>

        body{
            background-color: #f3e8ff;
            font-family: Arial, sans-serif;
        }
        .container-box{
            background: white;
            padding: 30px;
            border-radius: 20px;
            box-shadow: 0 0 15px rgba(0,0,0,0.1);
        }
        h2{
            color: #6d28d9;
        }
    </style>

  </head>
  <body>
    <div class="container mt-5">
      <div class="container-box">
          <h2 class="text-center mb-4">
              Student Profile List
          </h2>
  
<!-- SEARCH FORM START -->
<form action="viewProfilesServlet"
      method="get"
      class="mb-4">

    <div class="row">

        <div class="col-md-8">

            <input type="text"
                   name="keyword"
                   class="form-control"
                   placeholder="Search by Student ID or Name">

        </div>

        <div class="col-md-4">

            <button type="submit"
                    style="
                        padding:8px 20px;
                        background:#8b5cf6;
                        color:white;
                        border:none;
                        border-radius:6px;">
                Search
            </button>

        </div>

    </div>

</form>
<!-- SEARCH FORM END -->

<table class="table table-bordered table-hover">
          <table class="table table-bordered table-hover">
              <thead class="table-dark">
                  <tr>
                      <th>Student ID</th>
                      <th>Name</th>
                      <th>Program</th>
                      <th>Email</th>
                      <th>Hobbies</th>
                      <th>Introduction</th>
                      <th>Action</th>
                  </tr>

              </thead>
              <tbody>
              <%
                if(profileList != null){
                for(ProfileBean profile : profileList){
              %>
                <tr>
                    <td>
                        <%= profile.getStudentid() %>
                    </td>

                    <td>
                        <%= profile.getName() %>
                    </td>

                    <td>
                        <%= profile.getProgram() %>
                    </td>

                    <td>
                        <%= profile.getEmail() %>
                    </td>

                    <td>
                        <%= profile.getHobbies() %>
                    </td>

                    <td>
                        <%= profile.getIntro() %>
                    </td>
                    
                    <td>
                        <a href="editProfileServlet?studentid=<%= profile.getStudentid() %>"
                           style="
                              width:80px;
                              padding:6px 12px;
                              background:#8b5cf6;
                              color:white;
                              text-decoration:none;
                              border-radius:6px;
                              display:inline-block;">
                            Edit
                        </a>
                           <br><br>
                        <a href="deleteProfileServlet?studentid=<%= profile.getStudentid() %>"
                           onclick="return confirm('Are you sure you want to delete this profile?')"
                           style="
                             width:80px;
                             padding:6px 12px;
                             background:#39254D;
                             color:white;
                             text-decoration:none;
                             border-radius:6px;
                             display:inline-block;">
                           Delete
                        </a>
                    </td>
                </tr>
            <%
                }
            }
            %>
            </tbody>
        </table>
        <div class="text-center mt-4">
            <a href="userInformation.html"
               class="btn btn-primary">
               Add New Profile
            </a>

            <a href="index.html"
               class="btn btn-secondary">
               Back Home
            </a>
        </div>
      </div>
   </div>
  </body>
</html>