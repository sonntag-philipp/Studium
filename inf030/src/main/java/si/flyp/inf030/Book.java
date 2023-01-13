package si.flyp.inf030;

public class Book {

    private String title;
    private String author;
    private String releaseYear;
    private int pages;
    private double price;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(String releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
    
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void publish() {
        System.out.println("Publishing book...");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Release Year: " + releaseYear);
        System.out.println("Pages: " + pages);
        System.out.println("\n########\n");
    }
}
