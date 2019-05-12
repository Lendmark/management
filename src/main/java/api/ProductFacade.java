package api;

import entity.Product;

import java.util.List;

/**
 * Create by Lendemark on 12.05.2019.
 */
public interface ProductFacade {

    String createProduct(Product product);
    String removeProduct(String productName);
    List<Product> getAllProducts();
}
