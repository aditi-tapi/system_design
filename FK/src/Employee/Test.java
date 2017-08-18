package Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.*;
 
class Test  
{ 
     
    public static void main (String[] args) throws Exception
    {
        try
        {
            //Create comp company object
            Company comp = new Company(5);
             
            //Compute the payroll data
            comp.computePayroll();
             
            //Read the total payroll
            comp.readPayrollData();
             
            System.out.println(comp.toString());//This is where I run into trouble, I feel like
                                                //I should put this in a loop.Not sure how to call
                                                //an object from Class Company...
         
        }
        catch (IOException e){
            System.out.println(e.getMessage());
         
                 
        }
         
    }
}