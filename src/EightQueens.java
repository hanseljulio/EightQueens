import java.util.*;

public class EightQueens {
    // entry point for the code. Returns the solution as a char[][]
    public static char[][] placeQueens(char[][] board) {
        return placeQueensHelper(board, 8);
    }

    // recursive helper function
    // Takes in the current board state and the number of queens left to place.
    // Returns a solution board if it finds one, else returns null.
    private static char[][] placeQueensHelper(char[][] board, int numQueens) {
        if (numQueens == 0) {
            return board;
        }
        for (char[][] option : getValidPlacements(board)) {
            char[][] potentialResult = placeQueensHelper(option, numQueens - 1);
            if (potentialResult != null) {
                return potentialResult;
            }
        }
        return null;
    }

    // Called by placeQueensHelper.
    // Takes in the current board state.
    // Returns all potential boards where one queen is added to the current board in a valid position.
    private static List<char[][]> getValidPlacements(char[][] board) {
        List<char[][]> options = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (isSafe(board, i, j)) {
                    char[][] other = new char[8][8];
                    for (int k = 0; k < other.length; k++) {
                        for (int l = 0; l < other.length; l++) {
                            other[k][l] = board[k][l];
                        }
                    }
                    other[i][j] = 'Q';
                    options.add(other);
                }
            }
        }

        return options;
    }

    // Takes in a board and a placement (row + col)
    // Returns true if that is a valid place to put a queen, false if it is not valid.
    // Checks that there are no queens in the same row, the same col, or on a diagonal from the cell.
    private static boolean isSafe(char[][] board, int row, int col) {
        // Check rows
        for (int i = 0; i < 8; i++) {
            if (board[row][i] == 'Q') {
                return false;
            }
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        for (int i = row; i >= 0; i--) {
            for (int j = col; j >= 0; j--) {
                if (board[i][j] == 'Q') {
                    return false;
                }
            }
        }

        for (int i = row; i < 8; i++) {
            for (int j = col; j >= 0; j--) {
                if (board[i][j] == 'Q') {
                    return false;
                }
            }
        }

        for (int i = row; i >= 0; i--) {
            for (int j = col; j < 8; j++) {
                if (board[i][j] == 'Q') {
                    return false;
                }
            }
        }

        // TODO: Check upper-right diagonal from the row/col
        /*for (int i = row; i > 0; i--) {
            for (int j = col + 1; j < 8; j++) {
                if (board[i][j] == 'Q') {
                    return false;
                }
            }
        }*/


        return true;
    }


    public static void main(String[] args) {
        char[][] solution = new char[8][8];
        for (int k = 0; k < solution.length; k++) {
            for (int l = 0; l < solution.length; l++) {
                solution[k][l] = '0';
            }
        }

        solution = placeQueens(solution);

        for (char[] row : solution) {
            for (char cell : row) {
                System.out.print(cell);
            }
            System.out.println();
        }
    }
}