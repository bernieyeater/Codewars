package y2022;

public class D20220920_Checkforfactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int base=10;
		int factor=2;
		int remainder = base%factor;
		boolean isAFactor = false;
		if (remainder == 0){ isAFactor = true;};
		System.out.println(isAFactor);
		
	}

}

/*
public class Kata {
    public static boolean checkForFactor(int base, int factor) {
        return base % factor == 0;
    }
}
 */
