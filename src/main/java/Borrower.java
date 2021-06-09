import java.util.ArrayList;

public class Borrower {
    private ArrayList<Book> collection;

    public Borrower(){
        this.collection = new ArrayList<>();
    }

    public void addBookToCollection(Book book, Library library){
        this.collection.add(library.checkOutBook(book));
    }
}
