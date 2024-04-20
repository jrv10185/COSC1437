
/**
 *Tally number of coin tosses
 * James Vaughan 1/30/2023
 * JDK 18.0.2.1
 */
import java.util.Scanner;
public class HeadsTails {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("How many times would you like to flip the coin?");
       int times = input.nextInt();
       int headCounter = 0;
       int tailCounter = 0;
       for(int i=0; i < times ; i++){
           double r = Math.random(); //generate a random number 0-1, assigns it to r
           if(r>=.5){ //fair chance heads/tails
              // System.out.println("Heads");
               headCounter++;
           }else{
               //System.out.println("Tails");
               tailCounter++;
           }
       }
       System.out.println("Number of Heads: "+headCounter);
       System.out.println("Number of Tails: "+tailCounter);
    }
    
}
