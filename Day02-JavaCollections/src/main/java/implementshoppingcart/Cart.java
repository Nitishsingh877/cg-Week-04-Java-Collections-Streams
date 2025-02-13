package implementshoppingcart;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Cart {
    HashMap<String,Double> product = new HashMap<>();
    HashMap<String,Double> orderedProduct = new LinkedHashMap<>();
    TreeMap<Double,String > sortedProduct = new TreeMap<>();

    public void addProduct(String name, double price){
        product.put(name,price);

        //add in linked hash map
        orderedProduct.put(name,product.get(name));

        //add in tree map
        sortedProduct.put(price,name);
    }

    public void displayUsingHm(){
        for (Map.Entry<String,Double>entry : product.entrySet()){
            System.out.println("product is : " + entry.getKey() + " and price is " + entry.getValue());
        }
    }
    public void displayUsingLHm(){
        for (Map.Entry<String,Double>entry : orderedProduct.entrySet()){
            System.out.println("product is : " + entry.getKey() + " and price is " + entry.getValue());
        }
    }

    public void displayUsingTm(){
        for (Map.Entry<Double,String>entry : sortedProduct.entrySet()){
            System.out.println("product is : " + entry.getKey() + " and price is " + entry.getValue());
        }
    }


    public static void main(String[] args) {
        Cart cart = new Cart();

        // Add 10 products with their prices
        cart.addProduct("Laptop", 999.99);
        cart.addProduct("Smartphone", 699.49);
        cart.addProduct("Headphones", 59.99);
        cart.addProduct("Tablet", 399.99);
        cart.addProduct("Smartwatch", 199.99);
        cart.addProduct("Monitor", 229.99);
        cart.addProduct("Keyboard", 49.99);
        cart.addProduct("Mouse", 25.99);
        cart.addProduct("Charger", 15.49);
        cart.addProduct("External Hard Drive", 89.99);


        //display in any order using hashmap
        System.out.println("using hashmap");
        cart.displayUsingHm();
        System.out.println("---------");
        System.out.println("using linked Hm");
        //display using linkedHM order
        cart.displayUsingLHm();
        System.out.println("----------");
        System.out.println("using treeMap");
        //display using tree map sorted
        cart.displayUsingTm();

    }


}
