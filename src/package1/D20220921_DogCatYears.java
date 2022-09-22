package package1;

public class D20220921_DogCatYears {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int humanYears=10;
		int dogYears=0;
		int catYears=0;
		
		for (int i=0;i<humanYears;i++) {
			if (i==0) {dogYears=dogYears+15;catYears=catYears+15;}
			else if (i==1) {dogYears=dogYears+9;catYears=catYears+9;}
			else {
				dogYears=dogYears+5;
				catYears=catYears+4;
			}
		}
		//return new int[] {humanYears,catYears,dogYears};
		System.out.println(humanYears+" "+catYears+" "+dogYears);
	}
}
/*
 * Kata Task
I have a cat and a dog.

I got them at the same time as kitten/puppy. That was humanYears years ago.

Return their respective ages now as [humanYears,catYears,dogYears]

NOTES:

humanYears >= 1
humanYears are whole numbers only
Cat Years
15 cat years for first year
+9 cat years for second year
+4 cat years for each year after that
Dog Years
15 dog years for first year
+9 dog years for second year
+5 dog years for each year after that

From Others
public class Dinglemouse {
  public static int[] humanYearsCatYearsDogYears(final int y) {
    return new int[]{y,y==1?15:16+4*y,y==1?15:14+5*y};
  }
}

public class Dinglemouse {

  public static int[] humanYearsCatYearsDogYears(final int humanYears) {
     int catYears =0, dogYears = 0;
        switch (humanYears) {
            default:
                catYears = 4 * (humanYears - 2);
                dogYears = 5 * (humanYears - 2);
            case 2:
                catYears += 9;
                dogYears += 9;
            case 1:
                catYears += 15;
                dogYears += 15;
        }
    return new int[]{humanYears, catYears, dogYears};
  }

}

*/
