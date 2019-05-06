package validator;

import entity.Product;
import exception.ProductCountNegativeException;
import exception.ProductNameEmptyException;
import exception.ProductPriceNoPositiceException;
import exception.ProductWeightNoPositiveException;

/**
 * Create by Lendemark on 07.05.2019.
 */
public class ProductValidator {

    private static ProductValidator instance = null;
    private ProductValidator() {}

    public static ProductValidator getInstance(){
        if(instance == null ){
            instance = new ProductValidator();
        }
        return instance;
    }

    private boolean isPriceNoPositive(Float prince) {
        return prince <= 0.0f;
    }

    private boolean isCountNegative(Integer productCount) {
        return productCount < 0;
    }

    private boolean isWeightNoPositive(Float weight) {
        return weight <= 0.0f;
    }

    private boolean isNameEmpty(String productName) {
        return productName.length() == 0;
    }

    public boolean isValidate(Product product) throws ProductNameEmptyException,
            ProductCountNegativeException, ProductPriceNoPositiceException,
            ProductWeightNoPositiveException{

        if(isPriceNoPositive(product.getPrice())){
            throw new ProductPriceNoPositiceException("Product prince is no positive");
        }

        if (isCountNegative(product.getProductCount())){
            throw new ProductCountNegativeException("Product count is lass then 0.");
        }

        if (isWeightNoPositive(product.getWeight())){
            throw new ProductWeightNoPositiveException("Product weight is less or equals 0.");
        }

        if (isNameEmpty(product.getProductName())){
            throw new ProductNameEmptyException("Product name cannot by empty.");
        }

        return true;
    }
}
