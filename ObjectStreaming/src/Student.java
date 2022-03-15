import java.io.Serializable;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Student implements Serializable {
    
    private static final long serialVersionUID = 2024302118858299808L;
    
    String firstName;
    Date dateOfBirth1;
    String dateofBirth;
    Address address;
    String date;
    
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public Date getDateOfBirth1() {
        return dateOfBirth1;
    }
    public void setDateOfBirth1(Date dateOfBirth) {
        this.dateOfBirth1 = dateOfBirth;
    }
    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    
    public Student (String firstName, String date, Address address) {

        try {

            Date date1=new SimpleDateFormat("yyyy-MM-dd").parse(date);
            this.dateOfBirth1 = date1;
            this.firstName = firstName;
            this.address = address;
        }
        catch (ParseException pe) {
            pe.printStackTrace();
        }
    }
    
    public Student (String firstName, Date date, Address address) {
        
            String date2 = date.toString();
            this.dateofBirth = date2;
            this.firstName = firstName;
            this.address = address;
        
    }
    
    @Override
    public String toString() {
        return "" + firstName + " "+address;
    }

}
