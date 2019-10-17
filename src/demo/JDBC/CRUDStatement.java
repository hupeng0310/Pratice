package demo.JDBC;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CRUDStatement {
    //增
    public static void createForMysql(){
        //该链接使用我自己封装的MysqlConnection对象获得，不要照抄
        try {
            Statement statement = MysqlConnection.getConnection().createStatement();
            int c = statement.executeUpdate("insert into user values('hupeng','password')");
            System.out.println(c);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    //删
    public static void deleteForMysql(){
        try{
            //注意：MysqlConnection.getConnection()方法使用了缺省参数的Connection
            Statement statement = MysqlConnection.getConnection().createStatement();
            int d = statement.executeUpdate("delete form user where account = 'hupeng'");
            System.out.println(d);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    public static void updateForMysql(){
        try{
            //注意：MysqlConnection.getConnection()方法使用了缺省参数的Connection
            Statement statement = MysqlConnection.getConnection().createStatement();
            int u = statement.executeUpdate("update user set password = 'hupeng'");
            System.out.println(u);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    //查
    public static void readForMysql(){
        try{
            //注意：MysqlConnection.getConnection()方法使用了缺省参数的Connection
            Statement statement = MysqlConnection.getConnection("localhost",3306,"root","root","project").createStatement();
            ResultSet resultSet = statement.executeQuery("select * from user");
            while (resultSet.next()) {
                System.out.println("account:" + resultSet.getString("account"));
                System.out.println("password:" + resultSet.getString("password"));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        createForMysql();
        updateForMysql();
        readForMysql();
        deleteForMysql();
    }
}
