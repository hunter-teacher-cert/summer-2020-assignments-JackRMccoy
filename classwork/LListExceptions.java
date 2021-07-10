import java.io.*;
import java.util.*;


public class LListExceptions {
    private Node head;

    public LListExceptions(){
    	head = null;
    }

    public void add(String data){
    	Node newnode = new Node(data);

    	// first point the new node to the beginning
    	newnode.setNext(head);

    	// point head to the new node
    	head = newnode;

    }

    public void addFront(String value) {
      if (value == null) {
     throw new IllegalArgumentException();
   }//exception


      Node addNode = new Node(value);
      addNode.setNext(head);
      head = addNode;
    }

    public boolean isEmpty() {
      if (head == null) {
        return true;
      } else {
        return false;
      }
    }

    public String get(int index){
      Node tmp = head;
      for(int i =0; i < index; i++){
        tmp = tmp.getNext();
        if (tmp == null) {
          return null;
        }
      }
      return tmp.getData();
    }

    public void set(int index, String value) {
      Node tmp = head;
      for(int i =0; i < index; i++){
        tmp = tmp.getNext();
        if (tmp == null) {
          return;
        }
      }
      tmp.setData(value);
    }


    public String toString(){
    	String s = "";

    	Node tmp;
    	tmp = head;
    	while (tmp != null){
    	    s = s + tmp.getData()+"-->";
    	    // how can we now move tmp to the next node
    	    // this is the magic linked list idiom!!!!
    	    // this moves a pointer to the next node!!!
    	    // It's analagous to i=i+1 for an array (for loop)
    	    tmp = tmp.getNext();
	    }

    	s = s + "null";
    	return s;
    }


    public int length(){
      int l = 0;

      Node tmp;
      tmp = head;
      while (tmp != null){
          l = l + 1;
          // how can we now move tmp to the next node
          // this is the magic linked list idiom!!!!
          // this moves a pointer to the next node!!!
          // It's analagous to i=i+1 for an array (for loop)
          tmp = tmp.getNext();
      }
      return l;
    }


      //call in driver System.out.print.length();

    public void insert(int index, String value){
      if (index == 0){
        add(value);
      } else {
        //make new Node
        Node tmp;
        tmp = head;
        //move temp down the list until it is right before insertion
        for (int i =0; i < index - 1; i++){  //must stop 1 before intended position
          tmp = tmp.getNext();
          if (tmp == null){
            return;
          }
        }
        Node newtmp = tmp.getNext();
        //insert
        tmp.setNext(new Node(value, newtmp));
      }
    }

    public int search(String key){
      Node tmp = head;
      //How to define length of search to cover entire linked list?  no.length property? created length method, but not invoking correctly
      for(var i = 0; /*i < this.length()*/; i++) {
        if (tmp.getData().equals(key)) { //Can't use == since comparing addresses?
          return i;
        } else {
          tmp = tmp.getNext();
          if(tmp == null) {
            //return -1;
            throw new NoSuchElementException();
          }
        }
      }
    }

    public void remove(int index){
      //make a tmp Node
      Node tmp = head;
      //move temp down the list until it is right before the node we want to delete
      for (int i =0; i < index - 1; i++){  //must stop 1 before intended position
        tmp = tmp.getNext();
        if (tmp == null){
          return;
        }
      }
      Node newtmp = tmp.getNext();
      //change tmp's next pointer to skip the node we are deleting
      tmp.setNext(newtmp.getNext());
    }



}
