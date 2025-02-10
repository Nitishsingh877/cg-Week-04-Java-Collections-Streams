package smartwarehousemanagementsystem;

public abstract class WarehouseItem {
    protected String name;
    protected int quantity;
    protected double price;

    public WarehouseItem(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public abstract void displayDetails();
}
