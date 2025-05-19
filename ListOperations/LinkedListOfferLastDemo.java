package Program_1;

import java.util.LinkedList;
public class LinkedListOfferLastDemo {
		    public static void main(String[] args) {
		        
		        // Create a LinkedList to store color names
		        LinkedList<String> colors = new LinkedList<>();
		        colors.add("Red");
		        colors.add("Green");
		        colors.add("Blue");

		        // Display the original LinkedList
		        System.out.println("Original LinkedList: " + colors);

		        // Add "Pink" at the end of the list using offerLast()
		        colors.offerLast("Pink");

		        // Display the LinkedList after adding the new element
		        System.out.println("LinkedList after adding 'Pink' at the end: " + colors);
		    }
}
