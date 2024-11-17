package Story1;

import java.util.Scanner;

/**
 * Author: Ryan Kerins
 * Purpose: To create the distribution of product section. To create the recommendation system, and also support the information retrieval. 
 */
public class DistributionOfProduct {
	//Set up scanner to take in user input
	private static Scanner input = new Scanner(System.in);
	protected Transport air = new Air();
	protected Transport water = new Water();
	protected Transport land = new Land();
	String[] produceChoices = {"Refined Grains", "Vegetables/Fruits", "Protein" , "Sugar"}; //Different choices for produce type
	String[] yesNoChoices = {"Yes", "No"}; //Different choices for yes/no questions
	String[] temperatureChoices = {"Refrigerated", "Frozen", "No temperature requirements"};//Different choices for storage temperature
	String[] transportTypes = {"Air, land and water", "Air and land", "Water and land", "Only land"};//Different choices for available transport types
	Menu produceMenu = new Menu("Select the type of produce you need to transport", produceChoices);//Creates menu to ask for produce type
	Menu livestockMenu = new Menu("Do you need to transport proteins in the form of livestock?", yesNoChoices);//Creates menu to ask if protein is being transported as livestock
	Menu specialReqsMenu = new Menu("Does the produce you need to transport have any other special requirements during transport?", yesNoChoices);//Creates menu to ask if produce being transported has any special requirements during transport
	Menu temperatureMenu = new Menu("Does the produce you need to transport have any temperature requirements during transport?", temperatureChoices);//Creates menu to ask if produce being transported has any temperature requirements during transport
	Menu transportTypesMenu = new Menu("Select the types of transport you are able to use", transportTypes);//Creates menu to ask for available transport types
	Menu landOnlyMenu = new Menu("Is direct transport to the client by only land possible?", yesNoChoices);//Creates menu to ask if direct land transport is possible
	
	
	//Method to take input for the distance between supplier and client
	private static int setDistanceSupplierToClient(int distance) {
		boolean ok = false;
		//Ensure that user enters valid number for distance between supplier and client
		do {
			System.out.print("Enter the total distance between supplier and client in kilometers: ");
			try {
				distance = input.nextInt();
				ok = true;
			} catch (Exception ex) {
				System.out.println("Please enter a valid number.");
				input.nextLine();
			}
		} while (!ok);
		System.out.println();
		return distance;
	}
	
	//Method to take input for the minimum and maximum budget
	private static int[] setBudget(int[] budgetSet) {
		boolean ok = false;
		//Ensure that user enters valid numbers for minimum and maximum budget where minimum is smaller than maximum
		do {
			System.out.print("Enter the minimum budget for transport: ");
			try {
			    budgetSet[0] = input.nextInt();
				System.out.print("Enter the maximum budget for transport: ");
				budgetSet[1] = input.nextInt();
				if ( budgetSet[0]>=1 && budgetSet[0]<=budgetSet[1] ) {
					ok = true;
				} else {
					System.out.println("The minimum budget is larger than the maximum budget, please enter a valid budget.");
				}
			} catch (Exception ex) {
				System.out.println("Please enter valid numbers.");
			}
		} while (!ok);
		System.out.println();
		return budgetSet;
	}
	
	//Method to take input for the distance between the supplier and the nearest seaport
	private static int setDistanceSupplierToSeaport(int distance) {
		boolean ok = false;
		//Ensure that user enters valid number for the distance between the supplier and nearest seaport
		do {
			System.out.print("Enter the distance between the supplier and the nearest seaport in kilometers: ");
			try {
				distance = input.nextInt();
				ok = true;
			} catch (Exception ex) {
				System.out.println("Please enter a valid number.");
				input.nextLine();
			}
		} while (!ok);
		System.out.println();
		return distance;
	}
	
	//Method to take input for the distance between the seaport nearest to the supplier and the seaport nearest to the client
	private static int setDistanceSeaportToSeaport(int distance) {
		boolean ok = false;
		//Ensure that user enters valid number for the distance between the  seaport nearest to the supplier and the seaport nearest to the client
		do {
			System.out.print("Enter the distance between the seaport nearest to the supplier and the seaport nearest to the client in kilometers: ");
			try {
				distance = input.nextInt();
				ok = true;
			} catch (Exception ex) {
				System.out.println("Please enter a valid number.");
				input.nextLine();
			}
		} while (!ok);
		System.out.println();
		return distance;
	}
	
	//Method to take input for the distance between the seaport nearest to the client and the client
	private static int setDistanceSeaportToClient(int distance) {
		boolean ok = false;
		//Ensure that user enters valid number for the  distance between the seaport nearest to the client and the client
		do {
			System.out.print("Enter the distance between the seaport nearest to the client and the client in kilometers: ");
			try {
				distance = input.nextInt();
				ok = true;
			} catch (Exception ex) {
				System.out.println("Please enter a valid number.");
				input.nextLine();
			}
		} while (!ok);
		System.out.println();
		return distance;
	}
	
	//Method to take input for the distance between the supplier and the nearest airport
	private static int setDistanceSupplierToAirport(int distance) {
		boolean ok = false;
		//Ensure that user enters valid number for the distance between the supplier and the nearest airport
		do {
			System.out.print("Enter the distance between the supplier and the nearest airport in kilometers: ");
			try {
				distance = input.nextInt();
				ok = true;
			} catch (Exception ex) {
				System.out.println("Please enter a valid number.");
				input.nextLine();
			}
		} while (!ok);
		System.out.println();
		return distance;
	}
	
	//Method to take input for the distance between the airport nearest to the supplier and the airport nearest to the client
	private static int setDistanceAirportToAirport(int distance) {
		boolean ok = false;
		//Ensure that user enters valid number for the distance between the airport nearest to the supplier and the airport nearest to the client
		do {
			System.out.print("Enter the distance between the airport nearest to the supplier and the airport nearest to the client in kilometers: ");
			try {
				distance = input.nextInt();
				ok = true;
			} catch (Exception ex) {
				System.out.println("Please enter a valid number.");
				input.nextLine();
			}
		} while (!ok);
		System.out.println();
		return distance;
	}
	
