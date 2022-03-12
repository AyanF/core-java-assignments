import java.util.ArrayList;
import java.util.List;

public class SerializationTest {

    public static void main(String[] args) {
        
        List<Student> students = new ArrayList<Student>();
        
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        Student student4 = new Student();
        
        Address address1 = new Address();
        Address address2 = new Address();
        
        address1.setState("Madhya Pradesh");
        address1.setPincode(452001);
        address1.setCountry("India");
        address1.setCity("Indore");
        
        address2.setState("Madhya Pradesh");
        address2.setPincode(462003);
        address2.setCountry("India");
        address2.setCity("Bhopal");
        
        student1.setFirstName("Ayan");
        student2.setFirstName("Yash");
        student3.setFirstName("Rohit");
        student4.setFirstName("Raza");
        
        student1.setDateOfBirth("2000-08-24");
        student2.setDateOfBirth("2000-10-12");
        student3.setDateOfBirth("2000-04-19");
        student4.setDateOfBirth("2000-06-20");
        
        student1.setAddress(address1);
        student2.setAddress(address1);
        student3.setAddress(address2);
        student4.setAddress(address2);
        
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        
        }

}
