package Story1;
/**
 * Author: Nikhil Mathur
 * Purpose: To create constants which could be used to describe climates. 
 */
public enum RankTemperature {
	//The different constants listed bellow. 
	LOW("Low"),
	MEDIUM("Medium"),
	HIGH("High");
	
	private String type;
	/**
	 * Constructor used to initialized the enumeration.
	 * @param type --> Used to initialize instance data.
	 */
	RankTemperature(String type){
		this.type = type;
	}
	/**
	 * ToString used to make enum value visible and usable. 
	 */
	public String toString() {
		return this.type;
	}
}

