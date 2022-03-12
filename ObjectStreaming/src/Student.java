import java.io.Serializable;

public class Student implements Serializable{
    
    String firstName;
    String dateOfBirth;
    Address address;
    
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    
    public Student(String firstName, String dateOfBirth, Address address) {
        super();
        this.dateOfBirth = dateOfBirth;
        this.firstName = firstName;
        this.address = address;
    }
    
    @Override
    public String toString() {
        return "" + firstName + " " + dateOfBirth + " " + " "+address;
    }

}
