package design_patterns_study.decorator.burger;

public class DeluxeBurger extends Burger {

	public DeluxeBurger() {
		burgerName = "Deluxe Burger";
	}

	@Override
	public double cost() {
		return 6.99;
	}
}
