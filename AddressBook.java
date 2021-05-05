import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class AddressList {
    static Scanner scanner = new Scanner(System.in);
    static List<Data> enlist = new ArrayList<Data>();

    public static void main(String[] args) {
        int option;
        AddressList addlist = new AddressList();
        System.out.println("Address Book Menu");
        do {
            System.out.println("1. add contacts");
            System.out.println("2. delete");
            System.out.println("3. edit");
            System.out.println("0. exit the system");
            System.out.println("Please choose:");
            option = scanner.nextInt();
            switch (option) {
                case 1:
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
                    Data data = new Data(firstName, lastName, address, city, state, zip, phoneNumber, email);
                    enlist.add(data);
                    System.out.println(enlist);
                    break;
                case 2:
                    System.out.println("Please enter you want to delete the contact:");
                    int num = scanner.nextInt();
                    if (addlist.delete(num)) {
                        System.out.println("deleted successfully!");
                    } else {
                        System.out.println("Delete failed!");
                    }
                    break;
                case 3:
                  break;
            }
        } while (option != 0);
        System.out.println("Choose proper option!");
    }

    public boolean delete(int num) {
        if (num > enlist.size())
            return false;
        else
            enlist.remove(num);
        return true;
    }
    static class Data {
        public String firstName;
        public String lastName;
        public String address;
        public String city;
        public String state;
        public String zip;
        public String phoneNumber;
        public String email;

        public Data() {
        }

        public Data(String firstName, String lastName, String address, String city, String state, String zip, String phoneNumber, String email) {
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

        @Override
        public String toString() {
            return "Data{" +
            "firstName='" + firstName + '\'' +
            ", lastName='" + lastName + '\'' +
            ", address='" + address + '\'' +
            ", city='" + city + '\'' +
            ", state='" + state + '\'' +
            ", zip='" + zip + '\'' +
            ", phoneNumber='" + phoneNumber + '\'' +
            ", email='" + email + '\'' +
            '}';
        }
    }
}

