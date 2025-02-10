package dyanamiconlinemarketplace;

public class BookCategory extends Category{
            private String genre;

    public BookCategory(String categoryName, int price, String name,String genre) {
        super("Book", price, name);
        this.genre = genre;
    }

    @Override
    public void displayCategoryInfo() {
        System.out.println("Category name is " + categoryName + "and genre is " + genre);

    }
}
