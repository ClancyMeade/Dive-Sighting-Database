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

		Sighting[] sightings = new Sighting[4];
		{
			sightings[0] = new AnimalSighting();
			sightings[1] = new ReefSighting();
			sightings[2] = new WreckSighting();
			sightings[3] = new TreasureSighting();
		}

		for (Sighting s : sightings) {
			s.displaySightingType();
		}

		String diveSightingChoice = userInput.nextLine();

		System.out.println("Great, here is some more information.");

		if (diveSightingChoice.toUpperCase().equals("ANIMAL SIGHTING")) {

			System.out.println();
			AnimalSighting firstSighting = new AnimalSighting();
			
			firstSighting.displayNumericalData();
			firstSighting.displayDiveSite();
			firstSighting.displaySpecies();
			firstSighting.displayColor();
			firstSighting.displayFoodSource();
		}

		else if (diveSightingChoice.toUpperCase().equals("REEF SIGHTING"))

		{
			System.out.println();
			ReefSighting secondSighting = new ReefSighting();
			
			secondSighting.displayNumericalData();
			secondSighting.displayDiveSite();
			secondSighting.displaySpecies();
			secondSighting.displayColor();
			secondSighting.displayArea();
			secondSighting.displayShape();
		}

		else if (diveSightingChoice.toUpperCase().equals("WRECK SIGHTING")) {

			System.out.println();
			WreckSighting thirdSighting = new WreckSighting();

			thirdSighting.displayNumericalData();
			thirdSighting.displayDiveSite();
			thirdSighting.displayDistanceFromCoast();
			thirdSighting.displaySeaLife();
			thirdSighting.displayVolume();
		}

		else if (diveSightingChoice.toUpperCase().equals("TREASURE SIGHTING")) {
			
			System.out.println();
			TreasureSighting fourthSighting = new TreasureSighting();
			
			fourthSighting.displayNumericalData();
			fourthSighting.displayDiveSite();
			fourthSighting.displayDistanceFromCoast();
			fourthSighting.displaySeaLife();
			fourthSighting.displayValueSource();

		}

	}

}
