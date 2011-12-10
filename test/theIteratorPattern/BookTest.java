package theIteratorPattern;

import static org.junit.Assert.*;

import org.junit.Test;

public class BookTest {

    @Test
    public void look_at_the_BookName() {
        Book book = new Book("DesignPattern");
        assertEquals("DesignPattern", book.getName());
    }

}
