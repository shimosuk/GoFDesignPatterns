package theComposite;

public class File extends Entry {

    private String name;
    private int size;

    /**
     * <h1>ファイルを生成する</h1>
     * @param name ファイル名
     * @param size ファイルサイズ
     */
    public File (String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    protected void printList(String prefix) {
        System.out.println(prefix + "/" + this); // ここでのthisは、this.toString()またはtoString()と同等の意味である
    }

}
