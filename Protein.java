package Story1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Author: Nikhil Mathur
 * Purpose: A particular type of food, will implement the interface and override the given methods. 
 */
public class Protein implements FoodType {
	
	private String name;//Will assign the food type a name 
	private ArrayList<String> examplesOfProtein; //Will assign the food type example of given foods. 
	private Scanner input;// Allow user to input values. 
	
	public Protein() {
		this.name = "Protein"; //Will assign a name to the food type. 
		this.examplesOfProtein = new ArrayList<String>();
		this.examplesOfProtein.add("Chicken");// Will insert data into the array list. 
		this.examplesOfProtein.add("Beef"); //Element inserted
		this.examplesOfProtein.add("Turkey"); //Element inserted
		this.examplesOfProtein.add("Eggs"); //Element inserted
		this.input = new Scanner(System.in);
	}
	
	/**
	 * Will get the name of the food type
	 * @return --> Will return the value of the attribute. 
	 */
	@Override
	public String getName() {
		return name;
	}
	/**
	 * Will set the name of the 
	 * @param name --> The new name to be assigned. 
	 */
	@Override
	public boolean setName(String name) {
		try {
			if (name != null) { //Will check if the name is valid. 
				this.name = name; //If valid then the assignment will take place. 
				return true;
			}else {
				System.out.println("This is not valid!"); //If not then a message will be displayed. 
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
			if (this.examplesOfProtein.size() != 0 && this.examplesOfProtein!= null) { //Will check if the data structure is null or if elements are within. 
				for (int index = 0; index < this.examplesOfProtein.size(); index++) {
					System.out.println(this.examplesOfProtein.get(index)); //Displays all contents appropriately. 
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
		if (this.examplesOfProtein.size() != 0 && this.examplesOfProtein != null) { //Will first check if the data structure is null and if  elements are within the data structure. 
			displayExamples(); //Will call the private method. 
			int choice = input.nextInt(); //Will signal the user to enter a value. 
			
			if (choice >= 1 && choice <= this.examplesOfProtein.size()) { // Will identify if the user select is valid. 
				this.examplesOfProtein.remove(choice-1); //Will accordingly remove the element from the array list. 
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
				this.examplesOfProtein.add(newExample);//Will insert if valid. 
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
	//A method to display storage of product for a hot wet climate. 
	@Override
	public boolean getStorageOfProductHotWet() {
		try {
			BufferedReader bufferReader = new BufferedReader(new FileReader("ProteinManagementHotWet.txt"));
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
	
	//A method to display storage of product for a hot dry climate. 
	@Override
	public boolean getStorageOfProductHotDry() {
		try {
			BufferedReader bufferReader = new BufferedReader(new FileReader("ProteinManagementHotDry.txt"));
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
	//A method to display storage of product for a cold wet climate. 
	@Override
	public boolean getStorageOfProductColdWet() {
		try {
			BufferedReader bufferReader = new BufferedReader(new FileReader("ProteinManagementColdWet.txt"));
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
	//A method to display storage of product for a cold dry climate. 
	@Override
	public boolean getStorageOfProductColdDry() {
		try {
			BufferedReader bufferReader = new BufferedReader(new FileReader("ProteinManagementColdDry.txt"));
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
	//A method to display disposal and recycling for a hot wet climate. 
	@Override
	public boolean getDisposalRecyclingHotWet() {
		try {
			BufferedReader bufferReader = new BufferedReader(new FileReader("DisposalRecyclingProteinsHotWet.txt"));
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
	//A method to display disposal and recycling for a hot dry climate. 
	@Override
	public boolean getDisposalRecyclingHotDry() {
		try {
			BufferedReader bufferReader = new BufferedReader(new FileReader("DisposalRecyclingProteinsHotDry.txt"));
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
	//A method to display disposal and recycling for a cold wet climate. 
	@Override
	public boolean getDisposalRecyclingColdWet() {
		try {
			BufferedReader bufferReader = new BufferedReader(new FileReader("DisposalRecyclingProteinsColdWet.txt"));
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
	//A method to display disposal and recycling for a cold dry climate. 
	@Override
	public boolean getDisposalRecyclingColdDry() {
		try {
			BufferedReader bufferReader = new BufferedReader(new FileReader("DisposalRecyclingProteinsColdDry.txt"));
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
