
public class TreasureSighting extends NonlivingSighting {
	protected int value;
	protected String predictedSource;

	public TreasureSighting() {
		value = 500000;
		predictedSource = "Shipwreck";
	}

	@Override
	public void displayDiveSite() {
		System.out.println("The dive site that this treasure was sighted at was the " + diveSite + "dive site.");

	}

	public void displayValueSource() {
		System.out.println("The value of the treasure found at this sighting is " + value
				+ ", and it is predicted that it came from a " + predictedSource);
	}
}
