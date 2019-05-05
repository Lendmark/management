package exception;

/**
 * Create by Lendemark on 05.05.2019.
 */

public class UserLoginAlreadyExistException extends Exception {

    public UserLoginAlreadyExistException() {
    }

    public UserLoginAlreadyExistException(String message) {
        super(message);
    }
}
