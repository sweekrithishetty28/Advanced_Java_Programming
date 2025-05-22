package program_5;

import java.awt.Color;
import javax.swing.*; // Required for JFrame, JPanel, JTabbedPane

public class Blue_Green_Red_TabbedPaneDemo {

    JFrame f;

    Blue_Green_Red_TabbedPaneDemo() {
        f = new JFrame();

        // Create three panels with different background colors
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();

        p1.setBackground(Color.BLUE);    // Panel 1 with blue background
        p2.setBackground(Color.RED);     // Panel 2 with red background
        p3.setBackground(Color.GREEN);   // Panel 3 with green background

        // Create a tabbed pane and set its size and position
        JTabbedPane tp = new JTabbedPane();
        tp.setBounds(50, 50, 200, 200);

        // Add panels to the tabbed pane with correct titles
        tp.add("BLUE", p1);
        tp.add("RED", p2);
        tp.add("GREEN", p3);

        // Add tabbed pane to the frame
        f.add(tp);

        // Set frame size, layout and visibility
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);

        // Close the application when the frame is closed
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Blue_Green_Red_TabbedPaneDemo(); // Correct class name
    }
}
