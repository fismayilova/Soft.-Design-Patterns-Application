package Lab7;

public class NewSystemFacadeAdapter implements OldSystem {
	NewSystem newAuto;

	/**
	 * 
	 * @param newAuto
	 */
	public NewSystemFacadeAdapter(NewSystem newAuto) {
		this.newAuto = newAuto;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Lab7.OldSystem#startEngine(java.lang.String)
	 * 
	 * 
	 */
	public void startEngine(String command) {
		newAuto.startEngine(command);
	}

	public void stopEngine() {
		newAuto.stopEngine();
	}

	public void listenToRadio(double frequency) {
		newAuto.listenToRadio(frequency);
	}

	public void switchToCD() {
		newAuto.switchToCD();
	}

	public void endRadio() {
		newAuto.endRadio();
	}

	public void endCD() {
		newAuto.endCD();
	}

	public void conditioningOn() {
		newAuto.conditioningOn();
	}

	public void conditioningOff() {
		newAuto.conditioningOff();
	}

	@Override
	public void updateDashboardDisplay() {
		newAuto.updateDashboard();
	}
}
