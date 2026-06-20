package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import model.ProfileBean;

public final class viewProfiles_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");

    ArrayList<ProfileBean> profileList =
    (ArrayList<ProfileBean>)
    request.getAttribute("profileList");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("    <title>All Student Profiles</title>\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\"\n");
      out.write("          rel=\"stylesheet\">\n");
      out.write("    <style>\n");
      out.write("\n");
      out.write("        body{\n");
      out.write("            background-color: #f3e8ff;\n");
      out.write("            font-family: Arial, sans-serif;\n");
      out.write("        }\n");
      out.write("        .container-box{\n");
      out.write("            background: white;\n");
      out.write("            padding: 30px;\n");
      out.write("            border-radius: 20px;\n");
      out.write("            box-shadow: 0 0 15px rgba(0,0,0,0.1);\n");
      out.write("        }\n");
      out.write("        h2{\n");
      out.write("            color: #6d28d9;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    <div class=\"container mt-5\">\n");
      out.write("      <div class=\"container-box\">\n");
      out.write("          <h2 class=\"text-center mb-4\">\n");
      out.write("              Student Profile List\n");
      out.write("          </h2>\n");
      out.write("          <table class=\"table table-bordered table-hover\">\n");
      out.write("              <thead class=\"table-dark\">\n");
      out.write("                  <tr>\n");
      out.write("                      <th>Student ID</th>\n");
      out.write("    <th>Name</th>\n");
      out.write("    <th>Program</th>\n");
      out.write("    <th>Email</th>\n");
      out.write("    <th>Hobbies</th>\n");
      out.write("    <th>Introduction</th>\n");
      out.write("    <th>Action</th>\n");
      out.write("                  </tr>\n");
      out.write("\n");
      out.write("              </thead>\n");
      out.write("              <tbody>\n");
      out.write("              ");

                if(profileList != null){
                for(ProfileBean profile : profileList){
              
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        ");
      out.print( profile.getStudentid() );
      out.write("\n");
      out.write("                    </td>\n");
      out.write("\n");
      out.write("                    <td>\n");
      out.write("                        ");
      out.print( profile.getName() );
      out.write("\n");
      out.write("                    </td>\n");
      out.write("\n");
      out.write("                    <td>\n");
      out.write("                        ");
      out.print( profile.getProgram() );
      out.write("\n");
      out.write("                    </td>\n");
      out.write("\n");
      out.write("                    <td>\n");
      out.write("                        ");
      out.print( profile.getEmail() );
      out.write("\n");
      out.write("                    </td>\n");
      out.write("\n");
      out.write("                    <td>\n");
      out.write("                        ");
      out.print( profile.getHobbies() );
      out.write("\n");
      out.write("                    </td>\n");
      out.write("\n");
      out.write("                    <td>\n");
      out.write("                        ");
      out.print( profile.getIntro() );
      out.write("\n");
      out.write("                    </td>\n");
      out.write("                    \n");
      out.write("                    <td>\n");
      out.write("                        <a href=\"editProfileServlet?studentid=");
      out.print( profile.getStudentid() );
      out.write("\"\n");
      out.write("                           style=\"\n");
      out.write("                              padding:6px 12px;\n");
      out.write("                              background:#8b5cf6;\n");
      out.write("                              color:white;\n");
      out.write("                              text-decoration:none;\n");
      out.write("                              border-radius:6px;\n");
      out.write("                              display:inline-block;\">\n");
      out.write("                            Edit\n");
      out.write("                        </a>\n");
      out.write("                        <a href=\"deleteProfileServlet?studentid=");
      out.print( profile.getStudentid() );
      out.write("\"\n");
      out.write("       onclick=\"return confirm('Are you sure you want to delete this profile?')\"\n");
      out.write("       style=\"\n");
      out.write("          padding:6px 12px;\n");
      out.write("          background:#ef4444;\n");
      out.write("          color:white;\n");
      out.write("          text-decoration:none;\n");
      out.write("          border-radius:6px;\n");
      out.write("          display:inline-block;\">\n");
      out.write("        Delete\n");
      out.write("    </a>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("            ");

                }
            }
            
      out.write("\n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("        <div class=\"text-center mt-4\">\n");
      out.write("            <a href=\"userInformation.html\"\n");
      out.write("               class=\"btn btn-primary\">\n");
      out.write("               Add New Profile\n");
      out.write("            </a>\n");
      out.write("\n");
      out.write("            <a href=\"index.html\"\n");
      out.write("               class=\"btn btn-secondary\">\n");
      out.write("               Back Home\n");
      out.write("            </a>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("   </div>\n");
      out.write("  </body>\n");
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
