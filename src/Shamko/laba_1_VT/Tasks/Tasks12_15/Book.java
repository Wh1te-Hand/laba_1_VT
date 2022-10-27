package Shamko.laba_1_VT.Tasks.Tasks12_15;

public class Book implements Comparable<Book>{
    private String title;
    private String author;
    private int price;
    private static int edition;

    private int isbn;

    protected Book(){

    }

    public Book(String title, String author, int price, int edition){
        this.title = title;
        this.author = author;
        this.price = price;
        Book.edition = edition;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static int getEdition() {
        return edition;
    }

    public static void setEdition(int edition) {
        Book.edition = edition;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "title: " + title + System.lineSeparator() + "author: " + author + System.lineSeparator() +
                "price: " + price + System.lineSeparator() + "edition:  " + edition + System.lineSeparator();
    }

    @Override
    protected Object clone() {
        Book newBook = new Book();
        newBook.title = this.title;
        newBook.author = this.author;
        newBook.price = this.price;
        return newBook;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return price == book.price;
    }

    @Override
    public int hashCode() {
        return price * 18 % Integer.MAX_VALUE;
    }

    @Override
    public int compareTo(Book book) {
        return isbn - book.isbn;
    }
}
