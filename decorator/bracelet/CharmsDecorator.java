package design_patterns_study.decorator.bracelet;

//Abstract decorator class
public abstract class CharmsDecorator extends Bracelet {
	
	@Override
	public abstract String getBraceletName();
	
	//Each concrete decorator will need to add behavior to cost()
	@Override
	public abstract double cost();
	
}
