package Lab10;

/*
 * This Class is Leaf class
 */
public class Deposit extends AccountComponent {
	String name;
	int balance;

	public Deposit(String name, int balance) {
		this.name = name;
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public int getBalance() {
		return balance;
	}
	public int setBalance(int i) {
		return balance = i;
	}
	public void print() {
		System.out.print("  " + getName());
		System.out.println("    -- " + getBalance());
	}
}