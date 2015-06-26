package design_patterns_study.observer;

public class TestNewsSource {
	
	public static void main(String[] args) {
		//Adaptation from exercise in "Head First Design Patterns", by Eric Freeman & Elisabeth Freeman
		//Create instance of the implementation of the Subject to get the update when it's available
		APNews apNews = new APNews();
		//Create instance of the implementation of the Observer to register with the Subject and receive the update
		@SuppressWarnings("unused")
		SFGate sfGate = new SFGate(apNews);
		
		//Call the method in the APNews class that sets the news information and kicks off the notify event
		apNews.setNewsInfo("Big Change Ahead!", "Bob N. Fornoose");
	}

}
