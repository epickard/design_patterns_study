package design_patterns_study.factory.pen_idiom;

public class TestPen {
	
	public static void main(String[] args) {
		//Create required class instances
		SimplePenFactory factory = new SimplePenFactory();
		PenStore store = new PenStore(factory);
		Pen pen;
		
		pen = store.orderPen("ballPoint");
		System.out.println("Ordering pen of type: " + pen.toString());
		
		pen = store.orderPen("calligraphy");
		System.out.println("Ordering pen of type: " + pen.toString());
	}
}
