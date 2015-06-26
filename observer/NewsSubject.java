package design_patterns_study.observer;

public interface NewsSubject {
	//Adaptation from exercise in "Head First Design Patterns", by Eric Freeman & Elisabeth Freeman
	//The Subject interface declares the method(s) that manage its interactions with the observers
	public void registerObserver(NewsObserver o);
	
	public void removeObserver(NewsObserver o);
	
	public void notifyObservers();

}
