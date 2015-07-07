package design_patterns_study.factory.pen_idiom;

public class SimplePenFactory {
	//Instance variable
	Pen pen;
	
	public Pen createPen(String type){
		
		if (type.equals("calligraphy")) {
			pen = new Calligraphy();
		} else if (type.equals("ballPoint")) {
			pen = new BallPoint();
		}
		
		return pen;
	}
}
