package design_patterns_study.decorator.burger;

public class CaramelizedOnions extends ExtrasDecorator {
	//Instance variable(s)
	Burger burger;
	
	//Constructor w/ input param of type abstract component
	public CaramelizedOnions(Burger burger) {
		this.burger = burger;
	}
	
	@Override
	public String getBurgerName() {
		return burger.getBurgerName();
	}

	@Override
	public double cost() {
		return .10 + burger.cost();
	}
	
}
