import java.io.*;
import java.util.*;

public class BSTree {
    private TreeNode root;

    public BSTree(){
	     root = null;
    }

    public void traverse(TreeNode current){
      if (current == null){
        return;
      }

      //process the current node
      System.out.print(current.getData()+", ");

      //recursively print right sub-tree
      traverse(current.getLeft());

      //recursively print right sub-tree
      traverse(current.getRight());
    }

    public void traverse(){
      traverse(root);
      System.out.println();
    }

    public void traverse2(TreeNode current){
      if (current == null){
        return;
      }

      //recursively print right sub-tree
      traverse2(current.getLeft());

      //recursively print right sub-tree
      traverse2(current.getRight());

      //process the current node
      System.out.print(current.getData()+", ");
    }

    public void traverse2(){
      traverse2(root);
      System.out.println();
    }

    public void traverse3(TreeNode current){
      if (current == null){
        return;
      }

      //recursively print right sub-tree
      traverse3(current.getLeft());

      //process the current node
      System.out.print(current.getData()+", ");

      //recursively print right sub-tree
      traverse3(current.getRight());
    }

    public void traverse3(){
      traverse3(root);
      System.out.println();
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
