package four.fp;

import three.customer.Customer;
import three.customer.CustomerDao;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class LambdaDemo {
    public static void main(String[] args) {
        CustomerDao customerDao = new CustomerDao();
        // customers : ArrayList, List, SequencedCollection, Collection, Iterable
        List<Customer> customers = customerDao.findAll();
        //Brian Goetz
        // 1. izvor stream - kolekcija -> customers
        // 2. intermediate / međuoperacije ->
        // metode -> pozovemo ih nad stream objektom i one opet vrate stream objekat / u većini slučajeva izmijenjen
        //3. terminated operation -> terminirajuće metode -> pozovemo ih nad stream objektom a one više ne vrate stream objekat
        // pa za njih zato kažemo da terminiraju stream

        // Martin Fowler STYLE
        customers
                .stream()
                .filter(c -> c.getPhone() != null)
                .filter(cu -> cu.getPoints() > 0)
                // Function<T, R>
                .map(customer -> customer.setPoints(customer.getPoints() + 1000))
                .forEach(customer -> System.out.println(customer));


        //Razložiti-bez Martin Fowler stila
        Stream<Customer> customerStream = customers.stream();
        Predicate<Customer> phoneTester = c -> c.getPhone() != null;
        customerStream = customerStream.filter(phoneTester);
        Predicate<Customer> customerWithPointTester = c -> c.getPoints() > 0;
        customerStream = customerStream.filter(customerWithPointTester);
        Function<Customer, Customer> customerTransformer = c -> c.setPoints(c.getPoints() + 1000);
        customerStream = customerStream.map(customerTransformer);
        customerStream.forEach(customer -> System.out.println(customer));
    }
}
