package Story1;
/**
 * Author: Nikhil Mathur
 * Purpose: To create an interface/template for types of food. 
 */
public interface FoodType {
	// These are all the methods which a class which implements the interface needs to override. 
	
	public String getName();
	public boolean setName(String name);
	public boolean displayExamples();
	public boolean deleteFromExamples();
	public boolean addToExamples(String newExample);
	
	//Manages the Storage of Product section. 
	public boolean getStorageOfProductHotWet();
	public boolean getStorageOfProductHotDry();
	public boolean getStorageOfProductColdWet();
	public boolean getStorageOfProductColdDry();
	//Manages the Disposal and Recycling section. 
	public boolean getDisposalRecyclingHotWet();
	public boolean getDisposalRecyclingHotDry();
	public boolean getDisposalRecyclingColdWet();
	public boolean getDisposalRecyclingColdDry();
	
	
	
	
}
