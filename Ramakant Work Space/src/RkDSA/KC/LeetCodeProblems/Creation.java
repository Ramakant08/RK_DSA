package RkDSA.KC.LeetCodeProblems;

public class Creation {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = i; j <= 5 / 2 + 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        for (int i = 1; i <= 5 - 1; i++) {
            for (int j = 0; j <=i-1; j++) {
                System.out.print(" ");
            }
            for (int j = 5-1; j >=i ; j--) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
