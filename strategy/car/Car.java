package design_patterns_study.strategy.car;

public class Car {
	//Declare instance variables
	StartBehavior startBehavior;
	HonkBehavior honkBehavior;
	String name;
	
	public void performStart() {
		startBehavior.start();
	}
	
	public void performHonk() {
		honkBehavior.honk();
	}
	
	//For sake of example, say all cars roll the same way, so there will be no variation between instances. 
	//In that case, the rolling behavior can be set in the superclass
	public void performRoll() {
		System.out.println("Car is rolling forward.");
	}

}
