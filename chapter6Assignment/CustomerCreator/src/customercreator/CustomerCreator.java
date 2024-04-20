/* James Vaughan
*  JDK 18.0.2.1
*  02/19/2023
*/
package customercreator;
public class CustomerCreator {

    public static void main(String[] args) {
        Customer cus1 = new Customer("Bob Smith", 640);
        System.out.println("Name: "+cus1.getName());
        System.out.println("Credit Score: "+cus1.getCreditScore());
        System.out.println("Credit Rating: "+cus1.getCreditRating());
    }
    
}
