package y2022;

public class D20221005_eight_or_nine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=22;
		int outInt=0;
		outInt = (n%2 == 0) ? n*8 : n*9;
		System.out.println(outInt);
	}

}

/*This kata is about multiplying a given number by eight if it is an even number and by nine otherwise.
 Others * 
 * public class Sid {
    public static int simpleMultiplication (int n) {
        return n % 2 == 0 ? n * 8 : n * 9;
    }
}
 */
