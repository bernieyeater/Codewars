package y2022;

public class D20220918_Rev_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="world";
		String [] sSplit = s.split("",0);
		String sOut ="";
		
		for (int x = s.length()-1;x>=0;x--) {
			sOut=sOut+sSplit[x];
		}
		System.out.println(sOut);
	}

}
/*
Complete the solution so that it reverses the string passed into it.

'world'  =>  'dlrow'
'word'   =>  'drow'
*/