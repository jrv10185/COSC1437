/**
 *James Vaughan
 * 02/26/2023
 * JDK 18.0.2.1
 */
import javax.swing.JOptionPane;
public class SellingSodas {

    public static void main(String[] args) {
        int numSodaType = -1;
        do {
            numSodaType = Integer.parseInt(JOptionPane.showInputDialog("How many types of sodes would you like to enter:"));
        }while (numSodaType <= 0);
        String sodaArray[] = new String[numSodaType];
        for (int i =0; i<numSodaType; i++){
            sodaArray[i] = JOptionPane.showInputDialog("Enter the name of soda type "+(numSodaType+1)+":");
        }
        int numSoldArray[] = new int[numSodaType];
        int totalSoda =0;
        
        //ask for number of sodas, fill out array and keep running total
        for(int i=0; i < sodaArray.length;i++){
            int sodaSold = -1;
            do {
                sodaSold = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of "+sodaArray[i]+" bottles sold:"));
            }while(sodaSold <=0);
            totalSoda += sodaSold;
            numSoldArray[i] = sodaSold;
        }
        //find highest sold soda
        int highestSoldAmount = numSoldArray[0];
        int highestIndex = 0;
        for (int i =1; i<numSoldArray.length-1;i++){
            if(numSoldArray[i] > highestSoldAmount){
                highestSoldAmount = numSoldArray[i];
                highestIndex = i;                        
            }
        }
        //find lowest sold soda
        int lowestSoldAmount = numSoldArray[0];
        int lowestIndex = 0;
        for (int i =1; i<numSoldArray.length-1;i++){
            if(numSoldArray[i] < lowestSoldAmount){
                lowestSoldAmount = numSoldArray[i];
                lowestIndex = i;                        
            }
        }
        JOptionPane.showMessageDialog(null, "Total Sold: "+totalSoda+"\nHighest Sold: "+sodaArray[highestIndex]+"\nLowest Sold: "+sodaArray[lowestIndex]);
    }
    
}
