<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page import="java.util.*" %>
<%@ page import="javax.sql.*;" %>
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
			  for (i=0; i < (args.length-1); i+=2) eval(args[i]+".location='"+args[i+1]+"'");
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
                    	<p class="breadcrumb"><a href="Index.html">Home</a><a href="#"> Administration</a> <a href="#">User Management</a>View User</p>
                        <h1>List All Users</h1>
                    	<p>This page is for users to list all user information.</p>
                        <form id="form1" name="form1" method="post" action="">
                        	<table class="dataTable">
                                <thead>
                                    <tr class="odd">
                                        <th class="column1"></th>
                                        <th>User ID</th>
                                        <th>Name</th>
                                        <th>Flat</th>
                                        <th>Email</th>
                                        <th>Role</th>
                                        <th class="column1">&nbsp;</th>
                                    </tr>
                                </thead>
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
String sql = "select * from t_user";
s = con.createStatement();
rs = s.executeQuery(sql);
int i=0;
while( rs.next() ){
%>
<tr <%= (i%2 == 0 ? "" : "class='odd'")%>>
<th class="column1" width="30px"> <input type="radio" name="radio" id="radio" class="radiobtn" value="radio" /></th>    
<td><%= rs.getString("userid") %></td>
<td><%= rs.getString("name") %></td>
<td><%= rs.getString("flat") %></td>
<td><%= rs.getString("email") %></td>
<td><%= rs.getString("role") %></td>
<td class="column1"><a href="UserDetails.jsp?uid=<%=rs.getString("userid")%>">Details</a></td>
</tr>
<%
i++;
}
%> 
                                </tbody>

                            </table>
                       		<input name="CreateNew" type="button" class="primarybuttonl" onclick="MM_goToURL('parent','CreateUser.html');return document.MM_returnValue" value="Create New" />
                            <input name="CreateNew" type="button" class="primarybuttonm" onclick="MM_goToURL('parent','EditUser.html');return document.MM_returnValue" value="Edit" />
                          	<input name="CreateNew" class="primarybuttons" type="button" value="Delete" onclick="cnfrmtn=confirm('Do you want to delete this user?');if(cnfrmtn){window.location='ListAllUsersDelete.html';}" />
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