package Lab7;

public class CdPlayer {
	String description;
	Amplifier amplifier;
	String title;

	/**
	 * 
	 * @param description
	 * @param amplifier
	 */
	public CdPlayer(String description, Amplifier amplifier) {
		this.description = description;
		this.amplifier = amplifier;
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
	 * @param title
	 */
	public void play(String title) {
		this.title = title;
		System.out.println(description + " playing ~ " + title + " ~ ");
	}

	/**
	 * 
	 */
	public void stop() {
		System.out.println(description + " stopped");
	}

	/**
	 * 
	 */
	public void pause() {
		System.out.println(description + " paused ~ " + title + " ~ ");
	}

	/**
	 * 
	 */
	public String toString() {
		return description;
	}
}