package package1;

public class D20220917_Sum_Triange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number[] = null; 
		number = new int[20];
		
		int indexer[] = {1,3,6,10,15};
		int theIndexer=1;
		int levels = indexer[theIndexer];
		int theSum = 0;
		
		for ()
		
		for (int n=1;n<=levels; n
			theSum = theSum+(n*2-1);
			System.out.println(theSum);
			//number[n]=n*2;
		}
	}
}

/*
Given the triangle of consecutive odd numbers:

             1
          3     5
       7     9    11
   13    15    17    19
21    23    25    27    29
...
Calculate the sum of the numbers in the nth row of this triangle (starting at index 1) e.g.: (Input --> Output)

1 -->  1
2 --> 3 + 5 = 8
 */
