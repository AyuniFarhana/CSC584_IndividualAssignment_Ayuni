package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.ProfileBean;

public final class editProfile_jsp extends org.apache.jasper.runtime.HttpJspBase
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

ProfileBean p = (ProfileBean) request.getAttribute("profile");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>Edit Profile</title>\n");
      out.write("\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\"\n");
      out.write("          rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <style>\n");
      out.write("        body{\n");
      out.write("            background-color:#f3e8ff;\n");
      out.write("            font-family: Arial;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .box{\n");
      out.write("            width: 60%;\n");
      out.write("            margin: auto;\n");
      out.write("            background:white;\n");
      out.write("            padding:30px;\n");
      out.write("            margin-top:50px;\n");
      out.write("            border-radius:20px;\n");
      out.write("            box-shadow:0 0 10px rgba(0,0,0,0.1);\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<div class=\"box\">\n");
      out.write("\n");
      out.write("    <h3 class=\"text-center mb-4\">Edit Profile</h3>\n");
      out.write("\n");
      out.write("    <form action=\"updateProfileServlet\" method=\"post\">\n");
      out.write("\n");
      out.write("        <input type=\"hidden\" name=\"studentid\"\n");
      out.write("               value=\"");
      out.print( p.getStudentid() );
      out.write("\">\n");
      out.write("\n");
      out.write("        <div class=\"mb-3\">\n");
      out.write("            Name:\n");
      out.write("            <input type=\"text\" name=\"name\"\n");
      out.write("                   value=\"");
      out.print( p.getName() );
      out.write("\"\n");
      out.write("                   class=\"form-control\">\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"mb-3\">\n");
      out.write("            Program:\n");
      out.write("            <input type=\"text\" name=\"program\"\n");
      out.write("                   value=\"");
      out.print( p.getProgram() );
      out.write("\"\n");
      out.write("                   class=\"form-control\">\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"mb-3\">\n");
      out.write("            Email:\n");
      out.write("            <input type=\"text\" name=\"email\"\n");
      out.write("                   value=\"");
      out.print( p.getEmail() );
      out.write("\"\n");
      out.write("                   class=\"form-control\">\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"mb-3\">\n");
      out.write("            Hobbies:\n");
      out.write("            <input type=\"text\" name=\"hobbies\"\n");
      out.write("                   value=\"");
      out.print( p.getHobbies() );
      out.write("\"\n");
      out.write("                   class=\"form-control\">\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"mb-3\">\n");
      out.write("            Introduction:\n");
      out.write("            <input type=\"text\" name=\"intro\"\n");
      out.write("                   value=\"");
      out.print( p.getIntro() );
      out.write("\"\n");
      out.write("                   class=\"form-control\">\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <button type=\"submit\"\n");
      out.write("                class=\"btn btn-success\"\n");
      out.write("                style=\"background:#8b5cf6; color:white; border:none;\">\n");
      out.write("            Update\n");
      out.write("        </button>\n");
      out.write("\n");
      out.write("        <a href=\"viewProfilesServlet\"\n");
      out.write("           class=\"btn btn-secondary\">\n");
      out.write("            Cancel\n");
      out.write("        </a>\n");
      out.write("\n");
      out.write("    </form>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</body>\n");
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
