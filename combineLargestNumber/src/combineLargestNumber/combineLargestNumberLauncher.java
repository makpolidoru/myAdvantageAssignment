package combineLargestNumber;
import java.util.ArrayList;
import java.util.Scanner;

public class combineLargestNumberLauncher {

	public static void main(String[] args) {
		
		Boolean legitNumbers = true;
		ArrayList<Integer> listNumbers = new ArrayList<Integer>();
				
		System.out.println("Please provide a list of non negative integers, separated by comma. \nPress enter when finished.");
		/*Delimiter: use comma as delimiter */
		
		try {
			@SuppressWarnings("resource")
			Scanner numbersScanner=new Scanner(System.in).useDelimiter(","); //anything non-digit.
			String[] tokens = numbersScanner.nextLine().split(",");
			String token; 
			int i = 0;
			
			while (legitNumbers && i<tokens.length) {
				for (i = 0; i < tokens.length; i++) {
					//inspect each given token. if token is a legit non negative integer, then add it to the list.
					token = tokens[i];
					if(inspectElements(token)) { 
						 System.out.println("got in: "+token);	
						 listNumbers.add(Integer.parseInt(token));
					 }
					 //if token is not an integer or is negative, then ignore alls et of numbers and clear contents of list.
					 else {
						 legitNumbers = false;
						 listNumbers.clear();
					 }
			     }
			}
			
		    numbersScanner.close();

		    
		    //constructNumber c = new constructNumber();
		    
		    //System.out.println("\nprogram out");
	    	    
	    	
		}
		catch (IllegalArgumentException exception) {
            // Catch expected IllegalArgumentExceptions.
            
		}
		//TODO -> in computing function throw exception when negative numbers, or decimal, are given
		/*since scanner considers everything non digit as delimiter*/

		//print what was the input
		//System.out.println(a + " " + b + " " + c);
		//TODO print the computed output of the function:
	} // end of main 


	public static boolean inspectElements(String tokenToInspect) 
	{
		 try
	        {
			 	// checking valid integer using parseInt() method
	            Integer.parseInt(tokenToInspect);
	            if (Integer.parseInt(tokenToInspect) < 0) {
	            	// this gets caught in the catch block
	            	throw new IllegalArgumentException("Only Positive Integers Should be inserted!"); 
	            }
	            
	            
	        } 
	        catch (NumberFormatException e) 
	        {
	            System.out.println(tokenToInspect + " is not a valid integer number");
	            return false;
	        }
	         			
		 	catch (IllegalArgumentException e) {
		 		System.out.println(e.getMessage());
		 		return false;
		 	}
		 return true;
	}
}
