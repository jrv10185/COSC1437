/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/* Java program to print an equation to the screen with 3 variables chosen by the user
 * 01/23/2023
 * James Vaughan
 * JDK Version 1.8.0.2.1
 */
import java.util.Scanner;
import java.text.DecimalFormat;
public class Assignment2 {
    public static void main(String[] args) {
        DecimalFormat noDecimal = new DecimalFormat("0");
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Name: James Vaughan");
        System.out.print("Enter a number: ");
        double num1 = keyboard.nextInt();
        System.out.print("Enter another number: ");
        double num2 = keyboard.nextInt();
        System.out.print("Enter another number: ");
        double num3 = keyboard.nextInt();
        double result = num1 / num2 * num3;
        System.out.println(noDecimal.format(num1) + "/" + noDecimal.format(num2)+"*"+noDecimal.format(num3)+" = "+result);
    }
    
}
