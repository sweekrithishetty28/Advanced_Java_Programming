package program_2;

public class PerformanceTest {

			    public static void main(String[] args) {

			        int times = 10000;
			        String text = "AIET";

			        // Test StringBuffer
			        long startBuffer = System.currentTimeMillis();

			        StringBuffer buffer = new StringBuffer();
			        for (int i = 0; i < times; i++) {
			            buffer.append(text);
			        }

			        long endBuffer = System.currentTimeMillis();
			        long timeBuffer = endBuffer - startBuffer;
			        System.out.println("Time taken by StringBuffer: " + timeBuffer + " ms");

			        // Test StringBuilder
			        long startBuilder = System.currentTimeMillis();

			        StringBuilder builder = new StringBuilder();
			        for (int i = 0; i < times; i++) {
			            builder.append(text);
			        }

			        long endBuilder = System.currentTimeMillis();
			        long timeBuilder = endBuilder - startBuilder;
			        System.out.println("Time taken by StringBuilder: " + timeBuilder + " ms");

			        // Compare times
			        if (timeBuffer > timeBuilder) {
			            System.out.println("StringBuilder is faster.");
			        } else if (timeBuffer < timeBuilder) {
			            System.out.println("StringBuffer is faster.");
			        } else {
			            System.out.println("Both have similar speed.");
			        }
			    }

}
