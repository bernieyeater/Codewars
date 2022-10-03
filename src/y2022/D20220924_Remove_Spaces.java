package y2022;

import java.util.Arrays;

public class D20220924_Remove_Spaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String c = "8 8 Bi fk8h B 8 BB8B B B  B888 c hl8 BhB fd";

		String [] sSplit = c.split(" ",0);
		String sOut = "";
		for (String i:sSplit)
			sOut+=i;
		
		System.out.println(sOut);

	}

}
/*
Simple, remove the spaces from the string, then return the resultant string.

Others

class Kata {
    static String noSpace(final String x) {
        return x.replace(" ", "");
    }
}


*/
