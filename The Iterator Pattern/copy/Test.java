package Lab9.copy;

public class Test {

	public static void main(String[] args) {
		PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
		DinerMenu dinerMenu = new DinerMenu();

		Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
		System.err.println("Yeesss");
		waitress.printMenu();
	}
}