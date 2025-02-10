package smartwarehousemanagementsystem;

public class smartWareHouseSystem {
    public static void main(String[] args) {

        //storage for electronics
        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItems(new Electronics("Laptop", 50,5000,12));
        electronicsStorage.addItems(new Electronics("phones",10,8999,15));

        //storage for groceries
        Storage<Groceries> groceriesStorage = new Storage<>();
        groceriesStorage.addItems(new Groceries("aplle",2,50,6));
        groceriesStorage.addItems(new Groceries("dudu",69,5,0));

        //storage for furniture
        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItems(new Furniture("chair",5,500,"wood"));
        furnitureStorage.addItems(new Furniture("palang",1,5999,"plastic"));


        //display all items.
        WarehouseUtils.displayAllItems(electronicsStorage.getItems());
        WarehouseUtils.displayAllItems(groceriesStorage.getItems());
        WarehouseUtils.displayAllItems(furnitureStorage.getItems());
    }
}
