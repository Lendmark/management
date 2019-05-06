package api;

import entity.User;


import java.io.IOException;
import java.util.List;

/**
 * Create by Lendemark on 06.03.2019.
 */
public interface UserService {

    List<User> getAllUsers() throws IOException;
    User getUserById(Long userId) throws IOException;
    User getUserByLogin(String login) throws IOException;

    boolean addUser(User user);

    void removeUserById(Long userId) throws IOException;

    boolean isCorrectLoginAndPassword(String login, String password);

}

