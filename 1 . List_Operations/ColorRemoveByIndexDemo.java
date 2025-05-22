/* 1b. Array List Programs
5.Write a java program for getting different colors through ArrayList interface and delete nth element from the ArrayList object by using remove by index*/

package Program_1;
import java.util.ArrayList;
import java.util.List;
public class ColorRemoveByIndexDemo {

		    public static void main(String[] args) {
		        // Create a List using ArrayList to store color names
		       ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        // Print original list
        System.out.println("Colors before removing: " + colors);

        // Remove 2nd element (index 1)
        colors.remove(1);

        // Print updated list
        System.out.println("Colors after removing 2nd element: " + colors);
		    }
	

}
