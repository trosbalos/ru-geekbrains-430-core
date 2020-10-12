package hw8.db;

import org.junit.Test;

import java.sql.SQLException;

import static org.junit.Assert.*;

public class UserRepositoryTest {

    @Test
    public void prepareDataSource()  {

    }

    @Test
    public void usersTablePrinter() throws SQLException {
        UserRepository userRepository = new UserRepository();
        userRepository.usersTablePrinter("users") ;
    }

    @Test
    public void showUsersByMinMaxAge() throws SQLException{
        UserRepository userRepository = new UserRepository();
        userRepository.showUsersByMinMaxAge(13L,20L);

    }

    @Test
    public void deleteByName() throws SQLException{
        UserRepository userRepository = new UserRepository();
        userRepository.deleteByName("Bob");
    }

    @Test
    public void addToUsersFromString() throws SQLException{
        UserRepository userRepository = new UserRepository();
        userRepository.addToUsersFromString("Bob 32 bob32@gmail.com");

    }
}