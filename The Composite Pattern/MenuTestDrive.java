package Lab10;

public class MenuTestDrive {

	public static void main(String args[]) {
		AccountComponent deposit1 = new Account("Deposit1 Account", 200);
		AccountComponent deposit2 = new Account("Deposit2 Account", 130);
		AccountComponent deposit3 = new Account("Deposit3 Account", 235);
		AccountComponent savings1 = new Account("Savings1 Account", 264);
		AccountComponent savings2 = new Account("Savings2 Account", 564);
		AccountComponent allAccounts = new Account("ALL Accounts", 1400);

		allAccounts.add(deposit1);
		allAccounts.add(deposit2);
		allAccounts.add(deposit3);
		allAccounts.add(savings1);
		allAccounts.add(savings2);

		deposit1.add(new Deposit("K&B's Bank Account", 299));
		deposit2.add(new Deposit("Regular Bank Account", 299));
		deposit3.add(new Deposit("Blueberry Bank Account", 349));
		deposit3.add(new Deposit("Wa Bank Account", 359));

		savings1.add(new Savings("BLT Bank Account", 299));
		savings1.add(new Savings("BLT", 299));
		savings1.add(new Savings("The day Bank Account", 329));
		savings2.add(new Savings("HoHo Bank Account", 305));
		savings2.add(new Savings("Veggies Bank Account", 399));
		savings2.add(new Savings("Pa Bank Account", 389));

		Client client = new Client(allAccounts);
		client.printAccount();
	}
}