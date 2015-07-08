package design_patterns_study.factory.candle_factory;

public abstract class CandleStore {
	//This is one of the Creator classes
	
	//Instance variable(s)
	String candleName;
	
	//Factory method for subclasses to define
	public abstract Candle createCandle(String type);
	
	//This is where the candle created by the factory is manipulated
	public Candle orderCandle(String type) {
		Candle candle = createCandle(type);
		candleName = candle.getName();
		return candle;
	}

}
