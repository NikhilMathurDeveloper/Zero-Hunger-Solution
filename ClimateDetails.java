package Story1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Author: Nikhil Mathur
 * Purpose: To display details of each of the climates. Makes representation easier, and also creates a more modular program. Allows a climate information to be viewed, changed wherever within any program. 
 */
public class ClimateDetails {
	//Different climate classes are instantiated. 
	protected HotDry hotDry = new HotDry();
	protected HotWet hotWet = new HotWet();
	protected ColdDry coldDry = new ColdDry();
	protected ColdWet coldWet = new ColdWet();
	private Scanner input = new Scanner(System.in);
	private String ranks[] = {"Low", "Medium","High"};
	private Menu newMenu = new Menu("Temperature Ranking", ranks);

	private String[] precipitations = {"Snow", "Rain", "Drizzle","Hail", "Fog"};
	private Menu newMenu2 = new Menu("Add precipitation kind",precipitations);
	
	/**
	 * Details are displayed to the user. The object gets details about the hot dry climate. 
	 * @return
	 */
	public String getDetailsOfHotDry() {
		//All details collated and showcased to the user. 
		String details = "";
		details = "Name: " + hotDry.getName() + "\n" +"Mean Annual Precipitation: " + hotDry.getMeanAnnualPrecipitation() + "\n" + "Summer temperature rank: " + hotDry.getSummerTemperatureRank() + "\n" +"Winter temperature rank: " +hotDry.getWinterTemperatureRank();
		System.out.println("Example of precipitation: ");
		hotDry.viewDifferentPrecipitationRanks(); //Calls method to show-case information.
		return details;
	}
	
	/**
	 * Used to get the name of the climate. 
	 * @return
	 */
	public String getHotDryName() {
		if (hotDry.getName() != null) { //Check if name is valid
			return hotDry.getName(); //Get the name of the climate. 
		}else {
			return null;
		}
	}
	/**
	 * Calls setter from hot dry object, and utilized to change name of the climate.
	 * @return
	 */
	public boolean changeClimateNameHotDry() {
		System.out.println("Enter the new name of the climate"); //New name entered.
		String newName = input.nextLine();
		if (newName != null) { //check if new name is valid
			hotDry.setName(newName); //Will set if valid. 
			System.out.println("Name changed! ");
			return true;
		}else {
			return false;
		}
	}
	/**
	 * Will modify the mean annual precipitation of the climate. 
	 * @return --> Returns true or false on whether the process has gone successfully. 
	 */
	public boolean changeClimateAnnualPripicationHotDry() {
		System.out.println("Enter the new mean: "); //The new mean entered 
		int newMean = input.nextInt();
		if (newMean > 0) {//Check if valid. 
			hotDry.setMeanAnnualPrecipitation(newMean); //If valid then the setter will change the value.
			System.out.println("Mean changed! ");
			return true;
		}else {
			return false;
		}
	}
	/**
	 * Will change the Summer temperature rank, using the climates setter. 
	 */
	public void changeSummerTemperatureRankHotDry() {
		//the user gets to the choose the new rank. 
		int choice = newMenu.getChoice();
		switch(choice) {
		case 1:
			hotDry.setSummerTemperatureRank(RankTemperature.LOW);// The rank is changed to low. 
			System.out.println("Summer temperature rank changed! ");
			break;
		case 2:
			hotDry.setSummerTemperatureRank(RankTemperature.MEDIUM);// The rank is changed to low. 
			System.out.println("Summer temperature rank changed! ");
			break;
		case 3:
			hotDry.setSummerTemperatureRank(RankTemperature.HIGH);// The rank is changed to low. 
			System.out.println("Summer temperature rank changed! ");
			break;
		
		}
	}
	/**
	 * Will change the the winter temperature rank by calling the climates setter.
	 */
	public void changeWinterTemperatureRankHotDry() {
		//Will ask the user to enter a new rank. 
		int choice = newMenu.getChoice();
		switch(choice) {
		case 1:
			hotDry.setWinterTemperatureRank(RankTemperature.LOW); //Will change the rank to low. 
			System.out.println("Summer temperature rank changed! ");
			break;
		case 2:
			hotDry.setWinterTemperatureRank(RankTemperature.MEDIUM); //Will change the rank to medium. 
			System.out.println("Summer temperature rank changed! ");
			break;
		case 3:
			hotDry.setWinterTemperatureRank(RankTemperature.HIGH);// Will change the rank to high.
			System.out.println("Summer temperature rank changed! ");
			break;
		
		}
	}
	/**
	 * Will allow user to add a new precipitation type.
	 */
	public void addDifferentTypesOfPrecipitationHotDry() {
		//User can enter the new precipitation type. 
		int choice = newMenu2.getChoice();
		switch(choice) {
		case 1:
			hotDry.addPrecipitation(RankPrecipitation.SNOW); //Will add the snow precipitation.
			break;
		case 2:
			hotDry.addPrecipitation(RankPrecipitation.RAIN); //Will add the rain precipitation.
			break;
		case 3:
			hotDry.addPrecipitation(RankPrecipitation.DRIZZLE);//Will add the drizzle precipitation.
			break;
		case 4:
			hotDry.addPrecipitation(RankPrecipitation.HAIL);//Will add the hail precipitation.
			break;
		case 5:
			hotDry.addPrecipitation(RankPrecipitation.FOG);//Will add the fog precipitation.
			break;
		}
	}
	
