package design_patterns_study.factory.candle_idiom;

public abstract class Candle {
	
	//Declare abstract methods for concrete classes to implement
	public abstract void selectWaxColor();
	
	public abstract void heatWax();
	
	public abstract void insertWick();
	
	public abstract void moldCandle();
	
	//Concrete methods should override toString with name of candle type so it can be printed out in test class
	public abstract String toString();
}
