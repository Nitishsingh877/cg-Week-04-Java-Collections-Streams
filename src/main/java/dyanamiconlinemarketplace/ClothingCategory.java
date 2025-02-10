package dyanamiconlinemarketplace;

import javax.swing.*;

public class ClothingCategory extends Category{
    private String size;

    public ClothingCategory(String categoryName, int price, String name,String size) {
        super("clothing", price, name);
        this.size =size;
    }

    @Override
    public String getCategoryName() {
        return super.getCategoryName();
    }

    @Override
    public void displayCategoryInfo() {
        System.out.println("category is " + getCategoryName() + " and size is  " + size);

    }
}
