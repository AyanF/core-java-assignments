package DAO;
import java.util.ArrayList;
import java.time.LocalDate;
import java.util.Comparator;

import DTO.Employee;

public class EmployeeSorting{

    //Method to sort employees by name
    public static void sortEmployeeByName(ArrayList<Employee> searchedList, String orderByStr){
        
        int orderBy = Integer.parseInt(orderByStr);

        searchedList.sort(new Comparator<Employee>() {

            @Override
            public int compare(Employee o1, Employee o2) {

                int comparision=0;
                
                if(orderBy==1) {
                    comparision = o1.getName().compareTo(o2.getName());
                }
                
                if(orderBy==2) {
                    comparision = o2.getName().compareTo(o1.getName());
                }
                
                return comparision;
            }});
    }

    //Method to sort employees by age
    public static void sortEmployeeByAge(ArrayList<Employee> searchedList, String orderByStr){

        int orderBy = Integer.parseInt(orderByStr);
        
        searchedList.sort(new Comparator<Employee>() {

            @Override
            public int compare(Employee o1, Employee o2) {

                int comparision=0;
                
                if(orderBy==1) {
                    comparision = Integer.compare(o1.getAge(), o2.getAge());
                }
                
                if(orderBy==2) {
                    comparision = Integer.compare(o2.getAge(), o1.getAge());
                }
                
                return comparision;
            }});
    }

    //Method to sort employee by email
    public static void sortEmployeeByEmail(ArrayList<Employee> searchedList, String orderByStr){

        int orderBy = Integer.parseInt(orderByStr);
        
        searchedList.sort(new Comparator<Employee>() {

            @Override
            public int compare(Employee o1, Employee o2) {

                int comparision=0;
                
                if(orderBy==1){
                    comparision = o1.getEmail().compareTo(o2.getEmail());
                }
                
                if(orderBy==2)
                {
                    comparision = o2.getEmail().compareTo(o1.getEmail());
                }
                
                return comparision;
            }});
    }
    
    //Method to sort employees by date of birth
    public static void sortEmployeeByDob(ArrayList<Employee> searchedList, String orderByStr){
        
        int orderBy = Integer.parseInt(orderByStr);

        searchedList.sort(new Comparator<Employee>() {

            @Override
            public int compare(Employee o1, Employee o2) {

                int comparision=0;
                
                if(orderBy==1) {
                    comparision = o1.getDob().compareTo(o2.getDob());
                }
                
                if(orderBy==2) {
                    comparision = o2.getDob().compareTo(o1.getDob());
                }
                
                return comparision;
            }});
    }
   
}
