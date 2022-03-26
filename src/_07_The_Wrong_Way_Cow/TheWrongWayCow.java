/*
 * https://www.codewars.com/kata/the-wrong-way-cow
 * 
 * Task
 * Given a field of cows find which one is the Wrong-Way Cow and return her
 * position.
 * 
 * Notes:
 * 
 * There are always at least 3 cows in a herd
 * There is only 1 Wrong-Way Cow!
 * Fields are rectangular
 * The cow position is zero-based [col,row] of her head (i.e. the letter c)
 * Examples
 * Ex1
 * 
 * cow.cow.cow.cow.cow
 * cow.cow.cow.cow.cow
 * cow.woc.cow.cow.cow
 * cow.cow.cow.cow.cow
 * Answer: [6,2]
 * 
 * Ex2
 * 
 * c..........
 * o...c......
 * w...o.c....
 * ....w.o....
 * ......w.cow
 * Answer: [8,4]
 * 
 * Notes
 * The test cases will NOT test any situations where there are "imaginary" cows,
 * so your solution does not need to worry about such things!
 * 
 * To explain - Yes, I recognize that there are certain configurations where an
 * "imaginary" cow may appear that in fact is just made of three other "real" cows.
 * 
 * In the following field you can see there are 4 real cows (3 are facing south and
 * 1 is facing north). There are also 2 imaginary cows (facing east and west).
 * 
 * ...w...
 * ..cow..
 * .woco..
 * .ow.c..
 * .c.....
*/

package _07_The_Wrong_Way_Cow;

public class TheWrongWayCow {

	public static int[] findWrongWayCow(final char[][] field) {
		// Fill in the code to return the [col, row] coordinate position of the
		// head (letter 'c') of the wrong way cow!
		int cowLeft = 0;
		int cowRight = 0;
		int cowDown = 0;
		int cowUp = 0;
		for (int row = 0; row < field.length; row++) {

			for (int col = 0; col < field[row].length; col++) {
				if (field[row][col] == 'c') {
					if (col + 1 < field[row].length && field[row][col + 1] == 'o') {
						cowLeft += 1;
					}
					if (col - 1 >= 0 && field[row][col - 1] == 'o') {
						cowRight += 1;
					}
					if (row + 1 < field.length && field[row + 1][col] == 'o') {
						cowDown += 1;

					}
					if (row - 1 >= 0 && field[row - 1][col] == 'o') {
						cowUp += 1;
					}
				}

			}
			System.out.println(cowRight+ " " + cowLeft + " " + cowDown+ " " + cowUp);
			
		}
		System.out.println(cowRight);
		if (cowLeft == 1) {
			for (int row = 0; row < field.length; row++) {

				for (int col = 0; col < field[row].length; col++) {
					if (col + 1 < field[row].length && field[row][col] == 'c' && field[row][col+1]=='o') {
						System.out.println(row +" "+ col);
						return new int[] { col, row };
					}
				}
			}
		}

		else if (cowRight == 1) {
			for (int row = 0; row < field.length; row++) {

				for (int col = 0; col < field[row].length; col++) {
					if (col - 1 >= 0 && field[row][col] == 'c' && field[row][col-1]=='o') {
						System.out.println(row +" "+ col);
						return new int[] { col, row };
					}
				}
			}
		} else if (cowDown == 1) {
			for (int row = 0; row < field.length; row++) {

				for (int col = 0; col < field[row].length; col++) {
					if (row + 1 < field.length && field[row][col] == 'c' && field[row+1][col]=='o') {
						System.out.println(row +" "+ col);
						return new int[] { col, row };
					}
				}
			}
		} else if (cowUp == 1) {
			for (int row = 0; row < field.length; row++) {

				for (int col = 0; col < field[row].length; col++) {
					if (row-1 >= 0 && field[row][col] == 'c' && field[row-1][col]=='o') {
						System.out.println(row +" "+ col);
						return new int[] { col, row };
					}
				}
			}
		}
		
		return null;
	}
}
