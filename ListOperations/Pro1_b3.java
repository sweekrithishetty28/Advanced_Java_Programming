package Program_1;
import java.util.ArrayList;
import java.util.Collections;
public class Pro1_b3 {
	    public static void main(String[] args) {
	        
	        // Create an ArrayList to store color names
	        ArrayList<String> colors = new ArrayList<>();

	        // Add color names to the ArrayList
	        colors.add("Blue");
	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Yellow");
	        colors.add("Orange");

	        // Display the original list of colors
	        System.out.println("Original Colors List: " + colors);

	        // Sort the ArrayList in alphabetical order using Collections.sort()
	        Collections.sort(colors);

	        // Display the sorted list of colors
	        System.out.println("Sorted Colors List: " + colors);
	    }
}
