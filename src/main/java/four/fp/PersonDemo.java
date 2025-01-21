package four.fp;

import java.time.LocalDate;

public class PersonDemo {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Faruk");
        person.setSurname("Hodzic");
        person.setBirthDate(LocalDate.now());
        person.setAge(23);

        //Martin Fowler
        Person person1 = new Person()
                .setName("Tarik")
                .setSurname("Bulić")
                .setBirthDate(LocalDate.now());
    }
}
