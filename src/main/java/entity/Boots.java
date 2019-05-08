package entity;

import entity.enums.Color;
import entity.enums.ProductSeparators;
import entity.enums.SkinType;

/**
 * Create by Lendemark on 21.02.2019.
 */
public class Boots extends Product {

    private Integer size;
    private SkinType skinType;


    public Boots(Long id, String productName, Float price, Float weight,
                 Color color, Integer productCount, Integer size, SkinType skinType) {
        super(id, productName, price, weight, color, productCount);
        this.size = size;
        this.skinType = skinType;
    }

    public Integer getSize() {
        return size;
    }

    public SkinType getSkinType(){ return skinType; }

    @Override
    public String toString() {
        return ProductSeparators.BOOTS_ID.toString() +
                ProductSeparators.PRODUCT_SEPARATORS.toString() +
                getBasicProductString() + ProductSeparators.PRODUCT_SEPARATORS.toString() +
                size + ProductSeparators.PRODUCT_SEPARATORS.toString() + skinType;
    }
}
