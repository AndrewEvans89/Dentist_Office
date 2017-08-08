/********************
 * Andrew Evans
 * Mini Project #1
 * CS 1302 Section 4
 * Procedure Class
 ********************/
import java.util.*;

import java.io.*;

import java.lang.*;

public class Procedure

{

    /** Properties **/

    private String procCode;

    private String procName;

    private String procDesc;

    private double cost;

    /** Constructors **/

    public Procedure()

    {

        setProcCode("");

        setProcName("");

        setProcDesc("");

        setCost(0.0);

    }

    public Procedure(String pCode, String pName, String pDesc, double c){

        setProcCode(pCode);

        setProcName(pName);

        setProcDesc(pDesc);

        setCost(c);

    }

    /** Behaviors **/

    public void setProcCode(String pc){

        procCode = pc;

    }

    public String getProcCode(){

        return procCode;

    }

    public void setProcName(String pn){

        procName = pn;

    }

    public String getProcName(){

        return procName;

    }

    public void setProcDesc(String pd){

        procDesc = pd;

    }

    public String getProcDesc(){

        return procDesc;

    }

    public void setCost(double c){

        cost = c;

    }

    public double getCost(){

        return cost;

    }

    public void insert(String pCode, String pName,String pDesc, double c)

    {

        setProcCode(pCode);

        setProcName(pName);

        setProcDesc(pDesc);

        setCost(c);

        try

        {

            FileWriter ff=new FileWriter("Procedures.txt",true);

            BufferedWriter b=new BufferedWriter(ff);

            PrintWriter pp=new PrintWriter(b);

            pp.println(pCode+":"+pName+":"+pDesc+":"+c);

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

            FileReader ff=new FileReader("Procedures.txt");

            BufferedReader b=new BufferedReader(ff);

            String ll;

            StringTokenizer tt;

            while((ll=b.readLine())!=null)

            {

                tt=new StringTokenizer(ll,":");

                String proCode=tt.nextToken();

                if(proCode.equalsIgnoreCase(pCode))

                {

                    procCode=proCode;

                    procName=tt.nextToken();

                    procDesc=tt.nextToken();

                    cost = Double.parseDouble(tt.nextToken());

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

        return "Procedure Code:\t" + getProcCode() +

                "\nProcedure Name:\t" + getProcName() +

                "\nProcedure Description:\t" + getProcDesc() +

                "\nProcedure Cost:\t$" + getCost();

    }

    public static void main(String[] args)

    {
        Procedure p1=new Procedure();
        p1.select("P114");
        System.out.println(p1);
    }

}
