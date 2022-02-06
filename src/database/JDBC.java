package database;
import java.sql.*;

public class JDBC {
    public static void main(String[] args) throws Exception {
        getConnection();
    }

    public static Connection getConnection() throws Exception {
        try {
            String driver = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/employee";
            String username = "root";
            String password = "Qlqjsanjgkwl1?";
            Class.forName(driver);

            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("Server Connected");
            return conn;

        } catch (Exception e) {System.out.println(e);}
        return null;
    }

    


}
