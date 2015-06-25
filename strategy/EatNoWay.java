package design_patterns_study.strategy;

public class EatNoWay implements EatBehavior {

	public void eat() {
		System.out.println("No eating.");
	}
}
