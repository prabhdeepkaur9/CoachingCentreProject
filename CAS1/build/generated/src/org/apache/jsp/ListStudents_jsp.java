package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class ListStudents_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/header.html");
    _jspx_dependants.add("/footer.html");
  }

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

      out.write('\n');
      out.write('\n');
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>Header</title>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        \r\n");
      out.write("        <link href=\"MyStyleSheet.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("       </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div id=\"MainDiv\">\r\n");
      out.write("            <div id=\"TitleDiv\">SPIC-CENTRE OF EXCELLENCE</div>\r\n");
      out.write("            <DIV ID=\"MenuDiv\">\r\n");
      out.write("                <table>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td> <a href=\"AddCourse.jsp\">Add Course</a>\r\n");
      out.write("                      </td>\r\n");
      out.write("                      \r\n");
      out.write("                      <td> <a href=\"ListCourses.jsp\">List Course</a>\r\n");
      out.write("                      </td>\r\n");
      out.write("                       \r\n");
      out.write("                        <td> <a href=\"AddStudent.jsp\">Add Student</a>\r\n");
      out.write("                      </td>\r\n");
      out.write("                      \r\n");
      out.write("                           <td> <a href=\"ListStudents.jsp\">List Students</a>\r\n");
      out.write("                      </td>\r\n");
      out.write("                        <td> <a href=\"#\">About US</a>\r\n");
      out.write("                      </td>\r\n");
      out.write("                        <td> <a href=\"#\">Contact Us</a>\r\n");
      out.write("                      </td>\r\n");
      out.write("                      <td> <a href=\"#\">Logout</a>\r\n");
      out.write("                      </td>     \r\n");
      out.write("                    </tr>\r\n");
      out.write("                    </table>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div id=\"ContentsDiv\">\r\n");
      out.write("            ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<table border=\"3>\"\n");
      out.write("        <tr>\n");
      out.write("        <td>RollNo:</td>\n");
      out.write("        <td>Name:</td>\n");
      out.write("        <td>Gender:</td>\n");
      out.write("        <td>City:</td>\n");
      out.write("       </tr>\n");
      out.write("      \n");

    try
      {
         Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        Connection con=DriverManager.getConnection("jdbc:sqlserver://ARPANHANJRA\\ARPANHANJRA:50105;databaseName=SpicExample;userName=sa;password=arpan");
         Statement st=con.createStatement();
         ResultSet rs=st.executeQuery("Select * from Students");
         while(rs.next())
         {
             
      out.write("\n");
      out.write("               <tr>\n");
      out.write("                   <td>");
      out.print(rs.getInt("RollNo") );
      out.write("</td>\n");
      out.write("                   <td>");
      out.print(rs.getString("Name") );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(rs.getString("Gender") );
      out.write("</td>\n");
      out.write("                     <td>");
      out.print(rs.getString("City") );
      out.write("</td>\n");
      out.write("             </tr>\n");
      out.write("             \n");
      out.write("             ");

             
         }
     }
      catch(Exception ex)
      {
      System.out.println(ex);
      }
   
      out.write("\n");
      out.write("</table>\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>");
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
