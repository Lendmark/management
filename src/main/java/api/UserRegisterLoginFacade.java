package api;

import entity.User;


/**
 * Create by Lendemark on 07.05.2019.
 */
public interface UserRegisterLoginFacade {

    boolean registerUser(User user);
    boolean loginUser(String login, String password);
}