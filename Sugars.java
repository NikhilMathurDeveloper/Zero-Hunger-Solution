package Story1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Author: Nikhil Mathur
 * Purpose: To represent a type of food, and implements the interface food type. 
 */
public class Sugars implements FoodType {
	
	private String name; //Represents the name of the food type. 
	private ArrayList<String> typeOfSugars;
	private Scanner input;
	
	
	public Sugars() {
		this.name = "Sugars";
		this.typeOfSugars = new ArrayList<String>();
		this.typeOfSugars.add("Honey");
		this.typeOfSugars.add("Sugar");
		this.typeOfSugars.add("Brown sugar");
		this.typeOfSugars.add("Liquid Sugar");
		this.input = new Scanner(System.in);
	}
	//Will get the name of the food type. 
	@Override
	public String getName() {
		return name;
	}
	
	/**
	 * Will set a new name to the food type. 
	 * @param name --> The new name assigned to the food type. 
	 */
	@Override
	public boolean setName(String name) {
		try {
			if (name != null) { //Will check if the new assignment is valid. 
				this.name = name; //If valid then the assignment will be organized. 
				return true;
			}else {
				System.out.println("This is not possible"); //If not possible then the error mesasge will be displayed. 
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
			if (this.typeOfSugars.size() != 0 && this.typeOfSugars!= null) { //Will check if the data structure is null or if elements are within. 
				for (int index = 0; index < this.typeOfSugars.size(); index++) {
					System.out.println(this.typeOfSugars.get(index)); //Displays all contents appropriately. 
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
		if (this.typeOfSugars.size() != 0 && this.typeOfSugars != null) { //Will first check if the data structure is null and if  elements are within the data structure. 
			displayExamples(); //Will call the private method. 
			int choice = input.nextInt(); //Will signal the user to enter a value. 
			
			if (choice >= 1 && choice <= this.typeOfSugars.size()) { // Will identify if the user select is valid. 
				this.typeOfSugars.remove(choice-1); //Will accordingly remove the element from the array list. 
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
				this.typeOfSugars.add(newExample);//Will insert if valid. 
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
	// Will provide information about storage of product in hot wet environment. 
	@Override
	public boolean getStorageOfProductHotWet() {
		try {
			BufferedReader bufferReader = new BufferedReader(new FileReader("SugarManagementHotWet.txt"));
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
	// Will provide information about storage of product in hot dry environment. 
	@Override
	public boolean getStorageOfProductHotDry() {
		try {
			BufferedReader bufferReader = new BufferedReader(new FileReader("SugarHotDryManagement.txt"));
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
	// Will provide information about storage of product in cold wet environment. 
	@Override
	public boolean getStorageOfProductColdWet() {
		try {
			BufferedReader bufferReader = new BufferedReader(new FileReader("SugarManagementColdWet.txt"));
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
	// Will provide information about storage of product in cold dry environment. 
	@Override
	public boolean getStorageOfProductColdDry() {
		try {
			BufferedReader bufferReader = new BufferedReader(new FileReader("StorageOfProductSugarColdDry.txt"));
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
	// Will provide information about disposal of recycling in hot wet environment. 
	@Override
	public boolean getDisposalRecyclingHotWet() {
		try {
			BufferedReader bufferReader = new BufferedReader(new FileReader("SugarsDisposalRecyclingHotWet.txt"));
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
	// Will provide information about disposal of recycling in hot dry environment. 
	@Override
	public boolean getDisposalRecyclingHotDry() {
		try {
			BufferedReader bufferReader = new BufferedReader(new FileReader("SugarHotDryDisposalRecycling.txt"));
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
	// Will provide information about disposal of recycling in cold wet environment. 
	@Override
	public boolean getDisposalRecyclingColdWet() {
		try {
			BufferedReader bufferReader = new BufferedReader(new FileReader("SugarColdWetDisposalRecycling.txt"));
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
	// Will provide information about disposal of recycling in hot dry environment. 
	@Override
	public boolean getDisposalRecyclingColdDry() {
		try {
			BufferedReader bufferReader = new BufferedReader(new FileReader("DisposalRecyclingSugarsColdDry.txt"));
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

