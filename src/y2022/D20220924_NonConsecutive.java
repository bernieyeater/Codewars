package y2022;

public class D20220924_NonConsecutive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] inArray = {1,2,3,4,5,6,7};
		int aInt = 0;
		int bInt =1;
    int outInt=0;
		boolean increment=true;
		while (bInt<inArray.length && increment) {
			if (inArray[aInt]+1==inArray[bInt]) {
				aInt++;bInt++;
			}
			else {
				increment=false;
			}
		}
		//System.out.println(aInt+" "+bInt);
		outInt = (bInt==inArray.length) ? null: bInt;
		if (bInt==inArray.length) System.out.println("It is null"+inArray.length);
		System.out.println(outInt);
	}
}
/*

Your task is to find the first element of an array that is not consecutive.

By not consecutive we mean not exactly 1 larger than the previous element of the array.

E.g. If we have an array [1,2,3,4,6,7,8] then 1 then 2 then 3 then 4 are all consecutive but 6 is not, so that's the first non-consecutive number.

If the whole array is consecutive then return null2.

The array will always have at least 2 elements1 and all elements will be numbers. The numbers will also all be unique and in ascending order. The numbers could be positive or negative and the first non-consecutive could be either too!

If you like this Kata, maybe try this one next: https://www.codewars.com/kata/represent-array-of-numbers-as-ranges

1 Can you write a solution that will return null2 for both [] and [ x ] though? (This is an empty array and one with a single number and is not tested for, but you can write your own example test. )


Others

class FirstNonConsecutive {
    static Integer find(final int[] array) {
       for(int i = 1; i < array.length; ++i)
       {
         if(array[i] - array[i - 1] != 1)
         {
           return array[i];
          }
        }
       return null;
    }
}
 */

