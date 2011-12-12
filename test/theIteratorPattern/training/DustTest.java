package theIteratorPattern.training;

import static org.junit.Assert.*;

import org.junit.Test;

public class DustTest {

    @Test
    public void what_dustName() {
        Dust dust = new Dust("紙くず");
        assertEquals("紙くず", dust.getName());
    }

}
