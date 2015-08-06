package design_patterns_study.strategy.car;

public interface HonkBehavior {
	
	//Each type of car will have a different honk mechanism. Therefore the method should be defined in
	//each class that implements this interface
	public void honk();

}
