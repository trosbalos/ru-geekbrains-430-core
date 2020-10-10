package hw8.db;

import com.mysql.cj.jdbc.MysqlDataSource;


import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Sandbox {


    public static void main(String[] args) throws SQLException {
        int id = 1;
        DataSource dataSource = prepareDataSource();
        List<User> users = new ArrayList<>();
        try (Connection connection = dataSource.getConnection()) {
            try (PreparedStatement statement = connection.prepareStatement("SELECT * FROM users WHERE id=?")) {
                statement.setString(1, String.valueOf(id));
                try (ResultSet resultSet = statement.executeQuery()) {
                    while (resultSet.next()) {
                        User user = new User();

                        user.setId(resultSet.getLong("id"));
                        user.setName(resultSet.getString("name"));
                        user.setAge(resultSet.getLong("age"));
                        user.setEmail(resultSet.getString("email"));

                        System.out.println(user);
                        users.add(user);
                        id++;
                    }
                }
            }
        }
        System.out.println(users);
    }

    private static DataSource prepareDataSource() throws SQLException {
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setUser("root");
        dataSource.setPassword("FuboSam381");
        dataSource.setUrl("jdbc:mysql://localhost:3306/geekbrains");
        dataSource.setServerTimezone("UTC");
        return dataSource;
    }
}
