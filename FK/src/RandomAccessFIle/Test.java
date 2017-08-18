package RandomAccessFIle;

import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException {

	      FileDatabase fe = new FileDatabase("/Users/adititapi/Documents/people.txt");

	      fe.insertRecord(new PersonRecord(1, "Brian", "Sullivan",
	         "bs@hotmail.com"));
	      fe.insertRecord(new PersonRecord(2, "Randal", "Wallace",
	         "rw@hotmail.com"));
	      fe.insertRecord(new PersonRecord(3, "Eric", "Bloch",
	         "eb@hotmail.com"));
	      fe.insertRecord(new PersonRecord(4, "Kapil", "Ansari",
	         "ka@hotmail.com"));
	      fe.showAllRecords();
	      fe.updateRecord(new PersonRecord(4,"Tony","Li",
	         "kapil@somemail.com"));
	      fe.showAllRecords();
	      fe.deleteRecord(new PersonRecord(1,"Brian","Sullivan",
	         "bs@hotmail.com"));
	      fe.showAllRecords();
	      fe.close();
	   }

}
