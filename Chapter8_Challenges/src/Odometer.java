
public class Odometer {
	private double currentMile;
	private double odometer = 999.999;
	private FuelGauge fuelgauge;
	public double getCurrentMile() {
		return currentMile;
	}
	public void setCurrentMile(double currentMile) {
		this.currentMile = currentMile;
	}
	public double getOdometer() {
		return odometer;
	}
	public void setOdometer(double odometer) {
		this.odometer = odometer;
	}
	public FuelGauge getFuelgauge() {
		return fuelgauge;
	}
	public void setFuelgauge(FuelGauge fuelgauge) {
		this.fuelgauge = fuelgauge;
	}
}
