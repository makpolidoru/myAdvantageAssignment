package combineLargestNumber;
import java.util.ArrayList;
import java.util.Scanner;

public class combineLargestNumberLauncher {

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
							//TODO remove debugging comments later 
							 System.out.println("got in the list: "+token);	
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
			    	
			    	//TODO  call combination algorithm
			    	combinationGeneration computeCombo = new combinationGeneration(listNumbers);
			    	computeCombo.generateLargestCombinationOfNumbers();
			    	//TODO  print output
			    	//printing message to run again
				    System.out.println("\n > Try again? (Y/N)");
			    	String answer = scanner.nextLine();
			    	System.out.println(answer);
			    	
			    	if (answer.equalsIgnoreCase("Y")) runAgain = true;
			    	else runAgain = false;
				    
			    }
			    else {
			    	//if number were not legit
			    	System.out.println("Try again? (Y/N)");
			    	String answer = scanner.nextLine();
			    	//TODO remove the below print:
			    	System.out.println(answer);
			    	
			    	if (answer.equalsIgnoreCase("Y")) runAgain = true;
			    	else runAgain = false;
			    }	    
			}
			catch (IllegalArgumentException exception) {
	            // Catch expected IllegalArgumentExceptions.
	            
			}
		}
		scanner.close();
		System.out.println("\nProgram out of loop! Bye!");
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