/**
 * James Vaughan
 * 02/05/2023
 * JDK 18.0.2.1
 * This program is a game to guess whether planet facts are true or false
 */
import java.util.Scanner;
public class MethodsGame {
    public static void main(String[] args) {
       String playAgain ="yes";
       do{
       int randNum = (int)(Math.random()*10+1);
       boolean isTrue = switchPlanet(randNum);
       Scanner input = new Scanner(System.in);
       System.out.println("True or False?");
       String answer = input.nextLine();
       compare(isTrue , answer);
       System.out.println("Play again (yes or no)?");
       playAgain = input.nextLine();
       }while(playAgain.equals("yes"));
    }
    public static boolean switchPlanet(int randNum){
        switch(randNum){
            case 1:
                System.out.println("There is ice on Mercury");
                return true;
            case 2:
                System.out.println("Venus has no moons");
                return true;
            case 3:
                System.out.println("Uranus spins sideways");
                return true;
            case 4:
                System.out.println("Mars has a volcano bigger than the state of Hawaii");
                return true;
            case 5:
                System.out.println("Spacecraft have visited every planet");
                return true;
            case 6:
                System.out.println("Our sky is blue because of the Sun's atmosphere");
                return false;   
            case 7:
                System.out.println("Our sky is blue because of the Sun's atmosphere");
                return false;
            case 8:
                System.out.println("There are aliens on the moon");
                return false;
            case 9:
                System.out.println("Mercury is expanding");
                return false;
            case 10:
                System.out.println("There are mountains on Pluto");
                return false; 
            default:
               System.out.println("Error"); 
               return false;
        }
    }
    public static void compare(boolean isTrue, String answer){
        boolean compareTo = false;
        if (answer.equals("True")){
             compareTo = true;
        }else if(answer.equals("true")){
            compareTo = true;
        }else if(answer.equals("TRUE")){
            compareTo = true;
        }
        if (answer.equals("False")){
            compareTo = false;
        }else if(answer.equals("false")){
            compareTo = false;
        }else if(answer.equals("FALSE")){
            compareTo = false;
        }
        //compare states
        if(isTrue ==  compareTo){
            System.out.println("Correct!");
        }else{
            System.out.println("Incorrect");
        }
    }
}
