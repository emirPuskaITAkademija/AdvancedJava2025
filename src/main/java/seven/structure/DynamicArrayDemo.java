package seven.structure;

import five.Gender;
import five.Person;

import java.time.LocalDate;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray<String> stringArray = new DynamicArray<>();
        stringArray.add("A");
        stringArray.add("B");
        stringArray.add("Cedevita");
        stringArray.add("D-vitamin");
        stringArray.add("Elon Musk");
        stringArray.add("Fred");
        stringArray.add("George");
        stringArray.add("Harry");
        stringArray.add("Jack");
        stringArray.add("Kate");
        stringArray.add("Lily");
        stringArray.add("Mary");
        for(String element : stringArray) {
            System.out.println(element);
        }


        DynamicArray<Person> persons = new DynamicArray<>();
        persons.add(new Person("Faruk", "Hodzic", LocalDate.of(1990, 1, 1), Gender.MALE));
        persons.add(new Person("Andrej", "Grumić", LocalDate.of(1991, 1, 1), Gender.MALE));
        persons.add(new Person("Angelina", "Jolie", LocalDate.of(1992, 2, 1), Gender.FEMALE));
        persons.add(new Person("Tarik", "Fejzić" , LocalDate.of(1993, 3, 1), Gender.MALE));
        persons.add(new Person("Azur", "Bulić", LocalDate.of(1994, 4, 1), Gender.MALE));
        persons.add(new Person("Tarik", "Bulić", LocalDate.of(2000, 4, 1), Gender.MALE));
        persons.add(new Person("Jovan", "Carević", LocalDate.of(2000, 5, 1), Gender.MALE));
        persons.add(new Person("Konstantin", "Porfirogenit", LocalDate.of(300, 6, 1), Gender.MALE));
        persons.add(new Person("Dženita", "Kovačević", LocalDate.of(300, 7, 1), Gender.MALE));
        persons.add(new Person("Srećko", "Stipović", LocalDate.of(2003, 8, 1), Gender.MALE));
        persons.add(new Person("Damir", "Peštalić", LocalDate.of(2005, 12, 1), Gender.MALE));
        Person personDamirDivkovic = new Person("Danko", "Divković", LocalDate.of(2006, 1, 1), Gender.MALE);
        persons.add(personDamirDivkovic);
        persons.remove(3);
        persons.remove(personDamirDivkovic);
        for(Person person : persons) {
            System.out.println(person);
        }
    }
}
