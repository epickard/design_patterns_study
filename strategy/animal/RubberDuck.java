package design_patterns_study.strategy.animal;

public class RubberDuck extends Duck {
	
	public RubberDuck() {
		quackBehavior = new Squeak();
		flyBehavior = new FlyNoWay();
		eatBehavior = new EatNoWay();
	}

}
