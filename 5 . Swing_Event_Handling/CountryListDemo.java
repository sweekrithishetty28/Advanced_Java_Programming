/*5a. Develop a Swing program in Java to add the countries USA, India, Vietnam, Canada, Denmark, France, Great Britain, Japan, Africa, Greenland, Singapore into a JList and
display them on console whenever the countries are selected on the list.*/

package program_5;

import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class CountryListDemo extends JFrame {
    private JList<String> countryList;  // JList to display countries

    public CountryListDemo() {
        // Create the list model and add elements (country names)
        DefaultListModel<String> listModel = new DefaultListModel<>();
        listModel.addElement("USA");
        listModel.addElement("India");
        listModel.addElement("Vietnam");
        listModel.addElement("Canada");
        listModel.addElement("Denmark");
        listModel.addElement("France");
        listModel.addElement("Great Britain");
        listModel.addElement("Japan");
        listModel.addElement("Africa");
        listModel.addElement("Greenland");
        listModel.addElement("Singapore");
        listModel.addElement("");  // empty string, optional, can be removed if not needed

        // Create the JList using the model
        countryList = new JList<>(listModel);

        // Add a selection listener to detect when user selects an item(s)
        countryList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                // Only respond when selection is finalized (not adjusting)
                if (!e.getValueIsAdjusting()) {
                    // Get all selected values as a list
                    final List<String> selectedValuesList = countryList.getSelectedValuesList();
                    // Print the selected countries to the console
                    System.out.println(selectedValuesList);
                }
            }
        });

        // Add the list to a scroll pane to allow scrolling if many items
        add(new JScrollPane(countryList));

        // Set JFrame properties
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // close app on window close
        this.setTitle("JList Example");  // window title
        this.setSize(200, 200);  // window size
        this.setLocationRelativeTo(null); // center the window on screen
        this.setVisible(true);  // make the window visible
    }

    // Main method to launch the GUI application
    public static void main(String[] args) {
        new CountryListDemo();
    }
}
