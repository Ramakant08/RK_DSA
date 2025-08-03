package RkDSA.KC.Recursion.MazeQuestion;

import java.util.Arrays;

public class PathAndMaze {

    public static void main(String[] args) {
        boolean[][] maze = {{true, true, true},
                {true, true, true},
                {true, true, true}};
        int[][] pathMat = new int[maze.length][maze[0].length];
        printAllPathAndMatrix("", maze, pathMat, 0, 0, 1);
    }

    public static void printAllPathAndMatrix(String processed, boolean[][] maze, int[][] pathMat, int down, int right, int count) {
        if (down == maze.length - 1 && right == maze[0].length - 1) {
            pathMat[down][right] = count;
            System.out.println(processed);
            for (int[] arr : pathMat) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println();
        }
        if (!maze[down][right]) {
            return;
        }

        maze[down][right] = false;
        pathMat[down][right] = count;
        if (down < maze[0].length - 1) {
            printAllPathAndMatrix(processed + "D", maze, pathMat, down + 1, right, count + 1);
        }

        if (right < maze[0].length - 1) {
            printAllPathAndMatrix(processed + "R", maze, pathMat, down, right + 1, count + 1);
        }

        if (down > 0) {
            printAllPathAndMatrix(processed + "U", maze, pathMat, down - 1, right, count + 1);
        }

        if (right > 0) {
            printAllPathAndMatrix(processed + "L", maze, pathMat, down, right - 1, count + 1);
        }

        maze[down][right] = true;
        pathMat[down][right] = 0;

    }
}
