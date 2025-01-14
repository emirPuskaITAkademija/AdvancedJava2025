package three.customer;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;
import java.util.StringJoiner;

//Java Bean
// 1. konstruktor bez parametara
// 2. Serializable
// 3. private polja -> getter/setters
// toString, hashCode i equals
public class Customer {

    private int customerId;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private String phone;
    private String address;
    private String city;
    private String state;
    private int points;


    public Customer() {
    }

    public Customer(int customerId, String firstName, String lastName, LocalDate birthDate, String phone, String address, String city, String state, int points) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.phone = phone;
        this.address = address;
        this.city = city;
        this.state = state;
        this.points = points;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public int getAge() {
        LocalDate now = LocalDate.now();
        Period period = birthDate.until(now);
        return period.getYears();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return new StringJoiner("  ", "[", "]")
                .add("" + customerId)
                .add(firstName)
                .add(lastName)
                .add(birthDate + "")
                .add(phone)
                .add(address)
                .add(city)
                .add(state)
                .add(points+"")
                .toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return customerId == customer.customerId && points == customer.points && Objects.equals(firstName, customer.firstName) && Objects.equals(lastName, customer.lastName) && Objects.equals(birthDate, customer.birthDate) && Objects.equals(phone, customer.phone) && Objects.equals(address, customer.address) && Objects.equals(city, customer.city) && Objects.equals(state, customer.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerId, firstName, lastName, birthDate, phone, address, city, state, points);
    }
}
