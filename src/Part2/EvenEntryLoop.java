package Part2;
import javax.swing.JOptionPane;

/**
 * Created by Kye_Cook on 22/08/2016.
 */
public class EvenEntryLoop {
    public static void main(String[] args)
    {
        int userInteger = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter integer"));

        while(userInteger != 999)
            if(userInteger % 2 == 0) {
                JOptionPane.showMessageDialog(null, "Good Job!");
                userInteger = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter integer"));
            }
            else {
                JOptionPane.showMessageDialog(null, "Error! Try again");
                userInteger = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter integer"));
            }
        JOptionPane.showMessageDialog(null, "Sentinel Value invoked, loop ended");
    }
}
