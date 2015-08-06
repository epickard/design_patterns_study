package design_patterns_study.strategy.car;

public class ModelTCar extends Car {

	//Constructor defines what kind of concrete behavior is assigned to each of the superclass's instance variables
	public ModelTCar() {
		name = "MODEL T";
		startBehavior = new StartWithCrank();
		honkBehavior = new HonkWithOldTimeyHorn();
	}
}
