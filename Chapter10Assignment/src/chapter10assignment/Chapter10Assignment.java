package chapter10assignment;

/**
 * James Vaughan
 * JDK 18.0.2.1
 * 03/28/2023
 */

public class Chapter10Assignment {
    public static void main(String[] args) {
      Person[] people = {new Person("Jim Bob","999-999-9999","jim@email"),
                        new Person("Jill Bob","999-888-8888","jill@email"),
                        new Employee("Cloud Strife","999-777-7777","cloud@email","888-999-9999"),
                        new Employee("Barrett","999-666-6666","barrett@email","888-888-8888")};   
      for(int i=0; i<people.length;i++){
          System.out.println(people[i].toString());
          System.out.println("");
      }
      
    }
    
}
