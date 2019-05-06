package exception;

/**
 * Create by Lendemark on 07.05.2019.
 */
public class ProductNameEmptyException extends Exception{
    public ProductNameEmptyException() {
    }

    public ProductNameEmptyException(String message) {
        super(message);
    }
}
