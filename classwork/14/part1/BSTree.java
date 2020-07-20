import java.io.*;
import java.util.*;

public class BSTree {
    private TreeNode root;

    public BSTree(){
	     root = null;
    }

    public void preorderTraverse(TreeNode current){
      if (current == null){
        return;
      }

      //process the current node
      System.out.print(current.getData()+", ");

      //recursively print right sub-tree
      preorderTraverse(current.getLeft());

      //recursively print right sub-tree
      preorderTraverse(current.getRight());
    }

    public void preorderTraverse(){
      preorderTraverse(root);
      System.out.println();
    }

    public void postorderTraverse(TreeNode current){
      if (current == null){
        return;
      }

      //recursively print right sub-tree
      postorderTraverse(current.getLeft());

      //recursively print right sub-tree
      postorderTraverse(current.getRight());

      //process the current node
      System.out.print(current.getData()+", ");
    }

    public void postorderTraverse(){
      postorderTraverse(root);
      System.out.println();
    }

    public void inorderTraverse(TreeNode current){
      if (current == null){
        return;
      }

      //recursively print right sub-tree
      inorderTraverse(current.getLeft());

      //process the current node
      System.out.print(current.getData()+", ");

      //recursively print right sub-tree
      inorderTraverse(current.getRight());
    }

    public void inorderTraverse(){
      inorderTraverse(root);
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
