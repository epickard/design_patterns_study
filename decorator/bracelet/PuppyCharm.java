package design_patterns_study.decorator.bracelet;

public class PuppyCharm extends CharmsDecorator {
	//Instance variable(s)
	Bracelet bracelet;
	
	//Constructor takes param of type of superclass and sets PuppyCharm's Bracelet type variable to component to be decorated 
	public PuppyCharm(Bracelet bracelet) {
		this.bracelet = bracelet;
	}
	
	@Override
	public String getBraceletName() {
		return bracelet.getBraceletName();
	}

	@Override
	public double cost() {
		return 3.99 + bracelet.cost();
	}

}
