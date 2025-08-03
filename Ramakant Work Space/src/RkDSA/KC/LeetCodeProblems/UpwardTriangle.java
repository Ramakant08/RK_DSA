package RkDSA.KC.LeetCodeProblems;

public class UpwardTriangle {
    public static void main(String[] args) {
        for (int i = 0; i < 10/2; i++) {
            for (int j = 0; j < 10/2-i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <i*2+1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
