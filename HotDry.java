package Story1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Author: Nikhil Mathur
 * Purpose: A class which implements the climate interface. Essentially, represents a kind of climate which is significant within our system. 
 */
public class HotDry implements Climate{
	private String name; //Name of the climate. 
	private double meanAnnualPrecipitation; // The average precipitation level. 
	private ArrayList <RankPrecipitation> differentRanks; //the precipitation rank (low, medium, high)
	private RankTemperature winterTemperatureRank; //The temperature rank during the winter. 
	private RankTemperature summerTemperatureRank; //The temperature rank during the summer. 
	private Scanner input; //Scanner enabling user input
	
	/**
	 * Constructor creating the Hot Dry climate. Assigning instance data, through assignments within the constructor. 
	 */
	public HotDry() {
		this.name = "Hot Dry";  //Name assigned. 
		this.meanAnnualPrecipitation = 30; //Annual Precipitation level assigned. 
		this.differentRanks = new ArrayList<RankPrecipitation>(); //Array List initialized. 
		this.differentRanks.add(RankPrecipitation.RAIN); //Array List added with data. 
		this.winterTemperatureRank = RankTemperature.MEDIUM; // Winter temperature rank assigned. 
		this.summerTemperatureRank = RankTemperature.HIGH; // Summer temperature rank assigned. 
		this.input = new Scanner(System.in); //Scanner initialized. 
	}
	/**
	 * Method overridden from climate interface. 
	 */
	@Override
	public void getStorageOfProducts() {
		Section storageOfProduct = new StorageOfProduct("Storage Of Product");
		storageOfProduct.FoodType(1);
		
	}
	/**
	 * Method overridden from climate interface.
	 */
	@Override
	public void getDisposalRecycling() {
		Section disposalRecycling  = new DisposalRecycling("Disposal Recycling");
		disposalRecycling.FoodType(1);
		
	}
	/**
	 * Method overridden from climate interface.
	 */
	@Override
	public void getDistributionProduct() {
		// TODO Auto-generated method stub
		
	}
	/**
	 * Will return the name of the climate
	 * @return --> The value returned. 
	 */
	public String getName() {
		return name;
	}
	/**
	 * Will set a new name of the climate.
	 * @param name --> The new name of the climate.
	 */
	public boolean setName(String name) {
		try {
			if (name != null) {//This is not valid!
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
	 * Will return the mean annual precipitation level.
	 * @return --> The value returned.
	 */
	public double getMeanAnnualPrecipitation() {
		return meanAnnualPrecipitation;
	}
	/**
	 * Will return the mean annual precipitation. 
	 * @param meanAnnualPrecipitation --> The new value to be assigned. 
	 */
	public boolean setMeanAnnualPrecipitation(double meanAnnualPrecipitation) {
		try {
			if (meanAnnualPrecipitation >= 75 && meanAnnualPrecipitation <=150) {//Will check if valid. 
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
	 * Will return the temperature rank during winter. 
	 * @return --> The returned value. 
	 */
	public RankTemperature getWinterTemperatureRank() {
		return winterTemperatureRank;
	}
	/**
	 * Will set a new temperature rank for winter. 
	 * @param winterTemperatureRank --> The new temperature rank. 
	 */
	public boolean setWinterTemperatureRank(RankTemperature winterTemperatureRank) {
		try {
			if (this.winterTemperatureRank!=null) {//Will check if valid.
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
	 * Will return the temperature rank for summer.
	 * @return --> The returned value. 
	 */
	public RankTemperature getSummerTemperatureRank() {
		return summerTemperatureRank;
	}
	/**
	 * Will set a new temperature rank for summer.
	 * @param summerTemperatureRank --> The new temperature rank.
	 */
	public boolean setSummerTemperatureRank(RankTemperature summerTemperatureRank) {
		try {
			if (summerTemperatureRank!=null) {
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
	
	public ArrayList<RankPrecipitation> getRankPrecipitation(){
		if (this.differentRanks != null && this.differentRanks.size() != 0) {
			return this.differentRanks;
		}else {
			return null;
		}
	}

}
