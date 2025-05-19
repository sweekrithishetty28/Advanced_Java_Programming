package program_5;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.util.HashMap;

public class CountryCapitalViewer {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Country Capital Viewer");

        // List of countries
        String[] countries = {
            "USA", "India", "Vietnam", "Canada", "Denmark",
            "France", "Great Britain", "Japan", "Africa", "Greenland", "Singapore"
        };

        // Map to store country-capital pairs
        HashMap<String, String> countryCapitals = new HashMap<>();
        countryCapitals.put("USA", "Washington, D.C.");
        countryCapitals.put("India", "New Delhi");
        countryCapitals.put("Vietnam", "Hanoi");
        countryCapitals.put("Canada", "Ottawa");
        countryCapitals.put("Denmark", "Copenhagen");
        countryCapitals.put("France", "Paris");
        countryCapitals.put("Great Britain", "London");
        countryCapitals.put("Japan", "Tokyo");
        countryCapitals.put("Africa", "No single capital (continent)");
        countryCapitals.put("Greenland", "Nuuk");
        countryCapitals.put("Singapore", "Singapore");

        // Create a JList for displaying countries
        JList<String> countryList = new JList<>(countries);
        countryList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        countryList.setFont(new Font("Arial", Font.PLAIN, 18));

        // Add the list to a scroll pane for better usability
        JScrollPane scrollPane = new JScrollPane(countryList);
        scrollPane.setBounds(30, 30, 250, 200);

        // Add listener to respond when a country is selected
        countryList.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    String selectedCountry = countryList.getSelectedValue();
                    String capital = countryCapitals.get(selectedCountry);
                    System.out.println("Selected Country: " + selectedCountry);
                    System.out.println("Capital: " + capital);
                }
            }
        });

        // Set up frame
        frame.add(scrollPane);
        frame.setSize(350, 300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
