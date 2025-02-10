package dyanamiconlinemarketplace;

public  class DiscountUtils {

    public static  <T extends Products>  void applyDiscount(T product, double percentage){
        double discount = (product.getPrice() * percentage)/100;
        double newPrice = product.getPrice() - discount;

        product.setPrice(newPrice);

        System.out.println("applied " + percentage + " % discount to"  + product.getName()) ;

        System.out.println("new price is "  + newPrice);
    }


}
