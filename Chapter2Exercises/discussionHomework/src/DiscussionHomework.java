import javax.swing.JOptionPane;

public class DiscussionHomework {
    public static void main(String[] args) {
       String response = JOptionPane.showInputDialog(null, "Enter your weight");
       double weight = Double.parseDouble(response);
       double marsWeight = weightOnMars(weight);
       JOptionPane.showMessageDialog(null, "Your weight: "+weight+"\nYour weight oon Mars: "+marsWeight);
    }
    public static double weightOnMars(double w){

    return w * 0.38;

    }
    
}
