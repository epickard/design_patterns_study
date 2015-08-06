package design_patterns_study.strategy.car;

public class MiataCar extends Car {
	
	//Constructor defines what kind of concrete behavior is assigned to each of the superclass's instance variables
	public MiataCar () {
		name = "MIATA";
		startBehavior = new StartWithButton();
		honkBehavior = new HonkWithCarHorn();
	}

}
