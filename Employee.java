import java.util.Scanner;
import java.util.Date;

public class Employee2 {
	public static void main(String[] args) {
		 
	String ename;
	 int dob;
	 int mob;
	 int yob;
	 int age;
	 double monthlysal;
	 double annualsal;
	 double tax = 0;
	 
	 Scanner sc=new Scanner(System.in);
	 Employee2 e=new Employee2();
	
	 System.out.println("Enter Employee Name:");
	 ename=sc.next();
	 System.out.println("Enter Employee Date of Birth:");
	 dob=sc.nextInt();
	 System.out.println("Enter Employee Month of Birth:");
	 mob=sc.nextInt();
	 System.out.println("Enter Employee Year of Birth:");
	 yob=sc.nextInt();
	 System.out.println("Enter Employee monthlysal:");
	 monthlysal=sc.nextDouble();

	System.out.println("Employee name: "+ename);	
	age=(2020-yob);
	System.out.println("Employee age: "+age);
	annualsal=monthlysal *12;
	System.out.println("Employee name: "+annualsal);
	if (annualsal<200000) {
		tax=annualsal*(5*100);
		System.out.println("Employee tax: "+tax);
	}
	else if (annualsal<300000) {
		tax=annualsal*(10*100);
		System.out.println("Employee tax: "+tax);
		}
	else if (annualsal<400000) {
		tax=annualsal*(15*100);
		System.out.println("Employee tax: "+tax);
		}
	else if (annualsal<500000) {
		tax=annualsal*(20*100);
		System.out.println("Employee tax: "+tax);
		}
	else {
		System.out.println("Employee tax not applicable");
		
	}
	} 
}
