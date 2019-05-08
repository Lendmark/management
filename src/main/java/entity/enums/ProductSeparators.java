package entity.enums;

/**
 * Create by Lendemark on 08.05.2019.
 */


public enum ProductSeparators {

    PRODUCT_SEPARATORS("#"), PRODUCT_ID("P"), CLOTCH_ID("C"), BOOTS_ID("B");

    private String word;

    ProductSeparators(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    @Override
    public String toString() {
        return word;
    }

    public static ProductSeparators getIdByChar(String word){
        for(ProductSeparators id: ProductSeparators.values()){
            if( id.getWord().equals(word)) {
                return id;
            }
        }
        return null;
    }
}
