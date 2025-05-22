/*1c. Linked List Operations
5.Write a Java program that swaps two elements ( first and third elements ) in a linked list ( using Collections.swap(l_list, 0, 2))*/
package Program_1;
import java.util.LinkedList;
import java.util.Collections;
public class LinkedListSwapElements {
			    public static void main(String[] args) {

			        // Create a LinkedList and add some color names
			        LinkedList<String> l_list = new LinkedList<>();
			        l_list.add("Red");
			        l_list.add("Green");
			        l_list.add("Blue");

			        // Display the original list
			        System.out.println("Original LinkedList: " + l_list);

			        // Swap the first (index 0) and third (index 2) elements
			        Collections.swap(l_list, 0, 2);

			        // Display the list after swapping
			        System.out.println("LinkedList after swapping first and third elements: " + l_list);
			    }
}
