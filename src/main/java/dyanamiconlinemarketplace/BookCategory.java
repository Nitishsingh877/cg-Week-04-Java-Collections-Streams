package dyanamiconlinemarketplace;

public class BookCategory extends Category{
            private String genre;

    public BookCategory(String categoryName,String genre) {
        super("Book");
        this.genre = genre;
    }

    @Override
    public void displayCategoryInfo() {
        System.out.println("Category name is " + categoryName + "and genre is " + genre);

    }
}
