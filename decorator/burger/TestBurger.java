package design_patterns_study.decorator.burger;

public class TestBurger {
	
	public static void main(String[] arg) {
		
		//Create concrete component instance
		Burger burger = new DeluxeBurger();
		
		//Decorate (wrap) concrete component in concrete decorators
		burger = new CaramelizedOnions(burger);
		burger = new Avocado(burger);
		
		System.out.println("Cost of " + burger.getBurgerName() + " burger is $" + burger.cost());
	}
}
