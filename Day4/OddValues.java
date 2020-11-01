
import java.util.Scanner;
public class OddValues{
	
	public static void main(String[] args) 
	{		
		Scanner sc = new Scanner(System.in);
		
		int [] a = new int[5];
		
		System.out.print(" Please Enter 5 elements of an Array  : ");
		for (int i = 0; i < 5; i++)
		{
			a[i] = sc.nextInt();
		}   

		//print odd  numbers
		System.out.println("Odd Numbers: ");
		for(int i = 0; i <5; i++)
		{
			if(a[i] % 2 != 0)			
			{
				System.out.print(a[i] + " ");
			}                    
		}		
	}
}