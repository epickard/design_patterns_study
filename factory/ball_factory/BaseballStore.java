package design_patterns_study.factory.ball_factory;

public class BaseballStore extends BallStore {

	@Override
	public Ball createBall(String type) {
		if (type.equals("baseball")) {
			return new Baseball();
		} else return null;
	}

}
