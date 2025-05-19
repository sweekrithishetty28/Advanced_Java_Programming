package program_3;

public class NumericCheck {
			    // User-defined function to check if the string is numeric
			    public static boolean isNumeric(String str) {
			        if (str == null || str.isEmpty()) {
			            return false;
			        }

			        for (char c : str.toCharArray()) {
			            if (!Character.isDigit(c)) {
			                return false;
			            }
			        }

			        return true;
			    }

			    public static void main(String[] args) {
			        String input1 = "123456";
			        String input2 = "123abc";

			        System.out.println("Is '" + input1 + "' numeric? " + isNumeric(input1));
			        System.out.println("Is '" + input2 + "' numeric? " + isNumeric(input2));
			    }


}
