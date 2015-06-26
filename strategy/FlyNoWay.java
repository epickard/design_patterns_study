package design_patterns_study.strategy;

public class FlyNoWay implements FlyBehavior {
	
	public void fly() {
		//do nothing. This implementation is for NOT flying.
		System.out.println("No flying.");
	}

}