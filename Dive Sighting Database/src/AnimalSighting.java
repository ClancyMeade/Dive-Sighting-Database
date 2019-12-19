
public class AnimalSighting extends LivingSighting {

	protected String foodSource;
	protected int totalNumber;

	public AnimalSighting() {
		time = "9:00 AM";
		diveSite = "Ambergris Caye";
		waterTemperature = 82;
		depth = 60;
		type = "Animal Sighting";
		date = "5/5/19";
		scientificName = "Chelonia Mydas";
		color = "green";
		commonName = "green sea turtle";
		foodSource = "sea grass";
		totalNumber = 3;

	}

	@Override
	public void displayDiveSite() {
		System.out.println("This animal was found at the " + diveSite + " dive site.");

	}

	@Override
	public void displayColor() {
		System.out.println("The color of this animal is " + color + ".");

	}

	public void displayFoodSource() {
		System.out.println("This animal was found eating " + foodSource + " in a group of " + totalNumber + " others.");
	}
}
