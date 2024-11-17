package Story1;

/**
 * Author: Conor Casey 
 * This interface lists the common methods where are to be implemented for classes which utilize this interface.
 */
public interface Section {
	public String getName(); // Getter to get name
	public boolean setName(String newName); // The setter to set the name. 
	public int getMenuChoice(); // To get the menu choice. 
	public boolean managementOfRefinedGrains(int choice); // To manage refined grains
	public boolean mangagementOfVegetableFruit(int choice); // To manage vegetable and fruit. 
	public boolean managementOfProtein(int choice); // To manage protein.
	public boolean mangagementOfSugars(int choice); // To manage sugars.
	public void FoodType(int choice); // To process the food type choice. 
	
	
	
	
}
