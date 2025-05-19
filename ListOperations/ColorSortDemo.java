/*1. Array List Program
 3.Write a java program for getting different colors through ArrayList interface and sort them
using Collections.sort( ArrayListObj)*/
package Program_1;
import java.util.ArrayList;
import java.util.Collections;
public class ColorSortDemo {
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
