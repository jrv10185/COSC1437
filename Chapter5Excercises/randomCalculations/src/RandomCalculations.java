/**
 * James Vaughan
 * 02/05/2023
 * jdk 18.0.2.1
 * Practice with methods in a seperate file
 */

import java.util.Scanner;
public class RandomCalculations {
    public static void main(String[] args) {
       //System.out.println(Calculations.generateRandomNumber(500, 1100)); 
       Scanner input = new Scanner(System.in);
       System.out.println("Would you like to add, subtract, multiply, or divide?");
       String choice = input.next();
       System.out.println("Pick an Integer");
       int n1 = input.nextInt();
       System.out.println("Pick an Integer");
       int n2 = input.nextInt();
       int r1=Calculations.generateRandomNumber(n1, n2);
       int r2=Calculations.generateRandomNumber(n1, n2);
       switch(choice){
           case "add":
               System.out.println(r1+"+"+r2+"="+Calculations.add(r1, r2));
               break;
            case "subtract":
               System.out.println(r1+"-"+r2+"="+Calculations.subtract(r1, r2));
               break;
            case "multiply":
               System.out.println(r1+"*"+r2+"="+Calculations.multiply(r1, r2));
               break;
            case "divide":
               System.out.println(r1+"/"+r2+"="+Calculations.divide(r1, r2));
               break;
            default:
                System.out.println("Invalid choice");
       }
              
    }
}
    

