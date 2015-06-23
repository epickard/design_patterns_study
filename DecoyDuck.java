package design_patterns_study;

public class DecoyDuck extends Duck {
	
	public DecoyDuck() {
		//Delegate to the specified classes
		quackBehavior = new MuteQuack();
		flyBehavior = new FlyNoWay();
		eatBehavior = new EatNoWay();
	}

}
