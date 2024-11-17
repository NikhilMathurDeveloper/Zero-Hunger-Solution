package Story1;

import java.util.Scanner;

/**
 * Author: Conor Casey
 * Purpose: This class represents a section within our application. Hence utilizes the section interface. 
 */
public class StorageOfProduct implements Section {
    private String name; // Stores the name of the product

    /**
     * Constructor to initialize the product name.
     *
     * @param name The name of the product.
     */
    public StorageOfProduct(String name) {
        this.name = name;
    }

    /**
     * Retrieves the stored name of the product.
     *
     * @return The product name.
     */
    @Override
    public String getName() {
        return this.name;
    }

    /**
     * Sets a new name for the product.
     *
     * @param newName The new name to set.
     */
    @Override
    public boolean setName(String newName) {
    	try {
    		if (newName != null) {
                this.name = newName;
                return true;
            } else {
                System.out.println("This is not possible"); // Print a message if newName is null
                return false;
            }
    	}catch(Exception ex) {
    		System.out.println("An error has occured");
    		return false;
    	}
    }

    /**
     * To process the user climate, choice and return the appropriate integer which is used for processing. 
     */
    @Override
    public int getMenuChoice() {
    	try {
    		String choice[] = {"Hot Dry", "Hot Wet", "Cold Dry", "Cold Wet"}; 
        	Menu newMenu = new Menu("Food Type", choice); // To instantiate the menu object, to create and utilize a menu representation. 
        	int userSelection = newMenu.getChoice(); 
        	switch(userSelection) { // Process user selection.
        	case 1:
        		return 1;
        	case 2:
        		return 2;
        	case 3: 
        		return 3;
        	case 4:
        		return 4;
        	default:
        		return 0;
        	}	
    	}catch(Exception ex) {
    		System.out.println("An error has occured");
    		return 0;
    	}
    	
    }
    /**
     * To manage the refined grains class for the storage of product class.
     */
    @Override
    public boolean managementOfRefinedGrains(int choice) {

    	FoodType refinedGrains = new RefinedGrains(); // To instantiate a refined grains object, used to utilize the necessary behaviors. 
    	
    	switch(choice) {
    	case 1:
    		refinedGrains.getStorageOfProductHotDry(); // Hot Dry
    		return true;
		case 2:
    		refinedGrains.getStorageOfProductHotWet(); // Hot Wet
    		return true;
    	case 3:
    		refinedGrains.getStorageOfProductColdDry(); // Cold Dry
    		return true;
    	case 4:
    		refinedGrains.getStorageOfProductColdWet(); // Cold Wet
    		return true;
    	default:
    		System.out.println("This is not valid!");
    		return false;
    	}   
    }
    /**
     * To manage the vegetables & fruits class for the storage of product class.
     */
    @Override
    public boolean mangagementOfVegetableFruit(int choice) {
       
    	FoodType vegetableFruit = new VegetableFruit(); // To instantiate a vegetable & fruit object, used to utilize the necessary behaviors.
    	
    	switch(choice) {
    	case 1:
    		vegetableFruit.getStorageOfProductHotDry(); // Hot Dry
    		return true;
    	case 2:
    		vegetableFruit.getStorageOfProductHotWet(); // Hot Wet
    		return true;
    	case 3:
    		vegetableFruit.getStorageOfProductColdDry(); // Cold Dry
    		return true;
    	case 4:
    		vegetableFruit.getStorageOfProductColdWet(); // Cold Wet
    		return true;
    	default:
    		System.out.println("This is not valid!");
    		return false;
    	}
        
    }
    /**
     * To manage the protein class for the storage of product class.
     */
    @Override
    public boolean managementOfProtein(int choice) {
       
    	FoodType protein = new Protein(); // Protein object, used to extract the appropriate methods. 
    
    	switch(choice) {
    	case 1:
    		protein.getStorageOfProductHotDry(); // Hot Dry
    		return true;
    	case 2:
    		protein.getStorageOfProductHotWet(); // Hot Wet
    		return true;
    	case 3:
    		protein.getStorageOfProductColdDry(); // Cold Dry
    		return true;
    	case 4:
    		protein.getStorageOfProductColdWet(); // Cold Wet
    		return true;
    	default:
    		System.out.println("This is not valid!");
    		return false;
    	}
        
    }
    /**
     * To manage the sugars for the storage of product class.
     */
    @Override
    public boolean mangagementOfSugars(int choice) {
       
    	FoodType sugars = new Sugars(); // To instantiate a sugars object, used to utilize the necessary behaviors.
    	
    	switch(choice) {
    	case 1:
    		sugars.getStorageOfProductHotDry(); // Hot Dry
    		return true;
    	case 2:
    		sugars.getStorageOfProductHotWet(); // Hot Wet
    		return true;
    	case 3:
    		sugars.getStorageOfProductColdDry(); // Cold Dry
    		return true;
    	case 4:
    		sugars.getStorageOfProductColdWet(); // Cold Wet
    		return true;
    	default:
    		System.out.println("This is not valid!");
    		return false;
    	}

    }

    /**
     * Displays a menu for selecting food types.
     * Based on the user's choice, specific actions can be performed.
     */
    @Override
    public void FoodType(int choice2) {
    	
        String choices[] = {"Refined Grains", "Vegetables/Fruits", "Protein", "Sugars"};
        Menu newMenu = new Menu("Select Food type", choices); 
        Scanner input = new Scanner(System.in);
        String choices2[] = {"HotDry", "HotWet", "ColdDry", "ColdWet"};
        Menu newMenu2 = new Menu("Climates", choices2);
        try {
        	int choice = newMenu.getChoice(); // Get user's choice
            switch (choice) {
                case 1:
                	switch(choice2) { // Refined Grains
                	case 1:
                		managementOfRefinedGrains(1);
                		break;
                	case 2:
                		managementOfRefinedGrains(2);
                		break;
                	case 3:
                		managementOfRefinedGrains(3);
                		break;
                	case 4:
                		managementOfRefinedGrains(4);
                		break;
                	}
                	break;
                case 2:
                	switch(choice2) { // Vegetable & Fruit
                	case 1:
                		mangagementOfVegetableFruit(1);
                		break;
                	case 2:
                		mangagementOfVegetableFruit(2);
                		break;
                	case 3:
                		mangagementOfVegetableFruit(3);
                		break;
                	case 4:
                		mangagementOfVegetableFruit(4);
                		break;	
                	}
                
                    // Handle vegetables/fruits
                	break;
                case 3:
                	switch(choice2) { // Protein
                	case 1:
                		managementOfProtein(1);
                		break;
                	case 2:
                		managementOfProtein(2);
                		break;
                	case 3:
                		managementOfProtein(3);
                		break;
                	case 4:
                		managementOfProtein(4);
                		break;
                	}
                    // Handle protein
                	break;
                case 4:
                	switch(choice2) { // Sugars
                	case 1:
                		mangagementOfSugars(1);
                		break;
                	case 2:
                		mangagementOfSugars(2);
                		break;
                	case 3:
                		mangagementOfSugars(3);
                		break;
                	case 4:
                		mangagementOfSugars(4);
                		break;
                	}
                    // Handle sugars
                	break;
            }
        }catch(Exception ex) {
        	System.out.println("An error has occured");
        } 
    }
}

