package service;

import entity.Boots;
import entity.Cloth;
import entity.Product;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Create by Lendemark on 07.03.2019.
 */

public class ProductServiceTest {

    @Test
    public void testGetAllProducts(){

        //is
        List<Product> products = new ArrayList<Product>();
        products.add(new Boots(1L, "Boots", 23.32f, 33.3f, "Blue",
                2, 2,true));
        products.add(new Cloth(1L, "cloth", 23.32f, 33.3f, "Red",
                2, "XXL", "cloth"));

        //then
        ProductServiceImpl productService = new ProductServiceImpl(products);
        List<Product> productsFromTestClass = productService.getAllProducts();

        //expected
        Assert.assertEquals(products, productsFromTestClass);
    }

    @Test
    public void testGetCountProduct(){

        //is
        List<Product> products = new ArrayList<Product>();
        products.add(new Boots(1L, "Boots", 23.32f, 33.3f, "Blue",
                2, 2,true));
        products.add(new Cloth(1L, "cloth", 23.32f, 33.3f, "Red",
                2, "XXL", "cloth"));

        //then
        ProductServiceImpl productService = new ProductServiceImpl(products);
        final int result = productService.getCountProducts();

        Assert.assertEquals(2, result);
    }

    @Test
    public void testGetProductByProductName() {

        //is
        List<Product> products = new ArrayList<Product>();
        products.add(new Boots(1L, "Boots", 23.32f, 33.3f, "Blue",
                2, 2, true));
        products.add(new Cloth(1L, "cloth", 23.32f, 33.3f, "Red",
                2, "XXL", "cloth"));

        //then
        ProductServiceImpl productService = new ProductServiceImpl(products);
        final Product product = productService.getProductByProductName("Boots");

        Assert.assertEquals("Boots", product.getProductName());
    }

    @Test
    public void testIsProductOnWarehouse(){

        //is
        List<Product> products = new ArrayList<Product>();
        products.add(new Boots(1L, "Boots", 23.32f, 33.3f, "Blue",
                2, 2,true));
        products.add(new Cloth(1L, "cloth", 23.32f, 33.3f, "Red",
                2, "XXL", "cloth"));

        //then
        ProductServiceImpl productService = new ProductServiceImpl(products);
        final boolean isProductOnWarehouse = productService.isProductOnWarehouse("Boots");

        Assert.assertTrue(isProductOnWarehouse);
    }

    @Test
    public void testIsProductExistByName(){

        //is
        List<Product> products = new ArrayList<Product>();
        products.add(new Boots(1L, "Boots", 23.32f, 33.3f, "Blue",
                2, 2,true));
        products.add(new Cloth(1L, "cloth", 23.32f, 33.3f, "Red",
                2, "XXL", "cloth"));

        //then
        ProductServiceImpl productService = new ProductServiceImpl(products);
        final boolean isProductExist = productService.isProductExist("Boots");

        Assert.assertTrue(isProductExist);
    }

    @Test
    public void testIsProductExistByID(){

        //is
        List<Product> products = new ArrayList<Product>();
        products.add(new Boots(1L, "Boots", 23.32f, 33.3f, "Blue",
                2, 2,true));
        products.add(new Cloth(1L, "cloth", 23.32f, 33.3f, "Red",
                2, "XXL", "cloth"));

        //then
        ProductServiceImpl productService = new ProductServiceImpl(products);
        final boolean isProductExist = productService.isProductExist(1L);

        Assert.assertTrue(isProductExist);

    }
}
