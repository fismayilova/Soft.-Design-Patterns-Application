
public class studentGrowUP implements GrowUPBehavior {
	Transport tr = new Transport("");

	@Override
	public void growUP() {
		if (tr.getName() == "Bus") {
			tr.setName("Train");
		}
	}

}
