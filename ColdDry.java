package Story1;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * Author: Nikhil Mathur
 * Purpose: To implement the climate interface. Represents a kind of climate, which is particularly important within our system. 
 */
public class ColdDry implements Climate {
	private String name; //Name of the climate. 
	private double meanAnnualPrecipitation; // The average precipitation level. 
	private ArrayList <RankPrecipitation> differentRanks; //the precipitation rank (low, medium, high)
	private RankTemperature winterTemperatureRank; //The temperature rank during the winter. 
	private RankTemperature summerTemperatureRank; //The temperature rank during the summer. 
	private Scanner input; //Scanner enabling user input
	
	/**
	 * Constructor creating the Cold Dry climate. Assigning instance data, through assignments within the constructor. 
	 */
	public ColdDry() {
		this.name = "Cold Dry";  //Name assigned. 
		this.meanAnnualPrecipitation = 25; //Annual Precipitation level assigned. 
		this.differentRanks = new ArrayList<RankPrecipitation>(); //Array List initialized. 
		this.differentRanks.add(RankPrecipitation.SNOW); //Array List added with data. 
		this.differentRanks.add(RankPrecipitation.FOG); //Array List added with data. 
		this.winterTemperatureRank = RankTemperature.LOW; // Winter temperature rank assigned. 
		this.summerTemperatureRank = RankTemperature.MEDIUM; // Summer temperature rank assigned. 
		this.input = new Scanner(System.in); //Scanner initialized. 
	}
	
	/**
	 * Method overridden from interface implementation. 
	 */
	@Override
	public void getStorageOfProducts() {
		Section storageOfProducts = new StorageOfProduct("Storage Of Products");
		storageOfProducts.FoodType(3);
		
	}
	/**
	 * Method overridden from interface implementation.
	 */

	@Override
	public void getDisposalRecycling() {
		Section disposalRecycling = new DisposalRecycling("DisposalRecycling");
		disposalRecycling.FoodType(3);
		
	}
	/**
	 * Method overridden from interface implementation. 
	 */

	@Override
	public void getDistributionProduct() {
		// TODO Auto-generated method stub
		
	}
	/**
	 * Method used to get the name--> instance data. 
	 * @return --> Returns the name
	 */
	public String getName() {
		return this.name; 
	}
	/**
	 * Method used to assign new name to name variable. 
	 * @param newName --> New name which is to be assigned is passed as a parameter.
	 */
	public boolean setName(String newName) {
		try {
			if (newName != null) { //Checks if newName is valid.
				this.name = newName; //Will assign. 
				return true;
			}else{
				System.out.println("This is not valid");
				return false;
			}	
		}catch(Exception ex) {
			System.out.println("An error occured");
			return false;
		}
	}
	/**
	 * Will return the meanAnnualPrecipitation level. 
	 * @return --> The value returned. 
	 */
	public double getMeanAnnualPrecipitation() {
		return this.meanAnnualPrecipitation;
	}
	/**
	 * Method which allows annual precipitation to be set accordingly. 
	 * @param newLevel --> New level to be assigned is provided as a parameter.
	 */
	public boolean setAnnualPrecipitation(double newLevel) {
		try {
			if (newLevel >= 75 && newLevel <=150) { //Checks if the newLevel is valid. 
				this.meanAnnualPrecipitation = newLevel; //Will assign accordingly. 
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
	 * Allows the Array List of precipitation ranks to be iterated through and viewed accordingly. 
	 */
	public boolean viewDifferentPrecipitationRanks() {
		if (this.differentRanks.size()!=0 && this.differentRanks != null) { //Will check if the array list is valid. 
			for (int i = 0; i < this.differentRanks.size(); i++) {
				System.out.println(differentRanks.get(i)); //Will perform an iteration and display requirements. 
			}
			return true;
		}else{
			System.out.println("This is not valid");
			return false;
		}
		
	}
	/**
	 * Allow new items to be added within the array list. 
	 * @param newRank --> New item to be added.
	 */
	public void addPrecipitation(RankPrecipitation newRank) {
		if (newRank != null) { //Will check if the new item to be added is valid. 
			for (int i = 0; i < differentRanks.size(); i++ ) {
				if (differentRanks.get(i) == newRank) {
					System.out.println("This is not valid!");	
				}else {
					differentRanks.add(newRank);	
				}
			}	
		}
	}
	/**
	 * Will allow items to be removed from the array list. 
	 */
	public void removePrecipitation(RankPrecipitation oldRank) {
		if (this.differentRanks != null && this.differentRanks.size() != 0 && oldRank != null) { //Will first check if the array list is in optimal conditions.
			for (int i = 0; i < differentRanks.size(); i++) {
				if (differentRanks.get(i) == oldRank) {
					this.differentRanks.remove(oldRank);
				}
			}	
		}
	}
	/**
	 * Will return the rank of winter temperature. 
	 * @return -- Return the value. 
	 */
	public RankTemperature getWinterTemperatureRank() {
		if (this.winterTemperatureRank != null) {//Check if valid.
			return this.winterTemperatureRank;
		}else {
			return null;	
		}
		
	}
	/**
	 * Will allow the winter temperature rank to be changed. 
	 * @param newRank --> The new rank to be assigned. 
	 */
	public boolean setWinterTemperatureRank(RankTemperature newRank) {
		try {
			if (newRank != null) {
				this.winterTemperatureRank = newRank;
				return true;
			}else{
				System.out.println("This is not valid");
				return false;
			}
		}catch(Exception ex) {
			System.out.println("An error occured");
			return false;
		}
	}
	/**
	 * This method will allow the summer temperature rank to be returned to the user. 
	 * @return --> Will return back to the user. 
	 */
	public RankTemperature getSummerTemperatureRank() {
		if(this.summerTemperatureRank != null) {
			return this.summerTemperatureRank;
		}else{
			return null;
		}
		
	}
	/**
	 * This method is to assign a new temperature rank.
	 * @param newRank --> The new rank to be assigned. 
	 */
	public boolean setSummerTemperatureRank(RankTemperature newRank) {
		try {
			if (newRank != null) { //Will check if valid.
				this.summerTemperatureRank = newRank; //Will assign if valid. 
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


}
