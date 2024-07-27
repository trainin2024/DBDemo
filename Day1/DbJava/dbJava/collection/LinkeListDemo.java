package collection;

import java.util.LinkedList;

public class LinkeListDemo {
	   public static void main(String args[])
	    {
	        // Creating object of the
	        // class linked list
	       LinkedList<String> ll = new LinkedList<String>();
	       // LinkedList ll = new LinkedList();
	        // Adding elements to the linked list
	        ll.add("A");
	       // ll.add(3);
	        ll.add("B");
	        ll.addLast("C");
	        ll.addFirst("D");
	        ll.add(2, "E");
	  
	        System.out.println(ll);
	  
	        ll.remove("B");
	        ll.remove(3);
	        ll.removeFirst();
	        ll.removeLast();
	  
	        System.out.println(ll);
	    }
}
