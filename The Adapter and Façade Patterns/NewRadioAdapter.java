package Lab7;

public class NewRadioAdapter implements OldRadio {
	NewRadio radio;

	/**
	 * 
	 * @param description
	 * @param amplifier
	 */
	public NewRadioAdapter(NewRadio radio) {
		this.radio = radio;
	}

	@Override
	public void on() {
		radio.on();
		// TODO Auto-generated method stub

	}

	@Override
	public void off() {
		radio.off();
		// TODO Auto-generated method stub

	}

	@Override
	public void setFrequency(double frequency) {
		radio.setFrequency(frequency);
		// TODO Auto-generated method stub

	}

	@Override
	public void setAm() {
		radio.setAm();
		// TODO Auto-generated method stub

	}

	@Override
	public void setFm() {
		radio.setFm();
		// TODO Auto-generated method stub

	}
}
