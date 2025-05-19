package Program_1;
import java.util.ArrayList;
import java.util.List;
public class Pro1_b5 {
	    public static void main(String[] args) {
	        // Create a List using ArrayList to store color names
	        List<String> ls = new ArrayList<>();

	        // Add color names to the list
	        ls.add("Orange");
	        ls.add("green");
	        ls.add("pink");
	        ls.add("red");
	        ls.add("Blue");

	        // Define the element to be removed (in this case, "green")
	        String Str = "green";

	        // Print the original list
	        System.out.println(ls);

	        // Remove the element "green" from the list using its value
	        System.out.println("Removing the nth Element: " + ls.remove(Str));

	        // Print the updated list after removal
	        System.out.println(ls);
	    }
}
