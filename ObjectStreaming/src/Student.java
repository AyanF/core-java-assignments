import java.io.Serializable;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Student implements Serializable {
    
    String firstName;
    Date dateOfBirth;
    Address address;
    
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public Date getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    
    
    
    public Student (String firstName, String date, Address address) {
        super();
        try {
            Date date1=new SimpleDateFormat("yyyy-MM-dd").parse(date);
            this.dateOfBirth = date1;
            this.firstName = firstName;
            this.address = address;
        }
        catch (ParseException pe) {
            pe.printStackTrace();
        }
        
    }
    
     
      
    
    @Override
    public String toString() {
        return "" + firstName + " " + dateOfBirth + " " + " "+address;
    }

}
