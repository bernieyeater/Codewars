package package1;

public class D20220919_average_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] theArray= {1,2,3,4,5};
		double theAverage = 0;
		//theArray.length
		for (int i=0;i<theArray.length;i++){
			theAverage = theAverage+theArray[i];
		}
		theAverage = theAverage/theArray.length;
		System.out.println(theAverage);
	}
}
/*
import java.util.Arrays;
public class Kata{
  public static double find_average(int[] array){
    return Arrays.stream(array).average().orElse(0);
  }
}
*/