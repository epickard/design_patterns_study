package design_patterns_study.decorator.starbuzz;

public class Espresso extends Beverage {
	//Exercise studied and learned from "Head First Design Patterns", by Eric Freeman & Elisabeth Freeman
	public Espresso() {
		description = "Espresso";
	}

	@Override
	public double cost() {
		return 1.99;
	}
}
