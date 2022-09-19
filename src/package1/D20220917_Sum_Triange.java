package package1;

public class D20220917_Sum_Triange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int levels = 5;
		int theIndexer=0;
		int rightIndexer=4;
		int leftIndexer=2;

		int theSum = 0;
		int startnum = 0;
		int endnum =0;
		int leftNum=0;
		int rightNum=0;
		
		
		for (int n=0;n<levels; n++) {
			if (n>0) {
				//theSum = theSum+(n*2-1);
				startnum = startnum+leftIndexer;
				endnum = endnum+rightIndexer;
				leftIndexer=leftIndexer+2;
				rightIndexer=rightIndexer+2;

			}
			else {
				startnum=0;
				endnum=0;
			}
			theSum=0;
			leftNum=startnum+1;
			rightNum=endnum+1;
			for (int i=leftNum; i<=rightNum;i=i+2) {
				theSum = theSum + i;
			}
			System.out.println((leftNum)+","+(rightNum)+","+theSum);

		}
			//number[n]=n*2;
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

1,3,7,13,21
2,4,6,8

1,5,11,19,29
4,6,8,10


 */
