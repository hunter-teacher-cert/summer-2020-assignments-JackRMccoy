import java.io.*;
import java.util.*;



public class TimeConverter{

public static void main(String[] args){

  int second;
  Scanner in = new Scanner(System.in);
  second = in.nextInt();

  int seconds = second % 60;
  int minutes = ((second - seconds) / 60) % 60;
  int hours = ((second - seconds) / 60) / 60;

  System.out.printf(second + " seconds = " + hours + " hours, " + minutes + " minutes, and " + seconds + " seconds");


  }
}
