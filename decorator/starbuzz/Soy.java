package design_patterns_study.decorator.starbuzz;

public class Soy extends CondimentDecorator {
	//Exercise studied and learned from "Head First Design Patterns", by Eric Freeman & Elisabeth Freeman
	//Instance variable(s)
	Beverage beverage;
	
	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}

	@Override
	public double cost() {
		return .15 + beverage.cost();
	}
}
