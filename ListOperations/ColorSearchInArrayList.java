package Program_1;
import java.util.ArrayList;
public class ColorSearchInArrayList {
		    public static void main(String[] args) {
		        
		        // Create an ArrayList to store colors
		        ArrayList<String> colors = new ArrayList<>();

		        // Add some color names to the ArrayList
		        colors.add("Blue");
		        colors.add("Green");
		        colors.add("Yellow");
		        colors.add("Red");
		        colors.add("White");

		        // Display all the available colors
		        System.out.println("Available Colors: " + colors);

		        // Check if the color "Red" is present in the list using contains()
		        if (colors.contains("Red")) {
		            System.out.println("The color 'Red' is available in the list.");
		        } else {
		            System.out.println("The color 'Red' is NOT available in the list.");
		        }
		    }
	

}