	/**
	 * Will remove a precipitation type from the collection based on user input. 
	 */
	public void removeDifferentPrecipitationHotDry() {
		//User enters what what precipitation type they would like to remove from the collection.
		hotDry.viewDifferentPrecipitationRanks();
		int choice = newMenu2.getChoice();
		switch(choice) {
		case 1:
			hotDry.removePrecipitation(RankPrecipitation.SNOW);
			break;
		case 2:
			hotDry.removePrecipitation(RankPrecipitation.RAIN);
			break;
		case 3:
			hotDry.removePrecipitation(RankPrecipitation.DRIZZLE);
			break;
		case 4:
			hotDry.removePrecipitation(RankPrecipitation.HAIL);
			break;
		case 5:
			hotDry.removePrecipitation(RankPrecipitation.FOG);
			break;
		}	
	}
	//--------------------------------------------------------------------------------------//
	/**
	 * Details are displayed to the user. The object gets details about the hot wet climate. 
	 * @return
	 */
	public String getDetailsOfHotWet() {
		//Utilizes the getters to display the relevant climates info. 
		String details = "";
		//Collates all info.
		details = "Name: " + hotWet.getName() + "\n" +"Mean Annual Precipitation: " + hotWet.getMeanAnnualPrecipitation() + "\n" + "Summer temperature rank: " + hotWet.getSummerTemperatureRank() + "\n" +"Winter temperature rank: " +hotWet.getWinterTemperatureRank();
		System.out.println("Example of precipitation: ");
		hotWet.viewDifferentPrecipitationRanks();
		return details;
	}
	/**
	 * Will get the name of the climate.
	 * @return --> Will return the name of the climate. 
	 */
	public String getHotWetName() {
		if (hotWet.getName() != null) {//Will check if the name is valid. 
			return hotWet.getName(); // Will return the name of the climate. 
		}else {
			return null;
		}
	}
	/**
	 * This method is to change the name of the climate.
	 * @return --> Will return true or false on whether the process has become successful. 
	 */
	public boolean changeClimateNameHotWet() {
		System.out.println("Enter the new name of the climate: "); 
		String newName = input.nextLine();//User enters the new name of climate.
		if (newName != null) { //Will check if the name is valid
			hotWet.setName(newName);  //If valid the new name would be set
			System.out.println("Name changed! ");
			return true;
		}else {
			return false;
		}
	}
	/**
	 * Will change the mean climate annual precipitation in a hot wet environment.
	 * @return --> Will return true or false depending on whether the process was successful. 
	 */
	public boolean changeClimateAnnualPripicationHotWet() {
		System.out.println("Enter the new mean: "); //The new mean entered. 
		int newMean = input.nextInt();
		if (newMean > 0) { //Will check if the new mean is valid.
			hotWet.setMeanAnnualPrecipitation(newMean); //Will set the mean precipitation climate.
			System.out.println("Mean changed! ");
			return true;
		}else {
			return false;
		}
	}
	/**
	 * Will change the summer temperature rank for the hot wet environment. 
	 */
	public void changeSummerTemperatureRankHotWet() {
		//Will allow the user to enter their new rank for summer temperature rank. 
		int choice = newMenu.getChoice();
		switch(choice) {
		case 1:
			hotWet.setSummerTemperatureRank(RankTemperature.LOW); //Will change to low. 
			System.out.println("Summer temperature rank changed! ");
			break;
		case 2:
			hotWet.setSummerTemperatureRank(RankTemperature.MEDIUM);//Will change to Medium.
			System.out.println("Summer temperature rank changed! ");
			break;
		case 3:
			hotWet.setSummerTemperatureRank(RankTemperature.HIGH);//Will change to High.
			System.out.println("Summer temperature rank changed! ");
			break;
		
		}
	}
	/**
	 * Will change the winter temperature rank for hot wet environment. 
	 */
	public void changeWinterTemperatureRankHotWet() {
		//Will allow the user to select what the user to select the new rank. 
		int choice = newMenu.getChoice();
		switch(choice) {
		case 1:
			hotWet.setWinterTemperatureRank(RankTemperature.LOW); //Will change to  low.
			System.out.println("Summer temperature rank changed! ");
			break;
		case 2:
			hotWet.setWinterTemperatureRank(RankTemperature.MEDIUM);//Will change to medium.
			System.out.println("Summer temperature rank changed! ");
			break;
		case 3:
			hotWet.setWinterTemperatureRank(RankTemperature.HIGH); //Will change to high.
			System.out.println("Summer temperature rank changed! ");
			break;
		
		}
	}
	/**
	 * This method allows more precipitation types to be added to hot wet. 
	 */
	public void addDifferentTypesOfPrecipitationHotWet() {
		//Allow user to select new precipitation type to be added. 
		int choice = newMenu2.getChoice();
		switch(choice) {
		case 1:
			hotWet.addPrecipitation(RankPrecipitation.SNOW); //Will add snow.
			break;
		case 2:
			hotWet.addPrecipitation(RankPrecipitation.RAIN);//Will add rain.
			break;
		case 3:
			hotWet.addPrecipitation(RankPrecipitation.DRIZZLE); // Will add drizzle. 
			break;
		case 4:
			hotWet.addPrecipitation(RankPrecipitation.HAIL);// Will add hail
			break;
		case 5:
			hotWet.addPrecipitation(RankPrecipitation.FOG); //Will add fog
			break;
		}
	}
	
