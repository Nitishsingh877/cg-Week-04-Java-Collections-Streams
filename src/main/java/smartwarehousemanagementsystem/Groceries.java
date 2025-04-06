package smartwarehousemanagementsystem;

public class Groceries extends WarehouseItem{
    private  int freshBeforeDays;
    public Groceries(String name, int quantity, double price,int freshBeforeDays) {
        super(name, quantity, price);
        this.freshBeforeDays = freshBeforeDays;
    }

    @Override
    public void displayDetails() {
        System.out.println("\n item name is "  + name + " quantity is "
                + quantity + " price is " + price + " best use before days is :"
                + freshBeforeDays);

    }
}
