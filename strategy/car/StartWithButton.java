package design_patterns_study.strategy.car;

public class StartWithButton implements StartBehavior {

	@Override
	public void start() {
		System.out.println("Press button to start engine.");
	}
}
