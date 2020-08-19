# EightQueens
Eight Queens Puzzle

This is the Eight Queens puzzle, exercise for 2D array.
All instructions are in the code comments.

- char[][] placeQueens(char[][] board) - Entry point for the code. Returns the solution as a char[][]
- char[][] placeQueensHelper(char[][] board, int numQueens) - Recursive function, Takes in the current board state and the number of queens left to place. Returns a solution board if it finds one
- private static List<char[][]> getValidPlacements(char[][] board) - Takes in current board state, returns all potential boards where one queen is added to the current board in a valid position
- boolean isSafe(char[][] board, int row, int col) - Takes in board and placement, returns true if there is a valid place for the queen
