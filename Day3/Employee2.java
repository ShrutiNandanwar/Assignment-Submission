import java.util.Scanner;

public class Employee2 {
	private static Scanner sc;

	public static void main(String[] args) {
		 
	String ename;
	 int dob,mob;
	 int yob;
	 int age;
	 float monthlysal;
	 float annualsal;
	 float tax = 0f;
	
	 sc = new Scanner(System.in);	
	 System.out.println("Enter Employee Name:");
	 ename=sc.next();
	 System.out.println("Enter Employee Date of Birth:");
	 dob=sc.nextInt();
	 System.out.println("Enter Employee Month of Birth:");
	 mob=sc.nextInt();
	 System.out.println("Enter Employee Year of Birth:");
	 yob=sc.nextInt();
	 System.out.println("Enter Employee monthlysal:");
	 monthlysal=sc.nextFloat();

	System.out.println("Employee Name: "+ename);	
	age=(2020-yob);
	System.out.println("Employee Age: "+age);
	annualsal=monthlysal *12;
	System.out.println("Employee Annual  Salary: "+annualsal);
	if (annualsal<200000) {
		tax=annualsal-(5*100);
		System.out.println("Employee tax: "+tax);
	}
	else if (annualsal<300000) {
		tax=annualsal-(10*100);
		System.out.println("Employee tax: "+tax);
		}
	else if (annualsal<400000) {
		tax=annualsal-(15*100);
		System.out.println("Employee tax: "+tax);
		}
	else if (annualsal<500000) {
		tax=annualsal-(20*100);
		System.out.println("Employee tax: "+tax);
		}
	else {
		System.out.println("Employee tax not applicable");
		
	}
	} 
}
