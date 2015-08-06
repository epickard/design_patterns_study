package design_patterns_study.strategy.car;

public class StartWithKey implements StartBehavior {

	@Override
	public void start() {
		System.out.println("Insert key into ignition and turn.");
	}

}
