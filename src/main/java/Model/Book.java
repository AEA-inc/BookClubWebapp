package Model;

public class Book {
    private int id;
    private String bookTitle;
    private String Author;
    private double price;

    public Book() {
        super();
    }

    public Book(int id, String bookTitle, String author, double price) {
        this.id = id;
        this.bookTitle = bookTitle;
        Author = author;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getAuthor() {
        return Author;
    }

    public double getPrice() {
        return price;
    }
}
