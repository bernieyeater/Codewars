package package1;
import java.util.Arrays;
import java.io.*;
import java.util.*;

public class D20220923_String_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "xyaabbbccccdefww";
		String b = "xxxxyyyyabklmopq";
		String c = a+b;
		String tempString=" ";
		String [] sSplit = c.split("",0);
		String sOut = "";
		Arrays.sort(sSplit);

		for (String i: sSplit) {
			if (i.charAt(0)!=tempString.charAt(0)) {
				sOut+=i;
				tempString=i;
			}
		}

		System.out.println(sOut);
	}

}
/*
Take 2 strings s1 and s2 including only letters from a to z. Return a new sorted string, the longest possible, containing distinct letters - each taken only once - coming from s1 or s2.

Examples:
a = "xyaabbbccccdefww"
b = "xxxxyyyyabklmopq"
longest(a, b) -> "abcdefklmopqwxy"

a = "abcdefghijklmnopqrstuvwxyz"
longest(a, a) -> "abcdefghijklmnopqrstuvwxyz"

Others
public class TwoToOne {
    
    public static String longest (String s1, String s2) {
        String s = s1 + s2;
        return s.chars().distinct().sorted().collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
    }
}
 */

