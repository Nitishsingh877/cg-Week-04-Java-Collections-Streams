package dyanamiconlinemarketplace;

abstract class Category {
    protected String categoryName;
    protected int price;
    protected String name;

    public Category(String categoryName, int price, String name) {
        this.categoryName = categoryName;
        this.price = price;
        this.name = name;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public abstract void displayCategoryInfo();
}
