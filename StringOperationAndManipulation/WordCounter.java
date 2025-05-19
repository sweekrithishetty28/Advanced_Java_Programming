package program_3;

public class WordCounter {


			    // User-defined function to count words in a string
			    public static int countWords(String str) {
			        // Remove leading and trailing whitespace
			        str = str.trim();

			        // Return 0 if string is empty after trimming
			        if (str.isEmpty()) {
			            return 0;
			        }

			        // Split the string by one or more spaces
			        String[] words = str.split("\\s+");

			        return words.length;
			    }

			    public static void main(String[] args) {
			        String text = "Java is a powerful programming language";
			        System.out.println("Original String: "+text);
			        int wordCount = countWords(text);
			        System.out.println("Number of words: " + wordCount);
			    }


}
