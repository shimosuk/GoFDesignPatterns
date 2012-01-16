package theAdapterPattern;

public class PrintBanner extends Banner implements Print{

    public PrintBanner(String string) {
        super(string);
    }

    @Override
    public String printWeak() {
        return showWithParen();
    }

    @Override
    public String printStrong() {
        return showWithAster();
    }

}
