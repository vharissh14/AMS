package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import javax.sql.*;;

public final class ListAllUsers_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("\t<head>\n");
      out.write("    \t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("        <title>AMS</title>\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"Styles/General.css\" />\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"Styles/Navigation.css\" />\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"Styles/Themes.css\" />\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"Styles/FormElements.css\" />\n");
      out.write("\t\t<script src=\"Scripts/dropdown.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"Scripts/popCalendar.js\"></script>\n");
      out.write("        <script src=\"Scripts/accordian.js\" type=\"text/javascript\" ></script>\n");
      out.write("        <script src=\"Scripts/General.js\" type=\"text/javascript\" ></script>\n");
      out.write("        <script src=\"Scripts/ClientInclude.js\" type=\"text/javascript\" ></script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("\t\t\tfunction MM_goToURL() { //v3.0\n");
      out.write("\t\t\t  var i, args=MM_goToURL.arguments; document.MM_returnValue = false;\n");
      out.write("\t\t\t  for (i=0; i < (args.length-1); i+=2) eval(args[i]+\".location='\"+args[i+1]+\"'\");\n");
      out.write("\t\t\t}\n");
      out.write("        </script>\n");
      out.write("\t</head>\n");
      out.write("\t<body onLoad=\"clientSideInclude('includeone', 'main-menu.inc');\">\n");
      out.write("    \t<div id=\"main\">\n");
      out.write("        \t<div class=\"top-nav\">Logged in as: Wen Chen | <a href=\"#\">Logout</a></div>\n");
      out.write("            <div class=\"roundedcorners\">\n");
      out.write("            \t<div class=\"rndtl\"></div><div class=\"rndc\"></div><div class=\"rndtr\"></div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"content-area\">\n");
      out.write("            \t<div id=\"header\">\n");
      out.write("                \t<a href=\"Index.html\" class=\"logo\"><img src=\"Images/AMS_Logo.JPG\" title=\"User Logo\" /></a>\n");
      out.write("                \t<a href=\"#\" class=\"logo1\"><img src=\"Images/AMS_Logo_S.JPG\" title=\"AMS Logo\" /></a>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("                <div id=\"navbar\">\n");
      out.write("                \t<div class=\"navleft\"></div>\n");
      out.write("\t\t\t\t\t<span id=\"includeone\"></span>\n");
      out.write("                    <div class=\"navright\"></div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"contentbox\">\n");
      out.write("                    <div class=\"leftmenu\">\n");
      out.write("                    \t<ul>\n");
      out.write("\t\t\t\t\t\t\t<li>User Management\n");
      out.write("\t\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"ListAllUsers.jsp\">View User </a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"CreateUser.html\">Add User </a></li>\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"maincolumn\">\n");
      out.write("                    \t<p class=\"breadcrumb\"><a href=\"Index.html\">Home</a><a href=\"#\"> Administration</a> <a href=\"#\">User Management</a>View User</p>\n");
      out.write("                        <h1>List All Users</h1>\n");
      out.write("                    \t<p>This page is for users to list all user information.</p>\n");
      out.write("                        <form id=\"form1\" name=\"form1\" method=\"post\" action=\"\">\n");
      out.write("                        \t<table class=\"dataTable\">\n");
      out.write("                                <thead>\n");
      out.write("                                    <tr class=\"odd\">\n");
      out.write("                                        <th class=\"column1\"></th>\n");
      out.write("                                        <th>User ID</th>\n");
      out.write("                                        <th>Name</th>\n");
      out.write("                                        <th>Flat</th>\n");
      out.write("                                        <th>Email</th>\n");
      out.write("                                        <th>Role</th>\n");
      out.write("                                        <th class=\"column1\">&nbsp;</th>\n");
      out.write("                                    </tr>\n");
      out.write("                                </thead>\n");
      out.write("                                <tbody>\n");

java.sql.Connection con;
java.sql.Statement s;
java.sql.ResultSet rs;
java.sql.PreparedStatement pst;

con=null;
s=null;
pst=null;
rs=null;

String url="jdbc:sqlserver://localhost;user=sa;password=Pa55word;databaseName=AMS";
Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
con = java.sql.DriverManager.getConnection(url);
String sql = "select * from t_user";
s = con.createStatement();
rs = s.executeQuery(sql);
int i=0;
while( rs.next() ){

      out.write("\n");
      out.write("<tr ");
      out.print( (i%2 == 0 ? "" : "class='odd'"));
      out.write(">\n");
      out.write("<th class=\"column1\" width=\"30px\"> <input type=\"radio\" name=\"radio\" id=\"radio\" class=\"radiobtn\" value=\"radio\" /></th>    \n");
      out.write("<td>");
      out.print( rs.getString("userid") );
      out.write("</td>\n");
      out.write("<td>");
      out.print( rs.getString("name") );
      out.write("</td>\n");
      out.write("<td>");
      out.print( rs.getString("flat") );
      out.write("</td>\n");
      out.write("<td>");
      out.print( rs.getString("email") );
      out.write("</td>\n");
      out.write("<td>");
      out.print( rs.getString("role") );
      out.write("</td>\n");
      out.write("<td class=\"column1\"><a href=\"UserDetails.jsp?uid=");
      out.print(rs.getString("userid"));
      out.write("\">Details</a></td>\n");
      out.write("</tr>\n");

i++;
}

      out.write(" \n");
      out.write("                                </tbody>\n");
      out.write("\n");
      out.write("                            </table>\n");
      out.write("                       \t\t<input name=\"CreateNew\" type=\"button\" class=\"primarybuttonl\" onclick=\"MM_goToURL('parent','CreateUser.html');return document.MM_returnValue\" value=\"Create New\" />\n");
      out.write("                            <input name=\"CreateNew\" type=\"button\" class=\"primarybuttonm\" onclick=\"MM_goToURL('parent','EditUser.html');return document.MM_returnValue\" value=\"Edit\" />\n");
      out.write("                          \t<input name=\"CreateNew\" class=\"primarybuttons\" type=\"button\" value=\"Delete\" onclick=\"cnfrmtn=confirm('Do you want to delete this user?');if(cnfrmtn){window.location='ListAllUsersDelete.html';}\" />\n");
      out.write("                         </form>\n");
      out.write("                   \t</div>\n");
      out.write("                    <div class=\"clear\"></div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"roundedcorners\">\n");
      out.write("            \t<div class=\"rndbl\"></div><div class=\"rndc\"></div><div class=\"rndbr\"></div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"footertext\">\n");
      out.write("        \t<a href=\"#\">ABC.com</a> |\n");
      out.write("            <a href=\"#\">Copyright</a> |\n");
      out.write("            <a href=\"#\">Legal Disclaimer</a> |\n");
      out.write("            <a href=\"#\">Change Password</a> |\n");
      out.write("            <a href=\"#\">Site Help</a> |\n");
      out.write("            <a href=\"#\">FAQ</a> |\n");
      out.write("            <a href=\"#\">Sitemap</a>\n");
      out.write("\t\t</div>\n");
      out.write("        <div id=\"footer\"></div>\n");
      out.write("\t</body>\n");
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
