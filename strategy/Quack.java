package design_patterns_study.strategy;

public class Quack implements QuackBehavior {
	
	public void quack() {
		//implementation of quacking sound, like a duck
		System.out.println("Quack, quack!");
	}

}
