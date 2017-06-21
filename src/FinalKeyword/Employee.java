package FinalKeyword;
import java.util.Scanner;

public class Employee
{
	public static void main(String[] args)  
	{
		final int parameterToPass; 
//This will initialize the int variable as final variable.
		
		System.out.println("Enter Employee Id :- This Id will save for future login ");
	
		Scanner sc=new Scanner(System.in);       
//This will create an object of Scanner class.
		
		parameterToPass=sc.nextInt();     
//The value of this variable can not be changed after this. 
		
		EmpId objFinalClass=new EmpId(parameterToPass);
// This will passed the value of parameterToPass variable to initialize the final variable of class
		     
		objFinalClass.display();     
		
		sc.close();        
	}
}

