package design_patterns_study;

public class Duck {
	//Declare instance variables
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	EatBehavior eatBehavior;
	
	public void performQuack() {
		//Design pattern: Identify parts of the application that will change and separate them from what will remain the same
		quackBehavior.quack();
	}
	
	public void performFly() {
		//Design pattern: Identify parts of the application that will change and separate them from what will remain the same
		flyBehavior.fly();
	}
	
	public void performEat() {
		eatBehavior.eat();
	}
	
	public void swim() {
		//Assumption (based on nothing, just for sake of example): All ducks swim the same way. Therefore, swim can be defined in Duck class
	}
}
