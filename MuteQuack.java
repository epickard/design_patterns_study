package design_patterns_study;

public class MuteQuack implements QuackBehavior  {
	
	public void quack() {
		System.out.println("<<silence>>");
	}

}
