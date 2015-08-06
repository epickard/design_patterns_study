package design_patterns_study.strategy.car;

public class HonkWithOldTimeyHorn implements HonkBehavior {

	@Override
	public void honk() {
		System.out.println("ArOOOOOOOgaaaaah! Sounds like an old-timey car.");
	}

}
