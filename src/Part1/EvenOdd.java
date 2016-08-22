package Part1;
import javax.swing.JOptionPane;

/**
 * Checks to see if user number is odd or even
 */
public class EvenOdd {
    public static void main(String[] args)
    {
        int userInteger = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter an integer number"));

        if (userInteger % 2 == 0)
            JOptionPane.showMessageDialog(null, "Number is even");
        else
            JOptionPane.showMessageDialog(null, "Number is odd");
    }
}
