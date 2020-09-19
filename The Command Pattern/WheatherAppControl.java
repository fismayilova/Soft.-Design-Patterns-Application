package Lab6;

public class WheatherAppControl { // Invoker class. 
	Command slot; 
	public WheatherAppControl() {
	}

	public void setCommand(Command command) {
		slot = command;
	}

	public void buttonWasPressed() {
		slot.execute();
	}
}