package dyanamiconlinemarketplace;

public class GadgetCategory extends Category{
    private String deviceType;

    public GadgetCategory(String categoryName, int price, String name,String  deviceType) {
        super("Gadget", price, name);
        this.deviceType = deviceType;
    }

    @Override
    public String getCategoryName() {
        return super.getCategoryName();
    }

    @Override
    public void displayCategoryInfo() {
        System.out.println("\ncategory is " + getCategoryName() + " device type is " + deviceType);
    }
}
