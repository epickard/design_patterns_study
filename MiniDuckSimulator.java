package design_patterns_study;

public class MiniDuckSimulator {
	
	public static void main(String[] args) {
		simulateMallard();
		simulateRubberDuckie();
		simulateDecoyDuck();
		simulateBlueBilledDuck();
		
	}
	
	public static void simulateMallard() {
		Duck mallard = new MallardDuck();
		
		System.out.println("I am a mallard.");
		
		mallard.performQuack();
		mallard.performFly();
		mallard.performEat();
	}
	
	public static void simulateRubberDuckie() {
		Duck rubberDuckie = new RubberDuck();
		
		System.out.println("\n" + "I am a rubber duckie.");
		
		rubberDuckie.performQuack();
		rubberDuckie.performFly();
		rubberDuckie.performEat();
	}
	
	public static void simulateDecoyDuck() {
		Duck decoyDuck =  new DecoyDuck();
		
		System.out.println("\n" + "I am a decoy duck.");
		
		decoyDuck.performQuack();
		decoyDuck.performFly();
		decoyDuck.performEat();
	}
	
	public static void simulateBlueBilledDuck() {
		Duck blueBilledDuck = new BlueBilledDuck();
		
		System.out.println("\n" + "I am a blue-billed duck.");
		
		blueBilledDuck.performQuack();
		blueBilledDuck.performFly();
		blueBilledDuck.performEat();
	}

}
