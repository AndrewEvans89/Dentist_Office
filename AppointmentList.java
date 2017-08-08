import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/********************
 * Andrew Evans
 * Mini Project #1
 * CS 1302 Section 4
 * AppointmentList Class
 ********************/
public class AppointmentList {

    public Appointment[] appointmentList = new Appointment[100];
    private int count = -1;

    public ArrayList<Appointment> getAppointmentList() {
        ArrayList<Appointment> ap = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            ap.add(appointmentList[i]);
        }
        System.out.println(ap.size());
        return ap;
    }

    public void addAppointment(Appointment appointment) {
        count += 1;
        appointmentList[this.count] = appointment;
    }

    public int getCount() {
        return count;
    }

    public void display(){
        for(int i = 0; i <= this.count; i++){
            System.out.println();
            //appointmentList[i].display();
        }
    }

    public void select(String a)
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

                String patientID = tt.nextToken();
                String apptDateTime=tt.nextToken();
                String dentistID = tt.nextToken();
                String procedureID = tt.nextToken();

                if(dentistID.equalsIgnoreCase(a))

                {

                    addAppointment(new Appointment(apptDateTime, patientID, dentistID, procedureID));

                }

            }

            b.close();

        }

        catch(Exception ep)

        {

            ep.printStackTrace();

        }
    }

    public String toString()
    {
        String a = "";
        for (int i = 0; i < count + 1; i++) {
            a += appointmentList[i].toString() + "\n\n";
        }
        return a;
    }

    public static void main(String[] args) {
        Appointment a1 = new Appointment("December 1, 2016 9am ", "A900 ", "D201 ", "P321 ");
        Appointment a2 = new Appointment("December 1, 2016 9am ", "A900 ", "D201 ", "P321 ");
        AppointmentList al = new AppointmentList();
        al.addAppointment(a1);
        al.addAppointment(a2);
        al.display();
    }

}
