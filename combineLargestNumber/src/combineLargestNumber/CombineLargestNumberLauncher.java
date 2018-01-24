package combineLargestNumber;
import java.util.ArrayList;
import java.util.Scanner;

public class CombineLargestNumberLauncher {

	public static void main(String[] args) {
		
		Boolean runAgain = true;
		Scanner scanner=new Scanner(System.in).useDelimiter(","); //open scanner.
		
		while (runAgain) {
			
			Boolean legitNumbers = true;
			ArrayList<Integer> listNumbers = new ArrayList<Integer>();
					
			System.out.println(" > Please provide a list of non negative integers, separated by comma. \nPress enter when finished.");
			/*Delimiter: use comma as delimiter */
			
			try {
				@SuppressWarnings("resource")
				String[] tokens = scanner.nextLine().split(",");
				String token; 
				int i = 0;
				
				while (legitNumbers && i<tokens.length) {
					for (i = 0; i < tokens.length; i++) {
						//inspect each given number/token. if token is a legit non negative integer, then add it to the list.
						token = tokens[i];
						if(inspectElements(token)) { 
							 listNumbers.add(Integer.parseInt(token));
						 }
						 //if token is not an integer or is negative, then ignore all set of numbers and clear contents of list.
						 else {
							 legitNumbers = false;
							 listNumbers.clear();
						 }
				     }
				}		    
	
			    if (legitNumbers) {
			    	
			    	//create object constructor in order to call combination algorithm
			    	CombinationGeneration computeCombo = new CombinationGeneration(listNumbers);
			    	//print final concatenated number :
			    	System.out.println("\nPrinting concatenated combination: "+ computeCombo.generateLargestCombinationOfNumbers());
			    	
			    	//printing message to run again
				    System.out.println("\n > Try again? (Y/N)");
			    	String answer = scanner.nextLine();
			    	if (answer.equalsIgnoreCase("Y")) runAgain = true;
			    	else runAgain = false;    
			    }
			    else {
			    	//if 1 or more numbers were not legit
			    	System.out.println("Give input properly.\nTry again? (Y/N)");
			    	String answer = scanner.nextLine();			    	
			    	if (answer.equalsIgnoreCase("Y")) runAgain = true;
			    	else runAgain = false;
			    }	    
			}
			catch (IllegalArgumentException exception) {
	            // Catch expected IllegalArgumentExceptions.
	            
			}
		}
		scanner.close();
		System.out.println("\nBye!");
	} // end of main 


	
	/**
	 *This is a method that inspects whether the given numbers meet the requirements,
	 *those being giving as input a banch of non negative integers
	 *@param tokenToInspect : every given number
	 *@return true/false : whether the number is legit or not.
	 */
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