package four.dao;

import three.customer.Customer;

import java.time.LocalDate;

public class DemoDaoExecution {
    public static void main(String[] args) {
        int id = 13;
        CustomerDao customerDao = new CustomerDao();
        //SELECT
        Customer customer = customerDao.findById(id);
        System.out.println(customer);
        //CHANGE polja
        customer.setBirthDate(LocalDate.of(1990, 12, 31));
        customer.setPhone("+3842322323");
        customer.setPoints(2343);
        //UPDATE
        customerDao.update(customer);
        //DELETE
        customerDao.delete(customer);
    }
}
