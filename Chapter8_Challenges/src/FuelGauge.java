
public class FuelGauge {
	private int currentAmount;
	private int increaseFuel;
	private int decreaseFuel;
	public FuelGauge(int currentAmount, int increaseFuel, int decreaseFuel) {
		super();
		this.currentAmount = currentAmount;
		this.increaseFuel = increaseFuel;
		this.decreaseFuel = decreaseFuel;
	}
	public int getCurrentAmount() {
		return currentAmount;
	}
	public void setCurrentAmount(int currentAmount) {
		this.currentAmount = currentAmount;
	}
	public int getIncreaseFuel() {
		return increaseFuel;
	}
	public void setIncreaseFuel(int increaseFuel) {
		this.increaseFuel = increaseFuel;
		increaseFuel = 0;
		//for(in)
	}
	public int getDecreaseFuel() {
		return decreaseFuel;
	}
	public void setDecreaseFuel(int decreaseFuel) {
		this.decreaseFuel = decreaseFuel;
	}

}
