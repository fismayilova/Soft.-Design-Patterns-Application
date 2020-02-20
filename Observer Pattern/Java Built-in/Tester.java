package JavaObserver;

public class Tester {
	public static void main(String[] args) {
		BidData weatherData = new BidData();
		@SuppressWarnings("unused")
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		((BidData) weatherData).setMeasurements(80);
		((BidData) weatherData).setMeasurements(82);
		((BidData) weatherData).setMeasurements(78);
	}
}
