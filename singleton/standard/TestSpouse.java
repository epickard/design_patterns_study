package design_patterns_study.singleton.standard;

public class TestSpouse {
	
	public static void main(String[] args) {
		Spouse spouse = Spouse.getInstance();
		
		spouse.marrySpouse("mySpouse");
		spouse.liveWithSpouse("mySpouse");
	}

}
