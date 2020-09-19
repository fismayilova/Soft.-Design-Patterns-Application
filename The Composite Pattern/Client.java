package Lab10;

/*
 * This Class is Client class
 */
public class Client {
	AccountComponent allAccounts;

	public Client(AccountComponent allAccounts) {
		this.allAccounts = allAccounts;
	}

	public void printAccount() {
		allAccounts.print();
	}
}