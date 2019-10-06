
public class Odometer {
private static double AW = 0;
private double currentMile;
private FuelGauge fuelgauge;	

public double getCurrentMile() {
	return currentMile;
}

public void setCurrentMile(double currentMile) {
	this.currentMile = currentMile;
}



public Odometer(double currentMile, FuelGauge fuelgauge) {
	super();
	this.currentMile = currentMile;
	this.fuelgauge = fuelgauge;
}

public static double IncreaseMile(double cm) {
	if(cm < 999999) {
		cm =cm +1;
	}
	else if (cm == 999999) {
		cm = 0;
	}
	else {
		System.out.println("Invalid Mileage in the Car!");
	}
	return cm;
}
public static void AbleWork(double ca) {
	if (ca <= 0) {
		System.out.println("Can not work!");
	}else {
		System.out.println("Able to work of car is: " + ca*24);
	}
	
}
}
