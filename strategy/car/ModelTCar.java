package design_patterns_study.strategy.car;

public class ModelTCar extends Car {

	//Constructor defines what kind of concrete behavior is assigned to each of the superclass's instance variables
	public ModelTCar() {
		name = "The name of this car is MODELT";
		startBehavior = new StartWithCrank();
		honkBehavior = new HonkWithOldTimeyHorn();
	}
}
