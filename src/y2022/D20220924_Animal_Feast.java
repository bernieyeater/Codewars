package y2022;

public class D20220924_Animal_Feast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "xyaabbbccccdefww";
		String b = "xxxxyydssfsyyabklmopw";
		boolean bOut = false; 


		bOut = (a.charAt(0)==b.charAt(0) && a.charAt(a.length()-1)==b.charAt(b.length()-1)) ? true : false;
		System.out.println(bOut);
	}

}
/*
All of the animals are having a feast! Each animal is bringing one dish. There is just one rule: the dish must start and end with the same letters as the animal's name. For example, the great blue heron is bringing garlic naan and the chickadee is bringing chocolate cake.

Write a function feast that takes the animal's name and dish as arguments and returns true or false to indicate whether the beast is allowed to bring the dish to the feast.

Assume that beast and dish are always lowercase strings, and that each has at least two letters. beast and dish may contain hyphens and spaces, but these will not appear at the beginning or end of the string. They will not contain numerals.

Solution
public class Kata {

  public static boolean feast(String beast, String dish) {
    
    return beast.charAt(0)==dish.charAt(0) && beast.charAt(beast.length()-1) == dish.charAt(dish.length()-1);
    
  }
  
}

*/
