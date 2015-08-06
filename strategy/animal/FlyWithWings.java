package design_patterns_study.strategy.animal;

public class FlyWithWings implements FlyBehavior {
	
	public void fly() {
		//implementation of flying using wings
		System.out.println("Fly with wings!");
	}
}
