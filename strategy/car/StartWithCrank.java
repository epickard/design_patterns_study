package design_patterns_study.strategy.car;

public class StartWithCrank implements StartBehavior {
	

	@Override
	public void start() {
		System.out.println("Turn starter crank.");
	}

}
