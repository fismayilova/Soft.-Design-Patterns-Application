package Lab7;

public class NewAutoSystem implements NewSystem {
	Engine engine;
	Amplifier amp;
	CdPlayer cd;
	OldRadio radio;
	CoolingSystem conditioning;
	NewSystem newAuto;

	/**
	 * 
	 * @param engine
	 * @param cd
	 * @param amp
	 * @param radio
	 * @param conditioning
	 */
	public NewAutoSystem(Engine engine, CdPlayer cd, Amplifier amp, OldRadio radio, CoolingSystem conditioning) {
		this.conditioning = conditioning;
		this.engine = engine;
		this.amp = amp;
		this.radio = radio;
		this.cd = cd;
	}

	/**
	 * 
	 */
	public void startEngine(String command) {
		boolean on = command.equalsIgnoreCase("on");
		if (on) {
			engine.start();
			updateDashboard();
		}
	}

	/**
	 * 
	 */
	public void stopEngine() {
		System.out.println("Engine will stop now. Turning off everything one by one");
		radio.off();
		cd.off();
		conditioning.off();
		engine.off();
	}

	/**
	 * 
	 */
	public void listenToRadio(double frequency) {
		radio.on();
		System.out.println("Tuning in the airwaves...");
		System.out.println("Will take 10 seconds");
		radio.setFm();
		radio.setFrequency(frequency);
		amp.on();
		amp.setVolume(5);
		amp.setRadio(radio);
	}

	/**
	 * 
	 */
	public void switchToCD() {
		System.out.println("Switching To CD");
		radio.off();
		amp.off();
		cd.on();
	}

	/**
	 * 
	 */
	public void endRadio() {
		System.out.println("Shutting down the radio...");
		radio.off();
		amp.off();
	}

	/**
	 * 
	 */
	public void endCD() {
		cd.off();
	}

	/**
	 * 
	 */
	public void conditioningOn() {
		System.out.println("Turning on the Conditioning system");
		conditioning.on();
		conditioning.setTemperature(18);
	}

	/**
	 * 
	 */
	public void conditioningOff() {
		System.out.println("Turning off the Conditioning system");
		conditioning.off();
	}

	/**
	 * 
	 */
	@Override
	public void updateDashboard() {
		System.out.println("New System's Dashboard Update: ");
	}

}
