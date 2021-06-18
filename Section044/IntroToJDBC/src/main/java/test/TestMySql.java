// Section 44, lectures 173-175.

package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestMySql {
    private static Connection connectToMySql() throws SQLException {
        String connectionUrl = 
                "jdbc:mysql://localhost:3306/UnivJava_test?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
        // Next line is no longer required, but appears in legacy code:
            // Class.forName("com.mysql.cj.jdbc.Driver"); // May be needed in WebApps
        return DriverManager.getConnection(
                connectionUrl, "root", System.getenv("pass"));
    }
    
    private static void closeMySqlObjs(ResultSet r, Statement q, Connection c)
    throws SQLException {
        r.close();
        q.close();
        c.close();
    }
    
    public static void main(String[] args) {
        try {
            Connection connection = connectToMySql();
            Statement instruction = connection.createStatement();
            String query = "SELECT * FROM persona";
            ResultSet result = instruction.executeQuery(query);
            while (result.next()) {
                System.out.print("Id: " + result.getInt("id") + ", ");
                System.out.print("First name: " + result.getString("nombre") + ", ");
                System.out.print("Last name: " + result.getString("apellido") + ", ");
                System.out.print("Email: " + result.getString("email") + ", ");
                System.out.println("Phone: " + result.getString("telefono"));
            }
            closeMySqlObjs(result, instruction, connection);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
}
