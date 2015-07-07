package design_patterns_study.factory.candle_idiom;

public class CandleStore {
	//Instance variable(s)
	SimpleCandleFactory factory;
	
	//Constructor takes a parameter of the factory type and sets instance variable to the passed-in factory
	public CandleStore(SimpleCandleFactory factory) {
		this.factory = factory;
	}
	
	public Candle orderCandle(String type) {
		Candle candle;
		
		candle = factory.createCandle(type);
		
		candle.selectWaxColor();
		candle.heatWax();
		candle.insertWick();
		candle.moldCandle();
		
		return candle;
	}
}
