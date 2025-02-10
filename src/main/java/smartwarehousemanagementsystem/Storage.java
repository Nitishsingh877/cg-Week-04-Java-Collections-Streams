package smartwarehousemanagementsystem;

import java.util.ArrayList;
import java.util.List;

class Storage<T extends WarehouseItem> {
    private List<T> items;

    public Storage() {
        this.items = new ArrayList<>();
    }

    public void addItems(T item){
        items.add(item);
        System.out.println(item.name + " added to storage.");
    }

    public List<T> getItems(){
        return items;
    }
}