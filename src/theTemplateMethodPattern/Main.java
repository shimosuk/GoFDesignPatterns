package theTemplateMethodPattern;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {

        AbstractDisplay charDisplay = new CharDisplay('c');
        charDisplay.display();

        AbstractDisplay stringDisplay = new StringDisplay("Hello! Hello?");
        stringDisplay.display();
    }

}
