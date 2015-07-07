package design_patterns_study.factory.pen_idiom;

public class PenStore {
	//Instance variable(s)
	SimplePenFactory factory;
	
	//Constructor takes parameter of factory type
	public PenStore(SimplePenFactory factory) {
		this.factory = factory;
	}
	
	public Pen orderPen(String type) {
		//Local variable(s)
		Pen pen;
		
		//Create the instance of the desired concrete class via the factory
		pen = factory.createPen(type);
		
		//Call the desired methods on the specified concrete class
		pen.selectInkColor();
		pen.selectBarrelColor();
		pen.selectBarrelDiameter();
		pen.selectHeight();
		
		return pen;
	}
}
