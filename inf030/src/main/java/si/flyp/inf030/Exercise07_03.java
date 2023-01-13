package si.flyp.inf030;

public class Exercise07_03 {
    
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.setTitle("The Lord of the Rings: The Fellowship of the Ring");
        book1.setReleaseYear("1954");
        book1.setAuthor("J.R.R. Tolkien");
        book1.setPages(423);
        book1.setPrice(29.90);

        book1.publish();

        Book book2 = new Book();
        book2.setTitle("Demon Slayer: Kimetsu no Yaiba, Vol. 1");
        book2.setReleaseYear("2016");
        book2.setAuthor("Kyoharu Gotouge");
        book2.setPages(192);
        book2.setPrice(9.90);

        book2.publish();

        Book book3 = new Book();
        book3.setTitle("The Great Gatsby");
        book3.setReleaseYear("1925");
        book3.setAuthor("F. Scott Fitzgerald");
        book3.setPages(180);
        book3.setPrice(29.90);

        book3.publish();
    }
}
