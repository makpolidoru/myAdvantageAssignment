package combinelargestnumber;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

class ConcateTest {

	@Test
	void testConcateFromAssign_1() {
		//test case 1 : given [50, 2, 1, 9] it returns "95021" (9 + 50 + 2 + 1)
		
		ArrayList<Integer> listOfValues =new ArrayList<Integer>(Arrays.asList(50, 2, 1, 9));
		CombinationGeneration concateObj = new CombinationGeneration(listOfValues);
		String expectedResult = "95021";
		String actualResult = concateObj.generateLargestCombinationOfNumbers();
		assertEquals(expectedResult, actualResult);
		
	}
	
	@Test
	void testConcateFromAssign_2() {
		//test case 2: given [5, 50, 56] it returns "56550" (56 + 5 + 50)
		
		ArrayList<Integer> listOfValues =new ArrayList<Integer>(Arrays.asList(5, 50, 56));
		CombinationGeneration concateObj = new CombinationGeneration(listOfValues);
		String expectedResult = "56550";
		String actualResult = concateObj.generateLargestCombinationOfNumbers();
		assertEquals(expectedResult, actualResult);
		
	}
	
	@Test
	void testConcateFromAssign_3() {
		//test case 3: given 420, 42, 423] it returns "42423420" (42 + 423 + 420)
		ArrayList<Integer> listOfValues =new ArrayList<Integer>(Arrays.asList(420, 42, 423));
		CombinationGeneration concateObj = new CombinationGeneration(listOfValues);
		String expectedResult = "42423420";
		String actualResult = concateObj.generateLargestCombinationOfNumbers();
		assertEquals(expectedResult, actualResult);
		
	}

}
