package Story1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Author: Nikhil Mathur
 * Purpose: A type of food type, which implements the food type interface. Will override all methods which are present within the food type interface.
 */
public class RefinedGrains implements FoodType {
	
	private String name;// Will store the name of the food type. 
	private ArrayList<String> examplesOfRefinedGrains; //Will store examples of refined grains 
	private Scanner input; //Will enable users to input their requirements. 
	
	/**
	 * Constructor used to initialize food type's more specifically. 
	 * My initializing the name of the food type, and adding details in regards to the types of refined grains. 
	 */
	public RefinedGrains() {
		this.name = "Refined Grains"; //The name of the food type. 
		this.examplesOfRefinedGrains = new ArrayList<String>();
		this.examplesOfRefinedGrains.add("White bread"); //Adding the examples of refined grains. 
		this.examplesOfRefinedGrains.add("Crackers");
		this.examplesOfRefinedGrains.add("Breakfast cereals");
		this.examplesOfRefinedGrains.add("Yogurt");
		this.input = new Scanner(System.in); //New user input initialized. 
	}
	/**
	 * A getter which retrieves the name of the food type. 
	 * @return --> Returns the name of the food type. 
	 */
	@Override
	public String getName() {
		return name;
	}
	
	/**
	 * A setter which sets a new name to the food type.
	 * @param name --> The new name assigned to the attribute. 
	 */
	@Override
	public boolean setName(String name) {
		try {
			if (name != null) { //Checks if null for security purposes. 
				this.name = name; //Will assign the new name to the attribute. 
				return true;
			}else {
				System.out.println("This is not valid!");
				return false;
			}
		}catch(Exception ex) {
			System.out.println("An error occured");
			return false;
		}
	}	
	/**
	 * A function which displays the contents of the array list, by displaying all the elements within. 
	 */
	@Override
	public boolean displayExamples() {
		try {
			if (examplesOfRefinedGrains.size() != 0 && examplesOfRefinedGrains!= null) { //Will check if the data structure is null or if elements are within. 
				for (int index = 0; index < this.examplesOfRefinedGrains.size(); index++) {
					System.out.println(this.examplesOfRefinedGrains.get(index)); //Displays all contents appropriately. 
				}
				return true;
			}else {
				System.out.println("This is not possible!");
				return false;
			}
		}catch(Exception ex) {
			System.out.println("An error occured");
			return false;
		}
	}
	
	/**
	 * A method which allows elements within the array list to be removed if needed. 
	 */
	@Override
	public boolean deleteFromExamples() {
		if (this.examplesOfRefinedGrains.size() != 0 && this.examplesOfRefinedGrains != null) { //Will first check if the data structure is null and if  elements are within the data structure. 
			displayExamples(); //Will call the private method. 
			int choice = input.nextInt(); //Will signal the user to enter a value. 
			
			if (choice >= 1 && choice <= this.examplesOfRefinedGrains.size()) { // Will identify if the user select is valid. 
				this.examplesOfRefinedGrains.remove(choice-1); //Will accordingly remove the element from the array list. 
				return true;
			}else {
				System.out.println("This is not valid!"); //Display message to the user.
				return false;
			}
		}else {
			System.out.println("This is not valid!");//Displays message to the user. 
			return false;
		}
	}
	
	/**
	 * A method which allows elements to be added to the array list. 
	 * @param newExample --> New data to be inserted into the array list. 
	 */
	@Override
	public boolean addToExamples(String newExample) {
		try {
			if (newExample != null) { //Will first check if the new data to be inserted is valid. 
				this.examplesOfRefinedGrains.add(newExample);//Will insert if valid. 
				return true;
			}else {
				System.out.println("This is not valid!"); //If not valid then a message will be displayed. 
				return false;
			}	
		}catch(Exception ex) {
			System.out.println("An error occured");
			return false;
		}
		
	}
	/**
	 * Method which is used to display information in regards to storage of product's in hot wet environment. 
	 */
	@Override
	public boolean getStorageOfProductHotWet() {
		try {
			BufferedReader bufferReader = new BufferedReader(new FileReader("ManagementRefinedGrainsHotWet.txt"));
			String line;
			while ((line = bufferReader.readLine()) != null) {
				System.out.println(line);
			}
			return true;
		}catch(Exception ex){
			System.out.println(ex);
			return false;
		}
	}
	/**
	 * Method which is used to display information in regards to storage of products in hot dry environment.
	 */

