package aidrivenresumescreeningsystem;

public class ProductManager extends JobRole{
    public ProductManager() {
        super("Product Manager");
    }

    @Override
    public void displayDetails() {
        System.out.println(getType());
    }
}
