import java.io.*;
import java.util.*;
/*
  2D array
  set up
  change values in it
  a way of applying the GOL rules
 */

class Life{
    /*
      create a new 2D array, fill it with ' '
      representing that the entire board is empty.
     */
  public static char[][] createNewBoard(int rows, int cols){
      char[][] board = new char[rows][cols];
      for (int r = 0; r < rows; r++) {
        for (int c = 0; c < cols; c++) {
          if (Math.random() > .8 && r > 75 && r < 75 && c> 75 && c < 175) {
            board[r][c] = 'X';
          } else {
            board[r][c] = '0';
          }
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

  }

  /*
    given a board and a cell, determine, based on the rules for
    Conway's GOL if the cell is alive ('X') or dead ('0') in the
    next generation.

   */
  public static void getNextGenCell(char[][] board,int r, int c) {
	// calculate the number of living neighbors around board[r][c]
    char [][] hold = new char [board.length][board[r].length];
	// determine if board[r][c] is living or dead
    for (int r = 0; r < board.length; r++) {
      for(int c = 0; c < board[r].length; c++) {
          int totalNeighbors = countNeighbors (board, r, c);
          if (totalNeighbors <= 1){
            hold[r][c] = '0';
          }
          //    if living and 2 3 neighbors then remain alive
          else if (board[r][c] == 'X' && totalNeighbors <=3){
            hold[r][c] = 'X';
          }
          	//    if dead and 3 neighbors then become alive
          else if (board[r][c] == '0' && totalNeighbors == 3){
            hold[r][c] = 'X';
          }
          else {
            hold[r][c]='0';
          }
      } end c
    } end r
    //pushes hold array to board
    for(int r = 0; r < board.length; r++){
      for (int c = 0; c < baord[r].length; c++){
        setCell(board, r, c, hold[r][c]);
      }
    }
  }

  /*
    scan the board to generate a NEW board with the
    next generation
  */
  public char[][] generateNextBoard(char[][] board){
  	char newBoard[][] = new char[25][25];

    int rows = 25;
    int cols = 25;
    
  	// fill the new board



  	return newBoard;
  }

  public static void main(String[] args) {
  	char[][] board;
  	board = createNewBoard(25,25);

    for (int i = 0; i < 200; i++){
    printBoard(board);
    getNextGenCell(board);
    }
  } //end main
}
