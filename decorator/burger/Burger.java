package design_patterns_study.decorator.burger;

public abstract class Burger {
	//Instance variable(s)
	String burgerName = "Generic Parent Burger";
	
	public String getBurgerName() {
		return this.burgerName;
	}
	
	public abstract double cost();
}
