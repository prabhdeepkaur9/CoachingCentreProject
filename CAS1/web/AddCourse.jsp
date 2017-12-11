

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="Header.jsp" %>
<%@page import="datalayer.eStatus" %>
<!DOCTYPE html>


<%
    session.getAttribute("pwd");
    String cnm="",fee="";
    String rbt1="checked",rbt2="";
    
    String msg="";
    
    if(request.getAttribute("flag")!=null)
    {
       datalayer.eStatus ret=(datalayer.eStatus)request.getAttribute("flag");
       
    if(ret==eStatus.Duplicate)
    {
      msg="CourseName Duplicate" ;
     cnm=request.getParameter("txtCourseName");
     fee=request.getParameter("txtFee");
    
       if(request.getParameter("rbtDuration").equals("6 weeks"))
       {
           rbt1="Checked";
           rbt2="";
         
       }  

       else
       {   
          rbt1="";
         rbt2="Checked";

        }
       
    }
    
    else if(ret==eStatus.Succeeded)
     {

            msg="Record Saved Successfully";

       }   
        
           
}
               
 %>       
    
    
    
    
    
    
    



    
        <form action="CourseServlet" method="post">
            <table>
                <tr>
                    
                    <td style="width:130px">Course Name</td>
                    <td><input type="text" name="txtCourseName" class="form-control" > </td>
                    
                </tr>
                <tr>
                       <td style="width:130px">Fee</td>
                         <td>
                         <input type="number" name="txtFee" class="form-control" >
                    </td>
                   </tr>
                
                <tr>
                       <td style="width:130px">Duration</td>
                         <td>
                             <input type="radio" name="rbtDuration" value="6 WEEKS" class="btn-group-xs">6 Weeks
                              <input type="radio" name="rbtDuration" value="6 MONTHS" class="btn-group-xs">6 Months
                    </td>
                   </tr>
                <tr>
                       <td></td>
                         <td>
                             <input type="submit" name="btnSave" value="Save" class="btn-success">
                         <td class="btn-success" ><%=msg%></td>
                          
                    </td>
                   </tr>
                
             
                   
             </table>
        </form>
   <%@include file="footer_1.html" %>