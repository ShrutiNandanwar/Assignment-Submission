
import java.util.Scanner;

public class Avenger{

	Scanner sc=new Scanner(System.in);
	 String name;
	 String weapon;
	 String planet;
	 int age;
	 int power;
public void getDetails() {
	System.out.println("Enter Avenger Name: ");
	name=sc.next();
	System.out.println("Enter Avenger Age: ");
	age=sc.nextInt();
	System.out.println("Enter Avenger Planet: ");
	planet=sc.next();
	System.out.println("Enter Avenger Power: ");
	power=sc.nextInt();
	System.out.println("Enter Avenger Weapon: ");
	weapon=sc.next();
} 
public void displayDetails() {
	
	System.out.println("Avenger Name: "+name);
	System.out.println("Avenger Age: "+age);
	System.out.println("Avenger Planet: "+planet);
	System.out.println("Avenger Power: "+power);
	System.out.println("Avenger Weapon: "+weapon);
} 
}