	public void removeDifferentPrecipitationHotWet() {
		hotWet.viewDifferentPrecipitationRanks();
		//Will allow user to select which precipitation to remove. 
		int choice = newMenu2.getChoice();
		
		switch(choice) {
		case 1:
			hotWet.removePrecipitation(RankPrecipitation.SNOW); //Will remove snow precipitation if exists.
			break;
		case 2:
			hotWet.removePrecipitation(RankPrecipitation.RAIN); //Will remove rain precipitation if exists.
			break;
		case 3:
			hotWet.removePrecipitation(RankPrecipitation.DRIZZLE);//Will remove drizzle precipitation if exists.
			break;
		case 4:
			hotWet.removePrecipitation(RankPrecipitation.HAIL);//Will remove hail precipitation if exists.
			break;
		case 5:
			hotWet.removePrecipitation(RankPrecipitation.FOG);//Will remove fog precipitation if exists.
			break;
		}	
	}
	//------------------------------------------------------------------------------------------//
	/**
	 * Details are displayed to the user. The object gets details about the cold dry climate. 
	 * @return
	 */
	public String getDetailsOfColdDry() {
		//Uses getters to get info about the relevant climate. 
		String details = "";
		//Collates all info into a variable which will be returned. 
		details = "Name: " + coldDry.getName() + "\n" +"Mean Annual Precipitation: " + coldDry.getMeanAnnualPrecipitation() + "\n" + "Summer temperature rank: " + coldDry.getSummerTemperatureRank() + "\n" +"Winter temperature rank: " +coldDry.getWinterTemperatureRank();
		System.out.println("Example of precipitation: ");
		coldDry.viewDifferentPrecipitationRanks();
		return details;
	}
	
