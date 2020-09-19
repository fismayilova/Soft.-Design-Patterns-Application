package Lab7;

public class Amplifier {
	String description;
	OldRadio radio;
	int volume;

	/**
	 * 
	 * @param description
	 */
	public Amplifier(String description) {
		this.description = description;
	}

	/**
	 * 
	 */
	public void on() {
		System.out.println(description + " is On");
	}

	/**
	 * 
	 */
	public void off() {
		System.out.println(description + " is Off");
	}

	/**
	 * 
	 * @param radio
	 */
	public void setRadio(OldRadio radio) {
		this.radio = radio;
	}

	/**
	 * 
	 * @param volume
	 */
	public void setVolume(int volume) {
		this.volume = volume;
	}
}