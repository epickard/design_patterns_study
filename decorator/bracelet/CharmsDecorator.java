package design_patterns_study.decorator.bracelet;

public abstract class CharmsDecorator extends Bracelet {
	
	public abstract String getBraceletName();
	
	//Each concrete decorator will need to add behavior to cost()
	public abstract double cost();
	
}
