package Lab9;

import java.util.Map;

public class Reception {
	ListVendor listRooms;
	HashMapVendor hashRooms;
	TreeVendor treeRooms;

	public Reception(ListVendor listRooms, HashMapVendor hashRooms, TreeVendor treeRooms) {
		this.listRooms = listRooms;
		this.hashRooms = hashRooms;
		this.treeRooms = treeRooms;
	}

	public void printRoomListing() {
		System.out.println("LIST");
		Lab9.Iterator list = listRooms.createIterator();
		printRoomListing(list, "hey");
		System.out.println();
		System.out.println("TREE");
		Lab9.Iterator tree = treeRooms.createIterator();
		printRoomListing(tree, 2);
		System.out.println();
		System.out.println("\nHASHMAP");
		Lab9.Iterator hashRIter = hashRooms.createIterator();
		printRoomListing(hashRIter);
	}

	private void printRoomListing(Iterator tree, int i) {
		while (tree.hasNext()) {
			System.out.println(tree.next());
		}
	}

	private void printRoomListing(Lab9.Iterator list, String string) {
		while (list.hasNext()) {
			System.out.print(list.next() + "\n");
		}
	}

	private void printRoomListing(Lab9.Iterator hashRIter) {
		while (hashRIter.hasNext()) {
			Map.Entry<?, ?> mapElement = (Map.Entry<?, ?>) hashRIter.next();
			int marks = ((int) mapElement.getValue());
			System.out.println(mapElement.toString() + " : " + marks);
		}
	}
}