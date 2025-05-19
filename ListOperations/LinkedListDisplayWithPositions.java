/*1c. Linked List Programs
4. Write a Java program to display elements and their positions in a linked list ( using l_listobj.get(p) )*/
package Program_1;
import java.util.LinkedList;
public class LinkedListDisplayWithPositions {
		    public static void main(String[] args) {

		        // Create a LinkedList to store color names
		        LinkedList<String> colors = new LinkedList<>();
		        
		        // Add elements to the LinkedList
		        colors.add("Red");
		        colors.add("Green");
		        colors.add("Blue");
		        colors.add("Yellow");

		        // Display elements and their positions using a for loop
		        System.out.println("Elements and their positions in the LinkedList:");
		        for (int i = 0; i < colors.size(); i++) {
		            // get(i) retrieves the element at index i
		            System.out.println("Position " + i + ": " + colors.get(i));
		        }
		    }

}
