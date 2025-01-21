package four.dao;

import three.customer.Customer;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * Ja želim povezati blok koda methode zvane actionPerformed
 * na način da izvršim tu metodu kada korisnik klikne na button saveButton
 * koji se nalazi u CustomerPanel.
 */
public class SaveCustomerListener implements ActionListener {
    private final CustomerPanel panel;

    public SaveCustomerListener(CustomerPanel panel) {
        this.panel = panel;
    }

    //SAVE button -> on click na SAVE se poziva
    @Override
    public void actionPerformed(ActionEvent e) {
        CustomerDao customerDao = new CustomerDao();
        Customer customer = new Customer();
        customer.setFirstName(panel.getFirstName());
        customer.setLastName(panel.getLastName());
        customer.setAddress(panel.getAddress());
        customer.setCity(panel.getCity());
        customer.setState(panel.getState());
        customerDao.create(customer);
        JOptionPane.showMessageDialog(null, "Uspješno kreiran customer...");
    }
}
