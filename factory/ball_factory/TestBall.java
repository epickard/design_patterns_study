package design_patterns_study.factory.ball_factory;

public class TestBall {
	
	public static void main(String[] args) {
		BallStore store1 = new BaseballStore();
		BallStore store2 = new BasketballStore();
		
		store1.makeBall("baseball");
		System.out.println("Making a " + store1.ballName);
		
		store2.makeBall("basketball");
		System.out.println("Making a " + store2.ballName);
	}

}
