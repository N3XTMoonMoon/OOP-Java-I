package SleepingGuide;
import java.util.Scanner;

public class SleepingGuide {

	public SleepingGuide() {
		
	}
	
	public void startGuide() {
		Scanner myObj = new Scanner(System.in);
		
	    System.out.println("Do you want to take a Nap?(y/n)");

	    
	    if(myObj.nextLine().equals("y")) {
	    	System.out.println("Do you have trouble sleeping at night?(y/n)");

	    	if(myObj.nextLine().equals("y")) {
	    		System.out.println("DON´t NAP!!!!!!!!!!!!!!!!");
	    		
	    	}else {
	    		System.out.println("Is it after 4pm?(y/n)");

			    
			    if(myObj.nextLine().equals("y")) {
			    	System.out.println("DON´t NAP!!!!!!!!!!!!!!!!");
			    	
			    }else {
			    	System.out.println("Are you at Work?(y/n)");

				    
				    if(myObj.nextLine().equals("y")) {
				    	System.out.println("Will your Boss get Mad if you nap?(y/n)");


				    	if(myObj.nextLine().equals("y")) {
				    		System.out.println("DON´t NAP!!!!!!!!!!!!!!!!");
					    	
				    	}else {
				    		System.out.println("Do you have 30 Min?(y/n)");


				    		if(myObj.nextLine().equals("y")) {
				    			
				    		}else {
				    			
				    		}
				    	}
				    }else {
				    	System.out.println("Do you have 30 Min?(y/n)");


				    	if(myObj.nextLine().equals("y")) {
				    		System.out.println("NAP AWAY!!!!");
				    		
				    	}else {
				    		System.out.println("Do you have 10 Min?(y/n)");


				    		if(myObj.nextLine().equals("y")) {
				    			System.out.println("NAP AWAY!!!!");
					    		
				    		}else {
				    			System.out.println("DON´t NAP!!!!!!!!!!!!!!!!");
						    	
				    		}
				    	}
				    }
			    }
	    	}
		    
	    }else {
	    	System.out.println("DON´t NAP!!!!!!!!!!!!!!!!");
	    }
	    
	    myObj.close();
	}
	
}

	
	
//System.out.println("?(y/n)");
//
//
//if(myObj.nextLine().equals("y")) {
//	
//}else {
//	
//}