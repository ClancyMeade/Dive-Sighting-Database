
public abstract class Sighting {
	protected String time;
	protected String diveSite;
	protected int waterTemperature;
	protected int depth;
	protected String date;
	protected String type;

	public void displayNumericalData() {
		System.out.println("Dive Time: " + time + "\nWater Temp: " + waterTemperature + " degrees fahrenheight\nDepth: "
				+ depth + " feet\nDate: " + date);
		System.out.println();
	}

	public void displaySightingType() {
		System.out.println("Dive Sighting: " + type);
	}

	public abstract void displayDiveSite();

}
