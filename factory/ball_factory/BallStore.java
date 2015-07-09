package design_patterns_study.factory.ball_factory;

public abstract class BallStore {
	//This is one of the Creator classes
	
	//Instance variable(s)
	String ballName;

	//Abstract method(s)
	public abstract Ball createBall(String type);
	
	//Concrete method(s)
	public Ball makeBall(String type) {
		Ball ball;
		
		ball = createBall(type);
		ball.cutMaterial();
		ball.sew();
		ballName = ball.getName();
		
		return ball;
	}
}
