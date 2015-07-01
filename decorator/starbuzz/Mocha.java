package design_patterns_study.decorator.starbuzz;

public class Mocha extends CondimentDecorator {
	//Exercise studied and learned from "Head First Design Patterns", by Eric Freeman & Elisabeth Freeman
	//Instance variable(s)
	Beverage beverage;
	
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}

	@Override
	public double cost() {
		return .20 + beverage.cost();
	}
}
