<%@include file="Header.jsp" %>
<%@page import="datalayer.DALCourse"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script>
            f1()
            {
                
                var flag=true;
                var a=document.getElementById("txtName");
                var msg=document.getElementById("msg1");
                
                if(a.value.length==0)
                {
                    
                    flag=false;
                    msg.innerHTML="Enter name";
                    
                    
                }
                
               return flag; 
            }
            
            
        </script>
        <title>JSP Page</title>
    </head>
    <body>
        <form action="StudentServlet" method="post">
            <table>
                <tr>
                    <td style="width:130px" >Student Name</td>
                    <td><input type="text" name="txtName" id="txtName" class="form-control"></td>
                    <td><span id="msg1"></span></td>
                </tr>
                <tr>
                    <td  style="width:130px" >Gender</td>
                    <td><input type="radio" name="rbtGender" value="Male"  class="btn-group-xs">MALE</td>
                    <td>   <input type="radio" name="rbtGender" value="Female" class="btn-group-xs">FEMALE
                </tr>
                
                <tr>
                    <td style="width:130px"  >City</td>
                    <td>
                        
                        <select name="ddlCourses">
                            
            <%
                datalayer.DALCourse objDAL=new DALCourse();
                ArrayList<beans.Course> AC=objDAL.getCourses();
                
                for(beans.Course c: AC)
                {
                    %>
                    <option value="<%=c.getCourseId()%>"><%=c.getCourseName()%></option>
                    
                    
               <% }%>
              </select>
                  </td>       
                   </tr>
                   <tr>
                       <td>
                           
                           <input type="submit" name="btnSave" value="Save"  class="btn-success" onclick="return f1()"> 
                       </td>
                       
                       
                   </tr>  
                        
            </table>
            
        </form>
    </body>
</html>
