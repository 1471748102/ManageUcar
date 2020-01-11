package conn;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class connect {
    private static String dirver;
    private static String url;
    private static String username;
    private static String password;

    static{
        try {

            InputStream inputStream = connect.class.getClassLoader()
                    .getResourceAsStream("db.properties");
            Properties properties = new Properties();

            properties.load(inputStream);

            dirver = properties.getProperty("db.driver");
            url = properties.getProperty("db.url");
            username = properties.getProperty("db.username");
            password = properties.getProperty("db.password");
            System.out.println(dirver);
            System.out.println(url);
            System.out.println(username);
            System.out.println(password);

            Class.forName(dirver);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }


    public static Connection getConnection() {
        Connection conn=null;
        try {
            conn=DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }


    public static void main(String[] args) {
        connect.getConnection();
    }
}

