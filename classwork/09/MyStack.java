import java.io.*;
import java.util.*;


public class MyStack{
  // add your internal data structure here
  private LList skiStack;

  public MyStack(LList list) {
    skiStack = list;
  } //end of MyStack

  public MyStack() {
    this(new LList());
  }

  //Adds Node to skiStack
  public void push(String data) {
    skiStack.add(data);
  } //end of push

  //Removes Node from skiStack
  public String pop() {
    int length = size();
    String pop = skiStack.get(length - 1); // stores data value of top element
    skiStack.remove(length - 1); // removes top element
    return pop;
  } //end of pop

  //Peaks at top of Stack but does not remove
  public String top() {
    return skiStack.get(size() - 1);
  } //end of top

  // identifies if skiStack is empty
  public boolean isEmpty() {
    return skiStack.isEmpty();
  } //end of isEmpty

  // returns number of items in skiStack
  public int size() {
    return skiStack.lengthValue();
  } //end of size

  public String toString() {
    if (size() == 0) {
      return "Stack is empty";
    } else {
    String s = "";
    for (int i = 0; i < size() - 1; i++) { // loops forwards from top to bottom
      s += skiStack.get(i) + "\n";
    }// end of i
    s += skiStack.get(size()-1); //prints the top index.
    return s;
    }
  }//end of toString


// New methods for String
public static String reverse(String s) {
  MyStack string = new MyStack();
  var i = 0;
  while (i < s.length()){
    string.push("" + s.charAt(i));
    i ++;
  }
  String result = "";
  while(!(string.isEmpty())){
      result += string.pop();
  }
  return result;

}






}//end of MyStack Class
