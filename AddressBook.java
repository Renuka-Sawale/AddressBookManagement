import java.util.ArrayList;
import java.util.Scanner;

class PersonDetails {
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String phoneNumber;
    private String email;

    public PersonDetails() {

    }
    public PersonDetails(String firstName, String lastName, String address, String city, String state, String zip,
                         String phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
        this.email = email;

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
    public String getZip() {
        return zip;
    }
    public void setZip(String zip) {
        this.zip = zip;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String toString() {
        return "PersonDetails [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", city="
                + city + ", state=" + state + ", zip=" + zip + ", phoneNumber=" + phoneNumber + ", email=" + email
                + "]";
    }
}
class AddressDetails {
    ArrayList<PersonDetails> List = new ArrayList<>();
    public void addDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first name");
        String firstName = sc.nextLine();
        System.out.println("Enter the last name");
        String lastName = sc.nextLine();
        System.out.println("Enter the address");
        String address = sc.nextLine();
        System.out.println("Enter the city");
        String city = sc.nextLine();
        System.out.println("Enter the state");
        String state = sc.nextLine();
        System.out.println("Enter the zip");
        String zip = sc.nextLine();
        System.out.println("Enter the phone number");
        String phoneNumber = sc.nextLine();
        System.out.println("Enter the email");
        String email = sc.nextLine();
        PersonDetails pd = new PersonDetails(firstName, lastName, address, city, state, zip, phoneNumber, email);
        List.add(pd);
        System.out.println(List);
    }
}

public class AddressBook {
    public static void main(String[] args) {
        AddressDetails ad = new AddressDetails();
        ad.addDetails();
    }
}

