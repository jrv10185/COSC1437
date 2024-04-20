
package chapter10assignment;

/**
 * James Vaughan
 * JDK 18.0.2.1
 * 03/28/2023
 */
public class Person {
    private String name;
    private String phoneNumber;
    private String emailAddress;
    
    public Person(){
        name ="";
        phoneNumber="";
        emailAddress="";
    }
    public Person(String pName, String phone, String email){
        name = pName;
        phoneNumber = phone;
        emailAddress = email;
    }
    public String getName(){
        return name;
    }
    public String getPhoneNum(){
        return phoneNumber;
    }
    public String getEmail(){
        return emailAddress;
    }
    public void setName(String pName){
        name = pName;
    }
    public void setPhone(String phone){
        phoneNumber = phone;
    }
    public void setEmail(String email){
        emailAddress = email;
    }
    public String toString(){
        String str = "Name: "+name+"\nPhone: "+phoneNumber+"\nEmail: "+emailAddress;
        return str;
    }
}

