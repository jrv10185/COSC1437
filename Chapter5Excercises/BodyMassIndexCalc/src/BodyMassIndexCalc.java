/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 * James Vaughan
 * 02/05/2023
 * JDK 18.0.2.1
 * This program will calculate BMI with a functional method
 */
import javax.swing.JOptionPane;
import java.text.DecimalFormat;
public class BodyMassIndexCalc {
    public static void main(String[] args) {
        String response;
        response = JOptionPane.showInputDialog(null, "Enter your height in inches");
        double height = Double.parseDouble(response);
        response = JOptionPane.showInputDialog(null,"Enter your weight in pounds");
        double weight = Double.parseDouble(response);
        double bmi = calculateBMI(height,weight);
        DecimalFormat pattern = new DecimalFormat("###.00");
        JOptionPane.showMessageDialog(null,"Height: "+ height +"\nWeight: "+ weight +"\nBMI: "+ pattern.format(bmi));
        
    }
    public static double calculateBMI(double height, double weight){
        return (weight*703)/(height*height);
    }
}
