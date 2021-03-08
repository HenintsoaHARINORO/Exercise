package tryit;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class OrderData {
    public static List<Order> getOrderData() {
        List<Order> orders = new ArrayList<>();
        String sqlQuery = "Select * from Portfolio";
        try (Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/Lesson21");
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sqlQuery);
        ) {
            while (rs.next()) {
                Integer id = rs.getInt("id");
                String symbol = rs.getString("symbol");
                Integer quantity = rs.getInt("quantity");
                Float price = rs.getFloat("price");

                orders.add(new Order(id, symbol, quantity, price));

            }
        } catch (SQLException se) {
            System.out.println("SQL Error: " + se.getMessage() + ",the db error code is " + se.getErrorCode());
        } catch(Exception e){
        e.printStackTrace();
    }
    return orders;
}
}


