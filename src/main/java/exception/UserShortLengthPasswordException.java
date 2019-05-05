package exception;

/**
 * Create by Lendemark on 05.05.2019.
 */

public class UserShortLengthPasswordException extends Exception {

    public UserShortLengthPasswordException() {
    }

    public UserShortLengthPasswordException(String message) {
        super(message);
    }
}
