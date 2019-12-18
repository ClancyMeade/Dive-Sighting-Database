
public class WreckSighting extends NonlivingSighting {
	protected double width;
	protected double length;
	protected double height;
	protected double volume;

	public WreckSighting() {
		width = 35.3;
		length = 88.4;
		height = 90.9;
		volume = width * length * height;
		diveSite = "Yongola";
		type = "Wreck Sighting";

	}

	@Override
	public void displayDiveSite() {
		System.out.println("This wreck was found at the " + diveSite + "dive site.");
	}

	public void displayVolume() {
		System.out.println("The approximated volume of this wreck is " + volume + " cubic feet.");
	}
}
