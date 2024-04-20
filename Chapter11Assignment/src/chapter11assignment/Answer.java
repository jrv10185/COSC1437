
/**
 *James Vaughan     
 * JDK 18.0.2.1
 * 04/03/23
 */
package chapter11assignment;

public class Answer {
    private double answer;
    public Answer(double n ,double d ) throws DivisionException{
        if(d == 0){
            throw new DivisionException();
        }
        answer = (n / d);
    }
    public double getAnswer(){
        return answer;
    }
}
