package seven;

import java.util.ArrayList;
import java.util.List;

/**
 * <h1>Klasa može imati:</h1>
 * <ul>
 *
 *
 * <li>1. polja
 * <li>1.1 instancna - name koji ne može postojati sve
 * dok se po šablonu klase Person ne kreira instance i
 * dok joj se ne dodijeli vrijednost njenog polja kojeg zovemo name,</li>
 * <li>1.2 static - ona su neovisna od instance. globalno vezana za klasu</li>
 * </li>
 * <li>
 *     2. konstruktor - on je tu da se definira način na koji se kreira instanca
 * </li>
 * <li>3. funkcije ili metode
 *
 * <li>3.1 instancne - setName(String name)  za poziv ove funkcije preduvjet je postojanje instance</li>
 * <li>3.2 static - nevezane za instancu</li>
 * </li>
 *
 * <li>
 *     4. INNER KLASE
 *     <li>4.1 INSTANCNE</li>
 *     <li>4.2 STATIC</li>
 * </li>
 *
 *
 * <b>OUTER i INNER</b>
 * <m>OUTER
 *    public, paketno privatno(bez keyword),
 *
 * </m>
 * <m>
 *     INNER
 *     public, paketno, protected i private
 * </m>
 * </ul>
 */
 public class Person {
    static int counter = 0;

    private String name;


    public Person(String name) {
        counter++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void incrementCounter() {
        counter++;
    }

    // instancna INNER klasa
    class Passport{
        private String passportId;

        public void setPassportId(String passportId) {
            this.passportId = passportId;
        }

        public String getPassportId() {
            return passportId;
        }
    }

    //statičke INNER klase
    static class PersonRegistry{
        private List<Person> personList = new ArrayList<>();

        public PersonRegistry() {}

        public void addPersonToRegistry(Person person) {
            personList.add(person);
        }
    }
}
