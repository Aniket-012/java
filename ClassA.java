package customer;

import java.util.Scanner;

public class ClassA {
	void A() {	String names;
	String n[] = {"AUDI","MERCEDES","BMW"};
	
	for(int i=0;i<n.length;i++)
	System.out.println(n[i] + " ");
	System.out.println("Enter your Choice");
	String c;
	Scanner e = new Scanner(System.in);
	deal u = new deal();
	
	 c= e.next();

	 String z;
	 switch (c) {
	case "Audi":  u.audi();
	               break;
	case "Mercedes": u.mercedes();
		break;
		
	case "BMW": u.bmw();
		break;
	
		default:
			System.out.println("Not found in the following class");
		break;
	}
			 
	}
	
}

class deal
{	Scanner b= new Scanner(System.in);
	  String z;
	void audi() {	
		System.out.println("You Have Selected Audi");
        System.out.println("The price of this 3.8m");
        System.out.println("Do you still want to buy this car?");
        	z=b.next();      	
        if(z.equals("Yes"))
        {	
     	   System.out.println("Congratulations you have brought this car");
        }
        else
        {
     	   System.out.println("You can check other cars within your budget");
        }
		
	}
		void mercedes(){
		
		System.out.println("You Have Selected Mercedes");
	      System.out.println("The price of this 4m");
      System.out.println("Do you still want to buy this car?");
      z = b.next();
     if(z.equals("Yes"))
    {	
	   System.out.println("Congratulations you have brought this car");
    }
     else
     {
	   System.out.println("You can check other cars within your budget");
     }
	}
	
	void bmw()
	{

	 System.out.println("You Have Selected BMW");
	System.out.println("The price of this 3m");
    System.out.println("Do you still want to buy this car?");
    z = b.next();
    if(z.equals("Yes"))
    {	
 	   System.out.println("Congratulations you have brought this car");
    }
    else
    {
 	   System.out.println("You can check other cars within your budget");
    }
	}
	
	}
	


