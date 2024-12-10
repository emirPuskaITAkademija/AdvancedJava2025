package one.generic;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

public class Person {
    private String name;
    private String surname;
    private LocalDate birthDate;
    private Gender gender;

    public Person() {
        this("", "", LocalDate.now(), Gender.UNKNOWN);
    }

    public Person(String name, String surname, LocalDate birthDate, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
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

    public int getAge() {
        LocalDate now = LocalDate.now();
        Period period = birthDate.until(now);
        return period.getYears();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthDate=" + birthDate +
                ", gender=" + gender +
                " i ima= " + getAge() + " godina" +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        //Objasniti getClass() -> Refleksija
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) &&
                Objects.equals(surname, person.surname) &&
                Objects.equals(birthDate, person.birthDate) &&
                gender == person.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, birthDate, gender);
    }
}
