
public class AnimalSighting extends LivingSighting
	{

		protected String foodSource; 
		protected int totalNumber;
		
		public AnimalSighting()
		{ 
			foodSource = "sea grass";
			totalNumber = 3; 
			scientificName = "cfhelonia mydas"; 
			color = "green"; 
			commonName = "Green Sea Turtle";
			
		}
		
		
		
		@Override
		public void displayDiveSite()
			{
				System.out.println("This animal was found at the " + diveSite + "dive site.");
				
			}

		@Override
		public void displayColor()
			{
				System.out.println("The color of this animal is " + color);
				
			} 
	}
