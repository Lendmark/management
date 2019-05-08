package entity;

import entity.enums.Color;
import entity.enums.ProductSeparators;

/**
 * Create by Lendemark on 21.02.2019.
 */
public class Product {

    private Long id;
    private String productName;
    private Float price;
    private Float weight;
    private Color color;
    private Integer productCount;

    public Product (Long id, String productName, Float price, Float weight,
                    Color color, Integer productCount) {
        this.id = id;
        this.productName = productName;
        this.price = price;
        this.weight = weight;
        this.color = color;
        this.productCount=productCount;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public void setProductCount(Integer productCount) {
        this.productCount = productCount;
    }

    public Long getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public Float getPrice() {
        return price;
    }

    public Float getWeight() {
        return weight;
    }

    public Color getColor() {
        return color;
    }

    public Integer getProductCount() {
        return productCount;
    }

    @Override
   public String toString() {
        return ProductSeparators.PRODUCT_ID.toString() +
                ProductSeparators.PRODUCT_SEPARATORS.toString() +
                getBasicProductString();
    }

    protected String getBasicProductString() {
        return id + ProductSeparators.PRODUCT_SEPARATORS.toString() + productName +
                ProductSeparators.PRODUCT_SEPARATORS.toString() + price +
                ProductSeparators.PRODUCT_SEPARATORS.toString() + weight +
                ProductSeparators.PRODUCT_SEPARATORS.toString() + color +
                ProductSeparators.PRODUCT_SEPARATORS.toString() + productCount;
    }
}
