<%--
9b. Read all the existing records from the table coffee which is from the database test and query coffee name starting with ‘D’ in the table using HTML and JSP to get the field and display the
results respectively
--%>
<%@ page import="java.sql.*" %>
<%
    String url = "jdbc:mysql://localhost:3306/test";
    String user = "root";      // change if needed
    String pass = "";          // change if needed

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection(url, user, pass);

        String query = "SELECT * FROM coffee WHERE coffee_name LIKE 'D%'";
        ps = conn.prepareStatement(query);
        rs = ps.executeQuery();
%>

<h2>Coffee Products Starting with 'D'</h2>
<table border="1" cellpadding="5" cellspacing="0">
    <tr>
        <th>ID</th>
        <th>Coffee Name</th>
        <th>Price</th>
    </tr>
<%
        boolean found = false;
        while (rs.next()) {
            found = true;
%>
    <tr>
        <td><%= rs.getInt("id") %></td>
        <td><%= rs.getString("coffee_name") %></td>
        <td><%= rs.getDouble("price") %></td>
    </tr>
<%
        }
        if (!found) {
%>
    <tr>
        <td colspan="3">No coffee names found starting with 'D'.</td>
    </tr>
<%
        }
    } catch (Exception e) {
        out.println("<p style='color:red;'>Error: " + e.getMessage() + "</p>");
    } finally {
        if (rs != null) try { rs.close(); } catch (Exception e) {}
        if (ps != null) try { ps.close(); } catch (Exception e) {}
        if (conn != null) try { conn.close(); } catch (Exception e) {}
    }
%>
</table>

<br><a href="queryCoffee.html">Go Back</a>
