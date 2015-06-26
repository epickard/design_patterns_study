package design_patterns_study.observer;

public interface NewsObserver {
	//Adaptation from exercise in "Head First Design Patterns", by Eric Freeman & Elisabeth Freeman
	//The Observer interface declares the method(s) that manage updating subscribed observers
	public void update(String headline, String byline);

}
