package Story1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
/**
 * Author: Jay Conlon
 * Purpose: To show-case land transport details. Implements transport interface. 
 */
public class Land implements Transport {
	private ArrayList<String> differentTransportTypes;// Stores the different transport types. 
	public Land() {
		this.differentTransportTypes = new ArrayList<String>();
		this.differentTransportTypes.add("Semi truck");
		this.differentTransportTypes.add("Tanker truck");
		this.differentTransportTypes.add("Refrigerated truck");
		this.differentTransportTypes.add("Freezer truck");
		this.differentTransportTypes.add("Boxcar rail");
		this.differentTransportTypes.add("Hopper car rail");
		this.differentTransportTypes.add("Flat cars rail");
		this.differentTransportTypes.add("Refrigerator car rail");
		this.differentTransportTypes.add("Speciality car rail");
		this.differentTransportTypes.add("Flat car rail");
	}
	/**
	 * Will read from the respective text file. Will show-case the necessary details.
	 */
	public boolean getDetails() {
		try {
			String information = "";
			BufferedReader bufferReader = new BufferedReader(new FileReader("LandDetails.txt")); // Will read the respective file.
			String line;
			while ((line = bufferReader.readLine()) != null) { // Will iterate through the text file.
				//System.out.println(line); // Will show-case all details of the text file.
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
	 * Will iterate through the array list and show-case all requirements. 
	 * @return --> Returns null
	 */
	public boolean viewTransportTypes() {
		try {
			if (this.differentTransportTypes.size() != 0 && this.differentTransportTypes != null) { // Will check if array list is valid.
				System.out.println("Different transport types");
				for (int index = 0; index < this.differentTransportTypes.size(); index++) { // Will iterate through and show-case all requirements. 
					System.out.println(" - "+ this.differentTransportTypes.get(index)); // All elements presented. 
				}
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
}

