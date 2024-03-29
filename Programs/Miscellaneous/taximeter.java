import java.io.*;

class TaxiMeter{
    int taxiNo;
    String name;
    int km;
    double bill;
    public TaxiMeter(){
        taxiNo = 0;
        name = "";
        km = 0;
        bill = 0.0;
    }
    public void input()throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Taxi Number: ");
        taxiNo = Integer.parseInt(br.readLine());
        System.out.print("Name: ");
        name = br.readLine();
        System.out.print("Number of km: ");
        km = Integer.parseInt(br.readLine());
    }
    public void calculate(){
        if(km <= 1)
            bill = 25 * km;
        else if(km > 1 && km <= 6)
            bill = 10 * km;
        else if(km > 6 && km <= 12)
            bill = 15 * km;
        else if(km > 12 && km <= 18)
            bill = 20 * km;
        else
            bill = 25 * km;
    }
    public void display(){
        System.out.println("TaxiNo.\tName\tKilometers Traveled\tBill Amount");
        System.out.println(taxiNo + "\t" + name + "\t" + km + "\t" + bill);
    }
    public static void main(String args[])throws IOException{
        TaxiMeter obj = new TaxiMeter();
        obj.input();
        obj.calculate();
        obj.display();
    }
}
