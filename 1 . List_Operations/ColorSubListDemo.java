/*1b. Array List programs
4. Write a java program for getting different colors through ArrayList interface and extract the elements 1st and 2nd from the ArrayList object by using SubList()*/
package Program_1;
import java.util.ArrayList;
import java.util.List;
public class ColorSubListDemo {
		    public static void main(String[] args) {
		        
		        // Create an ArrayList to store color names
		        ArrayList<String> colors = new ArrayList<>();

		        // Add color names to the ArrayList
		        colors.add("Red");
		        colors.add("Green");
		        colors.add("Blue");
		        colors.add("Yellow");
		        colors.add("Orange");

		        // Display the original list of colors
		        System.out.println("Original Colors List: " + colors);

		        // Extract a sublist containing the 1st and 2nd elements (index 0 and 1)
		        List<String> subColors = colors.subList(0, 2); // end index is exclusive

		        // Display the extracted sublist
		        System.out.println("Extracted Elements (1st and 2nd): " + subColors);
		    }
	

}
