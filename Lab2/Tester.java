package Lab2;

public class Tester {
	public static void main(String[] args) {
		Auctioner weatherData = new BidData();
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		((BidData) weatherData).setMeasurements(80);
		((BidData) weatherData).setMeasurements(82);
		((BidData) weatherData).setMeasurements(78);
	}
}
