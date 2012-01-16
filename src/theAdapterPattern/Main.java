package theAdapterPattern;

public class Main {

    public static void main(String[] args) {
        Print print = new PrintBanner("Hellow");
        print.printWeak();
        print.printStrong();
    }

}
