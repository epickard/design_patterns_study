package design_patterns_study.strategy;

public class RubberDuck extends Duck {
	
	public RubberDuck() {
		quackBehavior = new Squeak();
		flyBehavior = new FlyNoWay();
		eatBehavior = new EatNoWay();
	}

}
