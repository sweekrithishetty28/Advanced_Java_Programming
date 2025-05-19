package program_3;
import java.util.*;
public class StringReversal {
				    public static String reverseWords(String sentence) {
				        // Split the sentence into words
				        String[] words = sentence.split(" ");
				        
				        // Use a StringBuffer to build the result
				        StringBuffer result = new StringBuffer();
				        
				        for (String word : words) {
				            // Reverse each word using StringBuffer
				            StringBuffer reversedWord = new StringBuffer(word);
				            result.append(reversedWord.reverse().toString()).append(" ");
				        }
				        
				        // Remove the trailing space at the end and return the result
				        return result.toString().trim();
				    }

				    public static void main(String[] args) {
				        // Test cases
				    	String str1="Java programming is fun";
				    	String str2="Hello World";
				    	System.out.println("Oiginal String 1:"+str1);
				    	System.out.println("Oiginal String 2:"+str2);
				    	System.out.println("Reversing of String:");
				        System.out.println(reverseWords(str1));  
				        System.out.println(reverseWords(str2));  
				    }


}
