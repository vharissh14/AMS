package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("\t<head>\n");
      out.write("    \t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("        <title>AMS</title>\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"Styles/General.css\" />\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"Styles/Navigation.css\" />\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"Styles/Themes.css\" />\n");
      out.write("\t\t<script src=\"Scripts/dropdown.js\" type=\"text/javascript\"></script>\n");
      out.write("\t\t<script src=\"Scripts/ClientInclude.js\" type=\"text/javascript\" ></script>\n");
      out.write("\t</head>\n");
      out.write("\t<body onLoad=\"clientSideInclude('includeone', 'main-menu.inc');\">\n");
      out.write("    \t<div id=\"main\">\n");
      out.write("        \t<div class=\"top-nav\">Logged in as: Wen Chen | <a href=\"Logout.html\">Logout</a></div>\n");
      out.write("            <div class=\"roundedcorners\">\n");
      out.write("            \t<div class=\"rndtl\"></div><div class=\"rndc\"></div><div class=\"rndtr\"></div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"content-area\">\n");
      out.write("            \t<div id=\"header\">\n");
      out.write("                \t<a href=\"index.jsp\" class=\"logo\"><img src=\"Images/AMS_Logo.JPG\" title=\"AMS Logo\" /></a>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("                <div id=\"navbar\">\n");
      out.write("                \t<div class=\"navleft\"></div>\n");
      out.write("\t\t\t\t\t<span id=\"includeone\"></span>\n");
      out.write("                    <div class=\"navright\"></div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"contentbox\">\n");
      out.write("                    <table width=\"100%\">\n");
      out.write("                    \t<tr>\n");
      out.write("                        \t<td width=\"52%\"><img src=\"Images/AMS_Logo1.JPG\" width=\"388\" height=\"267\" /></td>\n");
      out.write("                            <td width=\"48%\">\n");
      out.write("                            \t<span class=\"welcome\">Hello!! Wen Chen. Welcome to Apartment Maintenance Portal</span>\n");
      out.write("                                <p>\n");
      out.write("                                   \tThis Apartment Maintenance Portal is a Web based application for Apartment association to perform various activities. You can add Users, Manage Apartment Details, Manage Maintenance Charges Calculations, and much more... Major activities you can carry out through this portal are listed below.\n");
      out.write("                                </p>\n");
      out.write("                                <ol>\n");
      out.write("                                        <li>Users Management</li>\n");
      out.write("                                        <li>Manage Apartment Details</li>\n");
      out.write("                                        <li>Manage Payment</li>\n");
      out.write("                                        <li>Meeting Management</li>\n");
      out.write("                                        <li>Report Management</li>\n");
      out.write("                                    </ol>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("\t\t\t\t\t</table>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"roundedcorners\">\n");
      out.write("           \t  <div class=\"rndbl\"></div><div class=\"rndc\"></div><div class=\"rndbr\"></div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"footertext\">\n");
      out.write("        \t<a href=\"#\">ABC.com</a> |\n");
      out.write("            <a href=\"#\">Copyright</a> |\n");
      out.write("            <a href=\"#\">Legal Disclaimer</a> |\n");
      out.write("            <a href=\"#\">Privacy statement</a> |\n");
      out.write("            <a href=\"#\">Site Help</a> |\n");
      out.write("            <a href=\"#\">FAQ</a> |\n");
      out.write("            <a href=\"#\">Sitemap</a>\n");
      out.write("\t\t</div>\n");
      out.write("        <div id=\"footer\"></div>\n");
      out.write("\t</body>\n");
      out.write("</html>\n");
      out.write("\n");
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
