package design_patterns_study.strategy.car;

public class HonkWithCarHorn implements HonkBehavior {

	@Override
	public void honk() {
		System.out.println("Honk! Honk! Sounds like a car horn.");
	}

}
