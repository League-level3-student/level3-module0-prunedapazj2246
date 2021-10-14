package _00_Intro_To_Arrays;

import java.util.Arrays;
import java.util.Random;

public class _01_IntroToArrays {

	public static void main(String[] args) {
		Random r = new Random();

		// 1. declare and Initialize an array 5 Strings
		String[] soccerPlayers = new String[5];

		soccerPlayers[0] = "Lionel Messi";
		soccerPlayers[1] = "Cristiano Ronaldo";
		soccerPlayers[2] = "Romelu Lukaku";
		soccerPlayers[3] = "Angel DiMaria";
		soccerPlayers[4] = "Thiago SIlva";
		// 2. print the third element in the array
		System.out.println(soccerPlayers[2]);
		// 3. set the third element to a different value
		soccerPlayers[2] = "Sergio Aguero";
		// 4. print the third element again
		System.out.println(soccerPlayers[2]);
		// 5. use a for loop to set all the elements in the array to a string
		// of your choice
		for (int i = 0; i < soccerPlayers.length; i++) {
			soccerPlayers[i] = "Giovani Lo Celso";
		}
		// 6. use a for loop to print all the values in the array
		// BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < soccerPlayers.length; i++) {
			System.out.println(soccerPlayers[i]);
		}
		// 7. make an array of 50 integers
		int[] numbers = new int[50];
		// 8. use a for loop to make every value of the integer array a random
		// number
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = r.nextInt(1000);
		}
		// 9. without printing the entire array, print only the smallest number
		// on the array
		int min = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < min) {
				min = numbers[i];
			}
		}
		System.out.println(min);

		// 10 print the entire array to see if step 8 was correct
		System.out.println(Arrays.toString(numbers));
		// 11. print the largest number in the array.
		int max = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
			}
		}
		// 12. print only the last element in the array
		int last=numbers[49];
		for (int i = 0; i < numbers.length; i++) {
			if(numbers[i]== last) {
				System.out.println(last);
			}
			
		}
	}
}
