package theIteratorPattern.training;

import java.util.ArrayList;
import java.util.List;

public class DustBox implements Aggregate{

    private List<Dust> dusts;

    public DustBox(int boxSize) {
        this.dusts = new ArrayList<Dust>(boxSize); 
    }

    public Dust withdrawDustOf(int index) {
        return dusts.get(index);
    }

    public void dump(Dust dust) {
        this.dusts.add(dust);
    }

    @Override
    public Iterator iterator() {
        return null;
    }

}
