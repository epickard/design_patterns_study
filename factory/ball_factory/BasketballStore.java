package design_patterns_study.factory.ball_factory;

public class BasketballStore extends BallStore {

	@Override
	public Ball createBall(String type) {
		if (type.equals("basketball")){
			return new Basketball();
		}
		return null;
	}

}
