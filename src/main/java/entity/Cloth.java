package entity;

import entity.enums.Color;
import entity.enums.Material;
import entity.enums.ProductSeparators;

/**
 * Create by Lendemark on 21.02.2019.
 */
public class Cloth extends Product {

    private String size;
    private Material material;


    public Cloth(Long id, String productName, Float price, Float weight, Color color,
                 Integer productCount, String size, Material material) {
        super(id, productName, price, weight, color, productCount);
        this.size = size;
        this.material = material;
    }

    public String getSize() {
        return size;
    }

    public Material getMaterial() {
        return material;
    }

    @Override
    public String toString () {
        return ProductSeparators.CLOTCH_ID.toString() +
               ProductSeparators.PRODUCT_SEPARATORS.toString() +
               getBasicProductString() + ProductSeparators.PRODUCT_SEPARATORS.toString() +
               size + ProductSeparators.PRODUCT_SEPARATORS.toString() + material;
    }
}
