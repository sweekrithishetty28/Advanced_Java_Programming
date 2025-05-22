/* 3b. String Exercise progams
Q1. Write a Java Program for Checking if a given string is null or contains only whitespace using user defined function isNullOrEmpty().*/

package program_3;
import java.util.*;
public class StringNullOrEmptyCheck {

			    public static boolean isNullOrEmpty(String str) {
			        // Check if str is null or after trimming is empty
			        return (str == null || str.trim().isEmpty());
			    }

			    public static void main(String[] args) {
			       String input="Hello World!";
			       System.out.println("Original String: "+input);
			        // Call the method and display result
			        if (isNullOrEmpty(input)) {
			            System.out.println("The string is null or contains only whitespace.");
			        } else {
			            System.out.println("The string is NOT null or empty.");
			        }

			    
			    }

}
