package Lab6;

public class GetLocationAutoCommand implements Command {
	Geolocation loc; // The receiver

	public GetLocationAutoCommand(Geolocation loc) {
		this.loc = loc;
	}

	public void execute() {
		loc.auto();

	}

	@Override
	public void undo() {
		loc.removeInfo();
	}
}