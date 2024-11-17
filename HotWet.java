package Story1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Author: Nikhil Mathur
 * Purpose: A class which implements the climate interface. Essentially, represents a kind of climate which is significant without our system.
 */
public class HotWet implements Climate {
	private String name; //Name of the climate. 
	private double meanAnnualPrecipitation; // The average precipitation level. 
	private ArrayList <RankPrecipitation> differentRanks; //the precipitation rank (low, medium, high)
	private RankTemperature winterTemperatureRank; //The temperature rank during the winter. 
	private RankTemperature summerTemperatureRank; //The temperature rank during the summer. 
	private Scanner input; //Scanner enabling user input
	
	
	/**
	 * Constructor creating the Hot Wet climate. Assigning instance data, through assignments within the constructor. 
	 */
	public HotWet() {
		this.name = "Hot Wet";  //Name assigned. 
		this.meanAnnualPrecipitation = 100; //Annual Precipitation level assigned. 
		this.differentRanks = new ArrayList<RankPrecipitation>(); //Array List initialized. 
		this.differentRanks.add(RankPrecipitation.RAIN); //Array List added with data. 
		this.differentRanks.add(RankPrecipitation.FOG); //Array List added with data. 
		this.winterTemperatureRank = RankTemperature.HIGH; // Winter temperature rank assigned. 
		this.summerTemperatureRank = RankTemperature.HIGH; // Summer temperature rank assigned. 
		this.input = new Scanner(System.in); //Scanner initialized. 
	}
	/**
	 * Method overridden from the climate interface. 
	 */
	@Override
	public void getStorageOfProducts() {
		Section storageOfProduct = new StorageOfProduct("Storage Of Product");
		storageOfProduct.FoodType(2);
		
	}
	/**
	 * Method overridden from the climate interface.
	 */
	@Override
	public void getDisposalRecycling() {
		Section disposalRecycling = new DisposalRecycling("Disposal and Recycling");
		disposalRecycling.FoodType(2);
		
	}
	/**
	 * Method overridden from the climate interface.
	 */
	@Override
	public void getDistributionProduct() {
		// TODO Auto-generated method stub
		
	}
	/**
	 * Method used to get the name of the climate
	 * @return --> Returns the name of the climate. 
	 */
	public String getName() {
		return name;
	}
	/**
	 * Method used to set a new name for the climate. 
	 * @param name --> The name name of the climate. 
	 */
	public boolean setName(String name) {
		try {
			if (name != null) {
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
	 * Method which is used to get the mean annual precipitation. 
	 * @return --> The value is returned. 
	 */
	public double getMeanAnnualPrecipitation() {
		return meanAnnualPrecipitation;
	}
	/**
	 * A method used to set a new mean annual precipitation. 
	 * @param meanAnnualPrecipitation --> The new mean annual precipitation achieved. 
	 */
	public boolean setMeanAnnualPrecipitation(double meanAnnualPrecipitation) {
		try {
			if (meanAnnualPrecipitation >= 75 && meanAnnualPrecipitation <=150) {
				this.meanAnnualPrecipitation = meanAnnualPrecipitation;
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
	 * Method used to get the winter temperature rank. 
	 * @return --> The returned value. 
	 */
	public RankTemperature getWinterTemperatureRank() {
		return winterTemperatureRank;
	}
	/**
	 * This method is used to assign a new winter temperature rank. 
	 * @param winterTemperatureRank --> The new temperature rank assigned.
	 */
	public boolean setWinterTemperatureRank(RankTemperature winterTemperatureRank) {
		try {
			if (winterTemperatureRank != null) {
				this.winterTemperatureRank = winterTemperatureRank;
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
	 * This method is used to get the summer temperature rank. 
	 * @return --> The returned temperature rank.
	 */
	public RankTemperature getSummerTemperatureRank() {
		return summerTemperatureRank;
	}
	/**
	 * This method is used to assign a new summer temperature rank.
	 * @param summerTemperatureRank --> The new temperature rank assigned. 
	 */
	public boolean setSummerTemperatureRank(RankTemperature summerTemperatureRank) {
		try {
			if (summerTemperatureRank != null) {
				this.summerTemperatureRank = summerTemperatureRank;
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
			//this.differentRanks.add(newRank);//Will add accordingly. 
			//System.out.println("Completed successfully!");
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
