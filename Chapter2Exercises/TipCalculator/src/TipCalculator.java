/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**Computing Tip Amount
 * written by James Vaughan on 1/23/23
 * JDK Version 18.0.2.1
 */

import java.text.NumberFormat;
import javax.swing.JOptionPane;
public class TipCalculator {
    public static void main(String[] args) {
       NumberFormat dollars = NumberFormat.getCurrencyInstance();
       String input = JOptionPane.showInputDialog(null,"Enter the total bill");
       double bill = Double.parseDouble(input);
       input = JOptionPane.showInputDialog(null, "Enter the tip perentage as a decimal"
                                            + " (Example: 10% would be 0.1)");
       double percentage = Double.parseDouble(input);
       double tipAmount = bill*percentage;
       JOptionPane.showMessageDialog(null,"Bill amount: " + dollars.format(bill)
                                    +"\nTip Percentage: " + percentage
                                    +"\nTip: "+ dollars.format(tipAmount));
       
    }
    
}
