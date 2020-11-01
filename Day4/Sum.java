import java.util.Scanner; 
  
public class Sum { 
   
    public static void main(String[] args) { 
      
        int i,sum=0; 
        int arr[]=new int[5]; 
         
        System.out.println("Enter 5 numbers"); 
         
        Scanner sc=new Scanner(System.in); 
         
        for(i=0;i<5;++i) 
             arr[i]=sc.nextInt(); 
             sum=sum+arr[i]; 
       // for(i=0;i<5;++i) 
           
         
        System.out.println("Sum of numbers is:"+sum); 
    } 
     
} 