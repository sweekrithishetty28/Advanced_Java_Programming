<%--
8b. Read all the existing records from the table coffee which is from the database test and update an existing coffee product in the table with its id. [Create a table coffee with fields
( id,coffee_name,price)] using HTML and JSP to get the fields and display the results respectively
--%>

<%@ page import="java.sql.*" %>
<%
    String url = "jdbc:mysql://localhost:3306/test";
    String username = "root";      // Change if needed
    String password = "";          // Change if needed

    Connection conn = null;
    PreparedStatement psUpdate = null;
    Statement stmt = null;
    ResultSet rs = null;

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection(url, username, password);

        String idStr = request.getParameter("id");
        String coffeeName = request.getParameter("coffee_name");
        String priceStr = request.getParameter("price");

        if (idStr != null && coffeeName != null && priceStr != null) {
            int id = Integer.parseInt(idStr);
            double price = Double.parseDouble(priceStr);

            // Update record by ID
            String updateSQL = "UPDATE coffee SET coffee_name = ?, price = ? WHERE id = ?";
            psUpdate = conn.prepareStatement(updateSQL);
            psUpdate.setString(1, coffeeName);
            psUpdate.setDouble(2, price);
            psUpdate.setInt(3, id);
            int rowsUpdated = psUpdate.executeUpdate();

            if (rowsUpdated == 0) {
                out.println("<p style='color:red;'>No record found with ID " + id + " to update.</p>");
            } else {
                out.println("<p style='color:green;'>Record updated successfully!</p>");
            }
        }

        // Display all coffee records
        stmt = conn.createStatement();
        rs = stmt.executeQuery("SELECT * FROM coffee");
%>

<h2>All Coffee Products</h2>
<table border="1" cellpadding="5" cellspacing="0">
    <tr>
        <th>ID</th>
        <th>Coffee Name</th>
        <th>Price</th>
    </tr>
<%
        while(rs.next()) {
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
        if (psUpdate != null) try { psUpdate.close(); } catch (Exception e) {}
        if (conn != null) try { conn.close(); } catch (Exception e) {}
    }
%>
</table>

<br><a href="updateCoffeeForm.html">Update another coffee</a>
