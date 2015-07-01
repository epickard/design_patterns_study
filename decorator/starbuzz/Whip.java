package design_patterns_study.decorator.starbuzz;


public class Whip extends CondimentDecorator {
	//Exercise studied and learned from "Head First Design Patterns", by Eric Freeman & Elisabeth Freeman
	//Instance variable(s)
	Beverage beverage;
	
	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Whip";
	}

	@Override
	public double cost() {
		return .10 + beverage.cost();
	}
}
