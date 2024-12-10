package one.generic;

import java.util.Collection;

public class PersonDemo {
    public static void main(String[] args) {
        PersonReader personReader = new PersonReader();
        Collection<Person> personCollection = personReader.readPersons();
        for (Person person : personCollection) {
            System.out.println(person);
        }
    }
}
