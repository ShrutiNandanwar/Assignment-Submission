
package com.quizApp;
import java.util.Scanner;

public class Player{
String name;
int score=0;

public void getDetails(){
System.out.println("Enter player Name:");
Scanner sc=new Scanner(System.in);
name=sc.next();

}
}