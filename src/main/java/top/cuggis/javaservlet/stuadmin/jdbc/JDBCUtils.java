package top.cuggis.javaservlet.stuadmin.jdbc;

import java.sql.*;

public class JDBCUtils {

    private static String driver;
    private static String url;
    private static String user;
    private static String password;

    private static JDBCUtils instance = null;
    private static Connection connection = null;

    public static void config(String driver, String url, String user, String password) {
        JDBCUtils.driver = driver;
        JDBCUtils.url = url;
        JDBCUtils.user = user;
        JDBCUtils.password = password;
    }

    public static JDBCUtils getInstance() {
        if (instance == null) {
            synchronized (JDBCUtils.class) {
                if (instance == null) {
                    instance = new JDBCUtils();
                }
            }
        }
        return instance;
    }

    private JDBCUtils() {
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


    public Connection getConnection() {
        if (connection == null)
            try {
                connection = DriverManager.getConnection(url, user, password);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        System.out.println("获取连接");
        return connection;
    }
}
