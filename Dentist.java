import java.io.*;
import java.util.StringTokenizer;

/********************
 * Andrew Evans
 * Mini Project #1
 * CS 1302 Section 4
 * Dentist Class
 ********************/
public class Dentist extends Person {
    //===========================Properties============================
    private String dentId;
    private String password;
    private int office;
    private AppointmentList ap;

    //===========================Constructors==========================
    public Dentist(){
        super();
        dentId="";
        password="";
        office=0;
        ap = new AppointmentList();

    }

    public Dentist(String did, String pw, String fn, String ln, int o, String a, String em, AppointmentList app){
        super(fn, ln, a, em);
        dentId=did;
        password=pw;
        office=o;
        ap = app;
    }

    //================================Behaviors================================
    public void setDentId(String did) {dentId=did;}
    public String getDentId() {return dentId;}

    public void setPassword(String pw) {password=pw;}
    public String getPassword() {return password;}

    public void setOffice(int o) {office=o;}
    public int getOffice() {return office;}

    public AppointmentList getAp() { return ap;}

    public void insert(String DentId, String Password, int Office )

    {

        setDentId(DentId);

        setPassword(Password);

        setOffice(Office);

        //setAppointmentList(AppointmentList);

        try

        {

            FileWriter ff=new FileWriter("Dentists.txt",true);

            BufferedWriter b=new BufferedWriter(ff);

            PrintWriter pp=new PrintWriter(b);

            pp.println(DentId+":"+Password+":"+Office);

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

            FileReader ff=new FileReader("Dentists.txt");

            BufferedReader b=new BufferedReader(ff);

            String ll;

            StringTokenizer tt;

            while((ll=b.readLine())!=null)

            {

                tt=new StringTokenizer(ll,":");

                String did=tt.nextToken();

                if(did.equalsIgnoreCase(pCode))

                {

                    dentId=did;

                    password=tt.nextToken();

                    String fname=tt.nextToken();
                    setFirstName(fname);

                    String lname=tt.nextToken();
                    setLastName(lname);

                    String email=tt.nextToken();
                    setEmail(email);

                    office=Integer.valueOf(tt.nextToken());

                    ap.select(dentId);

                    break;

                }

            }

            b.close();

        }

        catch(Exception ep)

        {

            ep.printStackTrace();

        }

    }

    public String toString() {

        return  "Dentist Id:\t" + getDentId() +

                "\nPassword:\t" + getPassword() +

                "\nFirst Name:\t" + getFirstName() +

                "\nLast Name:\t" + getLastName() +

                "\nE-mail Address:\t" + getEmail() +

                "\nOffice:\t" + getOffice() +

                "\n" + ap.toString();

    }
    //==============================Main Method======================================
    public static void main (String args[]){
        Dentist d1=new Dentist();
        d1.select("D202");
        System.out.println(d1);
    }//End Main


}//End Class
