
public class WreckSighting extends NonlivingSighting {
	protected double width;
	protected double length;
	protected double height;
	protected double volume;

	public WreckSighting() {
		time = "10:34 AM";
		diveSite = "Yongola";
		waterTemperature = 75;
		depth = 52;
		type = "Wreck Sighting";
		date = "9/6/19";
		distanceFromCoast = 4;
		hasSeaLife = false;
		width = 35.3;
		length = 88.4;
		height = 90.9;
		volume = width * length * height;

	}

	@Override
	public void displayDiveSite() {
		System.out.println("This wreck was found at the " + diveSite + "dive site.");
	}

	public void displayVolume() {
		System.out.println("The approximated volume of this wreck is " + volume + " cubic feet.");
	}
}
