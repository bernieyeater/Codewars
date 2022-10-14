package learning;

public class Vehicle {

	private String make;
	private String model;
	private double odometer;

	public static void main(String[] args) {

	}

	public Vehicle(String make, String model) {
		super();
		this.make = make;
		this.model = model;
		odometer=0;
	}

	private boolean kilometersDriven(double kilometers) {

		this.odometer += kilometers;
		return true;
	}

	public double getOdometer() {
		return odometer;
	}
	
	public void setOdometer(double odometer) {
		this.odometer=odometer;
	}
	
	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	public boolean drive( double kilometers) {
		this.odometer+=kilometers;
		return true;
	}
}
