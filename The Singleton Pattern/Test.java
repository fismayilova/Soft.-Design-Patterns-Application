package Lab5;

public class Test {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// Many instances
		CuteClass cute1 = CuteClass.getInstance();
		CuteClass cute2 = CuteClass.getInstance();
		// Only 1 instance
		for (int i = 1; i <= 25; i++) {
			Quarantine q1 = Quarantine.getInstance();
			HappyClass happy = HappyClass.getInstance();
			CookieClass cookies = CookieClass.getInstance();
			BowlOfCandies candies = BowlOfCandies.getInstance();
		}
	}
}
