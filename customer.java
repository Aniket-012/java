package customer;

 
	import java.util.Scanner;
	import java.util.*;
	public class customer {

		public static void main(String[] args) {
int ch; 
ClassA o = new ClassA();
ClassB a = new ClassB();
ClassC ca = new ClassC();

Scanner s = new Scanner(System.in);
System.out.println("Enter the Class whose car you wanna buy");
System.out.println("1.Class A \n 2.Class B\n 3.Class C");
ch= s.nextInt();

switch (ch)
		{
case 1:  System.out.println("Class A contains the following 3 cars" );
		 o.A();
		break;
case 2:  System.out.println("Class B contains the following 3 cars" );
			a.b();
			break;
			
case 3:  System.out.println("Class C contains the following 3 cars" );
			ca.c();
			break;
			
		}
System.out.println("RIDE SAFE :)");
		}
		
	 }
	
	 
	 
	  

		



