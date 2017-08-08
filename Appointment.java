import java.io.*;
import java.util.StringTokenizer;

/********************
 * Andrew Evans
 * Mini Project #1
 * CS 1302 Section 4
 * Appointment Class
 ********************/
public class Appointment {
    //===========================Properties==========================
    private String apptDateTime;
    private String patId;
    private String dentId;
    private String procCode;

    //============================Constructors=======================
    public Appointment() {
        apptDateTime = "";
        patId = "";
        dentId = "";
        procCode = "";
    }
    public Appointment(String adt, String pid, String did, String pc){
        apptDateTime=adt;
        patId=pid;
        dentId=did;
        procCode=pc;
    }

    //===========================Behaviors===========================
    public void setApptDateTime(String adt) {apptDateTime=adt;}
    public String getApptDateTime() {return apptDateTime;}

    public void setPatId(String pid) {patId=pid;}
    public String getPatId() {return patId;}

    public void setDentId(String did) {dentId=did;}
    public String getDentId() {return dentId;}

    public void setProcCode(String pc) {procCode=pc;}
    public String getProcCode() {return procCode;}

    public void insert(String PatId, int Password, String InsCo, String Appointment)

    {

        setApptDateTime(apptDateTime);

        setPatId(PatId);

        setDentId(dentId);

        setProcCode(procCode);

        try

        {

            FileWriter ff=new FileWriter("Appointments.txt",true);

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

            FileReader ff=new FileReader("Appointments.txt");

            BufferedReader b=new BufferedReader(ff);

            String ll;

            StringTokenizer tt;

            while((ll=b.readLine())!=null)

            {

                tt=new StringTokenizer(ll,":");

                patId=tt.nextToken();

                if(patId.equalsIgnoreCase(pCode))

                {

                    this.apptDateTime=apptDateTime;
                    
                    apptDateTime=tt.nextToken();
                    
                    dentId=tt.nextToken();
                    
                    procCode=tt.nextToken();

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

    public String toString(){

        return getApptDateTime();
    }

    //=====================================Main Method=====================
    public static void main (String args[]){

        Appointment a1=new Appointment();
        a1.select("A900");
        System.out.println(a1);
    }//End Main
}//End Class
