package Lab6;

public class AccountLogOut implements Command {
	Account acc;// The receiver

	public AccountLogOut(Account acc) {
		this.acc = acc;
	}

	public void execute() {
		acc.exit();
	}

	@Override
	public void undo() {
		acc.restoreInfo();
	}
}