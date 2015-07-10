package design_patterns_study.singleton.syncro;

public class Spouse {
	private static Spouse uniqueInstance;
	
	//Private constructor: Can only be instantiated by this class
	private Spouse() {
		System.out.println("This is a private constructor");
	}
	
	//Difference between syncro & standard is the keyword on the method
	//Synchronization decreases performance. Only use this approach if the code is 
	//not heavily used
	public static synchronized Spouse getInstance() {
		if (uniqueInstance == null) {
			System.out.println("Creating instance of Spouse using a synchronized method");
			//This is where the private constructor is called
			uniqueInstance = new Spouse();
		}
		System.out.println("Returning instance of Spouse");
		return uniqueInstance;
	}
	
	//Public methods
	public void marrySpouse(String name) {
		System.out.println("Marrying " + name + ". Using instance: " + uniqueInstance);
	}
	
	public void liveWithSpouse(String name) {
		System.out.println("Living with " + name + ". Using instance: " + uniqueInstance);
	}
}
