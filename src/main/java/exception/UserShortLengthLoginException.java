package exception;

/**
 * Create by Lendemark on 05.05.2019.
 */

public class UserShortLengthLoginException extends Exception {

    public UserShortLengthLoginException() {
    }

    public UserShortLengthLoginException(String message) {
        super(message);
    }
}
