package Story1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Author: Nikhil Mathur
 * Purpose: This class is to represent a specific food type. It implements the interface food type. 
 */
public class VegetableFruit implements FoodType {
	
	private String name; //A variable specifying the name of the food type. 
	private ArrayList<String>examplesOfVegetableFruit; //An array list used to store the different examples of vegetable fruit.
	private Scanner input; //Input allowing user to input values. 
	/**
	 * Constructor initializing the vegetableFruit class. Where all attributes are supplemented with information.
	 */
	public VegetableFruit() {
		this.name = "Vegetable&Fruit"; //Initializes the name of the food type. 
		this.examplesOfVegetableFruit = new ArrayList<String>();
		this.examplesOfVegetableFruit.add("Apple"); // Adds to the examples array list. 
		this.examplesOfVegetableFruit.add("Cucumber"); //Element added.
		this.examplesOfVegetableFruit.add("Orange"); //Element added.
		this.examplesOfVegetableFruit.add("Lemon"); //Element added
		this.input = new Scanner(System.in); //the input is initialized. 
	}
	
	/**
	 * This method is to return the name of the food type. 
	 * @return
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * This method is to set a new name for the food type. 
	 * @param name --> The new name to be assigned. 
	 */
	@Override
	public boolean setName(String name) {
		try {
			if (name != null) { //Will check if the new name to be assigned is valid. 
				this.name = name; //If yes the new value will be assigned. 
				return true;
			}else {
				System.out.println("This is not valid!");
				return false;
			}	
		}catch(Exception ex) {
			System.out.println("This is not valid");
			return false;
		}
	}
	
	/**
	 * A function which displays the contents of the array list, by displaying all the elements within. 
	 */
	@Override
	public boolean displayExamples() {
		try {
			if (this.examplesOfVegetableFruit.size() != 0 && this.examplesOfVegetableFruit!= null) { //Will check if the data structure is null or if elements are within. 
				for (int index = 0; index < this.examplesOfVegetableFruit.size(); index++) {
					System.out.println(this.examplesOfVegetableFruit.get(index)); //Displays all contents appropriately. 	
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
		if (this.examplesOfVegetableFruit.size() != 0 && this.examplesOfVegetableFruit != null) { //Will first check if the data structure is null and if  elements are within the data structure. 
			displayExamples(); //Will call the private method. 
			int choice = input.nextInt(); //Will signal the user to enter a value. 
			
			if (choice >= 1 && choice <= this.examplesOfVegetableFruit.size()) { // Will identify if the user select is valid. 
				this.examplesOfVegetableFruit.remove(choice-1); //Will accordingly remove the element from the array list. 
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
				this.examplesOfVegetableFruit.add(newExample);//Will insert if valid. 
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
	 * A method which gets information about storage of products in a hot wet environment. 
	 */
	@Override
	public boolean getStorageOfProductHotWet() {
		try {
			BufferedReader bufferReader = new BufferedReader(new FileReader("VegetablesFruitsManagementHotWet.txt"));
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
	 * A method which gets information about storage of products in a hot dry environment.
	 */
	@Override
	public boolean getStorageOfProductHotDry() {
		try {
			BufferedReader bufferReader = new BufferedReader(new FileReader("VegetablesFruitsHotDryManagement.txt"));
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
	 * A method which gets information about storage of products in a cold wet environment. 
	 */
	@Override
	public boolean getStorageOfProductColdWet() {
		try {
			BufferedReader bufferReader = new BufferedReader(new FileReader("VegetablesFruitColdWetManagement.txt"));
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
	 * A method which gets information about storage of products in a cold dry environment. 
	 */
	@Override
	public boolean getStorageOfProductColdDry() {
		try {
			BufferedReader bufferReader = new BufferedReader(new FileReader("VegetablesFrutisManagementColdDry.txt"));
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
	 * A method which gets information about disposal and recycling in a hot wet environment. 
	 */
	@Override
	public boolean getDisposalRecyclingHotWet() {
		try {
			BufferedReader bufferReader = new BufferedReader(new FileReader("VegetablesFruitsDisposalRecyclingHotWet.txt"));
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
	 * A method which gets information about disposing and recycling in a hot dry environment. 
	 */
	@Override
	public boolean getDisposalRecyclingHotDry() {
		try {
			BufferedReader bufferReader = new BufferedReader(new FileReader("VegetablesFruitsDisposalRecyclingHotDry.txt"));
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
	 * A method which gets information about disposing and recycling in a cold wet environment. 
	 */
	@Override
	public boolean getDisposalRecyclingColdWet() {
		try {
			BufferedReader bufferReader = new BufferedReader(new FileReader("VegetablesFruitsDisposalRecyclingColdWet.txt"));
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
	 * A method which gets information about disposing and recycling in a cold dry environment. 
	 */
	@Override
	public boolean getDisposalRecyclingColdDry() {
		try {
			BufferedReader bufferReader = new BufferedReader(new FileReader("DisposalRecyclingColdDryVegetablesFruits.txt"));
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
