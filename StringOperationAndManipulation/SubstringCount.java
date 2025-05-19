package program_3;

public class SubstringCount {


	    // Function to count occurrences of a substring in the main string
	    public static int countOccurrences(String mainString, String subString) {
	        if (mainString == null || subString == null || subString.isEmpty()) {
	            return 0; // Return 0 if inputs are invalid
	        }

	        int count = 0;
	        int index = 0;

	        // Loop to find the substring in the main string
	        while ((index = mainString.indexOf(subString, index)) != -1) {
	            count++;
	            index += subString.length(); // Move index ahead to avoid counting overlapping parts
	        }
	        return count;
	    }

	    public static void main(String[] args) {
	        // Example main string and substring
	        String mainString = "hello world, hello everyone";
	        String subString = "hello";
	        	System.out.println("Main String: "+mainString+"\nSub String: "+subString);
	        // Call function and print result
	        System.out.println("Occurrences: " + countOccurrences(mainString, subString)); 
	    }

}
