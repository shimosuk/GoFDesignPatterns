package theComposite;

public class Main {

    public static void main(String[] args) {

        /*
         * 以下のようなディレクトリ構造を作成
         * root
         *  |
         *  |_ bin
         *  |   |_ vi(ファイル:size=10000)
         *  |   |_ latex(ファイル:size=20000)
         *  |
         *  |_ tmp
         *  |
         *  |_ usr
         */
        try {
            Entry rootdir = new Directory("root");
            Entry bindir = new Directory("bin");

            rootdir.add(bindir); // rootに追加
            rootdir.add(new Directory("tmp"));
            rootdir.add(new Directory("usr"));

            bindir.add(new File("vi", 10000)); // binに追加
            bindir.add(new File("latex", 20000));

            System.out.println("*****************");
            rootdir.printList(); // root以下を表示
            System.out.println("*****************");
            bindir.printList(); // bin以下を表示
        } catch (FileTreatmentException e) {
            e.printStackTrace();
        }
    }
}
