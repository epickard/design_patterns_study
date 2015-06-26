package design_patterns_study.observer;

public class SFGate implements NewsObserver {
	//Adaptation from exercise in "Head First Design Patterns", by Eric Freeman & Elisabeth Freeman
	//Instance Variables
	private NewsSubject newsSubjectImplementation;
	private String headline;
	private String byline;
	
	//Constructor takes parameter of type NewsSubject and registers current object with the specified implementation of the NewsSubject
	public SFGate(NewsSubject nSubject) {
		this.newsSubjectImplementation = nSubject;
		newsSubjectImplementation.registerObserver(this);	
	}

	@Override
	public void update(String headline, String byline) {
		this.headline = headline;
		this.byline = byline;
		display();
	}
	
	public void display() {
		System.out.println("News headline is: " + headline +  ", byline is: " + byline);
	}

}
