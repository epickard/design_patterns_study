package design_patterns_study.strategy.animal;

public class FlyRocketPowered implements FlyBehavior {
	public void fly() {
		System.out.println("Fly with a rocket!");
	}
}
