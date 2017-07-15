package customer;

import java.util.Scanner;

public class ClassC {
	void c() {	String names;
	String n[] = {"Zen","Alto","Maruti 800"};
	
	for(int i=0;i<n.length;i++)
	System.out.println(n[i] + " ");
	System.out.println("Enter your Choice");
	String c;
	Scanner edd = new Scanner(System.in);
	 c= edd.next();
	 deal3 p = new deal3();
	 
	 switch (c) {
	case "Zen": p.zen();
		
		break;
	case "alto": p.alto();
		break;
		
	case "Maruti": p.Maruti();
			break;
	default:
			System.out.println("Not found in the following class");
	
	}

}
}
class deal3
{
	String z;
	Scanner b = new Scanner(System.in);
	
	void zen(){
		System.out.println("You Have Selected Zen");
		System.out.println("The price of this 200k");
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
	void alto()
	{
		System.out.println("You Have Selected alto");
		System.out.println("The price of this 250k");
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
	
	void Maruti()
	{
		System.out.println("You Have Selected Maruti 800");
		System.out.println("The price of this 100k");
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