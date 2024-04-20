/**
 * James Vaughan
 * 03/19/2023
 * JDk 18.0.2.1
 * Comparing months
 */
public class Chapter8Assignment {
    public static void main(String[] args) {
        Month month1 = new Month(10); //building default
        Month month2 = new Month(11); // using constructor
        System.out.println(month1);
        System.out.println(month2);
        if(month1.equals(month2)){
            System.out.println(month1.getMonthName()+" is equal to "+month2.getMonthName());
        }else{
            System.out.println(month1.getMonthName()+" is not equal to "+month2.getMonthName());
        }
    }
    
}
