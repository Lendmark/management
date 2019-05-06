package api;

import entity.Product;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

/**
 * Create by Lendemark on 14.04.2019.
 */
public interface ProductDao {

    void saveProduct(Product product) throws IOException;
    void saveProducts(List<Product> products) throws FileNotFoundException;

    void removeProductById(Long productId) throws IOException;
    void removeProductByName(String nameProduct) throws IOException;

    List<Product> getAllProducts() throws IOException;

}
