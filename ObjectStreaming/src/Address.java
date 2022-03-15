import java.io.Serializable;

public class Address implements Serializable{
    
    String city;
    String state;
    String country;
    int pincode;
    
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public int getPincode() {
        return pincode;
    }
    public void setPincode(int pincode) {
        this.pincode = pincode;
    }
    
    public Address(String city, String state, String country, int pincode) {
        
        super();
        this.city=city;
        this.country=country;
        this.state=state;
        this.pincode=pincode;
    }
    
    @Override
    public String toString(){
        
        return " "+ country + " "+state+ " "+city+ " "+pincode;
        
    }
    
    
}
