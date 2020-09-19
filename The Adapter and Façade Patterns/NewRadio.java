package Lab7;

public class NewRadio implements NewRadioInt {
	String description;
	Amplifier amplifier;
	double frequency;

	public NewRadio(String description, Amplifier amplifier) {
		this.description = "New Cute " + description;
	}

	/**
	 * 
	 */
	public void on() {
		System.out.println(description + " on");
	}

	/**
	 * 
	 */
	public void off() {
		System.out.println(description + " off");
	}

	/**
	 * 
	 */
	public void setFrequency(double frequency) {
		System.out.println(description + " setting frequency to " + frequency);
		this.frequency = frequency;
	}

	/**
	 * 
	 */
	public void setAm() {
		System.out.println(description + " is in AM mode");
	}

	/**
	 * 
	 */
	public void setFm() {
		System.out.println(description + " is in FM mode");
	}

	/**
	 * 
	 */
	public String toString() {
		return description;
	}
}