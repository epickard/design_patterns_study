package design_patterns_study.observer;


public class WeatherStation {

	public static void main(String[] args) {
		//Exercise studied and learned from "Head First Design Patterns", by Eric Freeman & Elisabeth Freeman
		WeatherData weatherData = new WeatherData();
	
		@SuppressWarnings("unused")
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);

		weatherData.setMeasurements(81, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
		
	}
}
