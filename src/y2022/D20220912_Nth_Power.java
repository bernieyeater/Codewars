package y2022;

public class D20220912_Nth_Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = {3,1,2,2};
		int power = 4;
		int intOut=0;
		
		if (intArray.length>power)  {  intOut = (int) Math.pow(intArray[power], power);}
		else {intOut = -1;}
		System.out.println(intOut);
	}

}




/*
You are given an array with positive numbers and a non-negative number N. You should find the N-th power of the element in the array with the index N. If N is outside of the array, then return -1. Don't forget that the first element has the index 0.

Let's look at a few examples:

array = [1, 2, 3, 4] and N = 2, then the result is 3^2 == 9;
array = [1, 2, 3] and N = 3, but N is outside of the array, so the result is -1.
*/