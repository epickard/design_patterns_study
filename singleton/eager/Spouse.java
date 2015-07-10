package design_patterns_study.singleton.eager;

public class Spouse {
	//If overhead of object is low, can get around multi-threading problems by instantiating
	//eagerly, as is done here
	private static Spouse uniqueInstance = new Spouse();
	
	//Private constructor: Can only be instantiated by this class
	private Spouse() {
		System.out.println("This is a private constructor");
	}
	
	public static Spouse getInstance() {
		//Since the Singleton instance already exists, the only thing that needs to 
		//be done here is to return it
		System.out.println("Returning Singleton instance");
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

