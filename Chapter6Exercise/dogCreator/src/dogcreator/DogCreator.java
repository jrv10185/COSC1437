
package dogcreator;

/**
 *
 * @author James Vaughan
 * 02/19/2023
 * jdk 18.0.2.1
 */
public class DogCreator {
    public static void main(String[] args) {
       Dog dog1 = new Dog("Rufus", 160);
       Dog dog2 = new Dog("Remy", 99);
       Dog dog3 = new Dog("Indy", 16);
       System.out.println("Name: "+dog1.getName());
       System.out.println("Weight: "+dog1.getWeight());
       System.out.println("Name: "+dog2.getName());
       System.out.println("Weight: "+dog2.getWeight());
       System.out.println("Name: "+dog3.getName());
       System.out.println("Weight: "+dog3.getWeight());
       
       System.out.println(dog1.compare(dog2));
    }
    
}
