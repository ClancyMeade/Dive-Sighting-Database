
public abstract class LivingSighting extends Sighting {
	protected String scientificName;
	protected String color;
	protected String commonName;

	public void displaySpecies() {
		System.out.println("A new " + scientificName + ", commonly known as the " + commonName + " was found.");
	}

	public abstract void displayColor();
}
