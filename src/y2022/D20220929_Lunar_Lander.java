package y2022;
import java.util.Scanner;

public class D20220929_Lunar_Lander {


	public static void main(String[] args) {
		String [] playAgain = {"y","n"};
		boolean playAgainBool = true;
		
		while (playAgainBool){
			int groundDistance=10;
			String [] validMoves = { "x+","x-","y+","y-","t","d","n","i"};
			String [] distructMove = {"999"};
			String userMove="";
		
			int xTilt = randomInt(-10,10);
			int yTilt = randomInt(-10,10);
		
			while (groundDistance!=0) {

				System.out.println("Your luner lander is "+groundDistance+" from ground has a x-tilt of "+xTilt+" and a y-tilt of "+yTilt);
				System.out.print("press [i] for instruction, Your move:");
				userMove=getMove(validMoves);
				if (theMove(userMove,"i")) {gameInstruction();}
				else {
					if (theMove(userMove,"x+")) {xTilt++;}
					if (theMove(userMove,"x-")) {xTilt--;}
					if (theMove(userMove,"y+")) {yTilt++;}
					if (theMove(userMove,"y-")) {yTilt--;}
					if (theMove(userMove,"t")) {groundDistance+=groundDistance;}
					else {groundDistance--;}
						if (theMove(userMove,"d")) {
							System.out.println("Enter 999 to abort self destruct");
							userMove=getMove(distructMove);
						}
				}
 		}
		
		if (groundDistance==0 && xTilt ==0 && yTilt==0) {
			System.out.println("Successful landing");
		}
		else {
			System.out.println("You crashed!");
		}
		System.out.println("Play again y/n?");
		userMove=getMove(playAgain);
	    playAgainBool = (theMove(userMove,"y"))? true : false;
		}
	}
	
	public static void gameInstruction(){
	    System.out.println("Enter x+ to x-thrust +1, x- to x-thrust -1.");
	    System.out.println("Enter y+ to y-thrust +1, y- to y-thrust -1.");
	    System.out.println("To thurst up enter [t], to double distance.");
	    System.out.println("To do nothing n. To self destruct d");
	}
	
	public static int randomInt(int lowInt, int highInt) {
		double rangeDouble=(double)highInt-(double)lowInt;
		return (int) (lowInt+Math.random()*rangeDouble+0.5);
	}
	
	public static boolean theMove(String move, String cmove) {
		return move.equalsIgnoreCase(cmove);
	}
	
	public static String getMove(String [] moves) {

		Scanner keyboard = new Scanner(System.in);
        boolean validMove = false;
        String moveString="";
        String returnString="";
        int userMoveInt=0;
        while (validMove != true) {
            moveString = keyboard.nextLine();
            for (int x = 0; x < moves.length; x++) {
                if (moveString.equalsIgnoreCase(moves[x])) {
                    validMove = true;
                    userMoveInt = x;
                    returnString = moves[x];
                }
            }
            if (validMove != true) {
                System.out.println("Does not match valid moves, try again, valid moves are ");
                for (String s:moves) {
                	 System.out.print(s+" ");
                }
                System.out.println();
            }
        }
		return returnString;
		
	}
	
	

}
