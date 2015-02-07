package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import javax.sql.*;;

public final class test_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html>\n");
      out.write("<head><title>Enter to database</title></head>\n");
      out.write("<body>\n");
      out.write("<table>\n");
      out.write("\n");
      out.write("\n");
 

java.sql.Connection con;
java.sql.Statement s;
java.sql.ResultSet rs;
java.sql.PreparedStatement pst;

con=null;
s=null;
pst=null;
rs=null;


// Remember to change the next line with your own environment 
String url="jdbc:sqlserver://localhost;user=sa;password=Pa55word;databaseName=AMS";
try{

Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

con = java.sql.DriverManager.getConnection(url);
}catch(ClassNotFoundException cnfex){
cnfex.printStackTrace();

}
catch (Exception ex) { ex.printStackTrace(); }
String sql = "select top 10 * from tbl_sys_user";
try{
s = con.createStatement();
rs = s.executeQuery(sql);

      out.write('\n');
      out.write('\n');

while( rs.next() ){

      out.write("<tr>\n");
      out.write("<td>");
      out.print( rs.getString("cust_id") );
      out.write("</td>\n");
      out.write("<td>");
      out.print( rs.getString("rdate") );
      out.write("</td>\n");
      out.write("<td>");
      out.print( rs.getString("email") );
      out.write("</td>\n");
      out.write("</tr>\n");

}

      out.write('\n');
      out.write('\n');


}
catch(Exception e){e.printStackTrace();}
finally{
if(rs!=null) rs.close();
if(s!=null) s.close();
if(con!=null) con.close();
}


      out.write("\n");
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
