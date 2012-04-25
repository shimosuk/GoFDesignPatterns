package theComposite;

public abstract class Entry {

    /**
     * <h1>ファイル名の取得</h1>
     * <p>ディレクトリエントリの名前を取得する。</p>
     */
    public abstract String getName();

    /**
     * <h1>ファイルサイズの取得</h1>
     * <p>Fileクラスでは自身のサイズを取得する。</p>
     * <p>Directoryでは配下のサイズを算出する</p>
     */
    public abstract int getSize();

    /**
     * <h1>エントリを追加する</h1>
     * <p>実装はサブクラス</p>
     * @param entry
     * @return
     * @throws FileTreatmentException
     */
    public Entry add(Entry entry) throws FileTreatmentException {
        throw new FileTreatmentException();
    }

    /**
     * <h1>中身の一覧を表示する。<h1>
     */
    public void printList() {
        printList(""); // オーバーロードしているメソッドを呼び出す。
    }

    /**
     * <h1>作成したファイルとディレクトリ構造の一覧表示</h1>
     * <p>エントリの一覧を表示するためのメソッド</p>
     * <p>引数prefixを前につけて一覧を表示する</p>
     * <p>ただし、実装はサブクラスで行う</p>
     * @param prefix
     */
    protected abstract void printList(String prefix); // protectedとしてサブクラス以外からの使用を防ぐ。

    /**
     * <h1>ファイル名とサイズの表示</h1>
     * <p>サブクラスがgetNameとgetSizeを実装することを前提した作り</p>
     */
    public String toString() {
        return getName() + " (" + getSize() + ")";
    }
}
