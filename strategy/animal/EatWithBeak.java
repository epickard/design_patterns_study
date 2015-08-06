package design_patterns_study.strategy.animal;

public class EatWithBeak implements EatBehavior {
	
	public void eat() {
		System.out.println("Eat with the beak!");
	}

}
