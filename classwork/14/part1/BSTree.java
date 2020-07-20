import java.io.*;
import java.util.*;

public class BSTree {
    private TreeNode root;

    public BSTree(){
	     root = null;
    }

    public int search (int key) {
      TreeNode current = root;

      while(current != null) {
        int currentValue = current.getData();
        if (currentValue == key) {
          return currentValue;
        } else if (currentValue < key){
          current = current.getRight();
        } else {
          current = current.getLeft();
        }
      }
      throw new NullPointerException();
    }

    public void insert (int key) {
      TreeNode newNode= new TreeNode(key);

      //If tree is empty - isert new node as root
      if (root == null){
        root = newNode;
        return;
      }

      TreeNode front = root;
      TreeNode trailer = root;

      while(front != null) {
        int frontValue = front.getData();
        if (frontValue == key) {
          //key is already in the tree
          return;
        } else if (frontValue < key){
          trailer = front;
          front = front.getRight();
        } else {
          trailer = front;
          front = front.getLeft();
        }
      }
      //front poitns to null, trailer points to the node before above where the new node goes
      //add the code to finish the insertion
      if (key > trailer.getData()){
        trailer.setRight(newNode);
      } else {
        trailer.setLeft(newNode);
      }
    }

    public void seed(){
    	TreeNode t;

    	t = new TreeNode(10);
    	root = t;
    	t = new TreeNode(5);
    	root.setLeft(t);
    	t = new TreeNode(20);
    	root.setRight(t);

    	root.getLeft().setRight( new TreeNode(8));

    	t = new TreeNode(15);
    	root.getRight().setLeft(t);

    	t = new TreeNode(22);
    	root.getRight().setRight(t);

	  }


}
