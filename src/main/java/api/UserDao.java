package api;

import entity.User;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

/**
 * Create by Lendemark on 05.05.2019.
 */
public interface UserDao {

    void saveUser(User user) throws IOException;
    void saveUsers(List<User> users) throws FileNotFoundException;

    void removeUserById(Long userId) throws IOException;
    void removeUserByLogin(String login) throws IOException;

    List<User> getAllUsers() throws IOException;
    User getUserById(Long userId) throws IOException;
    User getUserByLogin(String login) throws IOException;
}
