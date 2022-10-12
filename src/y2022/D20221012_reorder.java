package y2022;

public class D20221012_reorder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] arr = {"head", "body", "tails"};
		String [] outArr = {"","",""};
		String [] arr1 = {"tail", "body", "head"};
		String [] arr2 = {"tails", "body", "heads"};
		String [] arr3 = {"bottom", "middle", "top"};
		String [] arr4 = {"lower legs", "torso", "upper legs"};
		String [] arr5 = {"sky", "rainbow", "ground"};
		
		
		for (String s:arr) {
			if (s.equalsIgnoreCase("head")) outArr = arr1;
			if (s.equalsIgnoreCase("heads")) outArr = arr2;
			if (s.equalsIgnoreCase("bottom")) outArr = arr3;
			if (s.equalsIgnoreCase("torso")) outArr = arr4;
			if (s.equalsIgnoreCase("rainbow")) outArr = arr5;
		}
		//return outArr;
		System.out.println(outArr[0]+" "+outArr[1]+" "+outArr[2]);
	}

}
/*
You're at the zoo... all the meerkats look weird. Something has gone terribly wrong - someone has gone and switched their heads and tails around!

Save the animals by switching them back. You will be given an array which will have three values (tail, body, head). It is your job to re-arrange the array so that the animal is the right way round (head, body, tail).

Same goes for all the other arrays/lists that you will get in the tests: you have to change the element positions with the same exact logics

Simples!
Others:
public class WrongEndHead {
  public static String[] fixTheMeerkat(String[] arr) {
    return new String[] {arr[2], arr[1], arr[0]};
  }
}
*/