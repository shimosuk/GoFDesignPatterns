package theIteratorPattern.training;

import static org.junit.Assert.*;

import org.junit.Test;

public class DustBoxTest {

    @Test
    public void dumpAndRelease() {
        Dust dust = new Dust("ホコリ");
        DustBox dustBox = new DustBox(5);
        dustBox.dump(dust);
        assertEquals(dust, dustBox.withdrawDustOf(0));
    }

}
