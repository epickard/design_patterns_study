package design_patterns_study.decorator.starbuzz;


public class TestStarbuzzCoffee {
	//Exercise studied and learned from "Head First Design Patterns", by Eric Freeman & Elisabeth Freeman
	public static void main(String[] args) {
		Beverage beverage = new Espresso();
		beverage = new Mocha(beverage);
		beverage = new Soy(beverage);
		beverage = new Whip(beverage);
		System.out.println(beverage.getDescription() + ": $" + beverage.cost());
	}
}
