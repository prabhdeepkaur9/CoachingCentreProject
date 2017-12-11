<%@include file="Header_1.jsp" %>

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
             String x="";
             String y="";
             String name="";
            
            if(request.getParameter("btn1")!=null)
             {
                x=request.getParameter("txt1");
                y=request.getParameter("password");
            
               if(x.equals("spic") && y.equals("edc"))
               {
                name="Login Successsfuly";
                response.sendRedirect("AddCourse.jsp");
                session.setAttribute("pwd", y);
               }   
                else
               {
                name="Login failed";
               }
            
                     
            }
            %>
            
            
  
        
        <div id="main">
            <div id="title"><center>
                   <center></div>
            <div id="table1">
                <form  method="post">
                <table align="center">
                    <tr>
                       
                        <th style="width:130px"> UserId:</th> 
                        <td><input type="text" name="txt1" placeholder="Enter the LoginId" class="form-control"><br></td>
                      </tr>
                      <tr>
                        <th style="width:130px">
                            Password:  </th>
                        <td><input type="password" name="password" placeholder="Enter the Password" class="form-control"><br></td>
                        </tr>
               
                            
                        <tr>
                            <td > <input type="submit" name="btn1" class="btn btn-info"></td><br>
                        </tr>
                </table> 
                
                <%=name%>
                
                </form>
                
                
            </div>
    </div>
        
    <%@include file="footer_1.html" %>