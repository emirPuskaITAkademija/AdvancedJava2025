package seven;

public class Demo {
    public static void main(String[] args) {
        Person person = new Person("Faruk");
        //setName je kakva funkcija ? instancna
        // sta to znači ?
        // Ne možemo pozvati ovu funkciju ako ne postoji person
        // person.setName(..)
        person.setName("Fare");
        //Passport je kakva INNER klasa ? instancna inner klasa
        // šta to znači ?
        // Ne možemo kreirati objekat ili instancu po šablonu klase Passport ako prethodno
        // ne postoji osoba za koju bi taj pasoš vezali
        // person.new Passport();
        Person.Passport personPassport = person.new Passport();
        personPassport.setPassportId("dsmkmdksmd");


        //statička INNER klasa i za njeno kreiranje ne treba da postoji person instanca
        Person.PersonRegistry registry  = new Person.PersonRegistry();
        registry.addPersonToRegistry(person);
    }
}
