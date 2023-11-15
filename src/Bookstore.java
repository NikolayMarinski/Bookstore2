import java.util.ArrayList;
import java.util.List;

public class Bookstore {
    private List<Book> books = new ArrayList<>();

    public Bookstore() {
    }

    public Bookstore(List<Book> books) {
        this.books = books;
    }


    public void addBook(Book book) {
        this.books.add(book);
    }

    public void sell(Book book){
        if(book.getAvailable()>1)
        {
            System.out.println("Title: " + book.getTitle() + " Author: " + book.getAuthor() + " Price: " + book.getPrice());
            book.setAvailable(book.getAvailable()-1);
        }
        else
            System.out.println("No books, come back tomorrow");
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
