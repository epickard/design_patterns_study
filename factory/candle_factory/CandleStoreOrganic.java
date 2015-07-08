package design_patterns_study.factory.candle_factory;

public class CandleStoreOrganic extends CandleStore {
	//This is one of the Creator classes

	//This is where the factory is
	public Candle createCandle(String item) {
		if (item.equals("basic")) {
			return new OrganicBasicCandle();
		} else if (item.equals("lavender")) {
			return new OrganicLavenderCandle();
		}
			else return null;
	}
}
