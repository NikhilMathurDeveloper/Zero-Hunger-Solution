package Story1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
/**
 * Author: Jay Conlon
 * Purpose: To show-case water transport details. Implements transport interface. 
 */
public class Water implements Transport {
	private ArrayList<String> differentTransportTypes;// Stores the different transport types. 
	
	public Water() {
		this.differentTransportTypes = new ArrayList<String>();
		this.differentTransportTypes.add("General Cargo");
		this.differentTransportTypes.add("Bulk carriers");
		this.differentTransportTypes.add("Reefer vessels");
		this.differentTransportTypes.add("Ro-Ro ships");
		this.differentTransportTypes.add("Livestock vessels");
	}
	/**
	 * Will get the details from the respective text files.
	 */
	public boolean getDetails() {
		try {
			String information = "";
			BufferedReader bufferReader = new BufferedReader(new FileReader("WaterDetails.txt")); // Will read the respective text file.
			String line;
			while ((line = bufferReader.readLine()) != null) { // Will iterate through the text file.
				//System.out.println(line); // Will show-case details to the user. 
				information = information + "\n" + line;
			}
			System.out.println(information);
			return true;
		}catch(Exception ex) {
			System.out.println(ex);
			return false;
		}
		
	}
	/**
	 * Will iterate through the array, and show-case the elements within
	 * @return --> Return null;
	 */
	public boolean viewTransportTypes() {
		try {
			if (this.differentTransportTypes.size() != 0 && this.differentTransportTypes != null) { // Will check if the array list is valid.
				System.out.println("Different transport types");
				for (int index = 0; index < this.differentTransportTypes.size(); index++) {// Start iteration...
					System.out.println(" - "+ this.differentTransportTypes.get(index)); // Will display details.
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
