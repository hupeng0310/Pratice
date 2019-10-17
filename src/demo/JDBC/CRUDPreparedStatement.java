package demo.JDBC;

import java.sql.*;

public class CRUDPreparedStatement {
    public static void createForMysql(){
        try {
            //该链接使用我自己封装的MysqlConnection对象获得，不要照抄
            Connection connection = MysqlConnection.getConnection("localhost",3306,"root","root","project");
            PreparedStatement preparedStatement = connection.prepareStatement("insert into user values(?,?)");
            preparedStatement.setString(1,"hupeng");
            preparedStatement.setString(2,"password");
            int c = preparedStatement.executeUpdate();
            System.out.println(c);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    };
    //删
    public static void deleteForMysql(){
        try{
            //注意：MysqlConnection.getConnection()方法使用了缺省参数的Connection
            PreparedStatement preparedStatement = MysqlConnection.getConnection().prepareStatement("delete from user where account = ?");
            preparedStatement.setString(1,"hupeng");
            int d = preparedStatement.executeUpdate();
            System.out.println(d);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    //改
    public static void updateForMysql(){
        try{
            //注意：MysqlConnection.getConnection()方法使用了缺省参数的Connection
            PreparedStatement preparedStatement = MysqlConnection.getConnection().prepareStatement("update user set password = 'hupeng' where account = ?");
            preparedStatement.setString(1,"hupeng");
            int u = preparedStatement.executeUpdate();
            System.out.println(u);
        }catch (SQLException e){

        }
    }
    //查
    public static void readForMysql() {
        try {
            //注意：MysqlConnection.getConnection()方法使用了缺省参数的Connection
            PreparedStatement preparedStatement = MysqlConnection.getConnection().prepareStatement("select * from user");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                System.out.println("account:" + resultSet.getString("account"));
                System.out.println("password:" + resultSet.getString("password"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
        public static void main(String args[]){
        createForMysql();
        readForMysql();
        updateForMysql();
        deleteForMysql();
    }
}
