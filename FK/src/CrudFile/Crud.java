package CrudFile;

import java.io.IOException;
import java.util.Scanner;

public class Crud {

	public static void main(String[] args) throws IOException {
		Scanner strInput = new Scanner(System.in);
        String choice,cont = "y";        
        
        while( cont.equalsIgnoreCase("y") ) {        	
        	   System.out.println("\t\t Employee Information System\n\n");
        
	        System.out.println("1 ===> Add New Employee Record ");
	        System.out.println("2 ===> View All Employee Record ");	
	        System.out.println("3 ===> Delete Employee Record ");
	        System.out.println("4 ===> Search Specific Record ");
	        System.out.println("5 ===> Update Specific Record ");	        
	    
	        System.out.print("\n\n");
	        System.out.println("Enter your choice: ");
	        choice = strInput.nextLine();
	        
	        if( choice.equals("1") ) {
	        		naldrixClass.AddRecord();
	        } else if( choice.equals("2") ) {
	        		naldrixClass.ViewAllRecord();
	        } else if( choice.equals("3") ) {
	        		naldrixClass.DeleteRecordByID();
	        }	else if( choice.equals("4") ) {
	        		naldrixClass.SearchRecordbyID();
	        }	else if( choice.equals("5") ) {
	        		naldrixClass.updateRecordbyID();
	        }	
		        	
	        System.out.println("Do you want to continue? Y/N");
	        cont = strInput.nextLine();
	       	
        }

	}

}
