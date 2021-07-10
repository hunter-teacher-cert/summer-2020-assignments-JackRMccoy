import java.io.*;
import java.util.*;

public class GridImage {

  public static void main(String[] args) {

    int rows = 20;
    int cols = 20;

    int[][] grid = new int[rows][cols];

    invert(grid);
    colPop(grid, 3, 3);
    rowPop(grid, 10, 12);
    diagonal(grid, 5, 5, 0, 87);

    print2d(grid);
    System.out.println();


  }

  public static void print2d(int[][] d2) {

    for (int r=0; r < d2.length; r++) {
      for (int c=0; c < d2[r].length; c++) {

        System.out.printf("%03d ", d2[r][c]);
      }//end c for

      System.out.println();
    }//end r for
  }//end print2d

  public static void colPop(int[][] d2, int c, int value) {
    for (int i = 0; i < d2[0].length; i++){
      d2[i][c] = value;
    } //end i
  }//end colPop


  public static void rowPop(int[][] d2, int r, int value) {
    for (int i = 0; i < d2[0].length; i++) {
      d2[r][i] = value;
    } //end i
  }//end rowPop


  public static void invert(int[][] d2) {
    for (int r = 0; r < d2.length; r++) {
      for (int c = 0; c < d2[0].length; c++){
        if (d2[r][c] == 0){
          d2[r][c] = 255;
        } else {
          d2[r][c] = 0;
        }
      }//end j
    }// end i
  }//end invert

  /*
    0: up + left
    1: up + right
    2: down + left
    3: down + right
   */
  public static void diagonal(int[][] d2, int r, int c, int direction, int value) {
    int rowMove = 0;
    int columnMove = 0;
    if (direction == 2 || direction == 3){
      rowMove = 1;
    } else {
      rowMove = -1;
    }
    if (direction == 1 || direction == 3){
      columnMove = 1;
    } else {
      columnMove = -1;
    }
    for(int i = r; i>=0 && i < d2.length; i = i + rowMove){
      for (int j = c; j >=0 && j < d2[0].length; j = j + columnMove){
        d2[i][j] = value;
      } //end j
    }//end i

  }//end diagonal

}
