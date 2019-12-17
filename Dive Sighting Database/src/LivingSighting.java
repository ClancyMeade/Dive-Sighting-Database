
public abstract class LivingSighting extends Sighting
	{
		protected String scientificName; 
		protected String color; 
		protected String commonName; 
		
		public void displaySpecies()
		{ 
			System.out.println("New animal found, Scientific Name: " + scientificName);
		}
		
		public abstract void displayColor(); 
	}
