package Lab7;

public class OldAutoSystemFacade implements OldSystem {
	Engine engine;
	OldRadio radio;
	CoolingSystem conditioning;

	/**
	 * 
	 * @param engine
	 * @param radio
	 * @param conditioning
	 */
	public OldAutoSystemFacade(Engine engine, OldRadio radio, CoolingSystem conditioning) {
		this.conditioning = conditioning;
		this.engine = engine;
		this.radio = radio;
	}

	/**
	 * 
	 */
	@Override
	public void startEngine(String command) {
		engine.start();
		updateDashboardDisplay();
	}

	/**
	 * 
	 */
	@Override
	public void stopEngine() {
		System.out.println("Everything will stop now ");
		engine.off();
	}

	/**
	 * 
	 */
	@Override
	public void listenToRadio(double frequency) {
		radio.on();
		System.out.println("Trying to tune in the airwaves...");
		System.out.println("Will take 5 mins");
		radio.setFm();
		radio.setFrequency(frequency);
		System.out.println("Amplifier is not working");
	}

	/**
	 * 
	 */

	@Override
	public void switchToCD() {
		System.out.println("Cannot Switch To CD");
	}

	/**
	 * 
	 */

	@Override
	public void endRadio() {
		System.out.println("Shutting down the radio...");
		radio.off();
	}

	/**
	 * 
	 */

	@Override
	public void conditioningOn() {
		System.out.println("Turning on the Conditioning system");
		conditioning.on();
		conditioning.setTemperature(28);
	}

	/**
	 * 
	 */

	@Override
	public void conditioningOff() {
		System.out.println("Turning off the Conditioning system");
		conditioning.off();
	}

	/**
	 * 
	 */

	@Override
	public void updateDashboardDisplay() {
		System.out.println("Here you can see updated dashboard information");
	}

	/**
	 * 
	 */
	@Override
	public void endCD() {
		System.out.println("No CD Player Found!");
	}
}
