import javax.swing.JOptionPane;

public class A3 {
    public static void main(String[] args) {
        
       int count = 1 ;
       double sum = 0;
        while (count <= 2) 
        {
            try {       
                sum +=Double.parseDouble(JOptionPane.showInputDialog(String.format("Enter the number of Element %d", count))) ;
                ++count;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        JOptionPane.showMessageDialog(null, sum, "Result ", JOptionPane.INFORMATION_MESSAGE);
    }
}
