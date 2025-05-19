package program_4;

import javax.swing.*;  
import java.awt.*;  

public class SwingHelloMessage {
    public static void main(String[] args) {
        // Create a new JFrame window with a title
        JFrame frame = new JFrame("Swing Hello Message");

        // Create a JLabel to display the welcome message
        JLabel label = new JLabel("Hello! VI C, Welcome to Swing Programming");

        // Set the font to SansSerif, plain style, and size 32
        label.setFont(new Font("SansSerif", Font.PLAIN, 32));

        // Set the text color to blue
        label.setForeground(Color.BLUE);

        // Center the text horizontally and vertically within the label
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setVerticalAlignment(SwingConstants.CENTER);

        // Add the label to the frame
        frame.add(label);

        // Set the size of the window (width x height)
        frame.setSize(700, 200);

        // Close the application when the window is closed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make the window visible
        frame.setVisible(true);
    }
}
