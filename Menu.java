package Story1;

import java.util.Scanner;
/**
 * Author: Nikhil Mathur
 * Purpose: Enable numerous creations of menu's via the instantiation of an object from this class. All relevant choice's are to be displayed and returned when selected by the user.
 * This is to allow for menu's to be created efficiently. 
 */
public class Menu {
	private String[] options; //To hold the different options the menu will display to the user. 
	private String title; //The title which the menu will incorporate.
	private Scanner scan; //Allow user entry
	/**
	 * Constructor to enable instantiation. Title and options taken as parameters and are used to further develop the menu's contents. 
	 * @param title --> Used to initialize a title of the menu
	 * @param options --> Used to initialize the options within the menu.
	 */
	public Menu(String title, String options[]) {
		this.title = title;
		this.options = options;
		this.scan = new Scanner(System.in);
	}
	/**
	 * Display method used to show-case all requirements of the menu.
	 * Will display the title, and the choices within the menu.
	 */
	private void display() {
		if(options != null && options.length != 0 && title != null) { //Will check for null to ensure that no inaccurate pointers to memory. Also check for empty array to ensure that the options exist. 
			System.out.println(this.title);//Print title
			System.out.println();
			for (int index = 0; index < title.length(); index++) {
				System.out.print("*");//For cleaner representation.
			}
			System.out.println();
			int x = 1;
			for (int index = 0; index < options.length; index++) {
				System.out.println(x + ". "+ options[index]);
				x++;//Represent all contents within the menu.
			}
		}else {
			System.out.println("This is not valid!");
		}
	}
	/**
	 * This method will get the choice from the user. It will first call the display functionality, where the contents are displayed. 
	 * After, the choice will be demanded from the user, and the entered choice will be returned. 
	 * The returned value can be used to manipulate conditional code and requirements. 
	 * @return
	 */
	public int getChoice() {
		display();//Calls private display functionality. 
		//try catch loop inside of do while prevents the code from progressing without a valid input
		boolean ok = false;
		int value = 0;
		do {
			value = 0;
			System.out.println("Please enter the choice: "); //Will demand the user entry.
			try {
				value = this.scan.nextInt();//Will allow user to enter value.
				ok = true;
				scan.nextLine();
			} catch (Exception ex) {
				System.out.println("Please enter a valid number.");
				System.out.println();
				scan.nextLine();
			}
		} while (!ok);
		return value; //Will return the value entered back to the user. 	
		
		
	}
	
	//Code to wait for user to press enter before moving on, used after displaying information to allow user to read it
	public void promptContinue(){
		   System.out.println("Press \"ENTER\" to continue...");
		   String wait = scan.nextLine();
		}
	
}