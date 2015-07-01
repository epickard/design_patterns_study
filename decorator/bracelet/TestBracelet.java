package design_patterns_study.decorator.bracelet;

public class TestBracelet {
	
	public static void main(String[] args) {
		
		//Create concrete component instance
		Bracelet bracelet = new CharmBracelet();
		
		//Decorate (wrap) component in decorators
		bracelet = new BunnyCharm(bracelet);
		bracelet = new PuppyCharm(bracelet);
		
		System.out.println("Total cost of " + bracelet.getBraceletName() + " is: $" + bracelet.cost());
	}

}
