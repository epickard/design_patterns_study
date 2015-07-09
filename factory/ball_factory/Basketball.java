package design_patterns_study.factory.ball_factory;

public class Basketball extends Ball {

	@Override
	public String getName() {
		name = "Basketball";
		return name;
	}

	@Override
	public void cutMaterial() {
		System.out.println("Cutting out orange material with black stripes");
	}

}
