package RkDSA.KC.Recursion.MazeQuestion;

public class PlaceNQueens {

    public static void main(String[] args) {
        boolean[][] board = new boolean[4][4];
        System.out.println(placeQueens(board, 0));
    }

    public static int placeQueens(boolean[][] board, int row) {
        if (row == board.length) {
            display(board);
            System.out.println();
            return 1;
        }


        int count = 0;
        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = true;
                count += placeQueens(board, row + 1);
                board[row][col] = false;
            }
        }
        return count;
    }

    private static boolean isSafe(boolean[][] board, int row, int column) {
        //for vertical check
        for (int i = 0; i < row; i++) {
            if (board[i][column]) {
                return false;
            }
        }

        //for left diagonal

        int maxLeft = Math.min(row, column);
        for (int i = 1; i <= maxLeft; i++) {
            if (board[row - i][column - i]) {
                return false;
            }
        }

        //for right diagonal
        int maxRight = Math.min(row, board.length - column - 1);
        for (int i = 1; i <= maxRight; i++) {
            if (board[row - i][column + i]) {
                return false;
            }
        }


        return true;

    }

    public static void display(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean element : row) {
                if (element) {
                    System.out.print("Q ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
