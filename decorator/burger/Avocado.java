package design_patterns_study.decorator.burger;

public class Avocado extends ExtrasDecorator {
	//Instance variable(s)
	Burger burger;
	
	//Constructor w/ input param of abstract component type
	public Avocado(Burger burger) {
		this.burger = burger;
	}
	
	@Override
	public String getBurgerName() {
		return burger.getBurgerName();
	}

	@Override
	public double cost() {
		return .99 + burger.cost();
	}
}
