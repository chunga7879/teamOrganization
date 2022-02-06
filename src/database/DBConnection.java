package database;
import oracle.jdbc.driver.OracleDriver;

import java.sql.*;

public class DBConnection {
    private static Connection con;


    public static Connection getCon() {
        return con;
    }

    public static boolean withConnection() {
        System.out.println("Creating Connection...");
        String connectURL = "jdbc:oracle:thin:@localhost:1522:ug";

        try
        {
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            con = DriverManager.getConnection(connectURL,"ora_xhehf77","a18848614");
            con.commit();
            con.setAutoCommit(false);
            System.out.println("\nConnected to Oracle!");
            return true;
        } catch (SQLException ex)
        {
            System.out.println("Message: " + ex.getMessage());
            return false;
        }

    }

    public static boolean close() {
        try {
            con.close();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Close Error");
            return false;
        }
    }

}
