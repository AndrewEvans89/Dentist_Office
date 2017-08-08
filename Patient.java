import java.io.*;
import java.util.StringTokenizer;
import java.util.ArrayList;

/********************
 * Andrew Evans
 * Mini Project #1
 * CS 1302 Section 4
 * Patient Class
 ********************/
public class Patient extends Person {
    //=========================Properties========================
    private String patId;
    private String password;
    private String insCo;
    private Appointment a1=new Appointment();

    //=========================Constructors=======================
    public Patient(){
        super(); //Sets 5 properties from Person class to zero
        patId="";
        password="";
        insCo="";

    }

    public Patient(String id, String pw, String fn, String ln, String a, String em, String ic){
        super(fn, ln, a, em);
        patId=id;
        password=pw;
        insCo=ic;


    }

    //================================Behaviors=========================
    public void setPatId(String id) {patId=id;}
    public String getPatId() {return patId;}

    public void setPassword(String pw) {password=pw;}
    public String getPassword() {return password;}

    public void setInsCo(String ic) {insCo=ic;}
    public String getInsCo() {return insCo;}

    public Appointment getAp() { return a1;}


    public void insert(String PatId, String Password, String InsCo, String Appointment)

    {

        setPatId(PatId);

        setPassword(Password);

        setInsCo(InsCo);



        try

        {

            FileWriter ff=new FileWriter("Patients.txt",true);

            BufferedWriter b=new BufferedWriter(ff);

            PrintWriter pp=new PrintWriter(b);

            pp.println(PatId+":"+Password+":"+InsCo+":"+Appointment);

            pp.close();

        }

        catch(Exception ep)

        {

            ep.printStackTrace();

        }

    }

    public void select(String pCode)

    {



        try

        {

            FileReader ff=new FileReader("Patients.txt");

            BufferedReader b=new BufferedReader(ff);

            String ll;

            StringTokenizer tt;

            while((ll=b.readLine())!=null)

            {

                tt=new StringTokenizer(ll,":");

                String PatId=tt.nextToken();

                if(PatId.equalsIgnoreCase(pCode))

                {

                    patId=PatId;

                    password=tt.nextToken();

                    String fname=tt.nextToken();
                    setFirstName(fname);

                    String lname=tt.nextToken();
                    setLastName(lname);

                    String aa = tt.nextToken();
                    setAddress(aa);

                    String email=tt.nextToken();
                    setEmail(email);

                    insCo=tt.nextToken();



                    break;

                }

            }

            b.close();

            a1.select(patId);



        }

        catch(Exception ep)

        {

            ep.printStackTrace();

        }

    }

    public String toString(){

        return "Patient Id:\t" + getPatId() +

                "\nPassword:\t" + getPassword() +

                "\nFirst Name:\t" + getFirstName() +

                "\nLast Name:\t" + getLastName() +

                "\nAddress:\t" + getAddress() +

                "\nE-mail Address:\t" + getEmail() +

                "\nInsurance Company:\t" + getInsCo() +

                "\n\nAppointment Info:\n"+ a1.toString();



    }

    public static void main (String args[]){
        Patient p1=new Patient( );
        p1.select("A901");
        System.out.println(p1);
    }//End Main

}// End Class
