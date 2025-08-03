package RkDSA.KC.Recursion.MazeQuestion;

import java.util.ArrayList;
import java.util.List;

public class PathToTarget {

    public static void main(String[] args) {
        System.out.println(countPath(3, 3));
        pathTillThatPoint("", 3, 3);
        System.out.println(allPathList("", 3, 3));
        System.out.println(pathIncludingDiagonal("", 3, 3));
    }

    public static int countPath(int down, int right) {
        if (down == 1 || right == 1) {
            return 1;
        }

        int d = countPath(down - 1, right);
        int r = countPath(down, right - 1);

        return d + r;

    }


    public static void pathTillThatPoint(String processed, int down, int right) {

        if (down == 1 && right == 1) {
            System.out.println(processed);
            return;

        }

        if (down != 1) {
            pathTillThatPoint(processed + "D", down - 1, right);
        }
        if (right != 1) {
            pathTillThatPoint(processed + "R", down, right - 1);
        }

    }

    public static List<String> allPathList(String processed, int down, int row) {
        if (down == 1 && row == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }

        ArrayList<String> totalPathList = new ArrayList<>();
        if (down != 1) {
            totalPathList.addAll(allPathList(processed + "D", down - 1, row));
        }
        if (row != 1) {
            totalPathList.addAll(allPathList(processed + "R", down, row - 1));
        }


        return totalPathList;
    }

    public static ArrayList<String> pathIncludingDiagonal(String processed, int down, int right) {
        if (down == 1 && right == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }

        ArrayList<String> pathList = new ArrayList<>();
        if (down != 1) {
            pathList.addAll(pathIncludingDiagonal(processed + "V", down - 1, right));
        }
        if (right != 1) {
            pathList.addAll(pathIncludingDiagonal(processed + "H", down, right - 1));
        }

        if (right >1&& down>1) {
            pathList.addAll(pathIncludingDiagonal(processed + "D", down - 1, right - 1));
        }


        return pathList;

    }
}
