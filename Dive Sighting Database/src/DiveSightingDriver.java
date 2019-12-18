import java.util.Scanner;

public class DiveSightingDriver {

	public static void main(String[] args) {

		System.out.println("Hello welcome to the dive sighting database. What is your name?");

		Scanner userInput = new Scanner(System.in);

		String name = userInput.nextLine();

		System.out.println();

		System.out.println("Hello, " + name
				+ ", please choose from a dive sighting below, enter the sighting type for more information");

		System.out.println();

		Sighting[] sightings = new Sighting[3];
		{
			sightings[0] = new AnimalSighting();
			sightings[1] = new ReefSighting();
			sightings[2] = new WreckSighting();
		}

		for (Sighting s : sightings) {
			s.displaySightingType();
		}

		String diveSightingChoice = userInput.nextLine();

		if (diveSightingChoice.toUpperCase().equals("ANIMAL SIGHTING")) {

			System.out.println("Great, here is some more information: ");
			System.out.println();

			AnimalSighting firstSighting = new AnimalSighting();
			firstSighting.displayDiveSite();
			firstSighting.displayColor();
			firstSighting.displayFoodSource();
		}

		else if (diveSightingChoice.toUpperCase().equals("REEF SIGHTING"))

		{

			System.out.println("Great, here is some more information: ");
			System.out.println();
			ReefSighting firstSighting = new ReefSighting();
			firstSighting.displayDiveSite();
			firstSighting.displayArea();
			firstSighting.displayShape();
		}

		else if (diveSightingChoice.toUpperCase().equals("WRECK SIGHTING"))
			;
		{
			System.out.println("Great, here is some more information: ");
			System.out.println();
			WreckSighting firstSighting = new WreckSighting();

			firstSighting.displayDiveSite();
			firstSighting.displayVolume();

		}
	}

}
