package exception;

/**
 * Create by Lendemark on 07.05.2019.
 */
public class ProductPriceNoPositiceException extends Exception {
    public ProductPriceNoPositiceException() {
    }

    public ProductPriceNoPositiceException(String message) {
        super(message);
    }
}
