package theComposite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Directory extends Entry {

    private String name;
    private List<Entry> directory = new ArrayList<Entry>(); // Entry保持のためのフィールド。直下にいくつエントリを持っているかを表す
    // Directory自身ではサイズを持たず、getSizeメソッドで動的に計算する

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getSize() {
        int size = 0;
        Iterator<Entry> iterator = this.directory.iterator();
        while (iterator.hasNext()) {
            Entry entry = (Entry) iterator.next();
            size += entry.getSize(); // 再帰的構造（FileクラスもDirectoryクラスも意識しなくて良い）
        }
        return size;
    }

    @Override
    protected void printList(String prefix) {
        System.out.println(prefix + "/" + this);
        Iterator<Entry> iterator = this.directory.iterator();
        while (iterator.hasNext()) {
            Entry entry = (Entry) iterator.next();
            entry.printList(prefix + "/" + this.name); // 再帰的構造
        }
    }

    @Override
    public Entry add(Entry entry) {
        this.directory.add(entry); // このエントリの後ろにエントリを追加する
        return this;
    }
}
