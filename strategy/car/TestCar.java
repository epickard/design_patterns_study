package design_patterns_study.strategy.car;

public class TestCar {
	
	public static void main(String[] args) {
		simulateMiata();
		simulateModelT();
	}
	
	public static void simulateMiata(){
		Car miata = new MiataCar();
		System.out.println("This is a(n) " + miata.name);
		
		miata.performStart();
		miata.performHonk();
		miata.performRoll();
		
		System.out.println("\n");
	}

	public static void simulateModelT(){
		Car modelT = new ModelTCar();
		System.out.println("This is a(n) " + modelT.name);
		
		modelT.performStart();
		modelT.performHonk();
		modelT.performRoll();
	}
}
