package package1;

public class D20220914_PrinterError {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="aaaxbbbbyyhwawiwjjjwwm";
		int lengthOfString=s.length();
		int errorsPrinting=0;
		String [] sSplit = s.split("",0);
		System.out.println(lengthOfString+" "+ sSplit[1]);
		
		for (String var : sSplit) 
		{ 
		    if (var.charAt(0) >  'm' ) {errorsPrinting++;}
		}
		String outString = errorsPrinting+"/"+lengthOfString;
		System.out.println(outString);
				
	}

}


/*
In a factory a printer prints labels for boxes. For one kind of boxes the printer has to use colors which, for the sake of simplicity, are 
named with letters from a to m.

The colors used by the printer are recorded in a control string. For example a "good" control string would be aaabbbbhaijjjm meaning that
 the printer used three times color a, four times color b, one time color h then one time color a...

Sometimes there are problems: lack of colors, technical malfunction and a "bad" control string is produced e.g. aaaxbbbbyyhwawiwjjjwwm with
 letters not from a to m.

You have to write a function printer_error which given a string will return the error rate of the printer as a string representing a ration
 whose numerator is the number of errors and the denominator the length of the control string. Don't reduce this fraction to a simpler expression.

The string has a length greater or equal to one and contains only letters from ato z.

Examples:
s="aaabbbbhaijjjm"
printer_error(s) => "0/14"

s="aaaxbbbbyyhwawiwjjjwwm"

printer_error(s) => "8/22"

Best Practice:



public class Printer {
    
    public static String printerError(String s) {
        return s.replaceAll("[a-m]", "").length() + "/" + s.length();
    }
}


*/