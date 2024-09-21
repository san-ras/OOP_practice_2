public class Book {

    private int pages;
    private String title;
    private int publicationYear;

    public Book(int pages, String title, int publicationYear) {
        this.pages = pages;
        this.title = title;
        this.publicationYear = publicationYear;
    }

    public int getPages() {
        return pages;
    }

    public String getTitle() {
        return title;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    @Override
    public String toString() {
        return title + ", " + pages + " pages, " + publicationYear;
    }
}
