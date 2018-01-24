package combineLargestNumber;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class combinationGeneration {
	
	private static ArrayList<Integer> listOfNumbers;
	public combinationGeneration(ArrayList<Integer> listInput) {
		listOfNumbers =  listInput;
	}
	
	private static Comparator<Integer> sorter = new Comparator<Integer>(){
        @Override
        public int compare(Integer in1, Integer in2){
        	//convert to toString:
            String str1 = in1.toString();
            String str2 = in2.toString();
 
            //if the 2 numbers appear to be of the same length, then compare to keep the larger one.
            if(str1.length() == str2.length()){
                return str2.compareTo(str1);
            }
            else {
 
            	String initial1 = str1;
            	String initial2 = str2;
            	System.out.println(str1+" and second: "+str2);
	            //if they are not, we need to keep the one with the greater 1st digit, no matter the length.
	            //To compare, we need to bring them on the same length.
	            int max_length = Math.max(str1.length(), str2.length());
	            while(str1.length() < max_length * 2) str1 += initial1;
	            while(str2.length() < max_length * 2) str2 += initial2;
	 
	            return str2.compareTo(str1);
            }
        }
    };
	
	/**
	 *This is a method that generates the largest number combining the given integers
	 *@input : the list of non negative integers
	 */
	protected static void generateLargestCombinationOfNumbers() {
		//TODO remove printing for debug - no need to print the input now:
	    System.out.println("printing list as given in input: ");
	    for(int j = 0; j < listOfNumbers.size(); j++) {
	    	System.out.print(listOfNumbers.get(j));
        }
    	//TODO  create combination algorithm
	    int pos;
	    String concatenatedCombo = "";
	    Collections.sort(listOfNumbers, sorter);
	    //concatenate in one string value :
	   
        for(Integer token:listOfNumbers){
        	concatenatedCombo += token;
        }
        System.out.println("\nPrinting concatenated combination: "+concatenatedCombo);
       
    }
	   
	
//	/**
//	 *This is a method to find the first digit of any number in the list
//	 * @param num : the inout number 
//	 * @return integer : the 1 digit
//	 */
//	public static int firstDigit(int num)
//    {
//        // Remove last digit from number
//        // till only one digit is left
//        while (num >= 10) 
//            num /= 10;
//     
//        // return the first digit
//        return num;
//    }

	/**
	 *This is a method that returns the generated largest number.
	 *@input : the list of non negative integers
	 *@return : combination of integers that give the largest result as String.
	 */
	protected static String getLargestCombination() {
		
		return "TEST";
	}
}
