package Story1;

/**
 * Author: Conor Casey
 * Section within our application, hence utilizes the interface section. 
 */
public class DisposalRecycling implements Section {
    private String name; // Stores the name of the disposal/recycling unit

    /**
     * Constructor to initialize the disposal/recycling unit name.
     *
     * @param name The name of the disposal/recycling unit.
     */
    public DisposalRecycling(String name) {
        this.name = name;
    }

    /**
     * Retrieves the stored name of the disposal/recycling unit.
     *
     * @return The disposal/recycling unit name.
     */
    @Override
    public String getName() {
        return this.name;
    }

    /**
     * Sets a new name for the disposal/recycling unit.
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
    		System.out.println("An error occured");
    		return false;
    	}
    }
    /**
     * Used to process the menu choice made by the user, when they choose the respective climate. 
     */
    @Override
    public int getMenuChoice() {
    	try {
    		String choice[] = {"Hot Dry", "Hot Wet", "Cold Dry", "Cold Wet"};
        	Menu newMenu = new Menu("Food Type", choice); // Uses the menu object. 
        	int userSelection = newMenu.getChoice(); // Will get choice from the user. 
        	switch(userSelection) {
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
     * Will process the refined grains object, by using the respective behaviors, more specifically the ones associated with disposal and recycling. 
     */

    @Override
    public boolean managementOfRefinedGrains(int choice) {
    	FoodType refinedGrains = new RefinedGrains(); // Will instantiate the object. 
    	
    	switch(choice) {
    	case 1:
    		refinedGrains.getDisposalRecyclingHotDry(); // Hot Dry
    		return true;
    	case 2:
    		refinedGrains.getDisposalRecyclingHotWet();// Hot Wet
    		return true;
    	case 3:
    		refinedGrains.getDisposalRecyclingColdDry();// Cold Dry
    		return true;
    	case 4:
    		refinedGrains.getDisposalRecyclingColdWet();// Cold Wet
    		return true;
    	default:
    		System.out.println("This is not valid!");
    		return false;
    	}
      
    }
    /**
     * Will process the vegetable & fruit class, where the respective behaviors are being used. The one associated with disposal and recycling. 
     */
    @Override
    public boolean mangagementOfVegetableFruit(int choice) {
        FoodType vegetableFruit = new VegetableFruit(); // Will instantiate the vegetable fruit class. 
     // Will call the respective methods. 
        switch(choice) {
        case 1:
        	vegetableFruit.getDisposalRecyclingHotDry(); // Hot Dry
        	return true;
        case 2:
        	vegetableFruit.getDisposalRecyclingHotWet(); // Hot Wet
        	return true;
        case 3:
        	vegetableFruit.getDisposalRecyclingColdDry(); // Cold Dry
        	return true;
        case 4:
        	vegetableFruit.getDisposalRecyclingColdWet(); // Cold Wet
        	return true;
        default:
        	System.out.println("Not valid");
        	return false;
        }
        
    }
    /**
     * Will process the protein class, where the respective behaviors are being used. The one associated with disposal and recycling. 
     */
    @Override
    public boolean managementOfProtein(int choice ) {
        FoodType protein = new Protein();
        //Will call the respective methods. 
        switch(choice) {
        case 1:
        	protein.getDisposalRecyclingHotDry(); // Hot Dry
        	return true;
        case 2:
        	protein.getDisposalRecyclingHotWet(); // Hot Wet
        	return true;
        case 3:
        	protein.getDisposalRecyclingColdDry(); // Cold Dry
        	return true;
        case 4:
        	protein.getDisposalRecyclingColdWet(); // Cold Wet
        	return true;
        default:
        	System.out.println("This is not valid!");
        	return false;
        }
    
    }
    /**
     * Will process the sugars class, where the respective behaviors are being used. The one associated with disposal and recycling. 
     */
    @Override
    public boolean mangagementOfSugars(int choice) {
    	FoodType sugars = new Sugars();
    	//Will call the respective methods. 
    	switch(choice) {
    	case 1:
    		sugars.getDisposalRecyclingHotDry(); // Hot Dry
    		return true;
    	case 2:
    		sugars.getDisposalRecyclingHotWet(); // Hot Wet
    		return true;
    	case 3:
    		sugars.getDisposalRecyclingColdDry(); // Cold Dry
    		return true;
    	case 4:
    		sugars.getDisposalRecyclingColdWet(); // Cold Wet
    		return true;
    	default:
    		System.out.println("This is not valid!");
    		return false;
    	}
    }
    /**
     * Method to deal with user selection. According to user input will coordinate which method to initiate. 
     */
    public void FoodType(int choice2) {
        String choices[] = {"Refined Grains", "Vegetables/Fruits", "Protein", "Sugars"};
        String choices2[] = {"HotDry", "HotWet", "ColdDry", "ColdWet"};
        Menu newMenu2 = new Menu("Climates", choices2);
        Menu newMenu = new Menu("Select Food type", choices); 
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
                	
                	switch(choice2) { // Vegetables & Fruits
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
    		default:
                	break;
                    // Handle unexpected choice 
             
            }
        }catch(Exception ex) {
        	System.out.println("An error has occured");
        }         
    }
}

