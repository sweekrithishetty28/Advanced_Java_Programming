/*3c. String Exercise progams
Q9. Write a Java Program for Creating a random string of a specified length using user defined function generateRandomString()*/

package program_3;
import java.util.Random;
public class RandomStringGenerator {

			    // User-defined function to generate a random string
			    public static String generateRandomString(int length) {
			        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
			        StringBuilder result = new StringBuilder();
			        Random random = new Random();

			        for (int i = 0; i < length; i++) {
			            int index = random.nextInt(characters.length());
			            result.append(characters.charAt(index));
			        }

			        return result.toString();
			    }

			    public static void main(String[] args) {
			        int length = 10; // specify desired length here
			        String randomString = generateRandomString(length);
			        System.out.println("Random String of length " + length + ": " + randomString);
			    }

	

}
