package Lab7;

public class CoolingSystem {
	String description;
/**
 * 
 * @param description
 */
	public CoolingSystem(String description) {
		this.description =  description;
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
 * @param i
 */
	public void setTemperature(int i) {
		System.out.println(description + " setting to " + i + " degrees");

	}
/**
 * 
 */
	public String toString() {
		return description;
	}

}
