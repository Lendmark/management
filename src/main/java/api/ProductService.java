package api;

import entity.Product;
import exception.ProductCountNegativeException;
import exception.ProductNameEmptyException;
import exception.ProductPriceNoPositiceException;
import exception.ProductWeightNoPositiveException;

import java.io.IOException;
import java.util.List;

/**
 * Create by Lendemark on 07.03.2019.
 */
public interface ProductService {

    List<Product> getAllProducts() throws IOException;
    Integer getCountProducts() throws IOException;
    Product getProductByProductName(String productName) throws IOException;

    boolean isProductOnWarehouse(String productName);
    boolean isProductExist(String productName) throws IOException;
    boolean isProductExist(Long productId) throws IOException;

    boolean saveProduct(Product product) throws ProductWeightNoPositiveException, ProductNameEmptyException, ProductCountNegativeException, ProductPriceNoPositiceException, IOException;
    void removeProduct(String productName) throws IOException;

}