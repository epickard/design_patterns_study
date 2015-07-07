package design_patterns_study.factory.candle_idiom;

public class SimpleCandleFactory {
	//Instance variable(s)
	Candle candle;
	
	//Factory has a create method which is the place where any instances are created so that the rest of the code can be instance-free
	public Candle createCandle(String type) {
		Candle candle = null;
		
		if (type.equals("jarCandle")) {
			candle = new JarCandle();
		} else if (type.equals("freeStandingCandle")){
			candle = new FreeStandingCandle();
		}
		
		return candle;
	}
}
