package package1;

public class D20220912_ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
				String inString="Bernie";
			    String outString="";
	    	    
			      for (int i = inString.length()-1; i >=0; i--) {
			          outString = outString+inString.charAt(i);
			       }

			    System.out.println(outString);
	}

}


/*   Solutions from others, learned reverse funtion.
import java.lang.StringBuilder;

public class Kata
{
  public static String reverseWords(final String original)
  { 
    String[] array = original.split(" ");
    
    if(array.length == 0) 
        return original;
    
    
    int i = 0;
    for(String string : array){
        array[i] = new StringBuilder(string).reverse().toString();
        i++;
    }
    
    return String.join(" ",array);
  }
}
*/