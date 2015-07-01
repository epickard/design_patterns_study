package design_patterns_study.decorator.bracelet;

//Abstract component class and superclass for entire pattern
public abstract class Bracelet {
	//Instance Variable(s)
	String braceletName = "unknown bracelet";
	
	public String getBraceletName() {
		return this.braceletName;
	}
	
	//Abstract method to be defined by subclass(es)
	public abstract double cost();
}
