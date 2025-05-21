package program_5;

import java.awt.Color;
import javax.swing.*;

// This class demonstrates a tabbed pane with Cyan, Magenta, and Yellow colored panels
public class Cyan_Magenta_Yellow_TabbedPaneDemo {
    JFrame f; // Declare a JFrame

    // Constructor to set up the GUI
    Cyan_Magenta_Yellow_TabbedPaneDemo() {
        // Create a new JFrame
        f = new JFrame();

        // Create three JPanel components
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();

        // Set background colors for the panels
        p1.setBackground(Color.CYAN);       // Panel 1 with cyan background
        p2.setBackground(Color.MAGENTA);    // Panel 2 with magenta background
        p3.setBackground(Color.YELLOW);     // Panel 3 with yellow background

        // Create a tabbed pane and set its position and size
        JTabbedPane tp = new JTabbedPane();
        tp.setBounds(100, 100, 250, 250);

        // Add the panels to the tabbed pane with appropriate labels
        tp.add("CYAN", p1);
        tp.add("MAGENTA", p2);
        tp.add("YELLOW", p3);

        // Add the tabbed pane to the frame
        f.add(tp);

        // Set frame properties: size, layout, visibility, and close operation
        f.setSize(400, 400);             // Set the frame size
        f.setLayout(null);               // Use no layout manager (absolute positioning)
        f.setVisible(true);              // Make the frame visible
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit app on close
    }

    // Main method to run the application
    public static void main(String[] args) {
        new Cyan_Magenta_Yellow_TabbedPaneDemo(); // Create an instance of the class
    }
}
