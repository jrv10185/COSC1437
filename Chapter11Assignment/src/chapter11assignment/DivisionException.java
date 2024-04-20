package chapter11assignment;

/**
 *James Vaughan     
 * JDK 18.0.2.1
 * 04/03/23
 */
public class DivisionException extends Exception {

    public DivisionException(){
       System.out.println("Error: Cannot divide by 0."); 
    }
}
