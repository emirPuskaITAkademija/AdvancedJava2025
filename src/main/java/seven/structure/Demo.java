package seven.structure;

import five.Gender;
import five.Person;

import java.time.LocalDate;
import java.util.Iterator;
//REST web servis
public class Demo {
    public static void main(String[] args) {
        DynamicArray<Person> dynamicArrayOfPersons = new DynamicArray<>();
        dynamicArrayOfPersons.add(new Person("Faruk", "Hodzic", LocalDate.of(1990, 1, 1), Gender.MALE));
        dynamicArrayOfPersons.add(new Person("Andrej", "Grumić", LocalDate.of(1991, 1, 1), Gender.MALE));
        dynamicArrayOfPersons.add(new Person("Angelina", "Jolie", LocalDate.of(1992, 2, 1), Gender.FEMALE));
        dynamicArrayOfPersons.add(new Person("Tarik", "Fejzić" , LocalDate.of(1993, 3, 1), Gender.MALE));
        dynamicArrayOfPersons.add(new Person("Azur", "Bulić", LocalDate.of(1994, 4, 1), Gender.MALE));
        dynamicArrayOfPersons.add(new Person("Tarik", "Bulić", LocalDate.of(2000, 4, 1), Gender.MALE));
        dynamicArrayOfPersons.add(new Person("Jovan", "Carević", LocalDate.of(2000, 5, 1), Gender.MALE));
        dynamicArrayOfPersons.add(new Person("Konstantin", "Porfirogenit", LocalDate.of(300, 6, 1), Gender.MALE));
        dynamicArrayOfPersons.add(new Person("Dženita", "Kovačević", LocalDate.of(300, 7, 1), Gender.MALE));
        dynamicArrayOfPersons.add(new Person("Srećko", "Stipović", LocalDate.of(2003, 8, 1), Gender.MALE));
        dynamicArrayOfPersons.add(new Person("Damir", "Peštalić", LocalDate.of(2005, 12, 1), Gender.MALE));
        Person personDamirDivkovic = new Person("Danko", "Divković", LocalDate.of(2006, 1, 1), Gender.MALE);
        dynamicArrayOfPersons.add(personDamirDivkovic);
        dynamicArrayOfPersons.remove(3);
        dynamicArrayOfPersons.remove(personDamirDivkovic);

        //Ne mogu koristiti kao tip DynamicArrayIterator jer je private unutar klase
        //Međutim, imam interfejs ka tom DynamicArrayIterator
        //API Application Programming Interface
        Iterator<Person> personIterator = dynamicArrayOfPersons.iterator();
        while (personIterator.hasNext()) {
            Person person = personIterator.next();
            System.out.println(person);
        }

    }
}
