package dyanamiconlinemarketplace;

import java.util.ArrayList;
import java.util.List;

public class Products<T extends Category>{
    private String name;
    private double price;
    private T category;
    private List<T> list = new ArrayList<>();

    public Products() {
        this.list = new ArrayList<>();
    }

    public Products(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public void displayProductInfo(){
        System.out.println("product name is " + name);
        System.out.println("price is : $" + price);
        category.displayCategoryInfo();
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public T getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }


}

