package old;

import java.util.ArrayList;

public class Sandwich {
	String breadType;
	double baseCost;
	double costPerItem;
	ArrayList<String> item;
	
	public Sandwich(String breadType, double baseCost, double costPerItem, ArrayList<String> item) {
		this.breadType = breadType;
		this.baseCost = baseCost;
		this.costPerItem = costPerItem;
		this.item = item;
	}
	
	public String getBreadType() {
		return breadType;
	}

	public double getBaseCost() {
		return baseCost;
	}

	public double getCostPerItem() {
		return costPerItem;
	}

	public ArrayList<String> getItem() {
		return item;
	}

	}

	

	
	
		





	//public Sandwich() {
		
	//}
}
