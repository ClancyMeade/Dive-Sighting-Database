
public abstract class NonlivingSighting extends Sighting {

	protected int distanceFromCoast;

	// concrete method
	public void displayDistanceFromCoast() {
		System.out.println("This nonliving sighting is " + distanceFromCoast + "miles from the coast.");
	}

}
