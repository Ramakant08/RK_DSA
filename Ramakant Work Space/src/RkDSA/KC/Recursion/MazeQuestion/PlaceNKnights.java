package RkDSA.KC.Recursion.MazeQuestion;

public class PlaceNKnights {

    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[4][4];
        placeKnights(board, 0, 0, 4);
    }

    public static void placeKnights(boolean[][] board, int row, int col, int knights) {
        if (knights == 0) {
            display(board);
            System.out.println();
            return;
        }

        if (row == board.length - 1 && col == board.length) {         // if board is finished
            return;
        }

        if (col == board.length) {
            placeKnights(board, row + 1, 0, knights);     // when reached till last column of the row
            return;
        }
        if (isSafe(board, row, col)) {
            board[row][col] = true;
            placeKnights(board, row, col + 1, knights - 1);    // when it is safe to place a knight at the cell
            board[row][col] = false;
        }
        placeKnights(board, row, col + 1, knights);              // when it is not safe to place thr knight
    }


    // to check the safety of the cell
    private static boolean isSafe(boolean[][] board, int row, int col) {
        if (isValid(board, row - 2, col - 1)) {
            if (board[row - 2][col - 1]) {
                return false;
            }
        }

        if (isValid(board, row - 2, col + 1)) {
            if (board[row - 2][col + 1]) {
                return false;
            }
        }

        if (isValid(board, row - 1, col - 2)) {
            if (board[row - 1][col - 2]) {
                return false;
            }
        }

        if (isValid(board, row - 1, col + 2)) {
            return false;
        }

        return true;
    }

    // to check the validity of the cell
    public static boolean isValid(boolean[][] board, int row, int col) {
        if (row >= 0 && row < board.length && col >= 0 && col < board[0].length) {
            return true;
        }
        return false;
    }

    // to display the board
    private static void display(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean element : row) {
                if (element) {
                    System.out.print("K ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
