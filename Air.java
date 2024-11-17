package Story1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
/**
 * Author: Jay Conlon
 * Purpose: To show-case air transport details. Implements transport interface. 
 */
public class Air implements Transport {
	
	private ArrayList<String> differentTransportTypes;// Stores the different transport types. 
	public Air() {
		this.differentTransportTypes = new ArrayList<String>();
		this.differentTransportTypes.add("General Cargo");
		this.differentTransportTypes.add("Expedited Air freight");
		this.differentTransportTypes.add("Special Cargo");
	}
	/**
	 * Will retrieve the information from a text file and show-case to the user. 
	 * Try and catch to deal with any erroneous processes. 
	 */
	public boolean getDetails() {
		try {
			String information = "";
			BufferedReader bufferReader = new BufferedReader(new FileReader("AirDetails.txt")); // Will open the text file. 
			String line; 
			while ((line = bufferReader.readLine()) != null) { // Will iterate through the text file. 
				//System.out.println(line); // Will show-case all details of the text file.
				information = information + "\n"+  line;
			}
			System.out.println(information);
			return true;
		}catch(Exception ex) {
			System.out.println(ex);
			return false;
		}
		
	}
	
	/**
	 * Will iterate through the array list and show-case all elements. 
	 * @return --> Return or boolean depending on whether the operation was executed successfully or not. 
	 */
	public boolean viewTransportTypes() {
		try {
			if (this.differentTransportTypes.size() != 0 && this.differentTransportTypes != null) { // Will identify if the array list is valid.
				System.out.println("Different transport types");
				for (int index = 0; index < this.differentTransportTypes.size(); index++) { // Start iteration
					System.out.println(" - "+ this.differentTransportTypes.get(index)); // Will display all requirements. 
				}
				return true;
			}else {
				System.out.println("This is not valid!");
				return false;
			}
		}catch(Exception ex) {
			System.out.println("An error has occured");
			return false;
		}	
	}
}
