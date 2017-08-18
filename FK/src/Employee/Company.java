package Employee;

import java.io.*;
import java.util.ArrayList;
 
public class Company 
{
//Declare data, array of employees and payroll for company.
private ArrayList<Employee> employees;
private double payroll;
 
Company(int size)
{
 employees = new ArrayList<Employee>();
}
 
// Method setPayRoll will store argument in variable payroll.
public void setPayRoll(double p)
{
    payroll = p;
}
 
//validate range of index #'s. 
private boolean Range(int i)
{
    return i >= 0 && i < employees.size();
}
 
//If valid range then will store employees in a certain index. 
public void setemployees(Employee e, int i)
{
    if (Range(i))
    {
        employees.add(e);
    }   
}
//If there is a valid range if indices then will return that employees, otherwise null.
public Employee getemployees(int i)
{
    if(Range(i))
    {
        return employees.get(i);    
    }
    else
    {
        return null;
    }
}//End Employee getemployees
 
 
//Read data from a file called employees.txt and store them in array "employees"
public void readPayrollData() throws Exception
{
    FileReader fr = new FileReader("/Users/adititapi/Documents/file1.txt");
    BufferedReader br = new BufferedReader(fr);
    Employee emp;
    String id;
    
    while ((id = br.readLine()) != null) 
    {
    	System.out.println(id);
    	String em[] = id.split(",");
        //int salary = Integer.parseInt((br.readLine()));
        
            emp = new Employee(em[0], Integer.parseInt(em[1]));
            employees.add(emp);
 
     
    }
    fr.close();
}//end readPayrollData  
     
 
public void computePayroll()
{
    payroll = 0;
    for(int i = 0; i< employees.size();i ++)
    {
        payroll = (employees.get(i).getPay());
    }
}//end Compute payroll
     
    public String toString()
{
    String newString = "Employee Information: \n";
    for(int countEmployee = 0;countEmployee < employees.size(); countEmployee++)
    {
        newString += employees.get(countEmployee).getID() + " "+ employees.get(countEmployee).getPay() + "\n";
    }
    return newString;
}
}//End String toString