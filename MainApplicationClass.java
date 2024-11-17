package Story1;

public class MainApplicationClass {
	public static void main(String[] args) {
		ClimateDetails climateDetails = new ClimateDetails();
		
		
		String[] choices2 = {"Storage Of Products", "Disposal and Recycling", "Details Of Climate"}; //Different choices for menu.
		String[] choices3 = {"Refined Grains", "Vegetables/Fruits", "Protein" , "Sugar"}; //Different choices for menu.
		String[] choices4 = {"Air", "Water", "Land"}; //Different choices for menu
		String[] choices5 = {"View transport information", "Get tailored transport recommendations with price estimations"}; //Different choices for menu
		String[] modificationMenu = {"Name", "Annual Mean Precipitation", "Summer temperature rank", "Winter temperature rank", "Add new kind of precipitation", "Remove kind of precipitation"}; //Different choices for menu
		boolean done = false;// Boolean to coordinate while loop.
	
		while (done != true) {//While loop running...
			String[] choices = {climateDetails.getHotWetName(), climateDetails.getHotDryName(), climateDetails.getColdWetName(), climateDetails.getColdDryName(), "Transport", "Exit System"}; //Choices for climate selection menu
			Menu mainMenu = new Menu("Select your climate to view climate specific information, or choose transport for information on distribution", choices); //Using the menu class to create a menu.
			int choiceSelection = mainMenu.getChoice();//Gets choice from user using menu class method. 
			Menu mainMenu2 = new Menu("Sections", choices2); //Creates menu
			Menu mainMenu3 = new Menu("Food Types", choices3);//Creates menu
			Menu mainMenu4 = new Menu("Transport Types", choices4);//Creates menu
			Menu mainMenu5 = new Menu("Transport options", choices5);//Creates menu
			Menu mainMenuModifications = new Menu("Modification Menu", modificationMenu);
			
			switch(choiceSelection) {//Uses switch statement to render options and path ways.
				case 1:
					//Hot Wet climate.
					int choiceSelection2 = mainMenu2.getChoice();
					Climate hotWet = new HotWet(); // S.O.L.I.D followed. 
					
					switch(choiceSelection2) {
					case 1:
						//User selects food type in storage of product section
						hotWet.getStorageOfProducts();
						mainMenu.promptContinue();
						break;
					case 2:
						//User selects food type in disposal and recycling section
						hotWet.getDisposalRecycling();
						mainMenu.promptContinue();
						break;
					case 3:
						System.out.println(climateDetails.getDetailsOfHotWet());	
						mainMenu.promptContinue();
						break;
					}
					break;
				case 2:
					//Hot Dry climate
					int choiceSelection3 = mainMenu2.getChoice();
					Climate hotDry = new HotDry();
					switch(choiceSelection3) {
					case 1:
						//User selects food type in storage of product section
						hotDry.getStorageOfProducts();
						mainMenu.promptContinue();
						break;
					case 2:
						//User selects food type in disposal and recycling section
						hotDry.getDisposalRecycling();
						mainMenu.promptContinue();
						break;
					case 3:
						System.out.println(climateDetails.getDetailsOfHotDry());
						mainMenu.promptContinue();
						break;
					}
					break;
				case 3:
					//Cold wet climate
					int choiceSelection4 = mainMenu2.getChoice();
					Climate coldWet = new ColdWet();
					switch(choiceSelection4) {
					case 1:
						//User selects food type in storage of product section
						coldWet.getStorageOfProducts();
						mainMenu.promptContinue();
						break;
					case 2:
						//User selects food type in disposal and recycling section
						coldWet.getDisposalRecycling();
						mainMenu.promptContinue();
						break;
					case 3:
						System.out.println(climateDetails.getDetailsOfColdWet());
						mainMenu.promptContinue();
						break;
					}
					break;
				case 4:
					//Cold Dry climate
					int choiceSelection5 = mainMenu2.getChoice();
					Climate coldDry = new ColdDry();
					switch(choiceSelection5) {
					case 1:
						//User selects food type in storage of product section
						coldDry.getStorageOfProducts();
						mainMenu.promptContinue();
						break;
					case 2:
						//User selects food type in disposal and recycling section
						coldDry.getDisposalRecycling();
						mainMenu.promptContinue();
						break;
					case 3:
						System.out.println(climateDetails.getDetailsOfColdDry());
						mainMenu.promptContinue();
						break;
					}
					break;
				case 5:
					//Transport information
					int transportChoice = mainMenu5.getChoice();
					//User selects if they want transport information or recommendations
					DistributionOfProduct distributionOfProduct = new DistributionOfProduct();
					switch(transportChoice) {
					case 1:
						//User selects transport information
						int choice = mainMenu4.getChoice();
						String distributionMenuChoices[] = {"Get examples of transport", "Get Details" };
						Menu newMenu = new Menu("Options", distributionMenuChoices);
						switch(choice) {
						//User selects to view information on air transport
						case 1:
							int selection = newMenu.getChoice();
							switch(selection) {
							case 1:
								distributionOfProduct.getExamplesOfAir();
								mainMenu.promptContinue();
								break;
							case 2:
								distributionOfProduct.getAirTransportDetails();
								mainMenu.promptContinue();
								break;
							}
							break;
						//User selects to view information on water transport
						case 2:
							int selection2 = newMenu.getChoice();
							switch(selection2) {
							case 1:
								distributionOfProduct.getExamplesOfWater();
								mainMenu.promptContinue();
								break;
							case 2:
								distributionOfProduct.getWaterTransportDetails();
								mainMenu.promptContinue();
								break;
							}
							break;
							//User selects to view information on land transport
						case 3:
							int selection3 = newMenu.getChoice();
							switch(selection3) {
							case 1:
								distributionOfProduct.getExamplesOfLand();
								mainMenu.promptContinue();
								break;
							case 2:
								distributionOfProduct.getLandTransportDetails();
								mainMenu.promptContinue();
								break;
							}
							break;
						}
						break;
					case 2:
					distributionOfProduct.giveRecommendation();
					break;
			}
					break;
				case 6:
					//Will end loop.
					System.out.println("Exiting system...");
					done = true;
					break;
			}	
		}
	}
}

