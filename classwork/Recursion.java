import java.io.*;
import java.util.*;

public class Recursion {

 public static void main(String[] args) {
  int n = 4;
  System.out.printf(n + "! = %d\n", factorial(n) );
  n = 6;
  System.out.printf("fib(" + n + ") = %d\n", fib(n) );
 }

 public static int factorial(int n) {
    if (n == 0) {
        return 1;
    } else {
        n = n*factorial(n-1);
        return n;
    }
 }

 public static int fib(int n) {
    if (n <=1) {
        return n;
    } else {
        return fib(n - 1) + fib(n - 2);
    }
 }

}
