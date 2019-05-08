package api;

import entity.User;

import java.io.IOException;

/**
 * Create by Lendemark on 07.05.2019.
 */
public interface UserRegisterLoginFacade {

    boolean registerUser(User user);
    boolean loginUser(String login, String password);
}
// FIXME: 08.05.2019 dokończenie przed angolem całego 6 tydodnia tak by móc odrobić prace domową i ruszyć dalej