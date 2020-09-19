package Lab6;

public class Account {

	public Account() {
	}

	public void logIn() {
		System.out.println("You are logging in");
	}

	public void exit() {
		System.out.println("You are logging out");
	}

	public void noAccount() {
		System.out.println("You can continue without account log in");
	}

	public void restoreInfo() {
		System.out.println("Log out is stoped. Your information is being restored");
	}

}