	@Override
	public boolean getStorageOfProductHotDry() {
		try {
			BufferedReader bufferReader = new BufferedReader(new FileReader("HotDryManagementRefinedGrains.txt"));
			String line;
			while ((line = bufferReader.readLine()) != null) {
				System.out.println(line);
			}
			return true;
		}catch(Exception ex){
			System.out.println(ex);
			return false;
		}

	}
	/**
	 * Method which is used to display information in regards to storage of products in cold wet environment. 
	 */
	@Override
	public boolean getStorageOfProductColdWet() {
		try {
			BufferedReader bufferReader = new BufferedReader(new FileReader("RefinedGrainsManagementColdWet.txt"));
			String line;
			while ((line = bufferReader.readLine()) != null) {
				System.out.println(line);
			}
			return true;
		}catch(Exception ex){
			System.out.println(ex);
			return false;
		}
	}
	
	/**
	 * Method which is used to display information in regards to storage of products in cold wet environment.
	 */
	@Override
	public boolean getStorageOfProductColdDry() {
		try {
			BufferedReader bufferReader = new BufferedReader(new FileReader("ManagementOfRefinedGrainsColdDry.txt"));
			String line;
			while ((line = bufferReader.readLine()) != null) {
				System.out.println(line);
			}
			return true;
		}catch(Exception ex){
			System.out.println(ex);
			return false;
		}
	}
	
	/**
	 * Method which is used to display information in regards to disposal and recycling in a hot wet environment.
	 */
	@Override
	public boolean getDisposalRecyclingHotWet() {
		try {
			BufferedReader bufferReader = new BufferedReader(new FileReader("DisposalRecyclingHotWetRefinedGrains.txt"));
			String line;
			while ((line = bufferReader.readLine()) != null) {
				System.out.println(line);
			}
			return true;
		}catch(Exception ex){
			System.out.println(ex);
			return false;
		}
	}
	
	/**
	 * Method which is used to display information in regards to disposal and recycling in a hot dry environment.
	 */
	@Override
	public boolean getDisposalRecyclingHotDry() {
		try {
			BufferedReader bufferReader = new BufferedReader(new FileReader("RefinedGrainsDisposalRecyclingHotDry.txt"));
			String line;
			while ((line = bufferReader.readLine()) != null) {
				System.out.println(line);
			}
			return true;
		}catch(Exception ex){
			System.out.println(ex);
			return false;
		}
	}
	
	/**
	 * Method which is used to display information in regards to disposal and recycling in a cold wet environment.
	 */
	@Override
	public boolean getDisposalRecyclingColdWet() {
		try {
			BufferedReader bufferReader = new BufferedReader(new FileReader("DisposalRecyclingRefinedGrainsColdWet.txt"));
			String line;
			while ((line = bufferReader.readLine()) != null) {
				System.out.println(line);
			}
			return true;
		}catch(Exception ex){
			System.out.println(ex);
			return false;
		}
	}
	
	/**
	 * Method which is used to display information in regards to disposal and recycling in a cold dry environment.
	 */
	@Override
	public boolean getDisposalRecyclingColdDry() {
		try {
			BufferedReader bufferReader = new BufferedReader(new FileReader("DisposalRecyclingRefinedGrainsColdDry.txt"));
			String line;
			while ((line = bufferReader.readLine()) != null) {
				System.out.println(line);
			}
			return true;
		}catch(Exception ex){
			System.out.println(ex);
			return false;
		}
	}
	

}

