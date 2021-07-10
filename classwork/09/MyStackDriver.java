import java.io.*;
import java.util.*;

public class MyStackDriver {
  public static void main(String[] args) {
    System.out.println("Ski Brands - We need some snow!");
    LList list = new LList();
		list.add("K2");
		list.add("Salomon");
		list.add("Atomic");
		list.add("Faction");
    list.add("Volkl");
		MyStack sStack = new MyStack(list);
    System.out.println("There are " + sStack.size() + " Nodes in the Stack.");
		System.out.println();
		System.out.println(sStack);
		sStack.pop();
		sStack.pop();
    sStack.pop();
		System.out.println("The stack after three removals - ");
    System.out.println("There are " + sStack.size() + " Nodes in the Stack.");
		System.out.println(sStack);
		System.out.println();
		sStack.push("Armada");
		sStack.push("Rossignol");
    System.out.println("There are " + sStack.size() + " Nodes in the Stack.");
		System.out.println(sStack);
		System.out.println();
		System.out.println("The top Node contains " + sStack.top() + ".");
		System.out.println(sStack);

    System.out.println("reverse method test");
    System.out.println(MyStack.reverse("Crunchy"));

  }//main
}//LListDriver
