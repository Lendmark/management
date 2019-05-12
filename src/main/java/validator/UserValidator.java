package validator;

import entity.User;
import exception.UserShortLengthLoginException;
import exception.UserShortLengthPasswordException;

/**
 * Create by Lendemark on 05.05.2019.
 */
public class UserValidator {
    private final int MIN_LENGTH_PASSWORD = 6;
    private final int MIN_LENGTH_LOGIN = 4;

    private UserValidator() {
    }

    private static UserValidator instance = null;

    public static UserValidator getInstance() {
        if (instance == null) {
            instance = new UserValidator();
        }
        return instance;
    }

    public boolean isValidate(User user) throws UserShortLengthLoginException,
            UserShortLengthPasswordException {

        if (!isLoginLengthEnough(user.getLogin())) {
            throw new UserShortLengthLoginException("Login is too short min 4 char.");
        }

        if (!isPasswordLengthEnough(user.getPassword())) {
            throw new UserShortLengthPasswordException("Password is too short min 6 char.");
        }

        return true;
    }

    private boolean isPasswordLengthEnough(String password) {
        return password.length() >= MIN_LENGTH_PASSWORD;
    }

    private boolean isLoginLengthEnough(String login) { return login.length() >= MIN_LENGTH_LOGIN; }


}

