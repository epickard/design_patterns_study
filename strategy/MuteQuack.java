package design_patterns_study.strategy;

public class MuteQuack implements QuackBehavior  {
	
	public void quack() {
		System.out.println("<<silence>>");
	}

}
