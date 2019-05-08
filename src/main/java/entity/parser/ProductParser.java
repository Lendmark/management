package entity.parser;

import entity.*;
import entity.enums.Color;
import entity.enums.Material;
import entity.enums.ProductSeparators;
import entity.enums.SkinType;


/**
 * Create by Lendemark on 15.04.2019.
 */
public class ProductParser {

    public static Product stringToProduct(String productStr) {
        final ProductSeparators productType =
                ProductSeparators.getIdByChar(productStr.substring(0,1));

        switch (productType){
            case PRODUCT_ID:
                return convertToProduct(productStr);
            case CLOTCH_ID:
                return convertToCloth(productStr);
            case BOOTS_ID:
                return convertToBoots(productStr);
        }

        return null;
    }

    private static Product convertToProduct(String productStr){

        String [] productInformations =
                productStr.split(ProductSeparators.PRODUCT_SEPARATORS.toString());

        Long id = Long.parseLong(productInformations[1]);
        String productName = productInformations[2];
        Float price = Float.parseFloat(productInformations[3]);
        Float weight = Float.parseFloat(productInformations[4]);
        Color color = ColorParser.parseStrToColor(productInformations[5]);
        Integer productCount = Integer.parseInt(productInformations[6]);

        return new Product(id, productName, price, weight, color, productCount);
    }

    private static Cloth convertToCloth(String productStr) {
        String [] productInformations =
                productStr.split(ProductSeparators.PRODUCT_SEPARATORS.toString());

        Long id = Long.parseLong(productInformations[1]);
        String productName = productInformations[2];
        Float price = Float.parseFloat(productInformations[3]);
        Float weight = Float.parseFloat(productInformations[4]);
        Color color = ColorParser.parseStrToColor(productInformations[5]);
        Integer productCount = Integer.parseInt(productInformations[6]);
        String size = productInformations[7];
        Material material = MaterialParser.parseStrToMaterial(productInformations[8]);

        return new Cloth(id, productName, price, weight, color,
                productCount, size, material);
    }

    private static Boots convertToBoots(String productStr) {
        String [] productInformations =
                productStr.split(ProductSeparators.PRODUCT_SEPARATORS.toString());

        Long id = Long.parseLong(productInformations[1]);
        String productName = productInformations[2];
        Float price = Float.parseFloat(productInformations[3]);
        Float weight = Float.parseFloat(productInformations[4]);
        Color color = ColorParser.parseStrToColor(productInformations[5]);
        Integer productCount = Integer.parseInt(productInformations[6]);
        Integer size = Integer.parseInt(productInformations[7]);
        SkinType skinType = SkinParser.parseStrToSkinType(productInformations[8]);

        return new Boots(id, productName, price, weight, color, productCount, size, skinType);
    }
}
