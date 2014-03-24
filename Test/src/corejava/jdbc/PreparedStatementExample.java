package corejava.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PreparedStatementExample {

	// JDBC driver name and database URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/test";

    // Database credentials
    static final String USER = "devuser";
    static final String PASS = "devpass";
    
    public static void main(String[] args) {


        Connection conn1 = null;
        PreparedStatement stmt1 = null;
        Statement stmt2 = null;

        try {
            Class.forName(JDBC_DRIVER);
            System.out.println("Connecting to database...");
            conn1 = DriverManager.getConnection(DB_URL, USER, PASS);
            
            final String sql = "insert into customer (name, city) values (?,?)";
            stmt1 = conn1.prepareStatement(sql);
            stmt1.setString(1, "DEF");
            stmt1.setString(2, "Bangalore");
            stmt1.executeUpdate();

            
            System.out.println("Connecting to database...");
            stmt2 = conn1.createStatement();
            final String sql1 = "select * from customer";
            final ResultSet rs = stmt2.executeQuery(sql1);
            while (rs.next()) {
                System.out.print(rs.getInt("customer_id") + "::");
                System.out.print(rs.getString("name") + "::");
                System.out.print(rs.getString("city"));
                System.out.println();
            }
            rs.close();
            stmt1.close();
            conn1.close();
            stmt2.close();
        } catch (final ClassNotFoundException e) {
            e.printStackTrace();
        } catch (final SQLException e) {
            e.printStackTrace();
        } finally {

            try {
                if (stmt1 != null) {
                    stmt1.close();
                }
                if (stmt2 != null) {
                    stmt2.close();
                }
                if (conn1 != null) {
                    conn1.close();
                }
            } catch (final SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
	}
}
