package theIteratorPattern;

import static org.junit.Assert.*;

import org.junit.Test;


public class BookShelfTest {

    @Test
    public void testBookShelf() {
        BookShelf bookShelf = new BookShelf(2);
        bookShelf.appendBook(new Book("Book1"));
        bookShelf.appendBook(new Book("Book2"));
        bookShelf.appendBook(new Book("Book3"));

        assertEquals(3, bookShelf.getLength());
        assertEquals("Book1", bookShelf.getBookAt(0).getName());
        assertEquals("Book2", bookShelf.getBookAt(1).getName());
        assertEquals("Book3", bookShelf.getBookAt(2).getName());
    }
}
