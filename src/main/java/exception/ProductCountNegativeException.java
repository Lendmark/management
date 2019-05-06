package exception;

/**
 * Create by Lendemark on 07.05.2019.
 */
public class ProductCountNegativeException extends Exception {
    public ProductCountNegativeException() {
    }

    public ProductCountNegativeException(String message) {
        super(message);
    }
}
