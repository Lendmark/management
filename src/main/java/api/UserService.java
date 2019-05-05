package api;

import entity.User;
import exception.UserLoginAlreadyExistException;
import exception.UserShortLengthLoginException;
import exception.UserShortLengthPasswordException;

import java.io.IOException;
import java.util.List;

/**
 * Create by Lendemark on 06.03.2019.
 */
public interface UserService {

    List<User> getAllUsers() throws IOException;
    void addUser(User user) throws IOException, UserShortLengthPasswordException, UserShortLengthLoginException, UserLoginAlreadyExistException;
    void removeUserById(Long userId) throws IOException;

}
