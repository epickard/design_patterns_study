package design_patterns_study.decorator.bracelet;

public class CharmBracelet extends Bracelet {
	
	//Constructor that sets the value of the superclass's braceletName variable to an object-specific value
	public CharmBracelet() {
		braceletName = "Charm Bracelet";
	}

	@Override
	//Override the superclass's cost() method to the price of the Charm Bracelet
	public double cost() {
		return 12.99;
	}
}
