package Part1;
import javax.swing.JOptionPane;

/**
 * Created by Kye_Cook on 22/08/2016
 */


public class CondoSales {
    public static void main(String[] args)
    {
        int userChoice = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter numbers for condos as follows : " +
                "\n1 - Park View\n\t2 - Golf Course View\n\t3 - Lake View"));

        if (userChoice == 1)
            JOptionPane.showMessageDialog(null, "Park - $150'000");
        else if (userChoice == 2)
            JOptionPane.showMessageDialog(null, "Golf Course - $170'000");
        else if (userChoice == 3)
            JOptionPane.showMessageDialog(null, "Lake - $210'000");
        else
            JOptionPane.showMessageDialog(null, "Invalid entry - $0");
    }
}
