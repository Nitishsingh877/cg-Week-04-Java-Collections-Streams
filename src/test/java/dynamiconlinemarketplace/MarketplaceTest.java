package dynamiconlinemarketplace;

import dyanamiconlinemarketplace.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarketplaceTest {

     private Products<BookCategory> bookCategoryProducts;
     private Products<GadgetCategory> gadgetCategoryProducts;
     private Products<ClothingCategory>clothingCategoryProducts;

     @BeforeEach
    public void setup(){
         BookCategory bookCategory = new BookCategory("Fiction");
         ClothingCategory clothingCategory = new ClothingCategory("Medium");
         GadgetCategory gadgetCategory = new GadgetCategory("Smartphone");

         // Create product instances
         bookCategoryProducts = new Products<>("The Great Gatsby", 15.99, bookCategory);
         clothingCategoryProducts = new Products<>("T-Shirt", 19.99, clothingCategory);
         gadgetCategoryProducts = new Products<>("iPhone", 999.99, gadgetCategory);
     }

     @Test
    public void testApplyDiscountOnBook(){
         //apply 10% discount
         DiscountUtils.applyDiscount(bookCategoryProducts , 10);

         //verify the price is updated correctly
         assertEquals(14.391, bookCategoryProducts.getPrice(), "Discount on book should be 10%");
     }

     @Test
     public void testApplyDiscountOnClothing(){
         //apply 10% discount
         DiscountUtils.applyDiscount(clothingCategoryProducts , 15);

         //verify the price is updated correctly
         assertEquals(16.9915, clothingCategoryProducts.getPrice(), "Discount on clothing should be 15%");
     }

     @Test
     public void testApplyDiscountOnGadgets(){
         //apply 10% discount
         DiscountUtils.applyDiscount(gadgetCategoryProducts , 5);

         //verify the price is updated correctly
         assertEquals(949.9905, gadgetCategoryProducts.getPrice(), "Discount on gadgets should be 5%");
     }


     @Test
    public void testProductsCatalog(){
         //store products
         Products<?>[] products = {bookCategoryProducts, clothingCategoryProducts,gadgetCategoryProducts};

         //check catalog
         assertEquals(3,products.length,"product catalog should have 3 products");

     }

     @Test
    public void testProductInfo(){
         assertAll("product info",
                 () -> assertEquals("The Great Gatsby", bookCategoryProducts.getName()),
                 () -> assertEquals("T-Shirt", clothingCategoryProducts.getName()),
                 () -> assertEquals("iPhone" , gadgetCategoryProducts.getName())
                 );
     }


}
