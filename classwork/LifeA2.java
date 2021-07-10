import java.io.*;
import java.util.*;
/*
  2D array
  set up
  change values in it
  a way of applying the GOL rules
 */

class LifeA2{

    /*
      create a new 2D array, fill it with ' '
      representing that the entire board is empty.
     */
    public static char[][] createNewBoard(int rows, int cols){
    	char[][] board = new char[rows][cols];
    	for (int r = 0; r < rows; r++) {
    	    for (int c = 0; c < cols; c++) {
    		board[r][c] = ' ';
    	    }
    	}
    	return board;
    }

    public static void printBoard(char[][] board){
    	for (int r = 0; r < board.length; r++) {
    	    for (int c = 0; c < board[r].length; c++) {
    		System.out.printf("%c",board[r][c]);
    	    }
    	    System.out.println();
    	}
    	System.out.println("\n\n------------------\n\n");
    }

    /*
      set the cell (r,c) to value
    */
    public static void setCell(char[][] board, int r, int c, char val){
    	if (r>=0 && r<board.length && c>=0 && c<board[r].length){
    	    board[r][c] = val;
    	}
    }

    /*
       Count and return the number of living neigbords around board[r][c]
       approach 1 - lots of if statements
       approach 2 - you can loop over the grid from board[r-1][c-1]
                    to board[r+1][c+1]
    */
    public static int countNeighbours(char[][] board, int r, int c){
      int numLiveCells = 0;
      char status = 'X';
      for (int i = r -1; i <= r + 1; i++) {
    	    for (int j = c - 1; j <= c+1; j++) {
              if (i>= 0 && j >=0 && i < board.length && j < board[r].length) {
                  if(!(i == r && j == c) && board[i][j] == status) {
                      numLiveCells = numLiveCells + 1;
                  } //end cell neighbor scan
              }//end boundary set
    	     } //end j
    	   } //end i
         return numLiveCells;
    }

    /*
      given a board and a cell, determine, based on the rules for
      Conway's GOL if the cell is alive ('X') or dead (' ') in the
      next generation.

     */
    public static char getNextGenCell(char[][] board,int r, int c){
    	// calculate the number of living neighbors around board[r][c]
    	// determine if board[r][c] is living or dead
    	//    if living and 2 3 neighbors then remain alive
    	//    if dead and 3 neighbors then become alive
        int totalNeighbors = countNeighbours (board, r, c);
        char hold = board[r][c];

        //    if living and 2 3 neighbors then remain alive
        if (hold == 'X' && (totalNeighbors == 2 || totalNeighbors == 3)) {
          return 'X';
        }
          //    if dead and 3 neighbors then become alive
        else if (hold == ' ' && totalNeighbors == 3) {
          return 'X';
        }
        else {
          return ' ';
        }
      }
    /*
      scan the board to generate a NEW board with the
      next generation
    */
    public char[][] generateNextBoard(char[][] board){
    	char newBoard[][] = new char[25][25];
    	// fill the new board
      int rows = 25;
      int cols = 25;
      for(int r = 0; r < rows; r++){
        for(int c = 0; c < cols; c++){
          char cell = getNextGenCell(board,r,c);
          newBoard[r][c] = cell;
        }
      }
    	return newBoard;
    }

    public static void main(String[] args) {
    	char[][] board;
    	board = createNewBoard(25,25);
    	printBoard(board);
    }
}
