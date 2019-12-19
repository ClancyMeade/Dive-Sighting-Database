
public class ReefSighting extends LivingSighting {
	protected int area;
	protected String shape;

	public ReefSighting() {
		time = "2:55 PM";
		diveSite = "Great Barrier";
		waterTemperature = 86;
		depth = 40;
		type = "Reef Sighting";
		date = "7/18/19";
		scientificName = "Acropora Palmata";
		color = "blue";
		commonName = "Elkhorn Coral";
		shape = "horn";
		area = 50;

	}

	@Override
	public void displayColor() {
		System.out.println("The color of this coral reef is " + color + ".");

	}

	@Override
	public void displayDiveSite() {
		System.out.println("This reef was found at the " + diveSite + " dive site.");

	}

	public void displayArea() {
		System.out.println("The area of this reef is " + area + " square feet.");
	}

	public void displayShape() {
		System.out.println("The shape of this coral is " + shape + " shaped.");
	}
}
