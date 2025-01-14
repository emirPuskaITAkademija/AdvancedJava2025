package three.execution;

import three.customer.Customer;
import three.customer.CustomerDao;

import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * Functional Interface:
 * Zvijezde među funkcionalnim interfejsima u programskom jeziku Java.
 * <li>
 * 1. Supplier<T>
 * T get();
 * </li>
 * <li>
 * 2. Consumer<T>
 * void accept(T t);
 * </li>
 * <li>
 * 3. Predicate<T>
 * boolean test(T element); -> true/false
 * </li>
 * <li>
 * 4. Function<T, R>
 * R apply(T taken);
 * </li>
 */
public class ExecutionDemo {
    public static void main(String[] args) {
        CustomerDao customerDao = new CustomerDao();
        List<Customer> customers = customerDao.findAll();
        //Fluentan način obrade neke kolekcije podataka iz baze ili nekog drugog izvora..
        //Martin Fowler -> Fluent Programming
        //Brian Goetz -> Spliterator
        //1. Collection -> izvor streama podataka
        //2. intermediate operacije nad svakim elementom u streamu
        //3. terminirajuću operaciju tog stream
//        customers
//                .stream() // izvor stream 1.
//                .filter(c -> c.getAge() >= 35) // intermediate operacija 2.
//                .filter(customer -> customer.getState().equals("FL"))//2.
//                .forEach(customer -> System.out.println(customer)); // 3. Terminirajuća operacija
//
//
//        Stream<Customer> customerStream = customers.stream();
//        customerStream = customerStream.filter(c -> c.getAge() <35);
//        customerStream = customerStream.filter(c -> c.getPhone()!=null);
//        Stream<String> customerNameStream = customerStream.map( t -> t.getFirstName());
//        customerNameStream.forEach(c -> System.out.println(c));

        Predicate<Customer> filterByAge = e -> e.getAge() >= 18;
        Predicate<Customer> noPhoneNumberFilter = cust -> cust.getPhone()==null;
        Function<Customer, String> customerExtractor = cust -> cust.getFirstName()+" "+cust.getLastName();
        Consumer<String> customerConsumer = cFullName -> System.out.println(cFullName);
        customers
                .stream()
                .filter(filterByAge)
                .filter(noPhoneNumberFilter)
                .map(customerExtractor)
                .forEach(customerConsumer);


        //želim print svih osoba starijih od 25 godina
//        printOlderThan(customers, 35);
//        printCustomers(customers, c -> c.getAge() >= 35, System.out::println);
//        System.out.println();
//        System.out.println("Mlađi od 35");
////        printYoungerThan(customers, 35);
//        printCustomers(customers, customer -> customer.getAge() < 35, c -> System.out.println(c));
//        System.out.println();
//        System.out.println("Ljudi između 35-40 godina");
////        printCustomerWithinRange(customers, 35, 40);
//        printCustomers(customers, customer -> customer.getAge() >= 35 && customer.getAge() <= 40, c -> System.out.println(c));
//        System.out.println();
//        System.out.println("Iz BA");
////        printCustomersInState(customers, "BA");
//        printCustomers(customers, c -> c.getState().equals("BA"), c -> System.out.println(c));
//
//        System.out.println();
//        System.out.println("iz BA i iz Gradačca");
//        printCustomers(customers, c -> c.getState().equals("BA") && c.getCity().equals("Gradačac"), c -> System.out.println(c));
    }

    static void printCustomers(List<Customer> customers, Predicate<Customer> tester, Consumer<Customer> consumer) {

        //ENHANCED FOR loop koristi tzv. Iterator<Customer>
        Iterator<Customer> iterator = customers.iterator();
        while (iterator.hasNext()) {
            Customer customer = iterator.next();
            if (tester.test(customer)) {
                consumer.accept(customer);
            }
        }
        //        for (Customer customer : customers) {
//            if (tester.test(customer)) {
//                consumer.accept(customer);
//            }
//        }
    }

    static void printOlderThan(List<Customer> customers, int age) {
        for (Customer customer : customers) {
            if (customer.getAge() < age) {
                continue;
            }
            System.out.println(customer);
        }
    }

    static void printYoungerThan(List<Customer> customers, int age) {
        for (Customer customer : customers) {
            if (customer.getAge() >= age) {
                continue;
            }
            System.out.println(customer);
        }
    }

    static void printCustomerWithinRange(List<Customer> customers, int start, int end) {
        for (Customer customer : customers) {
            if (customer.getAge() >= start && customer.getAge() <= end) {
                System.out.println(customer);
            }
        }
    }

    static void printCustomersInState(List<Customer> customers, String state) {
        for (Customer customer : customers) {
            if (customer.getState().equals(state)) {
                System.out.println(customer);
            }
        }
    }
}
