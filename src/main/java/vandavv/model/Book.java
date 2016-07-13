package vandavv.model;

public class Book {
    private String author;
    private String title;
    private Integer ISBN;

    public Book(String author, String title, Integer ISBN) {
        this.author = author;
        this.title = title;
        this.ISBN = ISBN;
    }

    public Book() {
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getISBN() {
        return ISBN;
    }

    public void setISBN(Integer ISBN) {
        this.ISBN = ISBN;
    }
}
