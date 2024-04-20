/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 * James Vaughan 1/23/2023
 * This program will break change into correct coins
 * JDK 18.0.2.1
 */

import javax.swing.JOptionPane;
public class MoneyChanger {
    public static void main(String[] args) {
    String answer = JOptionPane.showInputDialog(null, "Enter amount of change");
    int cents = (int)(Double.parseDouble(answer) * 100); 
    int centsLeft;  //temporary variable for storing remaining cents 
    int dollars; 
    int quarters; 
    int dimes; 
    int nickels; 
    int pennies;
    
    dollars = cents/100;           
    centsLeft = cents %100;   
    quarters = centsLeft/25;     
    centsLeft = centsLeft %25;   
    dimes = centsLeft/10;          
    centsLeft = centsLeft %10;   
    nickels = centsLeft/5;        
    centsLeft = centsLeft %5;     
    pennies = centsLeft;
    
    JOptionPane.showMessageDialog(null,"Total Cents: " + cents 
                + "\nDollars: " + dollars  
                + "\nQuarters: " + quarters 
                + "\nDimes: " + dimes  
                + "\nNickels: " + nickels 
                + "\nPennies: " + pennies);
    }
    
}
