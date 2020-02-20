package Lab2;

public interface Display {

	public void display();

	public static void update(String slot_author, int slot_price, String slot_name) {
		System.out.println("Author: " + slot_author + " Price: " + slot_price + " Name: " + slot_name);
	}

}
