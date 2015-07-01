package design_patterns_study.decorator.burger;

public abstract class ExtrasDecorator extends Burger {
	
	public abstract String getBurgerName();

	//Pass on behavior assignment to subclasses
	public abstract double cost();

}
