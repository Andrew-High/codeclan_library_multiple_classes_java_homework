import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {
    private Borrower borrower;
    private Library library;
    private Book book;

    @Before
    public void before(){
        borrower = new Borrower();
        book = new Book("Northern Lights", "Philip Pullman", "Fantasy");
        library = new Library ("Falkirk Library");
    }

    @Test
    public void canCheckOutBook(){
        library.addBookToCollection(book);
        borrower.addBookToCollection(book, library);
        assertEquals(0, library.getCollectionSize());
    }

}
