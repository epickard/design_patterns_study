package design_patterns_study.decorator.bracelet;

//Concrete decorator class
public class BunnyCharm extends CharmsDecorator {
	//Instance Variable(s)
	Bracelet bracelet;
	
	//Constructor takes param of type of superclass and sets BunnyCharm's Bracelet type variable to component to be decorated 
	public BunnyCharm(Bracelet bracelet) {
		this.bracelet = bracelet;
		System.out.println("bunny: " + this.bracelet.toString());
		System.out.println("bunny: " + this.braceletName);
	}
	
	@Override
	public String getBraceletName() {
		return bracelet.getBraceletName();
	}

	@Override
	public double cost() {
		return 2.99 + bracelet.cost();
	}
}