	/**
	 * Will get the name of the climate. 
	 * @return --> Will return the name of the climate. 
	 */
	public String getColdDryName() {
		if (coldDry.getName() != null) {
			return coldDry.getName(); //Will return the name of the climate. 
		}else {
			return null;
		}
	}
	/**
	 * Will change the climate's name.
	 * @return --> Will return true or false depending on whether the process was completed sucessfully. 
	 */
	public boolean changeClimateNameColdDry() {
		//Allow user to add new name for the climate. 
		System.out.println("Enter the new name of the climate");
		String newName = input.nextLine(); 
		if (newName != null) {//Check if name is valid
			coldDry.setName(newName); //Will set the name accordingly. 
			System.out.println("Name changed! ");
			return true;
		}else {
			return false;
		}
	}
	/**
	 * Will change the annual precipitation of the climate. 
	 * @return --> Return true or false depending on whether successful. 
	 */
	public boolean changeClimateAnnualPripicationColdDry() {
		System.out.println("Enter the new mean: ");
		//New mean will be entered. 
		int newMean = input.nextInt();
		if (newMean > 0) { //Check if valid. 
			coldDry.setAnnualPrecipitation(newMean); //If valid then the new mean shall be assigned. 
			System.out.println("Mean changed! ");
			return true;
		}else {
			return false;
		}
	}
	/**
	 * Will change the summer temperature rank for the cold dry environment. 
	 */
	public void changeSummerTemperatureRankColdDry() {
		//Will allow user to select a new temperature rank. 
		int choice = newMenu.getChoice();
		switch(choice) {
		case 1:
			coldDry.setSummerTemperatureRank(RankTemperature.LOW); //Will set the new temperature to low
			System.out.println("Summer temperature rank changed! ");
			break;
		case 2:
			coldDry.setSummerTemperatureRank(RankTemperature.MEDIUM); //  Will set the new temperature to 
			System.out.println("Summer temperature rank changed! ");
			break;
		case 3:
			coldDry.setSummerTemperatureRank(RankTemperature.HIGH);
			System.out.println("Summer temperature rank changed! ");
			break;
		
		}
	}
	
	public void changeWinterTemperatureRankColdDry() {
		
		int choice = newMenu.getChoice();
		switch(choice) {
		case 1:
			coldDry.setWinterTemperatureRank(RankTemperature.LOW);
			System.out.println("Summer temperature rank changed! ");
			break;
		case 2:
			coldDry.setWinterTemperatureRank(RankTemperature.MEDIUM);
			System.out.println("Summer temperature rank changed! ");
			break;
		case 3:
			coldDry.setWinterTemperatureRank(RankTemperature.HIGH);
			System.out.println("Summer temperature rank changed! ");
			break;
		
		}
	}
	
	public void addDifferentTypesOfPrecipitationColdDry() {
		int choice = newMenu2.getChoice();
		switch(choice) {
		case 1:
			coldDry.addPrecipitation(RankPrecipitation.SNOW);
			break;
		case 2:
			coldDry.addPrecipitation(RankPrecipitation.RAIN);
			break;
		case 3:
			coldDry.addPrecipitation(RankPrecipitation.DRIZZLE);
			break;
		case 4:
			coldDry.addPrecipitation(RankPrecipitation.HAIL);
			break;
		case 5:
			coldDry.addPrecipitation(RankPrecipitation.FOG);
			break;
		}
	}
	
	public void removeDifferentPrecipitationColdDry() {
		int choice = newMenu2.getChoice();
		coldDry.viewDifferentPrecipitationRanks();
		//	String[] precipitations = {"Snow", "Rain", "Drizzle","Hail", "Fog"};
		switch(choice) {
		case 1:
			coldDry.removePrecipitation(RankPrecipitation.SNOW);
			break;
		case 2:
			coldDry.removePrecipitation(RankPrecipitation.RAIN);
			break;
		case 3:
			coldDry.removePrecipitation(RankPrecipitation.DRIZZLE);
			break;
		case 4:
			coldDry.removePrecipitation(RankPrecipitation.HAIL);
			break;
		case 5:
			coldDry.removePrecipitation(RankPrecipitation.FOG);
			break;
		}	
	}
	//------------------------------------------------------------------------------------------------//
	/**
	 * Details are displayed to the user. The object get details about the cold wet climate. 
	 * @return
	 */
	public String getDetailsOfColdWet() {
		//Uses getter methods to get info about climate .
		String details = "";
		//Collate info on variable so that it can be returned to the user. 
		details = "Name: " + coldWet.getName() + "\n" +"Mean Annual Precipitation: " + coldWet.getMeanAnnualPrecipitation() + "\n" + "Summer temperature rank: " + coldWet.getSummerTemperatureRank() + "\n" +"Winter temperature rank: " +coldWet.getWinterTemperatureRank();
		System.out.println("Example of precipitation: ");
		coldWet.viewDifferentPrecipitationRanks();
		return details;
	}
	
