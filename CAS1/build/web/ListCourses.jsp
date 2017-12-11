
<%@include file="Header.jsp" %>

<%@page import="datalayer.DALCourse"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script type="text/javascript" src="script.js"></script>
        
    </head>
    <body>
        <%
             datalayer.DALCourse objDAL=new DALCourse();
             ArrayList<beans.Course> AC=objDAL.getCourses();
                     
         %>
             
                <table width="450" class="table table-hover"> 
               <tr>
                 <th>NAME</th>
                 <th>FEE</th>
                 <th> DURATION</th>
                 <th></th>
                </tr>    
             
             <%
                        String s="";
                     for(beans.Course c:AC)
                 {   
                        %>
       
                    
               <tr>
                      
                    <td><%=c.getCourseName()%></td>
                    <td><%=c.getFee()%></td>
                    <td><%=c.getDuration()%></td>
                    <td><a href="CourseServlet?DCID=<%=c.getCourseId()%>" onclick="return deleteConfirmation('DO YOU WANT TO DELETE SELECTED COURSE?')"></a></td>
                      
                            
                 
                  </tr>
         <%}%>
         </table>
    </body>
</html>
