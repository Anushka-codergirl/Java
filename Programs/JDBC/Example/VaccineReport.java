// Importing required classes
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class VaccineReport {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        //Read user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter vaccine name to see data");
        String vacName = sc.nextLine();
        System.out.println("You choose " + vacName + " vaccine! Available vaccine centers are: ");

        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vaccineDB", "root", "anushkaraj@11");
            //Create a statement          

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from data where vacName ='" + vacName + "' ");

            while (rs.next()) {
                String vaccineCenterName = rs.getString("vacCtName");
                System.out.println(vaccineCenterName);
            }
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }
}
