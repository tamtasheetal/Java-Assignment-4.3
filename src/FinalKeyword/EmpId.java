package FinalKeyword;

final class EmpId    
//A final class can not be inherited. 
{
	final int EmployeeId;   
//Here declaring the int variable as final variable.     
	
	
	public EmpId(int EmployeeId)      
//This will creat a constructor.
	{
		
		this.EmployeeId=EmployeeId;       
	}
	
	public final void display()      
//This will create a final method display to print the final variable of class.
	{
		
		
		System.out.println("The Employee Id is :- "+this.EmployeeId);     		
	}
	
}    

