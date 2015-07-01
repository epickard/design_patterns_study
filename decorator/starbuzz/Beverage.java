package design_patterns_study.decorator.starbuzz;

public abstract class Beverage {
	//Exercise studied and learned from "Head First Design Patterns", by Eric Freeman & Elisabeth Freeman
	//Instance variable(s)
	String description = "Unknown Beverage";
	
	public String getDescription() {
		return description;
	}
	
	public abstract double cost();
}
