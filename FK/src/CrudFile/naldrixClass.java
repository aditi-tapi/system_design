package CrudFile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class naldrixClass {
	public static void AddRecord() throws IOException {
		
		BufferedWriter bw = new BufferedWriter( new FileWriter("naldrix_db.txt",true) );
		Scanner strInput = new Scanner(System.in);
		
		String ID, name, age, addr;
		
		System.out.print("Enter the Employee ID: ");
		ID = strInput.nextLine();
		System.out.print("Enter the Employee Name: ");
		name = strInput.nextLine();
		System.out.print("Enter the Employee Age: ");
		age = strInput.nextLine();
		System.out.print("Enter the Employee Address: ");
		addr = strInput.nextLine();    		
		   		
		bw.write(ID+","+name+","+age+","+addr);
		bw.flush();
		bw.newLine();
		bw.close();		
	
}
	
	public static void ViewAllRecord() throws IOException {
    	BufferedReader br = new BufferedReader( new FileReader("naldrix_db.txt") );
    		
    	String record;
    		
    	System.out.println(" ------------------------------------------------------------- ");
    	System.out.println("|	ID		Name 				Age			Address 		  |");
    	System.out.println(" ------------------------------------------------------------- ");
    		
    	while( ( record = br.readLine() ) != null ) {
    			
    		StringTokenizer st = new StringTokenizer(record,",");
    			
    		System.out.println("|	"+st.nextToken()+"	"+st.nextToken()+" 		"+st.nextToken()+"			"+st.nextToken()+"      |");
	
    	}
    		
    	System.out.println("|	                                            	          |");
    	System.out.println(" ------------------------------------------------------------- ");
    	br.close();    		
    		
    }
	
	public static void DeleteRecordByID() throws IOException {
		Scanner strInput =  new Scanner(System.in);
		String ID, record;
		
		
		File tempDB = new File("naldrix_db_temp.txt");
		File db = new File("naldrix_db.txt");
		
		
		BufferedReader br = new BufferedReader( new FileReader( db ) );
		BufferedWriter bw = new BufferedWriter( new FileWriter( tempDB ) );
		
		
		System.out.println("\t\t Delete Employee Record\n");
		
		System.out.println("Enter the Employee ID: ");
		ID =  strInput.nextLine();
		
		
		while( ( record = br.readLine() ) != null ) {
			
			
			if( record.contains(ID) ) 
				continue;

			bw.write(record);
			bw.flush();
			bw.newLine();

		}
		
		br.close();
		bw.close();
		
		db.delete();
		
		tempDB.renameTo(db);

}
	public static void SearchRecordbyID() throws IOException {
		String ID,record;
		Scanner strInput = new Scanner(System.in);
		
		BufferedReader br = new BufferedReader( new FileReader("naldrix_db.txt") );
		
		System.out.println("\t\t Search Employee Record\n");
	
		
		System.out.println("Enter the Employee ID: ");
		ID = strInput.nextLine();
		
		System.out.println(" ------------------------------------------------------------- ");
		System.out.println("|	ID		Name 				Age			Address 		  |");
		System.out.println(" ------------------------------------------------------------- ");
		
		while( ( record = br.readLine() ) != null ) {
			
			StringTokenizer st = new StringTokenizer(record,",");
			if( record.contains(ID) ) {
				System.out.println("|	"+st.nextToken()+"	"+st.nextToken()+" 		"+st.nextToken()+"			"+st.nextToken()+"      |");
			}
			
			
			
		}
		
		System.out.println("|	                                            	          |");
		System.out.println(" ------------------------------------------------------------- ");
		
		br.close();
		
		
		
}
	public static void updateRecordbyID() throws IOException {
		String newName, newAge, newAddr, record, ID,record2;
		
		File db = new File("naldrix_db.txt");
		File tempDB = new File("naldrix_db_temp.txt");
		
		BufferedReader br = new BufferedReader( new FileReader(db) );
		BufferedWriter bw = new BufferedWriter( new FileWriter(tempDB) );
		    		
		Scanner strInput = new Scanner(System.in);
		
		System.out.println("\t\t Update Employee Record\n\n");   
	/****/		
		System.out.println("Enter the Employee ID: ");
    		ID = strInput.nextLine();	    		
    		System.out.println(" ------------------------------------------------------------- ");
    		System.out.println("|	ID		Name 				Age			Address 		  |");
    		System.out.println(" ------------------------------------------------------------- ");
    		
    		while( ( record = br.readLine() ) != null ) {
    			
    			StringTokenizer st = new StringTokenizer(record,",");
    			if( record.contains(ID) ) {
    				System.out.println("|	"+st.nextToken()+"	"+st.nextToken()+" 		"+st.nextToken()+"			"+st.nextToken()+"      |");
    			}
    			
    		}	    		
    		System.out.println("|	                                            	          |");
    		System.out.println(" ------------------------------------------------------------- ");
    		
    	br.close();
	/****/    	   
		System.out.println("Enter the new Name: ");
		newName = strInput.nextLine();    		
		System.out.println("Enter the new Age: ");
		newAge = strInput.nextLine();  
		System.out.println("Enter the new Address: ");
		newAddr = strInput.nextLine();  
		
		BufferedReader br2 = new BufferedReader( new FileReader(db) );
			
		while( (record2 = br2.readLine() ) != null ) {    			
			if(record2.contains(ID)) {
				bw.write(ID+","+newName+","+newAge+","+newAddr);
			} else {
			
				bw.write(record2);	
			}    			
			bw.flush();
			bw.newLine();
		}
		
		bw.close();
		br2.close();    		
		db.delete();    		
		boolean success = tempDB.renameTo(db);    		
		System.out.println(success);    		
		
}
}
