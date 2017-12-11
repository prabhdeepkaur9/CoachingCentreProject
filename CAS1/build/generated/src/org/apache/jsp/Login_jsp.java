package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/Header_1.jsp");
    _jspx_dependants.add("/footer_1.html");
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
      out.write("                background-color:skyblue;\n");
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
      out.write("                        Web XAM\n");
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
      out.write("                    <!--    <li><div>Courses><a href=\"AddCourse.jsp\"></a>\n");
      out.write("                                ><a href=\"ListCourses.jsp\">List Courses</a>\n");
      out.write("                                \n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("                       <li><div>Students><a href=\"AddStudent.jsp\">Add Student</a>\n");
      out.write("                                ><a href=\"ListStudents.jsp\">List Students</a>\n");
      out.write("                                \n");
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
      out.write("                        <div class=\"panel-heading\" style=\"background-color:#FF9927;color:white\">\n");
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
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        ");

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
            
      out.write("\n");
      out.write("            \n");
      out.write("            \n");
      out.write("  \n");
      out.write("        \n");
      out.write("        <div id=\"main\">\n");
      out.write("            <div id=\"title\"><center>\n");
      out.write("                   <center></div>\n");
      out.write("            <div id=\"table1\">\n");
      out.write("                <form  method=\"post\">\n");
      out.write("                <table align=\"center\">\n");
      out.write("                    <tr>\n");
      out.write("                       \n");
      out.write("                        <th style=\"width:130px\"> UserId:</th> \n");
      out.write("                        <td><input type=\"text\" name=\"txt1\" placeholder=\"Enter the LoginId\" class=\"form-control\"><br></td>\n");
      out.write("                      </tr>\n");
      out.write("                      <tr>\n");
      out.write("                        <th style=\"width:130px\">\n");
      out.write("                            Password:  </th>\n");
      out.write("                        <td><input type=\"password\" name=\"password\" placeholder=\"Enter the Password\" class=\"form-control\"><br></td>\n");
      out.write("                        </tr>\n");
      out.write("               \n");
      out.write("                            \n");
      out.write("                        <tr>\n");
      out.write("                            <td > <input type=\"submit\" name=\"btn1\" class=\"btn btn-info\"></td><br>\n");
      out.write("                        </tr>\n");
      out.write("                </table> \n");
      out.write("                \n");
      out.write("                ");
      out.print(name);
      out.write("\n");
      out.write("                \n");
      out.write("                </form>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("    </div>\n");
      out.write("        \n");
      out.write("    ");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div> <!-- row Div Closing -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"panel panel-success\"> \r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"panel-footer\" style=\"background-color:skyblue\" >@Copyrights: Lambton College, Toronto</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t</div>  <!--container Div Closing -->\r\n");
      out.write("\r\n");
      out.write("\t</body>\r\n");
      out.write("\r\n");
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
