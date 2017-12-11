
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="Header.jsp" %>
<%@page import="java.sql.*" %>


       <table width="450" class="table table-hover "> 
        <tr>
        <td>RollNo:</td>
        <td>Name:</td>
        <td>Gender:</td>
        <td>City:</td>
       </tr>
      
<%
    try
      {
         Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        Connection con=DriverManager.getConnection("jdbc:sqlserver://ARPANHANJRA\\ARPANHANJRA:50105;databaseName=SpicExample;userName=sa;password=arpan");
         Statement st=con.createStatement();
         ResultSet rs=st.executeQuery("Select * from Students");
         while(rs.next())
         {
             %>
               <tr>
                   <td><%=rs.getInt("RollNo") %></td>
                   <td><%=rs.getString("Name") %></td>
                    <td><%=rs.getString("Gender") %></td>
                     <td><%=rs.getString("City") %></td>
             </tr>
             
             <%
             
         }
     }
      catch(Exception ex)
      {
      System.out.println(ex);
      }
   %>
</table>
<%@include file="footer_1.html" %>