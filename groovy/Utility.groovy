package validator
import java.util.List
public class VerifyByXml{

  public void validate(){
    def persons = new Person("Jim", "Knopf")
    println persons.firstName
  }
  
  public class Person{
       String lastName;
       String firstName;
      Person(String firstName, String lastName){
    this.firstName = firstName
    this.lastName= lastName
  }
      
  }
} 