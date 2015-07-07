package design_patterns_study.factory.candle_idiom;

public class TestCandle {
	
	public static void main(String[] args) {
		//Create instances of the factory and the abstract class
		SimpleCandleFactory factory = new SimpleCandleFactory();
		CandleStore store = new CandleStore(factory);
		Candle candle;
		
		candle = store.orderCandle("jarCandle");
		System.out.println("Ordered candle: " + candle.toString());

		candle = store.orderCandle("freeStandingCandle");
		System.out.println("Ordered candle: " + candle.toString());
	}

}
