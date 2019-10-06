import java.util.Scanner;
public class CarInstrucmentDemo {
public static void main(String[] args) {
//	double ca = 1;
//	double cm = 99999;
//	System.out.println("The Amount of Fuel: " + ca);
//	System.out.println("The current Mile is: " + cm);
	double currentfuel;
	double currentmile;
	Scanner keyboard = new Scanner(System.in);
	System.out.print("Create The Amount of Fuel: ");
	currentfuel = keyboard.nextDouble();
	System.out.print("Create The current Mile is: ");
	currentmile = keyboard.nextDouble();
	
	
	
//	System.out.println("Value Fuel is increased by 1 is: " + FuelGauge.IncreaseFuel(currentfuel));
//	System.out.println("Value Fuel is decreased by 1 is: " + FuelGauge.DecreaseFuel(currentfuel));
//	System.out.println("Value Mile is increased by 1 is: " + Odometer.IncreaseMile(currentmile));
	
	// able to work until car out of fuel
//	Odometer.AbleWork(currentfuel);
	//value fill to full
	
	
//	for(double i= currentfuel; i<15;i++) {
//		double puttingFuel =15- (FuelGauge.IncreaseFuel(i)-1);
//		System.out.println("Value of Fuel you can put is: "+ puttingFuel); 
//	}
	
	
	//increments the odometer until the car runs out of fuel
	
	for(double j = currentfuel; j>0;j--) {
		System.out.println("Value Fuel in stock is: "+j);
		System.out.println("------------------------YOU CAN GO------------------------");
			for(double i= 1; i<= currentfuel *24;i++) {
		System.out.println("Miles you can go is: "+ i);
		System.out.println("Current Mileage changes to: "+ (currentmile+i));
	}
		System.out.println("------------------------THE VALUE OF FUEL CHANGED------------------------");
		System.out.println("Current value's'fuel in stock is: "+ (j-1));
	}
}
}