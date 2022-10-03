package y2022;

public class D20220923_Summation_Progressive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int summationIn = 8;
		int returnInt=0;
		
		for (int i=0; i<=summationIn;i++) {
			returnInt=returnInt+i;
		}
		System.out.println(returnInt);
		
	}
}
/*
 * 
Write a program that finds the summation of every number from 1 to num. The number will always be a positive integer greater than 0.

For example:

summation(2) -> 3
1 + 2

summation(8) -> 36
1 + 2 + 3 + 4 + 5 + 6 + 7 + 8


Best Solution
public class GrassHopper {

    public static int summation(int n) {

        return  n*(n+1)/2;
    }
}
*/