<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="com.royal.bean.StudentBean"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Student Records</title>

    <!-- Bootstrap 5 CDN -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>
        body {
            background-color: #f8f9fa;
        }
        .table thead th {
            background-color: #343a40;
            color: #fff;
            vertical-align: middle;
            text-align: center;
        }
        .table tbody td {
            vertical-align: middle;
        }
        .action-btns a {
            margin-right: 5px;
        }
    </style>
</head>

<body>

<div class="container-fluid mt-4">
    <div class="card shadow">
        <div class="card-header bg-dark text-white">
            <h4 class="mb-0">📋 Student Records</h4>
        </div>

        <div class="card-body">
            <div class="table-responsive">
                <table class="table table-bordered table-hover align-middle text-center">
                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>Full Name</th>
                            <th>Age</th>
                            <th>Course</th>
                            <th>Gender</th>
                            <th>Hobbies</th>
                            <th>DOB</th>
                            <th>Email</th>
                            <th>Mobile</th>
                            <th>Address</th>
                            <th>Action</th>
                        </tr>
                    </thead>
                    <tbody>

                    <%
                        ArrayList<StudentBean> list =
                                (ArrayList<StudentBean>) request.getAttribute("list");

                        if (list != null && !list.isEmpty()) {
                            for (StudentBean s : list) {
                    %>
                        <tr>
                            <td><%= s.getId() %></td>
                            <td><%= s.getFullName() %></td>
                            <td><%= s.getAge() %></td>
                            <td><%= s.getCourse() %></td>
                            <td><%= s.getGender() %></td>
                            <td><%= s.getHobbieStr() %></td>
                            <td><%= s.getDob() %></td>
                            <td><%= s.getEmail() %></td>
                            <td><%= s.getMobile() %></td>
                            <td><%= s.getAddress() %></td>
                            <td class="action-btns">
                                <a href="editStudent?id=<%=s.getId()%>" class="btn btn-sm btn-warning">
                                    Edit
                                </a>
                                <a href="deleteStudent?id=<%=s.getId()%>"
                                   class="btn btn-sm btn-danger"
                                   onclick="return confirm('Are you sure you want to delete this record?');">
                                    Delete
                                </a>
                            </td>
                        </tr>
                    <%
                            }
                        } else {
                    %>
                        <tr>
                            <td colspan="11" class="text-muted">
                                No student records found.
                            </td>
                        </tr>
                    <%
                        }
                    %>

                    </tbody>
                </table>
            </div>
        </div>
    </div>
</div>

</body>
</html>
