package four.fp;

import three.customer.Customer;
import three.customer.CustomerDao;

import java.util.List;
import java.util.function.Consumer;

public class LambdaBasicDemo {
    public static void main(String[] args) {
        CustomerDao customerDao = new CustomerDao();
        // customers : ArrayList, List, SequencedCollection, Collection, Iterable
        List<Customer> customers = customerDao.findAll();
        //Kako možemo obraditi elemente kolekcije
        //1. C++
        System.out.println("C++");
        for (int i = 0; i < customers.size(); i++) {
            Customer customer = customers.get(i);
            System.out.println(customer);
        }
        System.out.println("----------------------------------");
        System.out.println("Java Iterator");
        for(Customer customer : customers) {
            System.out.println(customer);
        }
        System.out.println("----------------------------------");
        System.out.println("Java 8+: Spliterator");
        Consumer<Customer> customerConsumer = c -> System.out.println(c);
        customers.forEach(customerConsumer);

    }
}
