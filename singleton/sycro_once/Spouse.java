package design_patterns_study.singleton.sycro_once;

public class Spouse {
	//The volatile keyword ensures multiple threads handle variable correctly during instantiation
	private static volatile Spouse uniqueInstance;
	
	//Private constructor: Can only be instantiated by this class
	private Spouse() {
		System.out.println("This is a private constructor");
	}
	
	public static Spouse getInstance() {
		if (uniqueInstance == null) {
			//Only synchronize the first time through
			synchronized (Spouse.class) {
				System.out.println("First time through: Synchronize");
				//Once in this block, check again to make sure the instance hasn't yet been created
				if (uniqueInstance == null) {
					//If it hasn't, then create
					System.out.println("Variable still null, therefore creating instance of Spouse");
					//This is where the private constructor is called
					uniqueInstance = new Spouse();
				}
			}
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
