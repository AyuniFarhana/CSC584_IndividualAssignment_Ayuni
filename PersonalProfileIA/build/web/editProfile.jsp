<%-- 
    Document   : editProfile
    Created on : Jun 16, 2026, 11:09:32 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.ProfileBean"%>

<%
ProfileBean p = (ProfileBean) request.getAttribute("profile");
%>

<!DOCTYPE html>
<html>
<head>
    <title>Edit Profile</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
          rel="stylesheet">

    <style>
        body{
            background-color:#f3e8ff;
            font-family: Arial;
        }

        .box{
            width: 60%;
            margin: auto;
            background:white;
            padding:30px;
            margin-top:50px;
            border-radius:20px;
            box-shadow:0 0 10px rgba(0,0,0,0.1);
        }
    </style>
</head>

<body>

<div class="box">

    <h3 class="text-center mb-4">Edit Profile</h3>

    <form action="updateProfileServlet" method="post">

        <input type="hidden" name="studentid"
               value="<%= p.getStudentid() %>">

        <div class="mb-3">
            Name:
            <input type="text" name="name"
                   value="<%= p.getName() %>"
                   class="form-control">
        </div>

        <div class="mb-3">
            Program:
            <input type="text" name="program"
                   value="<%= p.getProgram() %>"
                   class="form-control">
        </div>

        <div class="mb-3">
            Email:
            <input type="text" name="email"
                   value="<%= p.getEmail() %>"
                   class="form-control">
        </div>

        <div class="mb-3">
            Hobbies:
            <input type="text" name="hobbies"
                   value="<%= p.getHobbies() %>"
                   class="form-control">
        </div>

        <div class="mb-3">
            Introduction:
            <input type="text" name="intro"
                   value="<%= p.getIntro() %>"
                   class="form-control">
        </div>

        <button type="submit"
                class="btn btn-success"
                style="background:#8b5cf6; color:white; border:none;">
            Update
        </button>

        <a href="viewProfilesServlet"
           class="btn btn-secondary">
            Cancel
        </a>

    </form>

</div>

</body>
</html>