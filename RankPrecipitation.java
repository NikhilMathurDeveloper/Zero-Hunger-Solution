package Story1;
/**
 * Author: Nikhil Mathur
 * Purpose: This enumeration represents the different ranks of precipitation, and what a specific climate may inherit.
 * This enumeration will help initialize attributes within the children of "climate". 
 */
public enum RankPrecipitation {
	//Different ranks represented. 
	SNOW("Snow"), 
	RAIN("Rain"),
	DRIZZLE("Drizzle"),
	HAIL("Hail"),
	FOG("Fog");
	
	private String type;
	/**
	 * Constructor used to initialize assignment, and enum representation. 
	 * @param type --> String assigned. 
	 */
	RankPrecipitation(String type) {
		this.type = type;
	}
	/**
	 * ToString() created and used to represent the enumerations value. 
	 */
	public String toString() {
		return type;
	}
}
	
