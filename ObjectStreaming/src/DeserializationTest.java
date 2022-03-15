import java.io.IOException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class DeserializationTest { 

    public static void main(String[] args) throws Exception {
        
        List<Student> students = new ArrayList<Student>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter file name to deserialize the file");
        String fileName = scanner.nextLine();
        
        try {
            
          FileInputStream fis = new FileInputStream(fileName);
          ObjectInputStream ois = new ObjectInputStream(fis);
          System.out.println("De started");
          students  = (ArrayList) ois.readObject();
          
          ois.close();
          fis.close();
          scanner.close();
          
        }
        
        catch(IOException ioe){
            
            ioe.printStackTrace();
        }
        
        catch(ClassNotFoundException classNotFound) {
            
            System.out.println("Class not found");
            classNotFound.printStackTrace();
            
        }
        
        for(Student student: students) {
            System.out.println(student.toString());
        }
        

    }

}
