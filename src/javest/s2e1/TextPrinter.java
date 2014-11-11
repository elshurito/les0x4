package javest.s2e1;
public class TextPrinter {

    public static void showText(String text, EStyle style) {
        switch (style) {
            case DOLLAR_STYLE:
                System.out.println("$" + text + "$");
                break;
            case A_STYLE:
                default:
                    System.out.println("0" + text + "0");
        }
    }

    public static void main(String[] args) {
        showText("Text1", EStyle.valueOf("DOLLAR_STYLE"));
        showText("Text2", EStyle.A_STYLE);
        //showText("Text3", EStyle.valueOf("asd"));

        for (EStyle style : EStyle.values()) {
            showText("ALL STYLES", style);
        }
    }

}
