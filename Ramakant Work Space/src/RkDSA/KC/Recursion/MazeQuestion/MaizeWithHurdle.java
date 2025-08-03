package RkDSA.KC.Recursion.MazeQuestion;

public class MaizeWithHurdle {
    public static void main(String[] args) {
        boolean[][] maze = {{true, true, true}, {true, false, true}, {true, true, true}};
        pathTillThatPoint("", maze, 0, 0);
    }

    public static void pathTillThatPoint(String processed, boolean[][] maze, int down, int right) {
        if (down == maze[0].length-1 && right == maze[0].length-1) {
            System.out.println(processed);
            return;
        }

        if (!maze[down][right]) {
            return;
        }

        if (down < maze.length - 1) {
            pathTillThatPoint(processed + "D", maze, down + 1, right);
        }
        if (right < maze.length - 1) {
            pathTillThatPoint(processed + "R", maze, down, right + 1);
        }

    }
}
