/**
 * James Vaughan    
 * 03/19/2023   
 * JDK 18.0.2.1
 * Validates a email address
 */
import java.util.Scanner;
public class EmailValidation {

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Enter Your Email Address");
         String response = input.next();
         System.out.println(response);
         boolean goodEmail = true;
         boolean hasNumber = false;
         if(response.length() < 15 && response.length() > 25){
             goodEmail = false;
         }
         if(response.indexOf("@") < 0){
             goodEmail = false;
         }
         for(int i =0; i< response.length();i++){
             if(Character.isDigit(response.charAt(i))){
                 hasNumber = true;
                 break;
             }
         }
         if(!hasNumber){
             goodEmail = false;
         }
         if(goodEmail){
             System.out.println("Valid");
         }else{
             System.out.println("Invalid");
         }
         
    }
    
}
