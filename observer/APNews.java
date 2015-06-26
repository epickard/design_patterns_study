package design_patterns_study.observer;

import java.util.ArrayList;

public class APNews implements NewsSubject {
	//Adaptation from exercise in "Head First Design Patterns", by Eric Freeman & Elisabeth Freeman
	//Instance Variables
	private ArrayList<NewsObserver> newsObservers;
	private String headline;
	private String byline;
	
	//Constructor
	public APNews() {
		newsObservers = new ArrayList<NewsObserver>();
	}

	@Override
	public void registerObserver(NewsObserver o) {
		newsObservers.add(o);
	}

	@Override
	public void removeObserver(NewsObserver o) {
		if (newsObservers.indexOf(o) >= 0) {
			newsObservers.remove(o);
		}
	}

	@Override
	public void notifyObservers() {
		for (int i=0; i < newsObservers.size(); i++) {
			//Get each object from the ArrayList and update the associated data
			NewsObserver nObserver = newsObservers.get(i);
			nObserver.update(headline, byline);
		}
	}
	
	public void setNewsInfo(String headline, String byline) {
		this.headline = headline;
		this.byline = byline;
		notifyObservers();
	}

}
