import java.io.*;
import java.util.*;

public class SuperArray {
  private int[] data;
  private int numberElements;


  public SuperArray() {
    this.data = new int[10];
    this.numberElements = 0;
  }

  private SuperArray(int size) {
    this.data = new int[size];
    this.numberElements = 0;
  }

/*
  //this routine will add the parameter value to the end of the SuperArray (don’t forget to update numberElements). If there is no more room in the array do nothing
  public void add(int value) {
    if (this.numberElements < this.data.length){
      this.data[numberElements] = value;
      this.numberElements++;
    } else {
      grow();
    }

  }
  */

  //???? return the value at location index from the array. If index is past the last element, return -1
  public int get(int index) {
    if (index > this.numberElements){
      return -1;
    } else {
      return this.data[index];
    }
  }

  // return True if ther are no elemets in the internal array, false otherwise
  public boolean isEmpty(){
    if(this.numberElements == 0){
      return true;
    } else {
      return false;
    }
  }

  //build and return a String with all the elements of the array in a printable form
  public String toString(){
    String s = new String();
    for (var i=0; i < this.numberElements; i++){
      s = " , " + this.data[i];
    }
    return s;
  }

  public void grow(int arraySizeAdd){
    int [] bigger = new int [this.data.length + arraySizeAdd];
      for(var i = 0; i< this.data.length; i++){
        bigger[i] = data[i];
      }
      this.data = bigger;
  }

  public void add(int index, int value){
    if ( numberElements == data.length ){
      grow(1);
    }
    for( int i = numberElements; i > index ; i--) {
      data[i]=data[i-1];
    }
    data[index] = value;
    numberElements++;
  }//end add(i,i)


  public void remove(int index){
    for( int i = index; i < numberElements - 1; i++){
      data[i] = data[i+1];
    }
    numberElements--;
  }//end remove()

  public static void main(String[] args){
    System.out.println("Testing Default Constructor.");
    SuperArray sa = new SuperArray();
  }

}
