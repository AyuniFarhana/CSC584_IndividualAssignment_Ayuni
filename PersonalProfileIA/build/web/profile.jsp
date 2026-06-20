<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.ProfileBean"%>
<%
    ProfileBean profile = (ProfileBean) request.getAttribute("profile");
%>

<!DOCTYPE html>
<html>

<head>
    <title>Personal Profile Information</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
          rel="stylesheet">

    <style>
        body{
            background-color: #f3e8ff;
            font-family: Arial, sans-serif;
        }
        .card{
            width: 75%;
            margin: auto;
            border-radius: 20px;
        }
        h2{
            color: #2c3e50;
        }
        th{
            width: 25%;
        }
    </style>
</head>
<body>
    <div class="container mt-5">
        <div class="card shadow-lg p-4">
            <h2 class="text-center mb-4">
            Personal Profile Information
            </h2>
            <table class="table table-bordered">
                <tr>
                    <th>Student ID</th>
                    <td><%= profile.getStudentid() %></td>
                </tr>
                <tr>
                    <th>Name</th>
                    <td><%= profile.getName() %></td>
                </tr>
                <tr>
                    <th>Program</th>
                    <td><%= profile.getProgram() %></td>
                </tr>
                <tr>
                    <th>Email</th>
                    <td><%= profile.getEmail() %></td>
                </tr>
                <tr>
                    <th>Hobbies</th>
                    <td><%= profile.getHobbies() %></td>
                </tr>
                <tr>
                    <th>Introduction</th>
                    <td><%= profile.getIntro() %></td>
                </tr>
            </table>
        </div>
      <div style="text-align:center; margin-top:20px;">
           <a href="userInformation.html"
            style="
              padding:10px 20px;
              background:#8b5cf6;
              color:white;
              text-decoration:none;
              border-radius:8px;
              display:inline-block;">
               Add Another User
           </a>

           <a href="index.html"
             style="
              padding:10px 20px;
              background:#8b5cf6;
              color:white;
              text-decoration:none;
              border-radius:8px;
              display:inline-block;">
               Back to Home
           </a>
          
          <a href="viewProfilesServlet"
             style="
              padding:10px 20px;
              background:#8b5cf6;
              color:white;
              text-decoration:none;
              border-radius:8px;
              display:inline-block;">
               View All Profiles
          </a>
      </div>
    </div>
</body>
</html>