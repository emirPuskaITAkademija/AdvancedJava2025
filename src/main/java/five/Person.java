package five;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.StringJoiner;

/**
 * POJO - Plain Old Java Object class
 *
 * <p>
 *     Java Bean -
 *     <li>1. implements serializable</li>
 *     <li>2. konstruktor no args </li>
 *     <li>3. get set</li>
 * </p>
 */

public class Person implements Serializable, Comparable<Person> {
    private String name;
    private String surname;
    private LocalDate birthDate;
    private Gender gender;

    public Person() {
    }

    public Person(String name, String surname, LocalDate birthDate, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;
        return Objects.equals(name, person.name) && Objects.equals(surname, person.surname) && Objects.equals(birthDate, person.birthDate) && gender == person.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, birthDate, gender);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Person.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("surname='" + surname + "'")
                .add("birthDate=" + birthDate)
                .add("gender=" + gender)
                .toString();
    }

    public static List<Person> socialNetwork(){
        List<Person> persons = new ArrayList<>();
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
        persons.add(new Person("Danko", "Divković", LocalDate.of(2006, 1, 1), Gender.MALE));
        return persons;
    }

    //Person p1 = new Person();
    //p1.compareTo(p2)
    @Override
    public int compareTo(Person anotherPerson) {
        String anotherPersonName = anotherPerson.getSurname();
        int surnameResult = this.surname.compareTo(anotherPersonName);
        return surnameResult;
    }
}
