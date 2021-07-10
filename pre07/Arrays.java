import java.io.*;
import java.util.*;

public class Arrays{
  public static void main(String[] args){

}

public static double[] powArray(double[] a, double p){
  double[] total = new double[a.length];
  for (int i = 0; i < a.length; i++){
    a[i] = Math.pow(a[i], p);
  }
  return total;
}

public static int[] histogram(int[] a, int counter){
  int[] total = new int [counter];
  for (int i = 0; i < a.length; i++) {
    int index = a[i];
    total[index]++;
  }
  return total;
}

public static int[] indexOfMax(int[] a){
  int ind = 0;
  int i = 1;
  while(i<a.length) {
    if (a[i] > a[ind]){
    ind = i;
    i++;
    }
  }
  return ind;
}


//Answer to Second Prompt in Excercie 4:
//No, it is not possible to compose indexOfMax method as an enhanced for loop.  Enhanced for loops can be used can be used when you wish to step through an array in first to last order, when it is not needed to know the index of the current element.


//Unsure of Exercise 5 - I looked for other resources and got a bit lost - Sam helped me out a bit!
public static boolean[] sieve(int n){
  boolean[] s = new boolean[n];
  for (int i = 0; i < n; i++){
    s[i] = prime(i);
  }
  return s;
}

public static boolean prime(int num) {
  if (num <= 1){
   return false;
 } else if (num == 2) {
    return true;
 } else if {
  int i = 2;
  while (i < (num / 2)) {
    if (num % i == 0) {
      return false;
    }
    i++;
  }
 } else {
  return true;
 }
}
