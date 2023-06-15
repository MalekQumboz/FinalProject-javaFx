package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private static DBConnection db = null;

    private DBConnection() {

    }

    public static DBConnection getInstance() {
        if (db == null) {
            db = new DBConnection();
            return db;
        } else {
            return db;
        }
    }
   
    public Connection getConnection() throws SQLException, ClassNotFoundException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/clinic_appointments", "root", "");
        return conn;
    }
}
