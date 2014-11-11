package javest.s2e1;

public enum EStyle {

    DOLLAR_STYLE("$"),
    A_STYLE("A"),
    B_STYLE("B");

    private final String styleString;

    EStyle(String styleString) {
        this.styleString = styleString;
    }

    EStyle() {
        this.styleString = "";
    }

    public String getStyleString() {
        return styleString;
    }
}
