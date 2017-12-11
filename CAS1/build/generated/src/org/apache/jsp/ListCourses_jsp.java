package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import datalayer.DALCourse;
import java.util.ArrayList;

public final class ListCourses_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <script type=\"text/javascript\" src=\"script.js\"></script>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

             datalayer.DALCourse objDAL=new DALCourse();
             ArrayList<beans.Course> AC=objDAL.getCourses();
                     
         
      out.write("\n");
      out.write("               <table border=\"5\" width=\"450\">\n");
      out.write("               <tr>\n");
      out.write("                 <th>NAME</th>\n");
      out.write("                 <th>FEE</th>\n");
      out.write("                 <th> DURATION</th>\n");
      out.write("                 <th></th>\n");
      out.write("                </tr>    \n");
      out.write("             \n");
      out.write("             ");

                        String s="";
                     for(beans.Course c:AC)
                 {   
                        
      out.write("\n");
      out.write("       \n");
      out.write("                    \n");
      out.write("               <tr>\n");
      out.write("                      \n");
      out.write("                    <td>");
      out.print(c.getCourseName());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(c.getFee());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(c.getDuration());
      out.write("</td>\n");
      out.write("                    <td><a href=\"CourseServlet?DCID=");
      out.print(c.getCourseId());
      out.write("\" onclick=\"return deleteConfirmation('DO YOU WANT TO DELETE SELECTED COURSE?')\">DELETE</a></td>\n");
      out.write("                      \n");
      out.write("                            \n");
      out.write("                 \n");
      out.write("                  </tr>\n");
      out.write("         ");
}
      out.write("\n");
      out.write("         </table>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