	//Method to take input for the distance between the airport nearest to the client and the client
	private static int setDistanceAirportToClient(int distance) {
		boolean ok = false;
		//Ensure that user enters valid number for the distance between the airport nearest to the client and the client
		do {
			System.out.print("Enter the distance between the airport nearest to the client and the client in kilometers: ");
			try {
				distance = input.nextInt();
				ok = true;
			} catch (Exception ex) {
				System.out.println("Please enter a valid number.");
				input.nextLine();
			}
		} while (!ok);
		System.out.println();
		return distance;
	}
	
	//Method to take input for the weight of the product to be distributed
	private static int setProductWeight(int weight) {
		boolean ok = false;
		//Ensure that user enters valid number for weight of product
		do {
			System.out.print("Enter the weight of the product to be shipped in kilograms: ");
			try {
				weight = input.nextInt();
				ok = true;
			} catch (Exception ex) {
				System.out.println("Please enter a valid number.");
				input.nextLine();
			}
		} while (!ok);
		System.out.println();
		return weight;
	}
	
	//Method to get all needed information from user and calculate recommended transport options
	public void giveRecommendation() {
		//Set up empty variables for all information needed for calculations
		String produceType = "ERROR";
		boolean livestock = false;
		boolean refrigerated = false;
		boolean frozen = false;
		boolean specialReq = false;
		boolean waterAvailable = false;
		boolean airAvailable = false;
		boolean landOnly = false;
		boolean directLand = false;
		boolean train = false;
		boolean water = false;
		boolean air = false;
		int[] budget = {0,0};
		int weight = 0;
		double truckPerKm = 0;
		double trainPerKm = 0;
		int containersNumber = 0;
		int distanceSupplierToClient = 0;
		int distanceSupplierToSeaport = 0;
		int distanceSupplierToAirport = 0;
		int distanceSeaportToSeaport = 0;
		int distanceAirportToAirport = 0;
		int distanceSeaportToClient = 0;
		int distanceAirportToClient = 0;
		double total = 0;
		double totalExpress = 0;

		
		//User selects from a menu the type of produce they want to transport
		int produceSelection = produceMenu.getChoice();
		switch(produceSelection) {//Uses switch statement to render options and path ways.
		case 1:
			produceType = "Refined Grains";
			break;
		case 2:
			produceType = "Vegetables/Fruits";
			break;
		case 3:
			produceType = "Protein";
			//If produce is protein, second menu is used to check if the protein is being transported as livestock, otherwise it is assumed not to be
			int livestockSelect = livestockMenu.getChoice();
			if(livestockSelect == 1) {
				livestock=true;
			}
			break;
		case 4:
			produceType = "Sugar";
		break;
		}
		
		//User selects from a menu if the produce they want to transport has any temperature requirements
		int temperatureSelection = temperatureMenu.getChoice();
		switch(temperatureSelection) {//Uses switch statement to render options and path ways.
		case 1:
			refrigerated = true;
			break;
		case 2:
			frozen = true;
			break;
		case 3:
			refrigerated = false;
			frozen = false;
			break;
		}
		
		//User selects from a menu if the produce they want to transport has any other special requirements
		int specialReqs = specialReqsMenu.getChoice();
		if(specialReqs == 1)
			specialReq = true;
		
		//User selects from a menu if land only transport is possible
		int onlyLand = landOnlyMenu.getChoice();
		switch(onlyLand) {//Uses switch statement to render options and path ways.
		case 1:
			directLand = true;
			break;
		case 2:
			directLand = false;
			break;
		}
		
		//Set variables up using methods
		setBudget(budget);
		weight = setProductWeight(weight);
		
		//Set rates per km of weight based transport types after weight is set
		//Shipping by water is charged per 30480kg container so finding how many are needed allows the price per km per container to be calculated
		int tempweight = weight;
		while(tempweight>0) {
			tempweight -= 30480;
			containersNumber += 1;
		}

		//Shipping by train and truck per km is set based on weight thresholds
		if(weight<=7500) {
			truckPerKm = 0.93;
		}else {
			if(weight<=18000) {
				truckPerKm = 1.24;
			}
			else {
				if(weight<=26000) {
					truckPerKm = 1.4;
				}else {
					if(weight<=44000) {
						truckPerKm = 1.71;
					}
				}
			}
		}
		if(weight<=30000) {
			trainPerKm = 1.45;
		}else {
			if(weight<=72000) {
				trainPerKm = 1.6;
			}
			else {
				if(weight<=104000) {
					trainPerKm = 1.75;
				}else {
					if(weight<=176000) {
						trainPerKm = 1.9;
					}
				}
			}
		}
		
		
		//User selects from a menu the types of transport available to them
		int transportType = transportTypesMenu.getChoice();
		switch(transportType) {//Uses switch statement to render options and path ways.
		case 1:
			airAvailable = true;
			waterAvailable = true;
			distanceSupplierToClient = setDistanceSupplierToClient(distanceSupplierToClient);
			distanceSupplierToSeaport = setDistanceSupplierToSeaport(distanceSupplierToSeaport);
			distanceSupplierToAirport = setDistanceSupplierToAirport(distanceSupplierToAirport);
			distanceSeaportToSeaport = setDistanceSeaportToSeaport(distanceSeaportToSeaport);
			distanceAirportToAirport = setDistanceAirportToAirport(distanceAirportToAirport);
			distanceSeaportToClient = setDistanceSeaportToClient(distanceSeaportToClient);
			distanceAirportToClient = setDistanceAirportToClient(distanceAirportToClient);
			break;
		case 2:
			airAvailable = true;
			distanceSupplierToClient = setDistanceSupplierToClient(distanceSupplierToClient);
			distanceSupplierToAirport = setDistanceSupplierToAirport(distanceSupplierToAirport);
			distanceAirportToAirport = setDistanceAirportToAirport(distanceAirportToAirport);
			distanceAirportToClient = setDistanceAirportToClient(distanceAirportToClient);
			break;
		case 3:
			waterAvailable = true;
			distanceSupplierToClient = setDistanceSupplierToClient(distanceSupplierToClient);
			distanceSupplierToSeaport = setDistanceSupplierToSeaport(distanceSupplierToSeaport);
			distanceSeaportToSeaport = setDistanceSeaportToSeaport(distanceSeaportToSeaport);
			distanceSeaportToClient = setDistanceSeaportToClient(distanceSeaportToClient);
			break;
		case 4:
			landOnly = true;
			distanceSupplierToClient = setDistanceSupplierToClient(distanceSupplierToClient);
			break;
		}
		
		//Check through various criteria to narrow down eligible transport types when doing calculations
		
		//Livestock requires land and water transport by non-standard means and is unsuitable for air transport
		if(livestock==true&&directLand==false&&waterAvailable==false) {
			System.out.println("Without direct land transport or transport over water as an option, livestock cannot be distributed");
			landOnlyMenu.promptContinue();
		}
		if(livestock==true&&waterAvailable==false&&directLand==true){
			//Multiply distance by cost per km by 1.4 for needing non-standard transport type 
			if(total>(distanceSupplierToClient * trainPerKm * 1.4)||total==0) {
			 total =   (distanceSupplierToClient * trainPerKm * 1.4); 
			 water = false;
			 air = false;
			 train = false;
			}
		}
		if(livestock==true&&waterAvailable==true&&directLand==false){
			//Multiply distance by cost per km by 1.4 for needing non-standard transport type 
			if(total>((((distanceSupplierToSeaport * trainPerKm) + (distanceSeaportToSeaport * (containersNumber*1.64)) + (distanceSeaportToClient * trainPerKm))*1.4))||total==0) {
			 total =   ((((distanceSupplierToSeaport * trainPerKm) + (distanceSeaportToSeaport * (containersNumber*1.64)) + (distanceSeaportToClient * trainPerKm))*1.4)); 
			 air = false;
			 water = true;
			 train = false;
			}
		}
		if(livestock==true&&waterAvailable==true&&directLand==true){
			//Multiply distance by cost per km by 1.4 for needing non-standard transport type 
			double total1 =  (distanceSupplierToClient * trainPerKm * 1.4); 
			double total2 =   ((((distanceSupplierToSeaport * trainPerKm) + (distanceSeaportToSeaport * (containersNumber*1.64)) + (distanceSeaportToClient * trainPerKm))*1.4)); 			
			if(total1>total2&&(total>total2||total==0)) {
				 total = total2;
			}
			else {
				if(total>total1||total==0) {
				 total = total1;
				 air = false;
				 water = true;
				 train = false;
				}
			}
		}
		
		//Produce with special requirements during transport requires land and air transport by non-standard means and is unsuitable for air transport
		if(livestock==false&&specialReq==true&&airAvailable==false&&directLand==true){
			//Multiply distance by cost per km by 1.4 for needing non-standard transport type 
			if(total>(distanceSupplierToClient * trainPerKm * 1.4)||total==0) {
			 total =  (distanceSupplierToClient * trainPerKm * 1.4); 
			 water = false;
			 air = false;
			 train = false;
			}
		}
		if(livestock==false&&specialReq==true&&airAvailable==true&&directLand==false){
			//Multiply distance by cost per km by 1.4 for needing non-standard transport type, air transport rate per km per kg set to special cargo rate
			if(total>((((distanceSupplierToAirport * trainPerKm) + (distanceAirportToAirport * (weight*0.06)) + (distanceAirportToClient * trainPerKm))*1.4))||total==0) {
			 total =   ((((distanceSupplierToAirport * trainPerKm) + (distanceAirportToAirport * (weight*0.06)) + (distanceAirportToClient * trainPerKm))*1.4));
			 water = false;
			 air = true;
			 train = false;
			}
		}
		if(livestock==false&&specialReq==true&&airAvailable==true&&directLand==true){
			//Multiply distance by cost per km by 1.4 for needing non-standard transport type, air transport rate per km per kg set to special cargo rate 
			double total1 =   (distanceSupplierToClient * trainPerKm * 1.4); 
			double total2 =   ((((distanceSupplierToAirport * trainPerKm) + (distanceAirportToAirport * (weight*0.06)) + (distanceAirportToClient * trainPerKm))*1.4)); 
			if(total1>total2&&total>total2) {
				 total = total2;
				 water = false;
				 air = false;
				 train = false;
			}
			else {
				if(total!=0&&(total>total1||total==0)) {
				 total = total1;
				 water = false;
				 air = true;
				 train = false;
				}
			}
		}
		
		//Produce that needs frozen or refrigerated during transport requires land, air, and water transport by non-standard means
		if((refrigerated==true||frozen==true)&&livestock==false&&specialReq==false&&airAvailable==false&&waterAvailable==false&&directLand==true){
			//Multiply distance by cost per km by 1.4 for needing non-standard transport type 
			if(total>(distanceSupplierToClient * truckPerKm * 1.4)||total==0) {
			 total =   (distanceSupplierToClient * truckPerKm * 1.4); 
			 water = false;
			 air = false;
			 train = false;
			}
		}
		if((refrigerated==true||frozen==true)&&livestock==false&&specialReq==false&&airAvailable==true&&waterAvailable==false&&directLand==false){
			//Multiply distance by cost per km by 1.4 for needing non-standard transport type, air transport rate per km per kg set to special cargo rate
			if(total> ((((distanceSupplierToAirport * truckPerKm) + (distanceAirportToAirport * (weight*0.06)) + (distanceAirportToClient * truckPerKm))*1.4))||total==0) {
			total =   ((((distanceSupplierToAirport * truckPerKm) + (distanceAirportToAirport * (weight*0.06)) + (distanceAirportToClient * truckPerKm))*1.4)); 
			 water = false;
			air = true;
			train = false;
			}
		}
		if((refrigerated==true||frozen==true)&&livestock==false&&specialReq==false&&airAvailable==false&&waterAvailable==true&&directLand==false){
			//Multiply distance by cost per km by 1.4 for needing non-standard transport type, air transport rate per km per kg set to special cargo rate
			if(total> ((((distanceSupplierToSeaport * truckPerKm) + (distanceSeaportToSeaport * (containersNumber*1.64)) + (distanceSeaportToClient * truckPerKm))*1.4))||total==0) { 
			total =   ((((distanceSupplierToSeaport * truckPerKm) + (distanceSeaportToSeaport * (containersNumber*1.64)) + (distanceSeaportToClient * truckPerKm))*1.4)); 
			 air = false;
			water = true;
			train = false;
			}
		}
		if((refrigerated==true||frozen==true)&&livestock==false&&specialReq==false&&airAvailable==true&&waterAvailable==true&&directLand==false){
			//Multiply distance by cost per km by 1.4 for needing non-standard transport type, air transport rate per km per kg set to special cargo rate 
			double total1 =   ((((distanceSupplierToAirport * truckPerKm) + (distanceAirportToAirport * (weight*0.06)) + (distanceAirportToClient * truckPerKm))*1.4)); 
			double total2 =   ((((distanceSupplierToSeaport * truckPerKm) + (distanceSeaportToSeaport * (containersNumber*1.64)) + (distanceSeaportToClient * truckPerKm))*1.4)); 
			if(total1>total2&&(total>total2||total==0)) {
				 total = total2;
				 water = false;
				 air = true;
				 train = false;
			}
			else {
				if(total>total1||total==0) {
				 total = total1;
				 air = false;
				 water = true;
				 train = false;
				}
			}
		}
		if((refrigerated==true||frozen==true)&&livestock==false&&specialReq==false&&airAvailable==true&&waterAvailable==false&&directLand==true){
			//Multiply distance by cost per km by 1.4 for needing non-standard transport type, air transport rate per km per kg set to special cargo rate 
			double total1 =   (distanceSupplierToClient * truckPerKm * 1.4); 
			double total2 =   ((((distanceSupplierToAirport * truckPerKm) + (distanceAirportToAirport * (weight*0.06)) + (distanceAirportToClient * truckPerKm))*1.4)); 
			if(total1>total2&&(total>total2||total==0)) {
				 total = total2;
			}
			else {
				if(total>total1||total==0) {
				 total = total1;
				 water = false;
				 air = true;
				 train = false;
				}
			}
		}
		if((refrigerated==true||frozen==true)&&livestock==false&&specialReq==false&&airAvailable==false&&waterAvailable==true&&directLand==true){
			//Multiply distance by cost per km by 1.4 for needing non-standard transport type, air transport rate per km per kg set to special cargo rate 
			double total1 =   (distanceSupplierToClient * truckPerKm * 1.4); 
			double total2 =   (((((distanceSupplierToSeaport * truckPerKm) + (distanceSeaportToSeaport * (containersNumber*1.64))) + (distanceSeaportToClient * truckPerKm))*1.4)); 
			if(total1>total2&&(total>total2||total==0)) {
				 total = total2;
				 water = false;
				 air = false;
				 train = false;
			}
			else {
				if(total>total1||total==0) {
				 total = total1;
				 air = false;
				 water = true;
				 train = false;
				}
			}
		}
		if((refrigerated==true||frozen==true)&&livestock==false&&specialReq==false&&airAvailable==true&&waterAvailable==true&&directLand==true){
			//Multiply distance by cost per km by 1.4 for needing non-standard transport type, air transport rate per km per kg set to special cargo rate 
			double total1 =   (distanceSupplierToClient * truckPerKm * 1.4); 
			double total2 =   ((((distanceSupplierToAirport * truckPerKm) + (distanceAirportToAirport * (weight*0.06)) + (distanceAirportToClient * truckPerKm))*1.4)); 
			double total3 =   ((((distanceSupplierToSeaport * truckPerKm) + (distanceSeaportToSeaport * (containersNumber*1.64)) + (distanceSeaportToClient * truckPerKm))*1.4)); 
			if(total1<total2&&total1<total3&&(total>total1||total==0)) {
				 total = total1;
				 water = false;
				 air = false;
				 train = false;
			}
			if(total2<total1&&total2<total3&&(total>total2||total==0)) {
				 total = total2;
				 water = false;
				 air = true;
				 train = false;
			}
			if(total3<total1&&total3<total2&&(total>total3||total==0)) {
				 total = total3;
				 air = false;
				 water = true;
				 train = false;
			}
		}
		
		//Calculations for transporting produce without any kind of extra requirements
		if(refrigerated==false&&frozen==false&&livestock==false&&specialReq==false&&airAvailable==true&&waterAvailable==true&&directLand==true){
			double total1 =   (distanceSupplierToClient * truckPerKm); 
			double total2 =   (((distanceSupplierToAirport * truckPerKm) + (distanceAirportToAirport * (weight*0.044)) + (distanceAirportToClient * truckPerKm))); 
			double total3 =   (((distanceSupplierToSeaport * truckPerKm) + (distanceSeaportToSeaport * (containersNumber*1.64)) + (distanceSeaportToClient * truckPerKm))); 
			double total4 =   (distanceSupplierToClient * trainPerKm); 
			double total5 =   (((distanceSupplierToAirport * trainPerKm) + (distanceAirportToAirport * (weight*0.044)) + (distanceAirportToClient * trainPerKm))); 
			double total6 =   (((distanceSupplierToSeaport * trainPerKm) + (distanceSeaportToSeaport * (containersNumber*1.64)) + (distanceSeaportToClient * trainPerKm))); 
			if(total1<total2&&total1<total3&&total1<total4&&total1<total5&&total1<total6&&(total>total1||total==0)) {
				 total = total1;
				 water = false;
				 air = false;
				 train = false;
			}
			if(total2<total1&&total2<total3&&total2<total4&&total2<total5&&total2<total6&&(total>total2||total==0)) {
				 total = total2;
				totalExpress =   ((((distanceSupplierToAirport * truckPerKm) + (distanceAirportToAirport * (weight*0.06)) + (distanceAirportToClient * truckPerKm))*1.4)); 
				 water = false;
				air = true;
				train = false;
			}
			if(total3<total1&&total3<total2&&total3<total4&&total3<total5&&total3<total6&&(total>total3||total==0)) {
				 total = total3;
				 air = false;
				 water = true;
				 train = false;
			}
			if(total4<total1&&total4<total2&&total4<total3&&total4<total5&&total4<total6&&(total>total4||total==0)) {
				 total = total4;
				 air = false;
				 water = false;
				 train = false;
			}
			if(total5<total1&&total5<total2&&total5<total3&&total5<total4&&total5<total6&&(total>total||total==0)) {
				 total = total5;
				totalExpress =   ((((distanceSupplierToAirport * trainPerKm) + (distanceAirportToAirport * (weight*0.06)) + (distanceAirportToClient * trainPerKm))*1.4)); 
				train = true;
				air = true;
				 water = false;
			}
			if(total6<total1&&total6<total2&&total6<total3&&total6<total4&&total6<total5&&(total>total||total==0)) {
				 total = total6;
				train = true;
				water = true;
				 air = false;
			}
		}
		
		if(refrigerated==false&&frozen==false&&livestock==false&&specialReq==false&&airAvailable==false&&waterAvailable==true&&directLand==true){
			double total1 =   (distanceSupplierToClient * truckPerKm); 
			double total2 =   (((distanceSupplierToSeaport * truckPerKm) + (distanceSeaportToSeaport * (containersNumber*1.64)) + (distanceSeaportToClient * truckPerKm))); 
			double total3 =   (distanceSupplierToClient * trainPerKm); 
			double total4 =   (((distanceSupplierToSeaport * trainPerKm) + (distanceSeaportToSeaport * (containersNumber*1.64)) + (distanceSeaportToClient * trainPerKm))); 
			if(total1<total2&&total1<total3&&total1<total4&&(total>total1||total==0)) {
				 total = total1;
				 air = false;
				 water = false;
				 train = false;
			}
			if(total2<total1&&total2<total3&&total2<total4&&(total>total2||total==0)) {
				 total = total2;
				 water = true;
				 air = false;
				 train = false;
			}
			if(total3<total1&&total3<total2&&total3<total4&&(total>total3||total==0)) {
				 total = total3;
				train = true;
				 water = false;
				 air = false;
			}
			if(total4<total1&&total4<total2&&total4<total3&&(total>total4||total==0)) {
				 total = total4;
				train = true;
				water = true;
				 air = false;
			}
		}
		
		if(refrigerated==false&&frozen==false&&livestock==false&&specialReq==false&&airAvailable==true&&waterAvailable==false&&directLand==true){
			double total1 =   (distanceSupplierToClient * truckPerKm); 
			double total2 =   (((distanceSupplierToAirport * truckPerKm) + (distanceAirportToAirport * (weight*0.044)) + (distanceAirportToClient * truckPerKm))); 
			double total3 =   (distanceSupplierToClient * trainPerKm); 
			double total4 =   (((distanceSupplierToAirport * trainPerKm) + (distanceAirportToAirport * (weight*0.044)) + (distanceAirportToClient * trainPerKm))); 
			if(total1<total2&&total1<total3&&total1<total4&&(total>total1||total==0)) {
				 total = total1;
				 water = false;
				 air = false;
				 train = false;
			}
			if(total2<total1&&total2<total3&&total2<total4&&(total>total2||total==0)) {
				 total = total2;
				totalExpress =   ((((distanceSupplierToAirport * truckPerKm) + (distanceAirportToAirport * (weight*0.06)) + (distanceAirportToClient * truckPerKm))*1.4)); 
				air = true;
				 water = false;
				 train = false;
			}
			if(total3<total1&&total3<total2&&total3<total4&&(total>total3||total==0)) {
				 total = total3;
				train = true;
				 water = false;
				 air = false;
			}
			if(total4<total1&&total4<total2&&total4<total3&&(total>total4||total==0)) {
				 total = total4;
					totalExpress =   ((((distanceSupplierToAirport * trainPerKm) + (distanceAirportToAirport * (weight*0.06)) + (distanceAirportToClient * trainPerKm))*1.4)); 
				train = true;
				air = true;
				 water = false;
			}
		}
		
		if(refrigerated==false&&frozen==false&&livestock==false&&specialReq==false&&airAvailable==true&&waterAvailable==true&&directLand==false){
			double total1 =   (((distanceSupplierToAirport * truckPerKm) + (distanceAirportToAirport * (weight*0.044)) + (distanceAirportToClient * truckPerKm))); 
			double total2 =   (((distanceSupplierToSeaport * truckPerKm) + (distanceSeaportToSeaport * (containersNumber*1.64)) + (distanceSeaportToClient * truckPerKm))); 
			double total3 =   (((distanceSupplierToAirport * trainPerKm) + (distanceAirportToAirport * (weight*0.044)) + (distanceAirportToClient * trainPerKm))); 
			double total4 =   (((distanceSupplierToSeaport * trainPerKm) + (distanceSeaportToSeaport * (containersNumber*1.64)) + (distanceSeaportToClient * trainPerKm))); 
			if(total1<total2&&total1<total3&&total1<total4&&(total>total1||total==0)) {
				 total = total1;
					totalExpress =   ((((distanceSupplierToAirport * truckPerKm) + (distanceAirportToAirport * (weight*0.06)) + (distanceAirportToClient * truckPerKm))*1.4)); 
					air = true;
					 water = false;
					 train = false;
			}
			if(total2<total1&&total2<total3&&total2<total4&&(total>total2||total==0)) {
				 total = total2;
				 water = true;
				 air = false;
				 train = false;
			}
			if(total3<total1&&total3<total2&&total3<total4&&(total>total3||total==0)) {
				 total = total3;
					totalExpress =   ((((distanceSupplierToAirport * trainPerKm) + (distanceAirportToAirport * (weight*0.06)) + (distanceAirportToClient * trainPerKm))*1.4)); 
				train = true;
				air = true;
				 water = false;
			}
			if(total4<total1&&total4<total2&&total4<total3&&(total>total4||total==0)) {
				 total = total4;
				train = true;
				water = true;
				 air = false;
			}
		}
		
		if(refrigerated==false&&frozen==false&&livestock==false&&specialReq==false&&airAvailable==false&&waterAvailable==true&&directLand==false){
			double total1 =   (((distanceSupplierToSeaport * truckPerKm) + (distanceSeaportToSeaport * (containersNumber*1.64)) + (distanceSeaportToClient * truckPerKm))); 
			double total2 =   (((distanceSupplierToSeaport * trainPerKm) + (distanceSeaportToSeaport * (containersNumber*1.64)) + (distanceSeaportToClient * trainPerKm))); 
			if(total1<total2&&(total>total1||total==0)) {
				 total = total1;
				 water = true;
				 air = false;
				 train = false;
			}
			if(total2<total1&&(total>total2||total==0)) {
				 total = total2;
				train = true;
				water = true;
				 air = false;
			}
		}
		
		if(refrigerated==false&&frozen==false&&livestock==false&&specialReq==false&&airAvailable==true&&waterAvailable==false&&directLand==false){
			double total1 =   (((distanceSupplierToAirport * truckPerKm) + (distanceAirportToAirport * (weight*0.044)) + (distanceAirportToClient * truckPerKm))); 
			double total2 =   (((distanceSupplierToAirport * trainPerKm) + (distanceAirportToAirport * (weight*0.044)) + (distanceAirportToClient * trainPerKm))); 
			if(total1<total2&&(total>total1||total==0)) {
				 total = total1;
					totalExpress =   ((((distanceSupplierToAirport * truckPerKm) + (distanceAirportToAirport * (weight*0.06)) + (distanceAirportToClient * truckPerKm))*1.4)); 
					air = true;
					 water = false;
					 train = false;
			}
			if(total2<total1&&(total>total2||total==0)) {
				 total = total2;
					totalExpress =   ((((distanceSupplierToAirport * trainPerKm) + (distanceAirportToAirport * (weight*0.06)) + (distanceAirportToClient * trainPerKm))*1.4)); 
				train = true;
				air = true;
				 water = false;
			}
		}
		
		if(refrigerated==false&&frozen==false&&livestock==false&&specialReq==false&&airAvailable==true&&waterAvailable==false&&directLand==true){
			double total1 =   (distanceSupplierToClient * truckPerKm); 
			double total2 =   (distanceSupplierToClient * trainPerKm); 
			if(total1<total2&&total>total1) {
				 total = total1;
				 water = false;
				 air = false;
				 train = false;
			}
			if(total2<total1&&(total>total2||total==0)) {
				 total = total2;
				train = true;
				water = false;
				air = false;
			}

		}
		
		
		//Output final total for distribution while specifying what methods of transport are used to calculate said total
		if(frozen==false&&specialReq==false&&livestock==false&&refrigerated==true&&air==true) {
			if(total<budget[1]) {
				System.out.println("By using a refrigerated truck and special air cargo to ensure the temperature requirements of your produce of met during transport over land and air, you are able to transport it for the cost of £" + Math.round(total*100.0)/100.0 + " which is within your maximum budget.");
			}
			else {
				System.out.println("By using a refrigerated truck and special air cargo to ensure the temperature requirements of your produce of met during transport over land and air, you would be able to transport it for the cost of £" + Math.round(total*100.0)/100.0 + ", however this is more than your maximum budget.");
			}
		}
		
		if(frozen==false&&specialReq==false&&livestock==false&&refrigerated==true&&water==true) {
			if(total<budget[1]) {
				System.out.println("By using a refrigerated truck and reefer vessel to ensure the temperature requirements of your produce of met during transport over land and sea, you are able to transport it for the cost of £" + Math.round(total*100.0)/100.0 + " which is within your maximum budget.");
			}
			else {
				System.out.println("By using a refrigerated truck and reefer vessel to ensure the temperature requirements of your produce of met during transport over land and sea, you would be able to transport it for the cost of £" + Math.round(total*100.0)/100.0 + ", however this is more than your maximum budget.");
			}
		}
		
		if(frozen==false&&specialReq==false&&livestock==false&&refrigerated==true&&water==false&&air==false) {
			if(total<budget[1]) {
				System.out.println("By using a refrigerated truck to ensure the temperature requirements of your produce of met during transport over land, you are able to transport it for the cost of £" + Math.round(total*100.0)/100.0 + " which is within your maximum budget.");
			}
			else {
				System.out.println("By using a refrigerated truck to ensure the temperature requirements of your produce of met during transport over land, you would be able to transport it for the cost of £" + Math.round(total*100.0)/100.0 + ", however this is more than your maximum budget.");
			}
		}
		
		if(refrigerated==false&&specialReq==false&&livestock==false&&frozen==true&&air==true) {
			if(total<budget[1]) {
				System.out.println("By using a freezer truck and special air cargo to ensure the temperature requirements of your produce of met during transport over land and air, you are able to transport it for the cost of £" + Math.round(total*100.0)/100.0 + " which is within your maximum budget.");
			}
			else {
				System.out.println("By using a freezer truck and special air cargo to ensure the temperature requirements of your produce of met during transport over land and air, you would be able to transport it for the cost of £" + Math.round(total*100.0)/100.0 + ", however this is more than your maximum budget.");
			}
		}
		
		if(refrigerated==false&&specialReq==false&&livestock==false&&frozen==true&&water==true) {
			if(total<budget[1]) {
				System.out.println("By using a freezer truck and reefer vessel to ensure the temperature requirements of your produce of met during transport over land and sea, you are able to transport it for the cost of £" + Math.round(total*100.0)/100.0 + " which is within your maximum budget.");
			}
			else {
				System.out.println("By using a freezer truck and reefer vessel to ensure the temperature requirements of your produce of met during transport over land and sea, you would be able to transport it for the cost of £" + Math.round(total*100.0)/100.0 + ", however this is more than your maximum budget.");
			}
		}
		
		if(refrigerated==false&&specialReq==false&&livestock==false&&frozen==true&&water==false&&air==false) {
			if(total<budget[1]) {
				System.out.println("By using a freezer truck to ensure the temperature requirements of your produce of met during transport over land, you are able to transport it for the cost of £" + Math.round(total*100.0)/100.0 + " which is within your maximum budget.");
			}
			else {
				System.out.println("By using a freezer truck to ensure the temperature requirements of your produce of met during transport over land, you would be able to transport it for the cost of £" + Math.round(total*100.0)/100.0 + ", however this is more than your maximum budget.");
			}
		}
		
		if(refrigerated==false&&specialReq==false&&frozen==false&&livestock==true&&water==false) {
			if(total<budget[1]) {
				System.out.println("By using a specialty rail car to ensure your livestock is safely transported over land, you are able to transport it for the cost of £" + Math.round(total*100.0)/100.0 + " which is within your maximum budget.");
			}
			else {
				System.out.println("By using a specialty rail car to ensure your livestock is safely transported over land, you would be able to transport it for the cost of £" + Math.round(total*100.0)/100.0 + ", however this is more than your maximum budget.");
			}
		}
		
		if(refrigerated==false&&specialReq==false&&frozen==false&&livestock==true&&water==true) {
			if(total<budget[1]) {
				System.out.println("By using a specialty rail car and a livestock vessel to ensure your livestock is safely transported over land and sea, you are able to transport it for the cost of £" + Math.round(total*100.0)/100.0 + " which is within your maximum budget.");
			}
			else {
				System.out.println("By using a specialty rail car and a livestock vessel to ensure your livestock is safely transported over land and sea, you would be able to transport it for the cost of £" + Math.round(total*100.0)/100.0 + ", however this is more than your maximum budget.");
			}
		}
		
		if(refrigerated==false&&livestock==false&&frozen==false&&specialReq==true&&air==true) {
			if(total<budget[1]) {
				System.out.println("By using a specialty rail car and special air cargo to ensure the special requirements of your produce is met during transport over land and air, you are able to transport it for the cost of £" + Math.round(total*100.0)/100.0 + " which is within your maximum budget.");
			}
			else {
				System.out.println("By using a specialty rail car and special air cargo to ensure the special requirements of your produce is met during transport over land and air, you would be able to transport it for the cost of £" + Math.round(total*100.0)/100.0 + ", however this is more than your maximum budget.");
			}
		}
		
		if(refrigerated==false&&livestock==false&&frozen==false&&specialReq==true&&air==false) {
			if(total<budget[1]) {
				System.out.println("By using a specialty rail car to ensure the special requirements of your produce is met during transport over land, you are able to transport it for the cost of £" + Math.round(total*100.0)/100.0 + " which is within your maximum budget.");
			}
			else {
				System.out.println("By using a specialty rail car to ensure the special requirements of your produce is met during transport over land, you would be able to transport it for the cost of £" + Math.round(total*100.0)/100.0 + ", however this is more than your maximum budget.");
			}
		}
		
		if(refrigerated==false&&livestock==false&&frozen==false&&specialReq==false&&water==false&&air==false&&train==false&&produceType!="Refined Grains"&&produceType!="Sugars") {
			if(total<budget[1]) {
					System.out.println("By using a semi-truck to transport your produce across land, you are able to transport it for the cost of £" + Math.round(total*100.0)/100.0 +  " which is within your maximum budget.");
				}
			else {
				System.out.println("The cheapest possible method of transport that meets your requirements, using a semi-truck to transport across land, would cost £" + Math.round(total*100.0)/100.0 +  " which is outside of your maximum budget.");
			}
		}
		
		if(refrigerated==false&&livestock==false&&frozen==false&&specialReq==false&&water==false&&air==false&&train==true&&produceType!="Refined Grains"&&produceType!="Sugars") {
			if(total<budget[1]) {
					System.out.println("By using a boxcar train car to transport your produce across land, you are able to transport it for the cost of £" + Math.round(total*100.0)/100.0 +  " which is within your maximum budget.");
				}
			else {
				System.out.println("The cheapest possible method of transport that meets your requirements, using a boxcar train car to transport across land, would cost £" + Math.round(total*100.0)/100.0 +  " which is outside of your maximum budget.");
			}
		}
		
		if(refrigerated==false&&livestock==false&&frozen==false&&specialReq==false&&water==false&&air==false&&train==false&&(produceType=="Refined Grains"||produceType=="Sugars")) {
			if(total<budget[1]) {
					System.out.println("By using a tanker truck to transport your produce across land, you are able to transport it for the cost of £" + Math.round(total*100.0)/100.0 +  " which is within your maximum budget.");
				}
			else {
				System.out.println("The cheapest possible method of transport that meets your requirements, using a tanker truck to transport across land, would cost £" + Math.round(total*100.0)/100.0 +  " which is outside of your maximum budget.");
			}
		}
		
		if(refrigerated==false&&livestock==false&&frozen==false&&specialReq==false&&water==false&&air==false&&train==true&&(produceType=="Refined Grains"||produceType=="Sugars")) {
			if(total<budget[1]) {
					System.out.println("By using a hopper train car to transport your produce across land, you are able to transport it for the cost of £" + Math.round(total*100.0)/100.0 +  " which is within your maximum budget.");
				}
			else {
				System.out.println("The cheapest possible method of transport that meets your requirements, using a hopper train car to transport across land, would cost £" + Math.round(total*100.0)/100.0 +  " which is outside of your maximum budget.");
			}
		}
		
		if(refrigerated==false&&livestock==false&&frozen==false&&specialReq==false&&water==true&&air==false&&train==false&&produceType!="Refined Grains"&&produceType!="Sugars") {
			if(total<budget[1]) {
					System.out.println("By using a semi-truck and a Ro-Ro vessel to transport your produce across land and water, you are able to transport it for the cost of £" + Math.round(total*100.0)/100.0 +  " which is within your maximum budget.");
				}
			else {
				System.out.println("The cheapest possible method of transport that meets your requirements, using a semi-truck and a Ro-Ro vessel to transport across land and water, would cost £" + Math.round(total*100.0)/100.0 +  " which is outside of your maximum budget.");
			}
		}
		
		if(refrigerated==false&&livestock==false&&frozen==false&&specialReq==false&&water==true&&air==false&&train==true&&produceType!="Refined Grains"&&produceType!="Sugars") {
			if(total<budget[1]) {
					System.out.println("By using a boxcar train car and a general cargo vessel to transport your produce across land and water, you are able to transport it for the cost of £" + Math.round(total*100.0)/100.0 +  " which is within your maximum budget.");
				}
			else {
				System.out.println("The cheapest possible method of transport that meets your requirements, using a boxcar train car and a general cargo vessel to transport across land and water, would cost £" + Math.round(total*100.0)/100.0 +  " which is outside of your maximum budget.");
			}
		}
		
		if(refrigerated==false&&livestock==false&&frozen==false&&specialReq==false&&water==true&&air==false&&train==false&&(produceType=="Refined Grains"||produceType=="Sugars")) {
			if(total<budget[1]) {
					System.out.println("By using a tanker truck and a bulk carrier to transport your produce across land and water, you are able to transport it for the cost of £" + Math.round(total*100.0)/100.0 +  " which is within your maximum budget.");
				}
			else {
				System.out.println("The cheapest possible method of transport that meets your requirements, using a tanker truck and a bulk carrier to transport across land and water, would cost £" + Math.round(total*100.0)/100.0 +  " which is outside of your maximum budget.");
			}
		}
		
		if(refrigerated==false&&livestock==false&&frozen==false&&specialReq==false&&water==false&&air==true&&train==false&&produceType!="Refined Grains"&&produceType!="Sugars") {
			if(total<budget[1]) {
				if(totalExpress<budget[1]) {
					System.out.println("By using a semi-truck and a general cargo flight to transport your produce across land and air, you are able to transport it for the cost of £" + Math.round(total*100.0)/100.0 +  " which is within your maximum budget, additionaly, for the cost of £" + totalExpress + " which is also within your maximum budget, you could use expedited air freight to greatly reduce the time it takes for your produce to be delivered over air.");
				}
				else {
					
					System.out.println("By using a semi-truck and a general cargo flight to transport your produce across land and air, you are able to transport it for the cost of £" + Math.round(total*100.0)/100.0 +  " which is within your maximum budget.");
				}
				}
			else {
				System.out.println("The cheapest possible method of transport that meets your requirements, using a semi-truck and a general cargo flight to transport across land and air, would cost £" + Math.round(total*100.0)/100.0 +  " which is outside of your maximum budget.");
			}
		}

		if(refrigerated==false&&livestock==false&&frozen==false&&specialReq==false&&water==false&&air==true&&train==true&&produceType!="Refined Grains"&&produceType!="Sugars") {
			if(total<budget[1]) {
				if(totalExpress<budget[1]) {
					System.out.println("By using a boxcar train car and a general cargo flight to transport your produce across land and air, you are able to transport it for the cost of £" + Math.round(total*100.0)/100.0 +  " which is within your maximum budget, additionaly, for the cost of £" + totalExpress + " which is also within your maximum budget, you could use expedited air freight to greatly reduce the time it takes for your produce to be delivered over air.");
				}
				else {
					
					System.out.println("By using a boxcar train car and a general cargo flight to transport your produce across land and air, you are able to transport it for the cost of £" + Math.round(total*100.0)/100.0 +  " which is within your maximum budget.");
				}
				}
			else {
				System.out.println("The cheapest possible method of transport that meets your requirements, using a boxcar train car and a general cargo flight to transport across land and air, would cost £" + Math.round(total*100.0)/100.0 +  " which is outside of your maximum budget.");
			}
		}
		
		if(refrigerated==false&&livestock==false&&frozen==false&&specialReq==false&&water==false&&air==true&&train==false&&(produceType=="Refined Grains"&&produceType=="Sugars")) {
			if(total<budget[1]) {
				if(totalExpress<budget[1]) {
					System.out.println("By using a tanker truck and a general cargo flight to transport your produce across land and air, you are able to transport it for the cost of £" + Math.round(total*100.0)/100.0 +  " which is within your maximum budget, additionaly, for the cost of £" + totalExpress + " which is also within your maximum budget, you could use expedited air freight to greatly reduce the time it takes for your produce to be delivered over air.");
				}
				else {
					
					System.out.println("By using a tanker truck and a general cargo flight to transport your produce across land and air, you are able to transport it for the cost of £" + Math.round(total*100.0)/100.0 +  " which is within your maximum budget.");
				}
				}
			else {
				System.out.println("The cheapest possible method of transport that meets your requirements, using a tanker truck and a general cargo flight to transport across land and air, would cost £" + Math.round(total*100.0)/100.0 +  " which is outside of your maximum budget.");
			}
		}
		
		if(refrigerated==false&&livestock==false&&frozen==false&&specialReq==false&&water==false&&air==true&&train==true&&(produceType=="Refined Grains"&&produceType=="Sugars")) {
			if(total<budget[1]) {
				if(totalExpress<budget[1]) {
					System.out.println("By using a hopper train car and a general cargo flight to transport your produce across land and air, you are able to transport it for the cost of £" + Math.round(total*100.0)/100.0 +  " which is within your maximum budget, additionaly, for the cost of £" + totalExpress + " which is also within your maximum budget, you could use expedited air freight to greatly reduce the time it takes for your produce to be delivered over air.");
				}
				else {
					
					System.out.println("By using a hopper train car and a general cargo flight to transport your produce across land and air, you are able to transport it for the cost of £" + Math.round(total*100.0)/100.0 +  " which is within your maximum budget.");
				}
				}
			else {
				System.out.println("The cheapest possible method of transport that meets your requirements, using a hopper train car and a general cargo flight to transport across land and air, would cost £" + Math.round(total*100.0)/100.0 +  " which is outside of your maximum budget.");
			}
		}
		landOnlyMenu.promptContinue();
	}
	
	
	/**
	 * Will retrieve the air transport details.
	 * @return --> Return the details as String. 
	 */
	public void getAirTransportDetails() {
		air.getDetails();
	}
	/**
	 * Will retrieve the water transport details.
	 * @return --> Returns the details as String.
	 */
	public void getWaterTransportDetails() {
		water.getDetails();
	}
	/**
	 * Will retrieve the land transport details.
	 * @return --> Returns the details as a string.
	 */
	public void getLandTransportDetails() {
		land.getDetails();
	}
	
	public void getExamplesOfAir() {
		air.viewTransportTypes();
	}
	
	public void getExamplesOfWater() {
		water.viewTransportTypes();
	}
	
	public void getExamplesOfLand() {
		land.viewTransportTypes();
	}
	
	
	
	
}

