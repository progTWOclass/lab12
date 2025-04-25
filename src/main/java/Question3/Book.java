package Question3;

public class Book {
    //CLASS VARIABLES
    private String author;
    private String title;
    private String isbn;

    //CONSTRUCTOR
    public Book(String author, String title, String isbn){
        this.author = author;
        this.title = title;
        this.isbn = isbn;
    }


    //GETTERS AND SETTERS
    public String getAuthor(){
        return author;
    }
    public String getTitle() {
        return title;
    }
    public String getIsbn() {
        return isbn;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
