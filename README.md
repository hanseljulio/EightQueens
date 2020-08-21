# EightQueens
* Eight Queens Puzzle

-------------------------------------------------------------------------------

## Overview
* This is the Eight Queens puzzle, exercise for 2D array.
* The goal is to place all 8 queens ('Q') in a diagonal position.

-------------------------------------------------------------------------------

### Classes
1. EightQueens.java
 * Class contains the program driver and functions to handle the Eight Queens puzzle
 * Functions:
   * placeQueens(char[][] board)
     * This function is the entry point for the code, returns the solution as a char[][]
   * placeQueensHelper(char[][] board, int numQueens)
     * This function takes in the current board state and the number of queens left to place. Returns a solution board if it finds one
   * getValidPlacements(char[][] board)
     * This function takes in current board state, returns all potential boards where one queen is added to the current board in a valid position
   * isSafe(char[][] board, int row, int col)
     * This function takes in board and placement, returns true if there is a valid place for the queen
