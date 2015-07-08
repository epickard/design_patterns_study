package design_patterns_study.factory.candle_factory;

public class ConventionalBasicCandle extends Candle {
	//This is one of the Product classes
	
	//Set the value of the parent class's name variable to a description of the candle in this class
	@Override
	public String getName() {
		name = "Conventional Basic Candle";
		return name;
	}
}
