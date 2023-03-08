/**
 * CPSC 121 Lab03
 * @author CPSC 121 Instructors
 * @author David Garcia
 */
public class GoingLoopy {
	public static void main(String[] args) {
		/*
		 * TODO: Print multiples of 7 between 0 and 100 using a while loop
		 *
		 * 1. Use a while loop to evaluate every integer from 0 to 100
		 *    to see which are evenly divisible by 7.
		 * 2. An integer is divisible by 7 if it has a zero remainder
		 * 3. The modulo (%) is an operator that calculates the remainder of a division
		 * 4. You MUST USE the modulo to determine multiples in this lab
		 * 5. Print each multiple of 7 and keep track of the number of
		 *    multiples of 7 as you go. (Use the numMultiples variable initialized
		 *    below to keep track of the number of multiples.)
		 */
		System.out.println("Multiples of 7 between 0 and 100 (using while loop):");

		int numMultiples = 0; // Keeps track of the number of integers evenly divisible by 7.

		/*------------------ Your code goes here ------------------*/
		int number = 0;
		while (number <= 100) {
			
			if(number % 7 == 0) {
				System.out.println(number);
				numMultiples++;
			}

			number++;
		}


		/*---------------------------------------------------------*/

		// Prints the total number of multiples of 7.
		System.out.println("total: " + numMultiples);
		System.out.println();

		/*
		 * TODO: Print multiples of 7 between 0 and 100 using a for loop
		 *
		 * 1. Use a for loop to accomplish exactly the same task as in the previous
		 *    while loop.
		 */
		System.out.println("Multiples of 7 between 0 and 100 (using for loop):");

		numMultiples = 0; // Keeps track of the number of integers evenly divisible by 7.

		/*------------------ Your code goes here ------------------*/
		
		for (number = 0;number <= 100; number++) {
			
			if(number % 7 == 0) {
				System.out.println(number);
				numMultiples++;
			}

			
		}


		/*---------------------------------------------------------*/

		// Prints the total number of multiples of 7.
		System.out.println("total: " + numMultiples);
		System.out.println();

		/*
		 * TODO: Print a 2-dimensional table of values using a nested for loop
		 *
		 * 1. The outer loop will iterate from 1 to MAX_ROWS rows.
		 * 2. The inner loop will iterate from 1 to MAX_COLS columns.
		 * 3. Print each value in the table as the product of the row and column numbers.
		 *    (rowNumber * columnNumber).
		 * 4. Use println() and print() as appropriate
		 * 5. Use formatting characters like \t and \n to create columns and rows
		 */

		final int MAX_ROWS = 5;
		final int MAX_COLS = 10;

		System.out.println("Multiplication table:");
		/*------------------ Your code goes here ------------------*/
		for (int row = 1; row <= MAX_ROWS ; row++) {//Always associated with rows

			for(int column = 1; column <= MAX_COLS; column++) {//Always asociated with columns
				System.out.print(row * column + "\t");
			}
			System.out.println();
		}


		/*---------------------------------------------------------*/

		System.out.println();
	}
}
