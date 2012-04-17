package theAdapterPattern;

import static org.junit.Assert.*;

import org.junit.Test;

public class BannerTest {

    @Test
    public void testShowWithParen() {
        String paren = "カッコで囲む";
        Banner banner = new Banner(paren);
        assertEquals("(" + paren + ")", banner.showWithParen());
    }

    @Test
    public void testShowWithAster() {
        String aster = "アスターで囲む";
        Banner banner = new Banner(aster);
        assertEquals("*" + aster + "*", banner.showWithAster());
    }

}
