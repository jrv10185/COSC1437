package chapter11assignment;

/**
 *James Vaughan     
 * JDK 18.0.2.1
 * 04/03/23
 */
import javax.swing.JOptionPane;
public class Chapter11Assignment {

    public static void main(String[] args) {
       String input = JOptionPane.showInputDialog(null,"Enter the numerator");
       double numerator = Double.parseDouble(input); 
       input = JOptionPane.showInputDialog(null,"Enter the denominator");
       double denominator = Double.parseDouble(input); 
       try{
         Answer x = new Answer(numerator, denominator);
         System.out.println("The answer is "+ x.getAnswer());
       }
       catch(Exception e){
         
       }
    }
    
}
