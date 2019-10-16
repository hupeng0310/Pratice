package demo.JDBC;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        MysqlConnection.getConnection("localhost",3306,"root","root","mysql");
        Statement statement = MysqlConnection.getConnection().createStatement();
        ResultSet resultSet = statement.executeQuery("select host from user");
        while(resultSet.next()){
            System.out.println(resultSet.getString(1));
        }
    }
}
