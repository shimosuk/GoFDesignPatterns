package theIteratorPattern.training;

public class DustBoxIterator implements Iterator{

    private DustBox dustBox;
    private int index;

    public DustBoxIterator(DustBox dustBox) {
        this.dustBox = dustBox;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < dustBox.hasDustAmount();
    }

    @Override
    public Object next() {
        int index = this.index;
        this.index++;
        return dustBox.withdrawDustOf(index);
    }

}