	public String getColdWetName() {
		if (coldWet.getName() != null) {
			return coldWet.getName();
		}else {
			return null;
		}
	}
	
	public boolean changeClimateNameColdWet() {
		System.out.println("Enter the new name of the climate");
		String newName = input.nextLine();
		if (newName != null) {
			coldWet.setName(newName);
			System.out.println("Name changed! ");
			return true;
		}else {
			return false;
		}
	}
	
	public boolean changeClimateAnnualPripicationColdWet() {
		System.out.println("Enter the new mean: ");
		int newMean = input.nextInt();
		if (newMean > 0) {
			coldWet.setMeanAnnualPrecipitation(newMean);
			System.out.println("Mean changed! ");
			return true;
		}else {
			return false;
		}
	}
	
	public void changeSummerTemperatureRankColdWet() {
		
		int choice = newMenu.getChoice();
		switch(choice) {
		case 1:
			coldWet.setSummerTemperatureRank(RankTemperature.LOW);
			System.out.println("Summer temperature rank changed! ");
			break;
		case 2:
			coldWet.setSummerTemperatureRank(RankTemperature.MEDIUM);
			System.out.println("Summer temperature rank changed! ");
			break;
		case 3:
			coldWet.setSummerTemperatureRank(RankTemperature.HIGH);
			System.out.println("Summer temperature rank changed! ");
			break;
		
		}
	}
	
	public void changeWinterTemperatureRankColdWet() {
		
		int choice = newMenu.getChoice();
		switch(choice) {
		case 1:
			coldWet.setWinterTemperatureRank(RankTemperature.LOW);
			System.out.println("Summer temperature rank changed! ");
			break;
		case 2:
			coldWet.setWinterTemperatureRank(RankTemperature.MEDIUM);
			System.out.println("Summer temperature rank changed! ");
			break;
		case 3:
			coldWet.setWinterTemperatureRank(RankTemperature.HIGH);
			System.out.println("Summer temperature rank changed! ");
			break;
		
		}
	}
	
	public void addDifferentTypesOfPrecipitationColdWet() {
		int choice = newMenu2.getChoice();
		switch(choice) {
		case 1:
			coldWet.addPrecipitation(RankPrecipitation.SNOW);
			break;
		case 2:
			coldWet.addPrecipitation(RankPrecipitation.RAIN);
			break;
		case 3:
			coldWet.addPrecipitation(RankPrecipitation.DRIZZLE);
			break;
		case 4:
			coldWet.addPrecipitation(RankPrecipitation.HAIL);
			break;
		case 5:
			coldWet.addPrecipitation(RankPrecipitation.FOG);
			break;
		}
	}
	
	public void removeDifferentPrecipitationColdWet() {
		int choice = newMenu2.getChoice();
		coldWet.viewDifferentPrecipitationRanks();
		//	String[] precipitations = {"Snow", "Rain", "Drizzle","Hail", "Fog"};
		switch(choice) {
		case 1:
			coldWet.removePrecipitation(RankPrecipitation.SNOW);
			break;
		case 2:
			coldWet.removePrecipitation(RankPrecipitation.RAIN);
			break;
		case 3:
			coldWet.removePrecipitation(RankPrecipitation.DRIZZLE);
			break;
		case 4:
			coldWet.removePrecipitation(RankPrecipitation.HAIL);
			break;
		case 5:
			coldWet.removePrecipitation(RankPrecipitation.FOG);
			break;
		}	
	}
	//------------------------------------------------------------------------------------------------------//
}
