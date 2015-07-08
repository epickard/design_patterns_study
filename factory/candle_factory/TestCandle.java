package design_patterns_study.factory.candle_factory;

public class TestCandle {
	
	public static void main(String[] args) {
		CandleStore orgStore = new CandleStoreOrganic();
		CandleStore convStore = new CandleStoreConventional();
		
		orgStore.orderCandle("basic");
		System.out.println("Factory pattern: Ordering the candle: " + orgStore.candleName);
		
		orgStore.orderCandle("lavender");
		System.out.println("Factory pattern: Ordering the candle: " + orgStore.candleName);
		
		convStore.orderCandle("basic");
		System.out.println("Factory pattern: Ordering the candle: " + convStore.candleName);

	}
}
