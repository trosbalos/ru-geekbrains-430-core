package hw8.db;

import com.mysql.cj.jdbc.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserRepository {

    public static DataSource prepareDataSource() throws SQLException {
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setUser("root");
        dataSource.setPassword("pass");
        dataSource.setUrl("jdbc:mysql://localhost:3306/geekbrains");
        dataSource.setServerTimezone("UTC");
        return dataSource;
    }

    public void usersTablePrinter(String schema) throws SQLException {
        DataSource dataSource = prepareDataSource();
        List<User> users = new ArrayList<>();
        Connection connection = dataSource.getConnection();
        Statement statement = connection.createStatement();
//        System.out.println("SELECT * FROM "+schema+"");
        ResultSet resultSet = statement.executeQuery("SELECT * FROM "+schema+"");
        while (resultSet.next()) {
            User user = new User();

            user.setId(resultSet.getLong("id"));
            user.setName(resultSet.getString("name"));
            user.setAge(resultSet.getLong("age"));
            user.setEmail(resultSet.getString("email"));

            users.add(user);
        }
        System.out.println(users);
        connection.close();
    }

    public void showUsersByMinMaxAge(Long min, Long max) throws SQLException {
        DataSource dataSource = prepareDataSource();
        List<User> users = new ArrayList<>();
        Connection connection = dataSource.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM users");
        while (resultSet.next()) {
            User user = new User();

            user.setId(resultSet.getLong("id"));
            user.setName(resultSet.getString("name"));
            user.setAge(resultSet.getLong("age"));
            user.setEmail(resultSet.getString("email"));

            users.add(user);
        }
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getAge() > min && users.get(i).getAge() < max) {
                System.out.println(users.get(i));
            }
        }
        connection.close();
    }

    public void deleteByName(String name) throws SQLException {
        DataSource dataSource = prepareDataSource();
        Connection connection = dataSource.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM users");

        while (resultSet.next()) {

            String id = resultSet.getString("id");
            String nameInBase = resultSet.getString("name");
            if (nameInBase.equals(name)) {
                Statement deleteUserStatement = connection.createStatement();
                int resultSetDelete = deleteUserStatement.executeUpdate("DELETE FROM users WHERE ID=" + id);
            }
        }
    }

public void addToUsersFromString(String strToParse) throws SQLException {
        List<String> parseResult = new ArrayList<String>(Arrays.asList(strToParse.split(" ")));

        String name = parseResult.get(0);
        int age = Integer.parseInt(parseResult.get(1));


        String email = parseResult.get(2);

        DataSource dataSource = prepareDataSource();
        Connection connection = dataSource.getConnection();
        Statement addUserStatement = connection.createStatement();
//      Bob 32 bob32@gmail.com
//      Тут я обрабатывал ошибку: You have an error in your SQL syntax
//      System.out.println("INSERT INTO geekbrains.users (name, age, email) VALUES ('"+name+"','"+age+"','"+email+"')");
        int resultSetDelete = addUserStatement.executeUpdate(
                "INSERT INTO geekbrains.users (name, age, email) VALUES ('"+name+"','"+age+"','"+email+"')");



    }


//    public static void main(String[] args) throws SQLException {
//        UserRepository userRepository = new UserRepository();
//        userRepository.showUsersByMinMaxAge(13L,20L);
//        userRepository.deleteByName("Bob");
//        userRepository.addToUsersFromString("Bob 32 bob32@gmail.com");
//        userRepository.usersTablePrinter("users");
//    }


}
