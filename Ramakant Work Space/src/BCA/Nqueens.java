package BCA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Nqueens {
    static List<List<String>> list;

    public static List<List<String>> solve(int n) {
        list = new ArrayList<>();
        char[][] board = new char[n][n];
        for (int i = 0; i < board.length; i++) {
            Arrays.fill(board[i],'.');
        }
        helper(board, 0);
        return list;
    }

    public static void helper(char[][] board, int row) {
        if (row == board.length) {
            List<String>ans=new ArrayList<>();
            for (int i = 0; i < board.length; i++) {
                ans.add(new String(board[i]));
            }
            list.add(ans);
            return;
        }

        for (int i = 0; i < board.length; i++) {
            if (isValid(board, row, i)) {
                board[row][i] = 'Q';
                helper(board,row+1);
                board[row][i] = '.';
            }
        }
    }

    public static boolean isValid(char board[][], int row, int col) {
        for (int i = row; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        for (int i = row, j = col; i >= 0 && j <board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n=4;
        System.out.println(solve(4));
    }

}
