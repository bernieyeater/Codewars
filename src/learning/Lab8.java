package learning;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

class Lab8 {

	public static void main(String[] args) throws IOException {
		String fileName = "mcdonalds.txt";
		String [] menuDescripition = {"Burger", "Fry", "Soda"};
		double [] menuCost = {2.01, 1.01, 0.50};


			FileWriter fileWrite = new FileWriter(fileName);

			PrintWriter printWriter = new PrintWriter(fileName);

		
		for (int i = 0; i < menuDescripition.length; i++) {
			printWriter.println(menuDescripition[i]);
			printWriter.println(menuCost[i]);
		}
		printWriter.close();

	}
	
	

}


