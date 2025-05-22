/*3c. String Exercise progams

Q7. Write a Java Program for Shortening a string to a specified length and adds an ellipsis using user
defined function truncate()*/
package program_3;

public class StringTruncate {
			    // User-defined function to truncate a string and add ellipsis
			    public static String truncate(String str, int length) {
			        if (str == null || str.length() <= length) {
			            return str;
			        }
			        return str.substring(0, length) + "...";
			    }

			    public static void main(String[] args) {
			        String input = "This is a long sentence that needs to be shortened.";
			        int maxLength = 20;

			        String shortened = truncate(input, maxLength);

			        System.out.println("Original: " + input);
			        System.out.println("Truncated: " + shortened);
			    }
}
