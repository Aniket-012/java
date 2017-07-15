package customer;

import java.util.Scanner;

public class ClassB {
	void b() {	String names;
	String n[] = {"Honda City	","Swift"," Fortuner"};
	
	for(int i=0;i<n.length;i++)
	System.out.println(n[i] + " ");
	System.out.println("Enter your Choice");
	String c;
	Scanner ed = new Scanner(System.in);
	 c= ed.next();
	 deal2 i = new deal2();
	 
	 switch (c) {
	case "city": i.honda();
		
		break;
	case "swift": i.Swift();
		break;
		
	case "fortuner": i.fortuner();
		default:
			System.out.println("Not found in the following class");
		break;
	}

	}
	}

class deal2
{String z;
Scanner b = new Scanner(System.in);

	void honda()
	{
	
		
	 System.out.println("You Have Selected Honda City");
	System.out.println("The price of this 1m");
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
	
	void Swift()
	{

		System.out.println("You Have Selected Swift");
	System.out.println("The price of this 600k");
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
	void fortuner()
	{
		System.out.println("You Have Selected Fortuner");
		System.out.println("The price of this 2.5m");
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