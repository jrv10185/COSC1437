/**
 * James Vaughan   
 * JDK 18.0.2.1
 * 04/24/2023 
 * A Simple Currency Converter
 */

import java.text.NumberFormat;
import javax.swing.JOptionPane;
public class CurrencyConverter {

    public static void main(String[] args) {
        NumberFormat dollars = NumberFormat.getCurrencyInstance();
        int convertToOrFromDollars = 0; // 1 for to Dollars, 2 for Dollars
        double startingValue =0;
        int currency=0;
        double otherValue = 0 ;
        String response ="";
        //are we converting to dollars or from dollars?
        do{
            response = JOptionPane.showInputDialog(null,"This is a simple Currency converter. \nPress 1 to convert from a curreny to the Dollar.\nPress 2 to convert from Dollar to a Currency");
            convertToOrFromDollars = Integer.parseInt(response);
        }while(convertToOrFromDollars > 2 || convertToOrFromDollars < 1);
        // if "to dollars" - need currency and amount
        if(convertToOrFromDollars == 1){
           do {
            response = JOptionPane.showInputDialog(null,  "Which Type of Currency do you have?\n"
                                                        + "1. Euro\n"
                                                        + "2. Japanese Yen\n"
                                                        + "3. Canadian Dollar\n"
                                                        + "4. Mexican Peso\n"
                                                        + "5. Russian Ruble\n"
                                                        + "6. Other"); 
           currency = Integer.parseInt(response);
           }while(currency > 6 || currency <=0);
           double exchangeRate = findRate(currency);
           if(currency == 6){
                response = JOptionPane.showInputDialog(null,  "What is the value of your Currency in relation to the dollar? (IE: 1 Dollar = X)");
                exchangeRate = Double.parseDouble(response);
            }
           response = JOptionPane.showInputDialog(null,  "What is the value of your current Currency? (IE: 20.57)");
           startingValue = Double.parseDouble(response);
           //        do calc and display result
           double finalAmount = toDollar(startingValue, exchangeRate);
           JOptionPane.showMessageDialog(null,"You have "+dollars.format(finalAmount)+" American dollar(s)");
        }
        // if "from dollars
        if(convertToOrFromDollars == 2){
           response = JOptionPane.showInputDialog(null,  "How much American Currency do you have? (IE: 2.58)");
           startingValue = Double.parseDouble(response);
           do {
           response = JOptionPane.showInputDialog(null,  "Which Type of Currency do you want to exchange to?\n"
                                                        + "1. Euro\n"
                                                        + "2. Japanese Yen\n"
                                                        + "3. Canadian Dollar\n"
                                                        + "4. Mexican Peso\n"
                                                        + "5. Russian Ruble\n"
                                                        + "6. Other"); 
           currency = Integer.parseInt(response);
           }while(currency > 6 || currency <=0);
           double exchangeRate = findRate(currency);
           if(currency == 6){
                response = JOptionPane.showInputDialog(null,  "What is the value of your Currency in relation to the dollar? (IE: 1 Dollar = X)");
                exchangeRate = Double.parseDouble(response);
            }
           double finalAmount = toDollar(startingValue, exchangeRate);
           JOptionPane.showMessageDialog(null,"You have "+dollars.format(finalAmount)+" of your chosen currency.");
        }
    }
    

    public static double toDollar(double startingValue, double exchangeRate){
        
        return startingValue/exchangeRate;
    }
    public static double fromDollar(double startingValue, double exchangeRate){
        
        return startingValue*exchangeRate;
    }
    public static double findRate(int currency){
        double rate = 0.00;
        switch (currency){
            case 1: //euro
                rate = 0.85;
                break;
            case 2:  // Japanese Yen
                rate = 110.0;
                break;
            case 3: //Canadian Dollar
                rate = 1.26;
                break;
            case 4: //Mexican Peso
                rate = 19.95;
                break;    
            case 5: // Russian Ruble
                rate = 73.70;
                break; 
            default:
                rate = 0.00;
                break;
        }
        return rate;
    }
}
