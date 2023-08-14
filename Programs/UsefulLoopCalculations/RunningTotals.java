import javax.print.attribute.standard.JobPriority;
import javax.swing.*;
import java.text.DecimalFormat;

public class RunningTotals
{
    public static void main(String[] args)
    {
        int days;
        double sales;
        double totalSales = 0.0; //running total

        DecimalFormat dollar = new DecimalFormat("#,##0.000");

        String input = JOptionPane.showInputDialog("For how many days do you have sales" + "figures?" );

        days = Integer.parseInt(input);

        for(int count = 1; count <= days; count++)
        {
            input = JOptionPane.showInputDialog("Enter the sales for day " + count);

            sales = Double.parseDouble(input);

            totalSales += sales;
        }

        JOptionPane.showMessageDialog(null,"The total sales are : $" +dollar.format(totalSales));

        System.exit(0);
    }


}
