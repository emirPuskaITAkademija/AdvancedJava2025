package four.dao;

import javax.swing.*;
import java.awt.*;


//Customer -> CustomerPanel
//polja(firstName, lastName..) String -> polja (firstNameField, lastNameField..) JTextField

/**
 * GUI komponente dijelimo na 3 vrste:
 * <li>1. Kontejneri: JPanel, CustomerPanel, </li>
 * <li>2. Layout Menadzeri - FlowLayout, GridLayout,..</li>
 * <li>3. GUI kontrole -> korisnik : JTextField, </li>
 */
public class CustomerPanel extends JPanel {
    private final JTextField firstNameField = new JTextField();
    private final JTextField lastNameField = new JTextField();
    private final JTextField addressField = new JTextField();
    private final JTextField cityField = new JTextField();
    private final JTextField stateField = new JTextField();
    private final JButton saveButton = new JButton("Save Customer");

    public CustomerPanel() {
        setLayout(new FlowLayout());
        firstNameField.setColumns(50);
        lastNameField.setColumns(50);
        addressField.setColumns(50);
        cityField.setColumns(50);
        stateField.setColumns(50);
        add(new JLabel("First Name"));
        add(firstNameField);
        add(new JLabel("Last Name"));
        add(lastNameField);
        add(new JLabel("Address"));
        add(addressField);
        add(new JLabel("City"));
        add(cityField);
        add(new JLabel("State"));
        add(stateField);
        SaveCustomerListener saveCustomerListener = new SaveCustomerListener(this);
        saveButton.addActionListener(saveCustomerListener);
        add(saveButton);
    }

    public String getFirstName() {
        return firstNameField.getText();
    }

    public String getLastName() {
        return lastNameField.getText();
    }

    public String getAddress() {
        return addressField.getText();
    }

    public String getCity() {
        return cityField.getText();
    }

    public String getState() {
        return stateField.getText();
    }
}
