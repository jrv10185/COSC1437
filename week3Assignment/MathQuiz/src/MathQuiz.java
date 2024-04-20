/**
 *  James Vaughan
 *  02/19/2023
 *  JDK 18.0.2.1
 */
import java.util.Scanner;
import java.util.Random;
public class MathQuiz {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int numQuestions = 0;
        double percent=0.00;
        do{
            do{
            System.out.println("How many questions would you like to solve? Must be greater than 2");
            numQuestions = keyboard.nextInt();
            }while(numQuestions <2);
        int counter = 0;
        double numCorrect =0;
        int rand1 = 0;
        int rand2 =0;
        int answer=0;
        int userAnswer =0;
            for(int i=0; i<numQuestions; i++){
                rand1 = (int)(Math.random()*(99)+1);
                rand2 = (int)(Math.random()*(99)+1);
                answer = rand1+rand2;
                System.out.println(rand1+"+"+rand2+"=?");
                userAnswer = keyboard.nextInt();
                if(userAnswer == answer){
                    System.out.println("Correct");
                    numCorrect+=1;
                }else{
                    System.out.println("Incorrect");
                }
            }
            percent = (double)((numCorrect / numQuestions)*100);
            System.out.println("You got "+numCorrect+" out of "+numQuestions+" correct which is "+percent+"%");
            if(percent < 70.0){
                System.out.println("You did not pass this addition quiz. Please try again.");
            } else{
                System.out.println("You passed this addition quiz. Congratulations!");
            }
        }while (percent <70.0);
    }
}
