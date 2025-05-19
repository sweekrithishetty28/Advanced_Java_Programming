package program_3;
import java.util.Random;
public class PalindromeCheck {

			    public static void main(String[] args) {
			        System.out.println("=== String Utilities Demo ===");

			        // Basic String Checks
			        String str1 = "A man, a plan, a canal, Panama";
			   
			        System.out.println("Original strings:");
			        System.out.println("str1: " + str1);
			       
			     
			        //Check if a string is a palindrome
			        System.out.print("isPalindrome: ");
			        System.out.println(isPalindrome(str1));
			    }

			    public static boolean isPalindrome(String str) {
			        if (str == null) return false;
			        String cleanedStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
			        return cleanedStr.equals(new StringBuilder(cleanedStr).reverse().toString());
			 

		}

	

}
