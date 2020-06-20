import java.io.*;
import java.util.*;

public class Loops{
  public static void main(String[] args){

    System.out.println(power(3,7));
    System.out.println(factorial(4));
    System.out.println(myExp(3, 4));

  }

public static double power(double x, int n){
  double num = 1;
  int i = 1;
  while(i < n) {
    num *= x;
    i++;
  }
  return num;
}

public static int factorial(int n){
  int num = 1;
  int i = 1;
  while(i < n) {
    num *= i;
    i++;
  }
  return num;
}

public static double myExp(double x, int n){
  double num = 1;
  double a = 1;
  double b = 1;
  int i = 1;
  while (i < n) {
    num += (a *= x) / (b *= i);
    i++;
  }
  return num;
}


}
