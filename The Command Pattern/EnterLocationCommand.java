package Lab6;

public class EnterLocationCommand implements Command {
	Geolocation loc; // The receiver

	public EnterLocationCommand(Geolocation loc) {
		this.loc = loc;
	}

	public void execute() {
		loc.enterLocation();
	}

	@Override
	public void undo() {
		loc.auto();
	}
}