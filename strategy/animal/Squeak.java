package design_patterns_study.strategy.animal;

public class Squeak implements QuackBehavior {
	
	public void quack() {
		System.out.println("Squeak, squeak!");
	}

}
