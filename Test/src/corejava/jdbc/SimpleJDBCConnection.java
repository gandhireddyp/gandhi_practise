package corejava.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SimpleJDBCConnection {

    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/test";

    // Database credentials
    static final String USER = "devuser";
    static final String PASS = "devpass";

    public static void main(final String[] args) {

        Connection conn = null;
        Statement stmt = null;

        try {
            Class.forName(JDBC_DRIVER);
            System.out.println("Connecting to database...");
            /**
             * We can load multiple drivers using the same driver manager. In
             * this case, the DriverManager.getConnection() method actually
             * delegates the construction of the connection to all drivers
             * registered with it. Only drivers that recognize the protocols in
             * the JDBC URL(ex jdbc:mysql in URL) will return the connection.
             * 
             * The JDBC specification states: When the DriverManager is trying
             * to establish a connection, it calls that driver’s connect method
             * and passes the driver the URL. If the Driver implementation
             * understands the URL, it will return a Connection
             * 
             */
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            stmt = conn.createStatement();
            final String sql = "select * from customer";
            final ResultSet rs = stmt.executeQuery(sql);
            /**
             * If you issue close statement on connection or statement, before
             * the resultset is iterated, you will get an exception.
             * java.sql.SQLException: Operation not allowed after ResultSet
             * closed
             */
            // stmt.close();
            while (rs.next()) {
                System.out.print(rs.getString(1));
                System.out.println();
            }
            rs.close();
            stmt.close();
            conn.close();
        } catch (final ClassNotFoundException e) {
            e.printStackTrace();
        } catch (final SQLException e) {
            e.printStackTrace();
        } finally {

            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (final SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

}
