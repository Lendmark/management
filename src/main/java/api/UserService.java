package api;

import entity.User;

import java.util.List;

/**
 * Create by Lendemark on 06.03.2019.
 */
public interface UserService {

    List<User> getAllUsers();
    void addUser(User user);
    void removeUserById(Long userId);

}
