package RkDSA.KC.LeetCodeProblems;

public class Shadowing {
  static int x=90;

    public static void main(String[] args) {
        int x=80;   //this variable shadowed the variable at line 2
        System.out.println(x);

    }
}
