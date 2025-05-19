package program_4;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ImageButtonDemo {

    JLabel l1;  // Label to display messages when buttons are clicked

    // Constructor to set up the GUI components
    ImageButtonDemo() {
        // Create a new JFrame window with title
        JFrame f = new JFrame("Image Button Example");

        // Initialize the label and set its position and font
        l1 = new JLabel();
        l1.setBounds(50, 50, 700, 100);
        l1.setFont(new Font("Lucida Calligraphy", Font.BOLD, 20));

        // Create a button with an image icon of digital clock
        JButton b = new JButton(new ImageIcon("C:\\Users\\Asus\\Downloads\\digital_clock.jpeg"));
        b.setBounds(150, 150, 180, 180);

        // Create another button with an image icon of hourglass
        JButton b1 = new JButton(new ImageIcon("C:\\Users\\Asus\\Downloads\\hourglass.jpeg"));
        b1.setBounds(500, 150, 153, 183);

        // Add an ActionListener for the digital clock button
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Set text on label when digital clock button is pressed
                l1.setText("You have pressed digital clock!");
            }
        });

        // Add an ActionListener for the hourglass button
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Set text on label when hourglass button is pressed
                l1.setText("You have pressed hour glass!");
            }
        });

        // Add the label and buttons to the frame
        f.add(l1);
        f.add(b);
        f.add(b1);

        // Set the size of the frame window
        f.setSize(800, 400);

        // Use absolute positioning (null layout)
        f.setLayout(null);

        // Make the frame visible
        f.setVisible(true);

        // Ensure the application closes when the window is closed
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // Main method to run the program
    public static void main(String[] args) {
        new ImageButtonDemo();  // Create instance of the GUI class
    }
}
