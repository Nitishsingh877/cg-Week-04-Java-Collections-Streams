package dyanamiconlinemarketplace;

public class GadgetCategory extends Category{
    private String deviceType;

    public GadgetCategory(String  deviceType) {
        super("Gadget");
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
