package package1;
import java.util.Arrays;

public class D20220923_Min_max_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] list = {-52, 56, 30, 29, -54, 0, -110};
	    Arrays.sort(list);
	    int returnInt = list[list.length-1];
	    System.out.println(returnInt);
	    returnInt = list[0];
	    System.out.println(returnInt);
	}

}
/*
 * Your task is to make two functions ( max and min, or maximum and minimum, etc., depending on the language ) that receive a list of integers as input, and return the largest and lowest number in that list, respectively.

Examples (Input -> Output)
* [4,6,2,1,9,63,-134,566]         -> max = 566, min = -134
* [-52, 56, 30, 29, -54, 0, -110] -> min = -110, max = 56
* [42, 54, 65, 87, 0]             -> min = 0, max = 87
* [5]                             -> min = 5, max = 5
Notes
You may consider that there will not be any empty arrays/vectors.
*/
