package Lab6;

public class AccountLogIn implements Command {
	Account acc; // The receiver

	public AccountLogIn(Account acc) {
		this.acc = acc;
	}

	public void execute() {
		acc.logIn();
	}

	@Override
	public void undo() {
		acc.noAccount();
	}
}