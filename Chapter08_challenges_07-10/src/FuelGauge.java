
public class FuelGauge {
private double currentAmount;

public void setCurrentAmount(double currentAmount) {
	this.currentAmount = currentAmount;
}

public double getCurrentAmount() {
	return currentAmount;
}

public FuelGauge(double currentAmount) {
	super();
	this.currentAmount = currentAmount;
}

public static double IncreaseFuel(double ca) {
	if (0< ca && ca <15) {
		ca = ca + 1;
	}else if(ca==15) {
		System.out.println("Fuel is full!");
		return 0;
	}else {
		System.out.println("Invalid Value!");
		return 0;
	}
	return ca ;
}

public static double DecreaseFuel(double ca) {
	if (ca>0 && ca<15 ) {
		ca = ca-1;
	}else if (ca == 0) {
		System.out.println("Out of Value!" );
		return 0;
	}else {
		System.out.println("Invalid Value!");
		return 0;
		
	}
	return ca;
}

}






