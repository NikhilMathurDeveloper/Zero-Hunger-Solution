package Story1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Author: Nikhil Mathur
 * Purpose: A class which implements the climate interface. Essentially, represents a kind of climate which is significant within our system.
 */
public class ColdWet implements Climate{
	private String name; //Name of the climate. 
	private double meanAnnualPrecipitation; // The average precipitation level. 
	private ArrayList <RankPrecipitation> differentRanks; //the precipitation rank (low, medium, high)
	private RankTemperature winterTemperatureRank; //The temperature rank during the winter. 
	private RankTemperature summerTemperatureRank; //The temperature rank during the summer. 
	private Scanner input; //Scanner enabling user input
	
	/**
	 * Constructor creating the Cold Wet climate. Assigning instance data, through assignments within the constructor. 
	 */
	public ColdWet() {
		this.name = "Cold Wet";  //Name assigned. 
		this.meanAnnualPrecipitation = 75; //Annual Precipitation level assigned. 
		this.differentRanks = new ArrayList<RankPrecipitation>(); //Array List initialized. 
		this.differentRanks.add(RankPrecipitation.RAIN); //Array List added with data. 
		this.winterTemperatureRank = RankTemperature.LOW; // Winter temperature rank assigned. 
		this.summerTemperatureRank = RankTemperature.MEDIUM; // Summer temperature rank assigned. 
		this.input = new Scanner(System.in); //Scanner initialized. 
	}
	/**
	 * Method overridden from climate interface.
	 */
	@Override
	public void getStorageOfProducts() {
		Section storageOfProduct = new StorageOfProduct("Storage Of Product");
		storageOfProduct.FoodType(4);
		
	}
	/**
	 * Method overridden from climate interface.
	 */
	@Override
	public void getDisposalRecycling() {
		Section disposalRecycling = new DisposalRecycling("Disposal and Recycling");
		disposalRecycling.FoodType(4);
		
	}
	/**
	 * Method overridden from climate interface.
	 */
	@Override
	public void getDistributionProduct() {
		// TODO Auto-generated method stub
		
	}
	/**
	 * Returns the name of the climate. 
	 * @return --> The value returned. 
	 */
	public String getName() {
		return name;
	}
	/**
	 * Sets the name of the climate. 
	 * @param name -- New name assigned. 
	 */
	public boolean setName(String name) {
		try {
			if (name != null) {//Will check if the new name is valid.
				this.name = name;
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
	 * Will return the annual precipitation level. 
	 * @return --> The value returned. 
	 */
	public double getMeanAnnualPrecipitation() {
		return meanAnnualPrecipitation;
	}
	/**
	 * Will assign a new mean annual precipitation. 
	 * @param meanAnnualPrecipitation --> The new value assigned. 
	 */
	public boolean setMeanAnnualPrecipitation(double meanAnnualPrecipitation) {
		try {
			if (meanAnnualPrecipitation >= 75 && meanAnnualPrecipitation <=150) {//Will identify if the mean annual precipitation is valid. 
				this.meanAnnualPrecipitation = meanAnnualPrecipitation;//Will assigned accordingly. 
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
	 * Will return the winter temperature rank. 
	 * @return --> Will return the value.
	 */
	public RankTemperature getWinterTemperatureRank() {
		return winterTemperatureRank;
	}
	/**
	 * Will assign the winter temperature rank. 
	 * @param winterTemperatureRank --> The new temperature rank.
	 */
	public boolean setWinterTemperatureRank(RankTemperature winterTemperatureRank) {
		try {
			if (winterTemperatureRank != null) {//Will identify if valid or not. 
				this.winterTemperatureRank = winterTemperatureRank;
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
	 * Will return the summer temperature rank. 
	 * @return --> The value returned. 
	 */
	public RankTemperature getSummerTemperatureRank() {
		return summerTemperatureRank;
	}
	/**
	 * Will assign a new summer temperature rank.
	 * @param summerTemperatureRank --> The new temperature rank assigned. 
	 */
	public boolean setSummerTemperatureRank(RankTemperature summerTemperatureRank) {
		try {
			if (summerTemperatureRank != null) {//Will check if valid. 
				this.summerTemperatureRank = summerTemperatureRank;
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
		}else {
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
			this.differentRanks.add(newRank);//Will add accordingly. 
			System.out.println("Completed successfully!");
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

}
