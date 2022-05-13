package adding.java;
import java.util.*;


public class ifvote {
public static void main(String args[]) {
String country;

Scanner sc=new Scanner (System.in) ;
System.out.println("Enter your country");
country=sc.nextLine();
Scanner sc1=new Scanner (System.in);
System.out.println("enter your age");
int age=sc1.nextInt();

{
	if (age>=18) {
		System.out.println("you can put the vote");
	}
   else
   {
	   System.out.println("you are not eligible to put the vote");
   }
if(country=="india")
	
	System.out.println("out side of the india is not valid put to the vote");


}
}
}
