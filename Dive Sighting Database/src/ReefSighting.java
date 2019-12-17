
public class ReefSighting extends LivingSighting
	{
		protected int area; 
		protected String shape; 
		protected String type;
		
		public ReefSighting()
		{ 
			scientificName = "Acropora palmata"; 
			color = "blue"; 
			area = 50; 
			shape = "horn";
			
			
		}
		
		@Override
		public void displayColor()
			{
				System.out.println("The color of this coral reef is " + color);
				
			}
		@Override
		public void displayDiveSite()
			{
				System.out.println("This reef was found at the " + diveSite + " dive site.");
				
			} 
		
		public void displayArea()
		{ 
			System.out.println("The area of this reef is " + area + " feet.");
		}

		public void displayShape()
		{
			 System.out.println("The shape of this coral is " + shape + " shaped.");
		} 
	}
