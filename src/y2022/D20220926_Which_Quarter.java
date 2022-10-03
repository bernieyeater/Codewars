package y2022;

public class D20220926_Which_Quarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month=12;
		int quarter = 0;
		
		if (month>0) quarter=1;
		if (month>3) quarter=2;
		if (month>6) quarter=3;
		if (month>9) quarter=4;
		//return quarter;

	}

}
/*
Given a month as an integer from 1 to 12, return to which quarter of the year 
it belongs as an integer number.

For example: month 2 (February), is part of the first quarter; month 6 (June), 
is part of the second quarter; and month 11 (November), is part of the fourth quarter.

Others
public class Kata {
    public static int quarterOf(int month) {
        return (month+2)/3;
    }
}

*/
