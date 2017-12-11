package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import datalayer.DALCourse;
import java.util.ArrayList;

public final class AddStudent_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/Header.jsp");
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

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap.theme.css\">\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"Accordion.css\">\n");
      out.write("            \n");
      out.write("<script type=\"text/javascript\" src=\"../Admin/Script/UpdateSavedQuestions.js\">\n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("\n");
      out.write("            *\n");
      out.write("            {\n");
      out.write("                margin:0px;\n");
      out.write("                padding:0px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #TopStrip\n");
      out.write("            {\n");
      out.write("                height:30px;\n");
      out.write("                background-color:background;\n");
      out.write("                margin-bottom:20px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            table tr td\n");
      out.write("            {\n");
      out.write("                padding:5px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\" src=\"LatestJQuery.js\">\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("            $(document).ready\n");
      out.write("                    (\n");
      out.write("                            function ()\n");
      out.write("                            {\n");
      out.write("\n");
      out.write("                                $(\"#accordion > li > div\").click(function () {\n");
      out.write("\n");
      out.write("                                    //if(false == $(this).next().is(':visible')) {\n");
      out.write("                                    //    $('#accordion ul').slideUp(300);\n");
      out.write("                                    //}\n");
      out.write("\n");
      out.write("                                    $(this).next().slideToggle(300);\n");
      out.write("                                });\n");
      out.write("\n");
      out.write("                            }\n");
      out.write("\n");
      out.write("                    );\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div id=\"TopStrip\">\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("\n");
      out.write("            <div class=\"panel panel-info\" >\n");
      out.write("                <div class=\"panel-heading\" style=\"height:80px;\">\n");
      out.write("\n");
      out.write("                    <h1 style=\"position:absolute\">\n");
      out.write("                        LAMBTON COACHING POINT\n");
      out.write("                    </h1>\n");
      out.write("\n");
      out.write("                    \n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\t\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"row\">\n");
      out.write("\n");
      out.write("                <div class=\"col-sm-3\">\n");
      out.write("                    <ul id=\"accordion\">\n");
      out.write("                        <li><div>Courses\n");
      out.write("                                <ul><li>  \n");
      out.write("                                \n");
      out.write("                                <a href=\"AddCourse.jsp\"></a>\n");
      out.write("                               <a href=\"ListCourses.jsp\">List Courses</a>\n");
      out.write("                                    </li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("                       <li><div>Students\n");
      out.write("                               <ul>\n");
      out.write("                               <a href=\"AddStudent.jsp\">Add Student</a>\n");
      out.write("                                <a href=\"ListStudents.jsp\">List Students</a>\n");
      out.write("                                   \n");
      out.write("                               </ul>\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("              <!--                        <li><div>Departments</div>\n");
      out.write("          <li><div>Categories</div>\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"../Admin/Category.jsp\">Add Category</a></li>\n");
      out.write("                                <li><a href=\"../Admin/Categories.jsp\">List Categories</a></li>\n");
      out.write("\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                        <li><div>Tests</div>\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"../Admin/Test.jsp\">Add Test</a></li>\n");
      out.write("                                <li><a href=\"../Admin/Tests.jsp\">List Tests</a></li>\n");
      out.write("\n");
      out.write("                            </ul>\n");
      out.write("                        </li>-->\n");
      out.write("\n");
      out.write("                      \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"col-sm-12\">\n");
      out.write("                    <div class=\"panel panel-danger\">\n");
      out.write("                        <div class=\"panel-heading\" style=\"background-color:#ffcccc;color:blue\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <script>\n");
      out.write("            f1()\n");
      out.write("            {\n");
      out.write("                \n");
      out.write("                var flag=true;\n");
      out.write("                var a=document.getElementById(\"txtName\");\n");
      out.write("                var msg=document.getElementById(\"msg1\");\n");
      out.write("                \n");
      out.write("                if(a.value.length==0)\n");
      out.write("                {\n");
      out.write("                    \n");
      out.write("                    flag=false;\n");
      out.write("                    msg.innerHTML=\"Enter name\";\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                }\n");
      out.write("                \n");
      out.write("               return flag; \n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </script>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action=\"StudentServlet\" method=\"post\">\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <td style=\"width:130px\" >Student Name</td>\n");
      out.write("                    <td><input type=\"text\" name=\"txtName\" id=\"txtName\" class=\"form-control\"></td>\n");
      out.write("                    <td><span id=\"msg1\"></span></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td  style=\"width:130px\" >Gender</td>\n");
      out.write("                    <td><input type=\"radio\" name=\"rbtGender\" value=\"Male\"  class=\"btn-group-xs\">MALE</td>\n");
      out.write("                    <td>   <input type=\"radio\" name=\"rbtGender\" value=\"Female\" class=\"btn-group-xs\">FEMALE\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                    <td style=\"width:130px\" class=\"form-control\" >City</td>\n");
      out.write("                    <td>\n");
      out.write("                        \n");
      out.write("                        <select name=\"ddlCourses\">\n");
      out.write("                            \n");
      out.write("            ");

                datalayer.DALCourse objDAL=new DALCourse();
                ArrayList<beans.Course> AC=objDAL.getCourses();
                
                for(beans.Course c: AC)
                {
                    
      out.write("\n");
      out.write("                    <option value=\"");
      out.print(c.getCourseId());
      out.write('"');
      out.write('>');
      out.print(c.getCourseName());
      out.write("</option>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("               ");
 }
      out.write("\n");
      out.write("              </select>\n");
      out.write("                  </td>       \n");
      out.write("                   </tr>\n");
      out.write("                   <tr>\n");
      out.write("                       <td>\n");
      out.write("                           \n");
      out.write("                           <input type=\"submit\" name=\"btnSave\" value=\"Save\" onclick=\"return f1()\"> \n");
      out.write("                       </td>\n");
      out.write("                       \n");
      out.write("                       \n");
      out.write("                   </tr>  \n");
      out.write("                        \n");
      out.write("            </table>\n");
      out.write("            \n");
      out.write("        </form>\n");
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
