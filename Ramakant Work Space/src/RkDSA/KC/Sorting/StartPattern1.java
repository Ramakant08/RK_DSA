package RkDSA.KC.Sorting;

public class StartPattern1 {
    public static void main(String[] args) {

        pattern(10, 0);//inverted triangle

    }



    public static void pattern(int row, int column) {
        if (row == 0) {
            return;
        }

        if (column < row) {
            pattern(row, column + 1);
            System.out.print("*");
        } else {
            pattern(row - 1, 0);
            System.out.println();
        }

    }
}
