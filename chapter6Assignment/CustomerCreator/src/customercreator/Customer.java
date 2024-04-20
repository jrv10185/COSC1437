
package customercreator;
public class Customer {
    private String name = null;
    private int creditScore = 300;
    
    //constructor
    public Customer(String newName, int newCredit){
        setName(newName);
        setCreditScore(newCredit);
    }
    public void setName(String newName){
        name = newName;
    }
    public void setCreditScore(int newCredit){
        if(newCredit > 300){
            creditScore = newCredit;
        }else{
            creditScore = 300;
        }
    }
    public int getCreditScore(){
        return creditScore;
    }
    public String getName(){
        return name;
    }
    public String getCreditRating(){
        if (creditScore >=200 && creditScore <=629){
            return "Bad";
        }else if (creditScore >=630 && creditScore <=689){
            return "Fair";
        }else if (creditScore >=690 && creditScore <=719){
            return "Good";
        }else if (creditScore >=720 && creditScore <=850){
            return "Excellent";
        }else{
            return "Credit Score out of bounds";
        }
    }
}
