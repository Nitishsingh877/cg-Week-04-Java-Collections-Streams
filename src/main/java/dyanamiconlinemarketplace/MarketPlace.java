package dyanamiconlinemarketplace;

import java.util.ArrayList;
import java.util.List;

public class MarketPlace {
    public static void main(String[] args) {

        //create category
        BookCategory bookCategory = new BookCategory("fiction");
        ClothingCategory clothingCategory = new ClothingCategory("34-b");
        GadgetCategory gadgetCategory = new GadgetCategory("smartphone");


        //create product
        Products<BookCategory> bookCategoryProducts = new Products<>("never alone",899,bookCategory);
        Products<ClothingCategory> clothingCategoryProducts = new Products<>("TShirt", 859,clothingCategory);
        Products<GadgetCategory> gadgetCategoryProducts = new Products<>("iphone",84000,gadgetCategory);


        //store products in a list
        List<Products<?>> productsList = new ArrayList<>();
        productsList.add(bookCategoryProducts);
        productsList.add(clothingCategoryProducts);
        productsList.add(gadgetCategoryProducts);

        //display all details
        System.out.println("before discount");
        for(Products<?> products : productsList){
            products.displayProductInfo();
            System.out.println("------------");
        }

        //after discount
        DiscountUtils.applyDiscount(bookCategoryProducts,10);
        DiscountUtils.applyDiscount(clothingCategoryProducts,5);
        DiscountUtils.applyDiscount(gadgetCategoryProducts,18);


        //sout after discount


        System.out.println("\nafter discount");
        for(Products<?> products : productsList){
            products.displayProductInfo();
            System.out.println("------------");
        }

    }
}
