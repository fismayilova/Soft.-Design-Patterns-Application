package Lab7;

public class Test {

	public static void main(String[] args) {
		Engine engine = new Engine("Engine");
		Amplifier amp = new Amplifier("Amplifier");
		CdPlayer cd = new CdPlayer("CD Player", amp);
		CoolingSystem ac = new CoolingSystem("AC");
		NewRadio newRadio = new NewRadio("Radio", amp);

		/**
		 * Here are 2 different classes implementing adapter pattern. Please try
		 * to uncomment lines below. I used adapter pattern for Radio and the
		 * System itself. It was used to adapt new Auto System and new Radio
		 */

		// OldRadio radio = new OurCarRadio("Radio", amp);

		OldRadio radio = new NewRadioAdapter(newRadio);

		/**
		 * This two classes OldCarSystemFacade and NewSystemFacadeAdapter are
		 * two Facade Classes however i used the adapter pattern too.
		 * 
		 */

		// OldSystem car = new OldAutoSystemFacade(engine, radio, ac);

		NewSystem newAuto = new NewAutoSystem(engine, cd, amp, radio, ac);
		OldSystem car = new NewSystemFacadeAdapter(newAuto);

		car.startEngine("on");
		System.out.println("\n");
		car.listenToRadio(3);
		radio.setAm();
		System.out.println("\n");
		car.switchToCD();
		System.out.println("\n");
		car.conditioningOn();
		System.out.println("\n");
		car.stopEngine();
	}

}