/********************
 * Andrew Evans
 * Mini Project #1
 * CS 1302 Section 4
 * Person Class
 ********************/
public class Person {
    //========================Properties=======================
    private String firstName;
    private String lastName;
    private String address;
    private String email;

    //========================Constructors=====================
    public Person() {
        firstName = "";
        lastName = "";
        address = "";
        email = "";
    }

    public Person(String fn, String ln, String a, String em) {
        firstName = fn;
        lastName = ln;
        address = a;
        email = em;
    }

    //=======================Behaviors=========================
    public void setFirstName(String fn) {
        firstName = fn;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String ln) {
        lastName = ln;
    }

    public String getLastName() {
        return lastName;
    }

    public void setAddress(String a) {
        address = a;
    }

    public String getAddress() {
        return address;
    }


    public void setEmail(String em) {
        email = em;
    }

    public String getEmail() {
        return email;
    }

    public void display() {
        System.out.println("First Name: " + getFirstName());
        System.out.println("Last Name: " + getLastName());
        System.out.println("Address: " + getAddress());
        System.out.println("E-mail: " + getEmail());
        System.out.println(); // Creates Space
    }//End Display

    public static void main(String args[]) {

        //Object 1
        Person p1;
        p1 = new Person();

        p1.setFirstName("Andrew");
        p1.setLastName("Evans");
        p1.setAddress("123 Main Street");
        p1.setEmail("Evans.Andrew03@Gmail.com");

        p1.display();

        //Object 2
        Person p2;
        p2 = new Person("Andrew ", "Evans ", "123 Main Street ", "Evans.Andrew03@Gmail.com");

        p2.display();
    }//End Main
}//End Class

