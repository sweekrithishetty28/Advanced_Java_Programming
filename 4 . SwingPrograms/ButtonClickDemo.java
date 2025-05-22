/*4b. Develop a Swing program in Java to display a message “Srilanka is pressed” or “India is pressed” depending upon the Jbutton either Srilanka or India is pressed by implementing the
event handling mechanism with addActionListener( ).*/
package program_4;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ButtonClickDemo {
    JLabel l1;  // Label to display messages when buttons are clicked

    // Constructor to create the GUI window and components
    ButtonClickDemo() {
        // Create a new JFrame window with title
        JFrame f = new JFrame("Button Example");

        // Initialize label, set its position and font properties
        l1 = new JLabel();
        l1.setBounds(50, 50, 700, 100);
        l1.setFont(new Font("Lucida Calligraphy", Font.BOLD, 60));

        // Create two buttons with labels "India" and "Srilanka"
        JButton b1 = new JButton(" India ");
        JButton b2 = new JButton(" Srilanka ");

        // Set bounds (position and size) for button b1
        b1.setBounds(100, 200, 100, 100);
        // Add action listener to button b1 to update label text when clicked
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                l1.setText("India is pressed");
            }
        });

        // Set bounds for button b2
        b2.setBounds(400, 200, 100, 100);
        // Add action listener to button b2 to update label text when clicked
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                l1.setText("SriLanka is pressed");
            }
        });

        // Add buttons and label to the frame
        f.add(b1);
        f.add(b2);
        f.add(l1);

        // Set the frame size (width, height)
        f.setSize(700, 400);

        // Use absolute positioning by setting layout to null
        f.setLayout(null);

        // Make the frame visible on screen
        f.setVisible(true);

        // Ensure program exits when window is closed
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // Main method to launch the GUI application
    public static void main(String[] args) {
        new ButtonClickDemo();
    }
}
