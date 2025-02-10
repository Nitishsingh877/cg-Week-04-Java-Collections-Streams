package smartwarehousemanagementsystem;

import java.util.List;

public class WarehouseUtils {
    public static void displayAllItems(List<? extends WarehouseItem> items){
        System.out.println("\nDisplaying all the items in storage");
        for(WarehouseItem item  : items){
            item.displayDetails();
        }
    }
}
