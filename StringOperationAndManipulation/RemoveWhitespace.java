package program_3;

public class RemoveWhitespace {


	public class Pro3_b5 {
	    // User-defined function to remove all whitespaces
			    public static String removeWhitespace(String str) {
			        return str.replaceAll("\\s+", "");
			    }

			    public static void main(String[] args) {
			        String original = " Hello   World! This is  Java. ";
			        String result = removeWhitespace(original);

			        System.out.println("Original String: " + original);
			        System.out.println("String without whitespace: " + result);
			    }

	}

}
