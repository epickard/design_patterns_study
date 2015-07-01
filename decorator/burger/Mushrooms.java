package design_patterns_study.decorator.burger;

public class Mushrooms extends ExtrasDecorator {
	//Instance variable(s)
	Burger burger;
	
	//Constructor w/ input param of type abstract component
	public Mushrooms(Burger burger) {
		this.burger = burger;
	}
	
	@Override
	public String getBurgerName() {
		return burger.getBurgerName();
	}

	@Override
	public double cost() {
		return .75 + burger.cost();
	}
}
