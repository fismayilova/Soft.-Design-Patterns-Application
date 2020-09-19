package Lab10;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * This Class is Composite class
 */
public class Account extends AccountComponent {
	ArrayList<AccountComponent> AccountComponents = new ArrayList<AccountComponent>();
	String name;
	int balance;

	public Account(String name, int balance) {
		this.name = name;
		this.balance = balance;
	}

	public void add(AccountComponent AccountComponent) {
		AccountComponents.add(AccountComponent);
	}

	public void remove(AccountComponent AccountComponent) {
		AccountComponents.remove(AccountComponent);
	}

	public AccountComponent getChild(int i) {
		return (AccountComponent) AccountComponents.get(i);
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
		System.out.println("\n" + getName());
		System.out.println("Balance: " + getBalance());
		System.out.println("---------------------");

		Iterator<AccountComponent> iterator = AccountComponents.iterator();
		while (iterator.hasNext()) {
			AccountComponent AccountComponent = (AccountComponent) iterator.next();
			AccountComponent.print();
		}
	}
}