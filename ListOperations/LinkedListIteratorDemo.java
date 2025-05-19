/*1c. Linked List Programs

1. Write a Java program to iterate through all elements in a linked list starting at the specified position ( 2nd) using iterator ( hint : Iterator iteratorobj = listobj.listIterator(1))*/
package Program_1;
import java.util.LinkedList;
import java.util.ListIterator;
public class LinkedListIteratorDemo {
		    public static void main(String[] args) {

		        // Create a LinkedList to store color names
		        LinkedList<String> colors = new LinkedList<>();

		        // Add colors to the LinkedList
		        colors.add("Red");
		        colors.add("Green");
		        colors.add("Blue");
		        colors.add("Yellow");
		        colors.add("Orange");
		        System.out.println(colors);
		        // Create a ListIterator starting from index 1 (which is the 2nd element "Green")
		        ListIterator<String> iterator = colors.listIterator(1);

		        // Print elements starting from the 2nd position
		        System.out.println("Elements starting from 2nd position:");
		        while (iterator.hasNext()) {
		            System.out.println(iterator.next());
		        }
		    }

}
