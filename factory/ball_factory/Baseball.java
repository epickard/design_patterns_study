package design_patterns_study.factory.ball_factory;

public class Baseball extends Ball {

	@Override
	public String getName() {
		name = "Baseball";
		return name;
	}

	@Override
	public void cutMaterial() {
		System.out.println("Cutting out white material");
	}

}
