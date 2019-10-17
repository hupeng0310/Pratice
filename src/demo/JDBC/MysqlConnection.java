package demo.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlConnection {
    private static final String className = "com.mysql.cj.jdbc.Driver";
    private static final String urlHead = "jdbc:mysql://";
    private static final String urlEnd = "?characterEncoding=utf8&useSSL=false&serverTimezone=UTC&rewriteBatchedStatements=true&allowPublicKeyRetrieval=true";
    private static String address;
    private static int port;
    private static String user;
    private static String password;
    //放置一个静态的Connection对象，以提高性能
    private static Connection connection;
    private static String database;
    //设置数据库的配置信息
    static {
        try {
            Class.forName(className);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    private static void setConfig(String address,int port,String user,String password,String database){
        MysqlConnection.address = address;
        MysqlConnection.port = port;
        MysqlConnection.user = user;
        MysqlConnection.password = password;
        MysqlConnection.database = database;
    }
    public static Connection getConnection() throws SQLException {
        if(connection == null || connection.isClosed()){
            connection = DriverManager.getConnection(urlHead+address + ":" + port +"/" +database +urlEnd,user,password);
        }
        return connection;
    }
    public static Connection getConnection(String address,int port,String user,String password,String database) throws SQLException {
        setConfig(address, port, user, password, database);
        return getConnection();
    }
    private MysqlConnection(){
    }
}
