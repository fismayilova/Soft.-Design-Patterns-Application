package Lab9;

public class Test {

	public static void main(String[] args) {
		ListVendor listRoom = new ListVendor();
		HashMapVendor hashRoom = new HashMapVendor();
		TreeVendor treeRooms = new TreeVendor();

		Reception reception = new Reception(listRoom, hashRoom, treeRooms);
		reception.printRoomListing();
	}
}