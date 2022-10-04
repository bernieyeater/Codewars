package y2022;

public class D20221004_i_love_you {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nb_petals=6;
	    String r="";
			int nbRemainder = nb_petals%6;
			switch (nbRemainder) {
			case 1: r="I love you";break;
			case 2: r="a little";break;
			case 3: r="a lot";break;
			case 4: r="passionately";break;
			case 5: r="madly";break;
			case 6: r="not at all";break;}
	    //return r;
			System.out.println(r);
	}

}
/*
Who remembers back to their time in the schoolyard, when girls would take a flower and tear its petals, saying each of the following phrases each time a petal was torn:

"I love you"
"a little"
"a lot"
"passionately"
"madly"
"not at all"
If there are more than 6 petals, you start over with "I love you" and so on.

When the last petal was torn there were cries of excitement, dreams, surging thoughts and emotions.

Your goal in this kata is to determine which phrase the girls would say at the last petal for a flower of a given number of petals. The number of petals is always greater than 0.

others
public class Sid {
    public static String howMuchILoveYou(int nb_petals) {
    
      String[] arr ={"not at all", "I love you",  "a little", "a lot", "passionately", "madly"};
    
      return arr[nb_petals%6];
    }
}
*
*/
