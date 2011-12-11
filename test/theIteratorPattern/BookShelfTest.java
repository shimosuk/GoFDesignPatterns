package theIteratorPattern;

import static org.junit.Assert.*;

import org.junit.Test;


public class BookShelfTest {

    @Test
    public void testBookShelf() {
        BookShelf bookShelf = new BookShelf(2);
        bookShelf.appendBook(new Book("Book1"));
        bookShelf.appendBook(new Book("Book2"));

        assertEquals(2, bookShelf.getLength());
        assertEquals("Book1", bookShelf.getBookAt(0).getName());
        assertEquals("Book2", bookShelf.getBookAt(1).getName());
    }
}
