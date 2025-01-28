package five;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * 4 ključna funkcionalna interfejsa:
 * <li>1. Supplier<T>
 * T get();
 * </li>
 * <lI>
 * 2. Consumer<T>
 * void accept(T element);
 * <p>
 * void accept(Person person);
 * </lI>
 * <li>
 * 3. Predicate<T>
 * boolean test(T element);
 * </li>
 * <li>
 * 4. Fuction<T, R>
 * <p>
 * R apply(T element);
 * </li>
 */
public class MethodReferencingDemo {
    public static void main(String[] args) {
        //new -> pomoću kojeg kreiram složeni objektni tip
        List<Person> personList = Person.socialNetwork();
        //1. kako streamati kroz kolekciju i ispisati svaki element u listi u konzoli
        // -> Šta ovdje dole LAMBDA mora uraditi da kreira personCOnsumer
        Consumer<Person> personConsumer = (Person person) -> System.out.println(person);
        // Kada LAMBDA ne radi ništa drugo nego poziva samo metodu println ne treba ti ni LAMBDA
        // REFERENCIRAJ SE SAMO NA TU METODU  ->     ::
        //Referenca na instacnu metodu
        Consumer<Person> personConsumer2 = System.out::println;
//        personConsumer.accept(personList.get(0));
        //Brian Goetz
        //1. izvor stream
        //2. međuoperacije
        //3. terminirajuće operacije: forEach terminiraju stream

//        personList
//                .stream()//1. stream() -> izvor Stream<Person>
//                .sorted()
////                .sorted((o1, o2) -> personComparator.compare(o1, o2))//2. međuoperaciju sorted() -> nad Stream<Person> se poziva ali vrati modifikovan Stream<Person>
//                .forEach(personConsumer);//3. terminira sortirani Stream<Person>

        //1. STATIC METHOD
        personList.forEach(MethodReferencingDemo::printPerson);
        //2. Referenca na INSTANCE/OBJECT METHOD
        PersonSorter personSorter = new PersonSorter();
        Comparator<Person> comparator = (p1, p2) -> personSorter.uporedi(p1, p2);
//        personList.sort((p1, p2) -> personSorter.uporedi(p1, p2));
        Comparator<Person> comparator2 = personSorter::uporedi;
        personList.sort(personSorter::uporedi);



        // 3. REFERENCA na INSTANCNU/OBJEKNTNU metodu ali na STATIČKI način ImeKlase::imeObjektneMetode
        //1. streamati kroz Person
        //2. transformisati se u stream njihovih imena
        //3. sortirati njihova imena u streamu i modifikovati stream na taj način
        //4. ispisati ta imena
        personList
                .stream() // Stream<Person>
                .map(Person::getName) // Stream<String>
                .sorted()
                .forEach(System.out::println);

        //4. TIP method referencira NA KONSTRUKTOR
        transferUTargetKolekciju(personList, HashSet::new);

    }


    //1. UNBOUNDED: T
    //2. BOUNDED: S extends Collection<T>, D extends Collection<T>
    static <T, S extends Collection<T>, D extends Collection<T>> D transferUTargetKolekciju(S srcCollection, Supplier<D> dstCollectionSupplier) {
        D destCollection = dstCollectionSupplier.get();
        for(T element: srcCollection){
            destCollection.add(element);
        }
        return destCollection;
    }



    // Function<T, R>     R apply(T taken);
    static String transform(Person person) {
        String name = person.getName();
        return name;
    }

    public static void printPerson(Person person) {
        System.out.println(person);
    }


    static class PersonSorter {
        public int uporedi(Person person1, Person person2) {
            String o1Name = person1.getName();
            String o2Name = person2.getName();
            int nameResult = o1Name.compareTo(o2Name);
            return nameResult;
        }
    }

    // Comparable<Person>  -> int compareTo(Person p); -> -1 0 1
    // Comparator<Person> int compare(Person p1, Person p2)
    //Ugniježdena klasa 4-ta stvar INNER
    private static class PersonComparator implements Comparator<Person> {

        @Override
        public int compare(Person person1, Person person2) {
            String o1Name = person1.getName();
            String o2Name = person2.getName();
            int nameResult = o1Name.compareTo(o2Name);
            return nameResult;
        }
    }
}
