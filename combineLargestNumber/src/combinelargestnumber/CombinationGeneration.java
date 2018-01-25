package combinelargestnumber;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CombinationGeneration {
	
	private static ArrayList<Integer> listOfNumbers;
	public CombinationGeneration(ArrayList<Integer> listInput) {
		listOfNumbers =  listInput;
	}
	
	private static Comparator<Integer> sorter = new IntegerComparator();
			
	private static class IntegerComparator implements Comparator<Integer> {
        @Override
        /*Implement Comparator ; custom ordering is needed*/
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
	 *This is a method that generates and returns the largest number combining the given integers
	 *@input : the list of non negative integers
	 *@return : combination of integers that give the largest result as String.
	 */
	protected  String generateLargestCombinationOfNumbers() {
	    String concatenatedCombo = "";
	    Collections.sort(listOfNumbers, sorter);
	    //concatenate in one string value :
        for(Integer token:listOfNumbers){
        	concatenatedCombo += token;
        }
       return concatenatedCombo;
       
    }
	   

}