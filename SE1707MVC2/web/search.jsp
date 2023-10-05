<%-- 
    Document   : search
    Created on : Oct 5, 2023, 7:17:39 AM
    Author     : Kami
--%>

<%@page import="registration.RegistrationDTO" %>
<%@page import="java.util.List" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Search</title>
    </head>
    <body>
        <h1>Search Page</h1>
        <form action="DispatchServlet">
            Search Value <input type="text" name="txtSearchValue" 
                                value="<%= request.getParameter("txtSearchValue") %>" /><br/>
            <input type="submit" value="Search" name="btAction" />
        </form><br/>
        <%
            String searchValue = request.getParameter("txtSearchValue");
            if (searchValue != null) {//first times
                List<RegistrationDTO> result = 
                        (List<RegistrationDTO>)request.getAttribute("SEARCH_RESULT");
                //render
                if (result != null) {//has one more records
                    %>
                    <table border="1">
                        <thead>
                            <tr>
                                <th>No.</th>
                                <th>Username</th>
                                <th>Password</th>
                                <th>Full name</th>
                                <th>Role</th>
                            </tr>
                        </thead>
                        <tbody>
                            <%
                                int count = 0;
                                for (RegistrationDTO dto : result) {
                                    %>
                            <tr>
                                <td>
                                    <%= ++count %>
                                </td>
                                <td>
                                    <%= dto.getUsername() %>
                                </td>
                                <td>
                                    <%= dto.getPassword() %>
                                </td>
                                <td>
                                    <%= dto.getFullname() %>
                                </td>
                                <td>
                                    <%= dto.isRole() %>
                                </td>
                            </tr>
                            <%
                                }//end traverse DTO
                            %>
                        </tbody>
                    </table>

        <%
                } else {//no record
                    %>
                    <h2>
                        No record is matched!!!
                    </h2>
        <%
                }
            }//end search Value has valid value
        %>
    </body>
</html>
