package dyanamiconlinemarketplace;

import javax.swing.*;

public class ClothingCategory extends Category{
    private String size;

    public ClothingCategory(String size) {
        super("clothing");
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
