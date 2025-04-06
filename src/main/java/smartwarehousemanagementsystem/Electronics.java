package smartwarehousemanagementsystem;

public class Electronics extends  WarehouseItem{
    private int WarrantyPeriods;
    public Electronics(String name, int quantity, double price,int warrantyPeriods) {
        super(name, quantity, price);
        this.WarrantyPeriods = warrantyPeriods;
    }

    @Override
    public void displayDetails() {
        System.out.println(" \n  item name is "  + name + " quantity is " + quantity + " price is " + price + " warranty periods for "  + WarrantyPeriods);
    }
}
