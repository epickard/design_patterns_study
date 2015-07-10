package design_patterns_study.singleton.standard;

public class Spouse {
	private static Spouse uniqueInstance;
	
	//Private constructor: Can only be instantiated by this class
	private Spouse() {
		System.out.println("This is a private constructor");
	}
	
	public static Spouse getInstance() {
		//Instance will be lazily created, meaning it will only be created if needed
		if (uniqueInstance == null) {
			System.out.println("Creating instance of Spouse");
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
