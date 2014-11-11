package javest.s1e4;

public class Fields {

    private static final int LENGTH_OF_ARRAY = 3;

    private static final int HIGHT_OF_ARRAY = 3;

    private static final int closedFieldValue = 1;

    private int[][] array = new int[LENGTH_OF_ARRAY][HIGHT_OF_ARRAY];

    private void showLine(int numOfLine) {
        for (int i = 0; i < LENGTH_OF_ARRAY; i++) {
            showCell(i, numOfLine);
        }
    }

    public void showField() {
        for (int i = 0; i < HIGHT_OF_ARRAY; i++) {
            showLine(i);
            System.out.println();
        }
    }


    private void showCell(int numOfCell, int numOfLine) {
            System.out.print("[" + array[numOfCell][numOfLine] + "]");
    }

    public void setValue(int line, int element) {
        array[element][line] = closedFieldValue;

    }

}
