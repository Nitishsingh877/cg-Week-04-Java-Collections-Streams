package smartwarehousemanagementsystem;

public class Furniture extends WarehouseItem{
    private String materialUsed;
    public Furniture(String name, int quantity, double price, String materialUsed) {
        super(name, quantity, price);
        this.materialUsed = materialUsed;
    }

    @Override
    public void displayDetails() {
        System.out.println(" \n item name is "  + name + " quantity is "
                + quantity + " price is " + price + " material used is :"
                + materialUsed);

    }
}
