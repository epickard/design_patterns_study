package design_patterns_study.strategy;

public class MallardDuck extends Duck {
	
	//Constructor
	public MallardDuck() {
		//Delegate to these Classes through the specified instances (this is how we associate quack() and fly() with a specific implementation)
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
		eatBehavior = new EatWithBeak();
	}
}
