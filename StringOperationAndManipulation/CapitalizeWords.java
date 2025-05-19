/*3c. String Exercise progams
Q6. Write a Java Program for Capitalizing the first letter of each word. using user defined function capitalizeWords()*/

package program_3;

public class CapitalizeWords {


			    // User-defined function to capitalize the first letter of each word
			    public static String capitalizeWords(String str) {
			        String[] words = str.split(" ");
			        StringBuilder result = new StringBuilder();

			        for (String word : words) {
			            if (!word.isEmpty()) {
			                // Capitalize first letter and add rest of the word
			                result.append(Character.toUpperCase(word.charAt(0)))
			                      .append(word.substring(1).toLowerCase())
			                      .append(" ");
			            }
			        }
			        return result.toString().trim(); // Remove the trailing space
			    }

			    public static void main(String[] args) {
			        String input = "hello world from java";
			        String capitalized = capitalizeWords(input);

			        System.out.println("Original: " + input);
			        System.out.println("Capitalized: " + capitalized);
			    }

	
}
