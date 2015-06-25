package design_patterns_study.strategy;

public class BlueBilledDuck extends Duck {
	
	public BlueBilledDuck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
		eatBehavior = new EatWithBeak();
	}

}
