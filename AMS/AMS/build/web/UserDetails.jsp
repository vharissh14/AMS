<%@ page import="java.util.*" %>
<%@ page import="javax.sql.*;" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
    	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title>AMS</title>
        <link type="text/css" rel="stylesheet" href="Styles/General.css" />
        <link type="text/css" rel="stylesheet" href="Styles/Navigation.css" />
        <link type="text/css" rel="stylesheet" href="Styles/Themes.css" />
        <link type="text/css" rel="stylesheet" href="Styles/FormElements.css" />
		<script src="Scripts/dropdown.js" type="text/javascript"></script>
        <script type="text/javascript" src="Scripts/popCalendar.js"></script>
        <script src="Scripts/accordian.js" type="text/javascript" ></script>
        <script src="Scripts/General.js" type="text/javascript" ></script>
        <script src="Scripts/ClientInclude.js" type="text/javascript" ></script>
        <script type="text/javascript">
			function MM_goToURL() { //v3.0
			  var i, args=MM_goToURL.arguments; document.MM_returnValue = false;
			  for (i=0; i<(args.length-1); i+=2) eval(args[i]+".location='"+args[i+1]+"'");
			}
        </script>
	</head>
	<body onLoad="clientSideInclude('includeone', 'main-menu.inc');">
    	<div id="main">
        	<div class="top-nav">Logged in as: Wen Chen | <a href="#">Logout</a></div>
            <div class="roundedcorners">
            	<div class="rndtl"></div><div class="rndc"></div><div class="rndtr"></div>
            </div>
            <div class="content-area">
            	<div id="header">
                	<a href="Index.html" class="logo"><img src="Images/AMS_Logo.JPG" title="User Logo" /></a>
                	<a href="#" class="logo1"><img src="Images/AMS_Logo_S.JPG" title="AMS Logo" /></a>
				</div>
                 <div id="navbar">
                	<div class="navleft"></div>
					<span id="includeone"></span>
                    <div class="navright"></div>
                </div>
                <div class="contentbox">
                    <div class="leftmenu">
                    	<ul>
							<li>User Management
								<ul>
									<li><a href="ListAllUsers.jsp">View User </a></li>
									<li><a href="CreateUser.html">Add User </a></li>
								</ul>
							</li>
						</ul>
                    </div>
                    <div class="maincolumn">
                    	<p class="breadcrumb"><a href="Index.html">Home</a><a href="#"> Administration</a> <a href="#">User Management</a><a href="#">View User</a>User Details</p>
                        <h1>User Details</h1>
                    	<p>This page is for users to see the detailed information about a particular user.</p>
                        <form id="form1" name="form1" method="post" action="">
                        	<table class="dataTable">
                            	<tbody>
<%
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
String sql = "select * from t_user where userid='" + request.getParameter("uid") + "'";
s = con.createStatement();
rs = s.executeQuery(sql);
while( rs.next() ){
%>
                                	<tr>
                                    	<th class="column1" width="150px">User Name:</th>
                                        <td><%=rs.getString("userid")%></td>
                                    </tr>
                                    <tr class="odd">
                                    	<th class="column1">Name:</th>
                                        <td><%=rs.getString("name")%></td>
                                    </tr>
                                    <tr>
                                    	<th class="column1">Flat:</th>
                                        <td><%=rs.getString("flat")%></td>
                                    </tr>
                                    <tr class="odd">
                                    	<th class="column1">Email:</th>
                                      <td><%=rs.getString("email")%></td>
                                    </tr>
                                    <tr>
                                      <th class="column1">Roles:</th>
                                      <td><%=rs.getString("role")%></td>
                                    </tr>
<%
}
%> 
                                </tbody>
                            </table>
							<input name="CreateNew" type="button" class="primarybuttons" onclick="MM_goToURL('parent','EditUser.html');return document.MM_returnValue" value="Edit" />
                        	<input name="CreateNew" type="button" class="primarybuttons" onclick="MM_goToURL('parent','ListAllUsers.jsp');return document.MM_returnValue" value="Back" />
                    	</form>
                   	</div>
                    <div class="clear"></div>
                </div>
            </div>
            <div class="roundedcorners">
            	<div class="rndbl"></div><div class="rndc"></div><div class="rndbr"></div>
            </div>
        </div>
        <div class="footertext">
        	<a href="#">ABC.com</a> |
            <a href="#">Copyright</a> |
            <a href="#">Legal Disclaimer</a> |
            <a href="#">Change Password</a> |
            <a href="#">Site Help</a> |
            <a href="#">FAQ</a> |
            <a href="#">Sitemap</a>
		</div>
        <div id="footer"></div>
	</body>
</html>