
public abstract class Sighting {
	protected int time;
	protected String diveSite;
	protected int waterTemperature;
	protected int depth;
	protected String date;
	protected String type;

	// Concrete Method
	public void displayNumericalData() {
		System.out.println(
				"Data Entry 1: \n Dive Time: " + time + "\n Water Temp: " + waterTemperature + "\n Depth: " + depth);
	}

	// Abstract Method
	public abstract void displayDiveSite();

	public void displaySightingType() {
		System.out.println("Dive Sighting: " + type);
	}

}
