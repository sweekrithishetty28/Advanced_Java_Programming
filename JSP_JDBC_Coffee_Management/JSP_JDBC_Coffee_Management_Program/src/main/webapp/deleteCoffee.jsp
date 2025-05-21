<%--9a. Read all the existing records from the table coffee which is from the database test and delete an existing coffee product from the table with its id and display the rest of the records using
HTML and JSP to get the field and display the results respectively--%>
<%@ page import="java.sql.*" %>
<%
    String url = "jdbc:mysql://localhost:3306/test";
    String username = "root"; // Change if needed
    String password = "";     // Change if needed

    Connection conn = null;
    PreparedStatement psDelete = null;
    Statement stmt = null;
    ResultSet rs = null;

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection(url, username, password);

        String idStr = request.getParameter("id");
        if (idStr != null) {
            int id = Integer.parseInt(idStr);

            String deleteSQL = "DELETE FROM coffee WHERE id = ?";
            psDelete = conn.prepareStatement(deleteSQL);
            psDelete.setInt(1, id);
            int rowsDeleted = psDelete.executeUpdate();

            if (rowsDeleted > 0) {
                out.println("<p style='color:green;'>Coffee product with ID " + id + " deleted successfully.</p>");
            } else {
                out.println("<p style='color:red;'>No product found with ID " + id + ".</p>");
            }
        }

        // Display remaining records
        stmt = conn.createStatement();
        rs = stmt.executeQuery("SELECT * FROM coffee");
%>

<h3>Remaining Coffee Records</h3>
<table border="1" cellpadding="5" cellspacing="0">
    <tr>
        <th>ID</th>
        <th>Coffee Name</th>
        <th>Price</th>
    </tr>
<%
        while (rs.next()) {
%>
    <tr>
        <td><%= rs.getInt("id") %></td>
        <td><%= rs.getString("coffee_name") %></td>
        <td><%= rs.getDouble("price") %></td>
    </tr>
<%
        }
    } catch (Exception e) {
        out.println("Error: " + e.getMessage());
    } finally {
        if (rs != null) try { rs.close(); } catch (Exception e) {}
        if (stmt != null) try { stmt.close(); } catch (Exception e) {}
        if (psDelete != null) try { psDelete.close(); } catch (Exception e) {}
        if (conn != null) try { conn.close(); } catch (Exception e) {}
    }
%>
</table>

<br><a href="deleteCoffee.html">Delete Another Product</a>
