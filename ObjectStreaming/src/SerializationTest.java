import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

public class SerializationTest {

    public static void main(String[] args) {
        
        List<Student> students = new ArrayList<Student>();
        
        Scanner scanner= new Scanner(System.in);
        
        Address address1 = new Address("Indore", "Madhya Pradesh", "India", 452001);
        Address address2 = new Address("Bhopal", "Madhya Pradesh", "India", 462003);
        
        Student student1 = new Student("Ayan","2000-08-24",address1);
        Student student2 = new Student("Yash","2000-10-12",address2);
        Student student3 = new Student("Rohit","2000-04-20",address1);
        Student student4 = new Student("Raza","2000-05-22",address2);
   
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        
        System.out.println("Enter file name for serialized file");
        
        String fileName = scanner.nextLine(); 
        scanner.close();
        try {
            
            FileOutputStream fos = new FileOutputStream(fileName);
            ObjectOutputStream obs = new ObjectOutputStream(fos);
            
            obs.writeObject(students);
            obs.close();
            fos.close();
            System.out.println("Serialization completed");
        }
        
        catch (IOException ioe) {
            
            ioe.printStackTrace();
            
        }
        
        }

}
