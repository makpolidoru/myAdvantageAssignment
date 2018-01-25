package combinelargestnumber;

import java.util.ArrayList;
import java.util.Scanner;

public class CombineLargestNumberLauncher {

	public static void main(String[] args) {

		boolean runAgain = true;
		Scanner scanner = new Scanner(System.in);
		scanner.useDelimiter(",");

		while (runAgain) {

			boolean isLegitNumber = true;
			ArrayList<Integer> listNumbers = new ArrayList<Integer>();

			System.out.println(
					" > Please provide a list of non negative integers, separated by comma. \nPress enter when finished.");

			String[] inputNumbers = scanner.nextLine().split(",");
			String inputNumber;
			int position = 0;

			while (isLegitNumber && position < inputNumbers.length) {
				inputNumber = inputNumbers[position].trim();
				if (inspectElements(inputNumber)) {
					listNumbers.add(Integer.parseInt(inputNumber));
					position++;
				} else {
					isLegitNumber = false;
					listNumbers.clear();
				}

			}

			if (isLegitNumber) {
				CombinationGeneration computeCombo = new CombinationGeneration(listNumbers);
				System.out.println("\nConcatenated combination: " + computeCombo.generateLargestCombinationOfNumbers());
			} else {
				// if 1 or more numbers were not legit
				System.out.println("Give input properly.");
			}
			System.out.println("\n > Try again? (Y/N)");
			String answer = scanner.nextLine();
			if (answer.equalsIgnoreCase("Y"))
				runAgain = true;
			else
				runAgain = false;

		}
		scanner.close();
		System.out.println("\nBye!");
	}

	/**
	 * This is a method that inspects whether the given numbers meet the
	 * requirements, those being giving as input a banch of non negative integers
	 * 
	 * @param tokenToInspect
	 *            : every given number
	 * @return true/false : whether the number is legit or not.
	 * @throws NumberFormatException
	 */
	public static boolean inspectElements(String tokenToInspect) {
		try {
			Integer.parseInt(tokenToInspect);
			if (Integer.parseInt(tokenToInspect) < 0) {
				System.out.println(
						"Only positive Integers should be inserted! " + tokenToInspect + " is not a positive integer");
				return false;
			}
		} catch (NumberFormatException e) {
			System.out.println(tokenToInspect + " is not a valid integer number");
			return false;
		}
		return true;
	}
}