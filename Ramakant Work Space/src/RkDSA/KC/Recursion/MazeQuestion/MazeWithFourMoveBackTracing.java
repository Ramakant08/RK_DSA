package RkDSA.KC.Recursion.MazeQuestion;

import java.util.ArrayList;
import java.util.List;

public class MazeWithFourMoveBackTracing {

    public static void main(String[] args) {
        boolean[][] maze = {
                {true, true, true},
                {true, true, true},
                {true, true, true}};
        System.out.println(allPathList("", maze, 0, 0));
    }

    public static List<String> allPathList(String processed, boolean[][] maze, int down, int right) {
        ArrayList<String> list = new ArrayList<>();
        if (down == maze[0].length - 1 && right == maze[0].length - 1) {
            list.add(processed);
            return list;
        }

        if (!maze[down][right]) {
            return list;
        }

        maze[down][right] = false;
        ArrayList<String> allPaths = new ArrayList<>();
        if (down < maze[0].length - 1) {
            allPaths.addAll(allPathList(processed + "D", maze, down + 1, right));
        }

        if (right < maze[0].length - 1) {
            allPaths.addAll(allPathList(processed + "R", maze, down, right + 1));
        }

        if (down > 0) {
            allPaths.addAll(allPathList(processed + "U", maze, down - 1, right));
        }

        if (right > 0) {
            allPaths.addAll(allPathList(processed + "L", maze, down, right - 1));
        }
        maze[down][right] = true;

        return allPaths;
    }
}
