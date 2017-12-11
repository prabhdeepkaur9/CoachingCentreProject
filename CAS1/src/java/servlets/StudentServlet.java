package servlets;
import beans.Student;
import datalayer.DALStudent;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class StudentServlet extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        if(request.getParameter("btnSave")!=null) 
        {
           beans.Student s=new Student();
           s.setName(request.getParameter("txtName"));
           s.setGender(request.getParameter("rbtGender"));
           int CID=Integer.parseInt(request.getParameter("ddlCourses"));
           s.CourseInfo.setCourseId(CID);

           datalayer.DALStudent objDAL=new DALStudent();
           objDAL.saveStudent(s);
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
