package learning;

public class ElectricVehicle extends Vehicle {

	double kilometersPerKilowattHour;
	double maxKilowattsInBattery;
	double currentKilowattsInBattery;
	
	public ElectricVehicle(String make, String model, double kilometersPerKilowattHour,double maxKilowattsInBattery ) {
		super(make, model);
		currentKilowattsInBattery=0;
	}
	
	public void charge(double kilowattsToCharge) {
		double capacityToCharge = this.maxKilowattsInBattery-this.currentKilowattsInBattery;
		if (kilowattsToCharge>capacityToCharge) {
			this.currentKilowattsInBattery=this.maxKilowattsInBattery;
		}
	}
	
	
	public boolean drive(double kilometers) {
		this.currentKilowattsInBattery -= (kilometers / this.kilometersPerKilowattHour);
		if (this.currentKilowattsInBattery < 0) {
			this.currentKilowattsInBattery = 0;
		}
		return super.drive(kilometers);
	}

	public double getKilometersPerKilowattHour() {
		return kilometersPerKilowattHour;
	}

	public double getMaxKilowattsInBattery() {
		return maxKilowattsInBattery;
	}

	public double getCurrentKilowattsInBattery() {
		return currentKilowattsInBattery;
	}
}
