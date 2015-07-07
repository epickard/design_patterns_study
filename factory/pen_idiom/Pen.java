package design_patterns_study.factory.pen_idiom;

public abstract class Pen {
	//Declare abstract methods that will be defined by concrete instances of the class
	public abstract void selectInkColor();
	
	public abstract void selectBarrelColor();
	
	public abstract void selectBarrelDiameter();
	
	public abstract void selectHeight();
	
	public abstract void assemble();
	
	//Each concrete class will define with name of pen for use in test class
	public abstract String toString();

}
