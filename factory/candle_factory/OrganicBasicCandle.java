package design_patterns_study.factory.candle_factory;

public class OrganicBasicCandle extends Candle {
	//This is one of the Product classes
	
	//Set the value of the parent class's name variable to a description of the candle in this class
	public String getName() {
		name = "Organic Basic Candle";
		return name;
	}
}
