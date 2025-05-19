/*1c. Linked List Programs
2.Write a Java program to iterate a linked list in reverse order (using
objlist.descendingIterator())*/
package Program_1;
import java.util.LinkedList;
import java.util.Iterator;
public class LinkedListReverseIteratorDemo {
		    public static void main(String[] args) {
		        
		        // Create a LinkedList to store color names
		        LinkedList<String> colors = new LinkedList<>();
		        colors.add("Red");
		        colors.add("Green");
		        colors.add("Blue");
		        colors.add("Yellow");
		        System.out.println(colors);
		        // Create an iterator to iterate in reverse order
		        Iterator<String> reverseIterator = colors.descendingIterator();

		        // Print the elements in reverse order
		        System.out.println("LinkedList elements in reverse order:");
		        while (reverseIterator.hasNext()) {
		            System.out.println(reverseIterator.next());
		        }
		    }

}
