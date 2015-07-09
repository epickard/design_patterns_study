package design_patterns_study.factory.ball_factory;

public abstract class Ball {
	//This is one of the Product classes
	
	//Instance variable(s)
	String name;
	
	//Abstract method(s)
	public abstract String getName();
	
	public abstract void cutMaterial();
	
	//Concrete method(s)
	public void sew() {
		System.out.println("Sewing material");
	}

}
