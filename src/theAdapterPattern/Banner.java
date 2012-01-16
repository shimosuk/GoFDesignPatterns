package theAdapterPattern;

public class Banner {

    private String string;
    public Banner(String string) {
        this.string = string;
    }
    public String showWithParen() {
        String paren = "(" + string + ")";
        System.out.println(paren);
        return paren;
    }
    public String showWithAster() {
        String aster = "*" + string + "*";
        System.out.println(aster);
        return aster;
    }

}
