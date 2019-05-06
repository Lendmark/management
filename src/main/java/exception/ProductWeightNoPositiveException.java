package exception;

/**
 * Create by Lendemark on 07.05.2019.
 */
public class ProductWeightNoPositiveException extends Exception {
    public ProductWeightNoPositiveException() {
    }

    public ProductWeightNoPositiveException(String message) {
        super(message);
    }
}
