import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    private Library library;
    private Book book;

    @Before
    public void before(){
        library = new Library("Falkirk Library");
        book = new Book("Northern Lights", "Philip Pullman", "Fantasy");
    }

    @Test
    public void libraryHasName() {
        assertEquals("Falkirk Library", library.getName());
    }

    @Test
    public void libraryCollectionEmpty() {
        assertEquals(0, library.getCollectionSize());
    }

    @Test
    public void canAddBookToCollection() {
        library.addBookToCollection(book);
        assertEquals(1, library.getCollectionSize());
    }

    @Test
    public void cantAddBookToCollection() {
        library.addBookToCollection(book);
        library.addBookToCollection(book);
        library.addBookToCollection(book);
        assertEquals(2, library.getCollectionSize());
    }
}
