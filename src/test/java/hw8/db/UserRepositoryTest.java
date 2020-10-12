package hw8.db;

import com.mysql.cj.jdbc.MysqlDataSource;
import org.junit.Assert;
import org.junit.Test;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserRepositoryTest {

    public static DataSource prepareDataSource() throws SQLException {
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setUser("root");
        dataSource.setPassword("pass");
        dataSource.setUrl("jdbc:mysql://localhost:3306/geekbrains");
        dataSource.setServerTimezone("UTC");
        return dataSource;
    }

    @Test
    public void usersTablePrinter() throws SQLException {
        UserRepository userRepository = new UserRepository();
        userRepository.usersTablePrinter("users");

    }

    @Test
    public void showUsersByMinMaxAge() throws SQLException {
        UserRepository userRepository = new UserRepository();
        userRepository.showUsersByMinMaxAge(13L,20L);

    }
// OK
    @Test
    public void deleteByName() throws SQLException {
        UserRepository userRepository = new UserRepository();
        userRepository.addToUsersFromString("Bob 32 bob32@gmail.com");
        String name = "Bob";
        userRepository.deleteByName(name);

        DataSource dataSource = prepareDataSource();
        Connection connection = dataSource.getConnection();
        Statement stmnt = connection.createStatement();
        ResultSet rs = stmnt.executeQuery("SELECT * FROM users");
        String result = "No Bob";

        // Не понял как использовать rs.last();
        //java.sql.SQLException: Operation not allowed for a result set
        // of type ResultSet.TYPE_FORWARD_ONLY.

        while (rs.next()) {
            System.out.println(rs.getString(2));
            if (name.equals(rs.getString(2))) {
                result = "Bob";
            }
            Assert.assertEquals(result, "No Bob");
        }

        connection.close();
    }

    @Test
    public void addToUsersFromString() throws SQLException {
        UserRepository userRepository = new UserRepository();
        userRepository.addToUsersFromString("Bob 32 bob32@gmail.com");
        DataSource dataSource = prepareDataSource();
        Connection connection = dataSource.getConnection();
        Statement stmnt = connection.createStatement();
        ResultSet rs = stmnt.executeQuery("SELECT * FROM users");


        while (rs.next()) {

        }
        connection.close();


    }
}