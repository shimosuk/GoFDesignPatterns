package theAdapterPattern;

import static org.junit.Assert.*;

import org.junit.Test;

public class PrintBannerTest {

    @Test
    public void testPrintWeak() {
        PrintBanner printBanner = new PrintBanner("カッコ");
        assertEquals("(カッコ)", printBanner.printWeak());
    }

    @Test
    public void testPrintStrong() {
        PrintBanner printBanner = new PrintBanner("アスター");
        assertEquals("*アスター*", printBanner.printStrong());
    }

}
