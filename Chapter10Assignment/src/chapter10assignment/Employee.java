package chapter10assignment;

/**
 * James Vaughan
 * JDK 18.0.2.1
 * 03/28/2023
 */

public class Employee extends Person {
    private String empPhone;
    
    public Employee(){
        super();
        empPhone = "";
    }
    public Employee(String pName, String phone, String email, String ePhone){
        super(pName,phone,email);
        empPhone = ePhone;
    }
    public String getEmpPhone(){
        return empPhone;
    }
    public void setEmpPhone(String ePhone){
        empPhone = ePhone;
    }
    public String toString(){
        String str = "Name: "+super.getName()+"\nPhone: "+super.getPhoneNum()+"\nEmail: "+super.getEmail()+"\nEmployee Number: "+empPhone;
        return str;
    }
}
