package Lab7;

public class OurCarRadio implements OldRadio {
	String description;
	Amplifier amplifier;
	double frequency;

	/**
	 * 
	 * @param description
	 * @param amplifier
	 */
	public OurCarRadio(String description, Amplifier amplifier) {
		this.description = description;
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
		System.out.println(description + " cannot switch to AM mode");
	}

	/**
	 * 
	 */
	public void setFm() {
		System.out.println(description + " is in FM mode");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return description;
	}
}