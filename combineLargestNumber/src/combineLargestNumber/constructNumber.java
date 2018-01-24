package combineLargestNumber;

import java.util.ArrayList;

public class constructNumber {
	
	private static ArrayList<Integer> listOfNumbers;
	public constructNumber(ArrayList<Integer> listInput) {
		listOfNumbers =  listInput;
	}
	
	/**
	 *This is a method that generates the largest number combining the given integers
	 *@input : the list of non negative integers
	 */
	protected static void generateCombinationOfNumbers() {
		//TODO remove printing for debug - no need to print the input now:
	    System.out.println("printing list: ");
	    for(int j = 0; j < listOfNumbers.size(); j++) {
	    	System.out.print(listOfNumbers.get(j));
        }
    	//TODO  create combination algorithm
    	
		
	}

	/**
	 *This is a method that returns the generated largest number.
	 *@input : the list of non negative integers
	 *@return : combination of integers that give the largest result as String.
	 */
	protected static String getLargestCombination() {
		
		return "TEST";
	}
}
