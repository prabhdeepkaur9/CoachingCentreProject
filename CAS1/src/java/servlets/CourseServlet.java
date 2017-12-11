
package servlets;

import beans.Course;
import datalayer.DALCourse;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class CourseServlet extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
           
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CourseServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CourseServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
            
            if(request.getParameter("btnSave")!=null)
            {
                beans.Course c=new Course();
                String a=request.getParameter("txtCourseName");
                float b=Float.parseFloat(request.getParameter("txtFee"));
                String d=request.getParameter("rbtDuration");
                
                c.setCourseName(a);
               c.setFee(b);
               c.setDuration(d);
               
               
               datalayer.DALCourse objDAL=new DALCourse();
               datalayer.eStatus ret=objDAL.saveCourse(c);
               
                RequestDispatcher dispatcher=request.getRequestDispatcher("AddCourse.jsp");
               request.setAttribute("flag", ret);
               
               dispatcher.forward(request, response);
                           
            }//if
            else if(request.getParameter("DCID")!=null)
            {
            
                    int x=Integer.parseInt(request.getParameter("DCID"));
                    
                    datalayer.DALCourse objDAL=new DALCourse();
                    objDAL.deleteCourse(x);
                    
                    response.sendRedirect("ListCourses.jsp");
                           
            
            
            
            
            
            }
            
            
            
            
            
            
            
            
            
            
            
            
            
        }
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
