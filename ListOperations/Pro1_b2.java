package Program_1;
import java.util.ArrayList;
public class Pro1_b2 {
	    public static void main(String[] args) {
	    
	        // Create an ArrayList to store color names
	        ArrayList<String> colors = new ArrayList<>();

	        // Add some colors to the list
	        colors.add("Red");
	        colors.add("Green");   // index 1
	        colors.add("Blue");
	        colors.add("Yellow");
	        colors.add("Black");

	        // Print the original list
	        System.out.println("Original Colors List: " + colors);

	        // Remove the 2nd element (index 1, which is "Green")
	        colors.remove(1);  
	        System.out.println("Updated Colors List (after removing 2nd element): " + colors);
	     
	        // Remove the color "Blue" by value
	        colors.remove("Blue");

	        // Print the updated list after removing "Blue"
	        System.out.println("Updated Colors List (after removing 'Blue'): " + colors);
	    }
}
