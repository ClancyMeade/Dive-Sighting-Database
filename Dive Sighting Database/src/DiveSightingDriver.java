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
		
boolean keepViewing = true;  
		
		while(keepViewing)
			{

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
			userInput.nextLine(); 
			firstSighting.displayDiveSite();
			userInput.nextLine();
			firstSighting.displaySpecies();
			userInput.nextLine();
			firstSighting.displayColor();
			userInput.nextLine();
			firstSighting.displayFoodSource();
		}

		else if (diveSightingChoice.toUpperCase().equals("REEF SIGHTING"))

		{
			System.out.println();
			ReefSighting secondSighting = new ReefSighting();
			
			secondSighting.displayNumericalData();
			userInput.nextLine();
			secondSighting.displayDiveSite();
			userInput.nextLine();
			secondSighting.displaySpecies();
			userInput.nextLine();
			secondSighting.displayColor();
			userInput.nextLine();
			secondSighting.displayArea();
			userInput.nextLine();
			secondSighting.displayShape();
		}

		else if (diveSightingChoice.toUpperCase().equals("WRECK SIGHTING")) {

			System.out.println();
			WreckSighting thirdSighting = new WreckSighting();

			thirdSighting.displayNumericalData();
			userInput.nextLine();
			thirdSighting.displayDiveSite();
			userInput.nextLine();
			thirdSighting.displayDistanceFromCoast();
			userInput.nextLine();
			thirdSighting.displaySeaLife();
			userInput.nextLine();
			thirdSighting.displayVolume();
		}

		else if (diveSightingChoice.toUpperCase().equals("TREASURE SIGHTING")) {
			
			System.out.println();
			TreasureSighting fourthSighting = new TreasureSighting();
			
			fourthSighting.displayNumericalData();
			userInput.nextLine();
			fourthSighting.displayDiveSite();
			userInput.nextLine();
			fourthSighting.displayDistanceFromCoast();
			userInput.nextLine();
			fourthSighting.displaySeaLife();
			userInput.nextLine();
			fourthSighting.displayValueSource();

		}
		
		System.out.println();
		
		System.out.println("Would you like to view a different dive sighting? \n(1) Yes \n(2) No");
		
		Scanner intInput = new Scanner(System.in); 
		
		int keepSightingNum = intInput.nextInt(); 
		
		if(keepSightingNum == 1)
			{ 
				keepViewing = true; 
			}
		else if(keepSightingNum == 2)
			{
				keepViewing = false; 
				System.out.println("Have a great day!");
			}
	
		
			}

	}

}
