package dyanamiconlinemarketplace;

abstract class Category {

    protected String categoryName;

    public Category(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public abstract void displayCategoryInfo();
}
