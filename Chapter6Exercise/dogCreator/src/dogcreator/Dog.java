
package dogcreator;

/**
 *
 * @author James Vaughan
 * 02/19/2023
 * jdk 18.0.2.1
 */
public class Dog {
    //instance variable
    private String name =null;
    private double weight = 0;
    
    public Dog(String newName , double w){
        setName(newName);
        setWeight(w);
    }
    
    public void setName(String newName){
        name = newName;
    }
    
    public void setWeight(double w){
        if( w > 0 ){
            weight = w;
        }else{
            System.out.println("Weight cannot be zero or negative");
        }
    }
    public String getName(){
        return name;
    }
    public double getWeight(){
        return weight;
    }
    public String compare(Dog dogCompare){
        if(dogCompare.weight > this.weight){
            return dogCompare.name;
        }else if (dogCompare.weight < this.weight){
            return this.name;
        }else{
            return "The dogs weights are equal.";
        }
    }
} // end of class
