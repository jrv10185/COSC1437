/**
 *02/26/2023
 *James Vaughan
 * JDK 18.0.2.1
 */
import javax.swing.JOptionPane;

public class DistanceCities {
    public static void main(String[] args) {
        String city1 = JOptionPane.showInputDialog(null, "What is your starting city: Dallas, Austin, Houston, Galveston?"); 
        String city2 = JOptionPane.showInputDialog(null, "What is your ending city: Dallas, Austin, Houston, Galveston?");
        int distance[][]={{0, 195, 239, 289},
                          {195, 0, 145, 189},
                          {239, 145, 0, 52},
                          {289, 189, 52, 0}};
        int row=0;
        switch(city1){
            case "Dallas":
                row=0;
                break;
            case "Austin":
                row=1;
                break;
            case "Houston":
                row=2;
                break;
            case "Galvestion":
                row=3;
                break;
            default:
                row=0;
                System.out.println("Invalid city");
                break;
        }
        int column =0;
        switch(city2){
            case "Dallas":
                column=0;
                break;
            case "Austin":
                column=1;
                break;
            case "Houston":
                column=2;
                break;
            case "Galvestion":
                column=3;
                break;
            default:
                column=0;
                System.out.println("Invalid city");
                break;
        }
        JOptionPane.showMessageDialog(null,"Distance is "+distance[row][column]+" miles");
        
    }
    
}
