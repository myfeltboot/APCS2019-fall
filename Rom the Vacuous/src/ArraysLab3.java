
public class ArraysLab3 {

	public static void main(String[] args) {
		/*Carry out the following actions
Declare array a1 containing the values (5, 10, 15, 20, 25, 30, 35, 40) and array a2 containing the values (7, 14, 21, 28, 35, 42, 49, 56)
Form sumArr by calling the sum method with a1 and a2 as inputs
Declare int appendNum and set it to 200.
Form appendArr by calling the append method with a1 and appendNum as inputs
Declare int removeIdx and set it to 5.
Form removeArr by calling remove with a2 and removeIdx
Form sumOfEvens by calling sumEven with appendArr as the input
Call rotateRight with a1 as the input
On their own lines print out (use Arrays.toString to transform arrays into a printable strings) :
sumArr
appendArr
removeArr
sumOfEvens (an int you don�t need Arrays.toString)
a1
 */

	}
	// Write a method sum that accepts two arrays of integers arr1 and arr2 and returns an array of integers, 
	//in which every element is the sum of the elements at that index for the arrays arr1 and arr2. 
	//You can assume arrays arr1 and arr2 have at least one element each and are the same length.
	public static int[] sum(int[] arr1, int[] arr2) {
	int[] sumArray = new int[arr1.length];
	//process arrays here
	return sumArray;
	}
	
	//Write a method append that accepts an array of integers arr of length n and an integer num
	// and returns an array of integers of length n+1 that consists of the elements of arr with num appended to the end. 
	//You can assume array arr has at least one element.
	public static int[] append(int[] arr, int num) {
	
	}

	//Write a method sumEven that accepts an array of integers arr 
	//and returns an integer containing the sum of the elements at the even indices of arr. 
	//(That means elements at indices 0,2,4,6,8.)  You can assume arr has at least one element.
	public static int sumEven(int[] arr) {
	
	}
	
	//Write a method rotateRight that accepts an array of integers arr and does not return a value. 
	//The rotateRight method moves each element of arr one index to the right 
	//(element 0 goes to element 1, element 1 goes to element 2, �, element n-1 goes to element 0).
	//You can assume arr has at least one element.
	public static void rotateRight(int[] arr) {
		
	}
}
