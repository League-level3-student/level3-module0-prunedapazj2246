package _01_Simple_Array_Algorithms;

import java.util.Random;

public class MoreArrayFun {
    //1. Create a main method to test the other methods you write.
	static Random r = new Random();
public static void main(String[]args) {
String[] array= new String[5];
array[0]="a";
array[1]="b";
array[2]="c";
array[3]="d";
array[4]="e";
printStrings(array);
printStrings2(array);
printStrings3(array);
printStrings4(array);
}


    //2. Write a method that takes an array of Strings and prints all the Strings in the array.

public static void printStrings(String arr[]) {
	for(int i=0;i < arr.length;i++) {
		System.out.println(arr[i]);
	}
}

    //3. Write a method that takes an array of Strings and prints all the Strings in the array
    //   in reverse order.

public static void printStrings2(String arr[]) {
	for(int i=arr.length-1;i >= 0;i--) {
		System.out.println(arr[i]);
	}
}

    //4. Write a method that takes an array of Strings and prints every other String in the array.
public static void printStrings3(String arr[]) {
	for(int i=0;i < arr.length;i+=2) {
		System.out.println(arr[i]);
	}
}

    //5. Write a method that takes an array of Strings and prints all the Strings in the array
    //   in a completely random order. Almost every run of the program should result in a different order.
public static void printStrings4(String arr[]) {
	for(int i=0;i < 10;i++) {
		System.out.println(arr[r.nextInt(5)]);
	}
}

}
