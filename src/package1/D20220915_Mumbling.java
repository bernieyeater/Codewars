package package1;

public class D20220915_Mumbling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abcd";
		String [] sSplit = s.split("",0);
		String sOut="";
		for (int a=0; a<s.length(); a++) {
			sOut = sOut+sSplit[a].toUpperCase();
			if (a>0) {
				for (int b=1; b<=a; b++) {
					sOut = sOut + sSplit[a].toLowerCase();
				}
			}
			//if (a<(s.length()-1))  {sOut = sOut + "-";}
			sOut = a<s.length()-1 ? sOut + "-" :sOut;

		}
		System.out.println(sOut);
	}
}


/*Problem 
 * This time no story, no theory. The examples below show you how to write function accum:
 

Examples:
accum("abcd") -> "A-Bb-Ccc-Dddd"
accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
accum("cwAt") -> "C-Ww-Aaa-Tttt"
The parameter of accum is a string which includes only letters from a..z and A..Z.

Best Practice from Others
public class Accumul {
  public static String accum(String s) {
    StringBuilder bldr = new StringBuilder();
    int i = 0;
    for(char c : s.toCharArray()) {
      if(i > 0) bldr.append('-');
      bldr.append(Character.toUpperCase(c));
      for(int j = 0; j < i; j++) bldr.append(Character.toLowerCase(c));
      i++;
    }
    return bldr.toString();
  }
}


*/