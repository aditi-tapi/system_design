package Employee;

public class Employee {
	private String empID;
	private int pay;
	 
	 
	 
	public Employee(String id, int pa)
	{
	    empID = id;
	    pay = pa;
	}
	 
	String getID()
	{
		return empID;
	}
	int getPay()
	{
	    return pay;
	}
}
