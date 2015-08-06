package design_patterns_study.strategy.car;

public interface StartBehavior {
	
	//Each type of car will have a different start mechanism. Therefore the method should be defined in
	//each class that implements this interface
	public void start();

}
