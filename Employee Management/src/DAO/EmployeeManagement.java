package DAO;
import java.time.LocalDate;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import javax.swing.JOptionPane;

import DTO.Employee;

import java.util.ArrayList;

public class EmployeeManagement {

    //method to check if string is numeric
    public static boolean isNumber(String numberInput) {
        
        String regex = "[0-9]+";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(numberInput);
        
        return m.matches();
    }
    
    //Method to delete employee record
    public static void deleteEmployee(ArrayList<Employee> employeeList, int employeeId) throws IOException {

        for(Employee employee: employeeList)
        {

            int currentId = employee.getId();

            if(currentId==employeeId)
            {
                employeeList.remove(employee);
                break;
            }

            else
            {
                JOptionPane.showMessageDialog(null,"ID does not exist");            }
        }

        fileWriter(employeeList);


    }

    //Method to write ArrayList into File
    public static void fileWriter(ArrayList<Employee> employeeList) throws IOException {

        FileWriter fileWriter = new FileWriter("./employees.txt");

        StringBuilder toWrite = new StringBuilder();

        for(Employee employee : employeeList)

        {
            int id = employee.getId();
            String name = employee.getName();
            String email = employee.getEmail();
            int age = employee.getAge();
            LocalDate dob = employee.getDob();

            toWrite.append(id+","+name+","+email+","+age+","+dob+",");
        }


        fileWriter.append(toWrite);
        JOptionPane.showMessageDialog(null,"Records updtad successfully");
        fileWriter.close();

    }

    //Loading file into ArrayList
    public static ArrayList<Employee> loadFile() throws  FileNotFoundException, IOException {

        ArrayList<Employee> employeeList= new ArrayList<Employee>();
        BufferedReader bufReader = new BufferedReader(new FileReader("./employees.txt"));
        String line = bufReader.readLine();
        String separated[] = line.split(",");

        for(int i=0; i<separated.length; i+=5)
        {

            int eId = Integer.parseInt(separated[i]);
            String empName = separated[i+1];
            String empEmail= separated[i+2];
            int age = Integer.parseInt(separated[i+3]);
            LocalDate dob = LocalDate.parse(separated[i+4]);

            Employee employee = new Employee();

            employee.setId(eId);
            employee.setName(empName);
            employee.setEmail(empEmail);
            employee.setAge(age);
            employee.setDob(dob);

            employeeList.add(employee);
        }

        bufReader.close();

        return employeeList;

    }

    //Create new employee record
    public static ArrayList<Employee> addEmployee(ArrayList<Employee> employeeList) {

        Employee lastEmp = employeeList.get(employeeList.size()-1);

        int lastId = lastEmp.getId();

        Employee employee = new Employee();

        String employeeName = JOptionPane.showInputDialog("Enter employee name");
        String employeeEmail = JOptionPane.showInputDialog("Enter employee E-Mail");
        String employeeAgeStr = JOptionPane.showInputDialog("Enter employee age");
        String employeeDob = JOptionPane.showInputDialog("Enter employee date of birth (yyyy-MM-dd)");

        int employeeAge = Integer.parseInt(employeeAgeStr);
        LocalDate dob = LocalDate.parse(employeeDob);

        employee.setId(lastId+1);
        employee.setName(employeeName);
        employee.setEmail(employeeEmail);
        employee.setAge(employeeAge);
        employee.setDob(dob);

        employeeList.add(employee);

        return employeeList;

    }

    //Search employee
    public static ArrayList<Employee> searchEmployee(ArrayList<Employee> employeeList, String query) {
        
        ArrayList<Employee> searchedList =new ArrayList<Employee>();
        
        //flag for recording if input is age 
        boolean ageFlag;
        //variable to store age in int form
        int queryInt=0;
        
        //checking if query is integer
        if(isNumber(query)) {
            
            queryInt = Integer.parseInt(query);
            ageFlag = true;
        }
        
        for(Employee employee : employeeList)
        {
            
            String name = employee.getName();
            String email = employee.getEmail();
            LocalDate dob = employee.getDob();
            String dobStr = dob.toString();
            
            //Explicit code if query is by age  i.e integer
            if(ageFlag=true) {
                int age = employee.getAge();
                if(queryInt==age)
                {
                    searchedList.add(employee);
                }
            }
            
            //s for records name,email,dob  
            if(query.equalsIgnoreCase(name) || query.equalsIgnoreCase(email)  || query.equalsIgnoreCase(dobStr))
            {
                searchedList.add(employee);
            }
        }
        
        return searchedList;
    }
    
    //Print list on console
    public static void showList(ArrayList<Employee> employeeList) {
        
        for(Employee employee : employeeList) {
            
            int id = employee.getId();
            String name = employee.getName();
            String email = employee.getEmail();
            int age = employee.getAge();
            LocalDate dob = employee.getDob();
            
            System.out.println(id+" "+name+" "+age+" "+dob+" "+email);
            
        }
        
    }
    public static void main(String[] args) throws Exception{

        ArrayList<Employee> employeeList = loadFile();
        ArrayList<Employee> searchedList = new ArrayList<Employee>();

        String choiceStr = JOptionPane.showInputDialog("Select an operation to perform\n1.Add\n2.Delete\n3.Search");

        int choice = Integer.parseInt(choiceStr);

        switch (choice) {

        //Case to create employee record and write in text file

        case 1:

            employeeList = addEmployee(employeeList);
            fileWriter(employeeList);


            break;

        //Case to delete employee and update in file	

        case 2:

            String employeeIdStr = JOptionPane.showInputDialog("Enter employee ID for deletion ");	
            int employeeId = Integer.parseInt(employeeIdStr);
            deleteEmployee(employeeList,employeeId);

            break;

       //Case to run search query 		
            
        case 3:

            String query = JOptionPane.showInputDialog("Enter text to search (Name, Email, Age or DOB)");
            String sortStr = JOptionPane.showInputDialog("Sort by \n1.Name \n2.E-mail \n3.Age\n4.Date of Birth");
            String orderByStr = JOptionPane.showInputDialog("Order by \n1.Ascending \n2.Descending");
            
            searchedList = searchEmployee(employeeList, query);
            
            if(sortStr.equals("1"))
            {
                EmployeeSorting.sortEmployeeByName(searchedList,orderByStr);
            }
            if(sortStr.equals("2"))
            {
                EmployeeSorting.sortEmployeeByEmail(searchedList,orderByStr);
            }
            if(sortStr.equals("3"))
            {
                EmployeeSorting.sortEmployeeByAge(searchedList,orderByStr);
            }
            if(sortStr.equals("4"))
            {
                EmployeeSorting.sortEmployeeByDob(searchedList,orderByStr);
            }
            break;
            
        }
        
        showList(searchedList);

    }

}
