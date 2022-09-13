package package1;

import java.util.Arrays;

public class D20220912_ReverseNumber {

	public static void main(String[] args) {
		int intIn = 645124;
		String inString = String.valueOf(intIn);
		int[] intArray = new int[inString.length()];
		String outString = "";
		int outInt=0;
		
		for (int i=0; i<inString.length();i++ ) {
			intArray[i] = inString.charAt(i);
		}
		Arrays.sort(intArray);
	      for (int i = inString.length()-1; i >=0; i--) {
	    	  outString = outString+(char)intArray[i];
	       }

	      outInt=Integer.parseInt(outString);
		System.out.println(outInt);
		
	}
	
}
/*  Best solution
import java.util.*;

public class DescendingOrder {
  public static int sortDesc(final int num) {
    String[] numbers = (Integer.toString(Integer.valueOf(num))).split("");
    Arrays.sort(numbers);
    
    String result = "";
    
    for(String s : numbers)
    {
      result = s + result;
    }
    
    return Integer.parseInt(result);
  }
}*/