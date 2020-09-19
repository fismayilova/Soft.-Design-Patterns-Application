package Lab8;

public class HouseConstructionTest {

	public static void main(String[] args) {
		Base base = new Base();
		Walls walls = new Walls();
		Floor floor = new Floor();
		Roof roof = new Roof();
		WindowsWithHook windowsWithHook = new WindowsWithHook();
		DoorsWithHook doorsWithHook = new DoorsWithHook();
		System.out.println("\nBuilding a House...\n");
		base.buildHouse();
		System.out.println();
		walls.buildHouse();
		System.out.println();
		floor.buildHouse();
		System.out.println("\nFinishing the Construction...");
		roof.buildHouse();
		System.out.println("\nAdding Windows and Doors...");
		windowsWithHook.buildHouse();
		System.out.println();
		doorsWithHook.buildHouse();
		System.out.println("The House is ready to move in");
	}
}