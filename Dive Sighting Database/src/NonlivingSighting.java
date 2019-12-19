
public abstract class NonlivingSighting extends Sighting {

	protected int distanceFromCoast;
	protected boolean hasSeaLife;

	// concrete method
	public void displayDistanceFromCoast() {
		System.out.println("This nonliving sighting is " + distanceFromCoast + " miles from the coast.");
	}

	public void displaySeaLife() {
		if (hasSeaLife == true) {
			System.out.println("This nonliving sighting does have sea life in the area.");
		}

		else {
			System.out.println("This nonliving sighting does not have sea life in the area.");
		}
	}

}
