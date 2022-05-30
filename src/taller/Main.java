package taller;

import java.util.Scanner;

/**
 * Spacecraft
 * code for creating different types of spacecraft
 * @author steba
 *
 */

public class Main {

	/**
	 * method used to verify that the answer is 1 or 2.
	 */
	public static void verifyOption(int value) {
		while (value != 1 || value != 2) {
			System.out.print("Option not valid, please try again");
		}
	}

	public static void main(String[] args) {

		/**
		 * Iterator and details needed for the main
		 */
		boolean on = true;
		int again = 0;
		/**
		 * Save temporaly the preferences of the current spacecraft
		 */
		String goal = "";
		int typeOfShip = 0;
		int capacity = 0;
		int mission = 0;
		String equipment = "";

		/**
		 * Loop - Local Machine
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("Welcome to SystemsEngineering in this place you can assemble your own spacecraft");
		/**
		 * Do while as infinite loop if want to assemble more ships
		 */
		do {
			/**
			 * First option : type of ship
			 *@param typeOfShip 
			 */
			System.out.print("Now select the purpose and details that you need");
			System.out.print("1 - MANNED SHIP    /    2  -  UNMANNED SHIP");
			typeOfShip = sc.nextInt();
			verifyOption(typeOfShip);
			/**
			 * conditional if Select the next steps depends on the answer
			 * 
			 * Manned Ship - Questions
			 * 
			 * @param capacity  -  Number of passagers
			 *  @param equipment - Type of equipment
			 */

			if (typeOfShip == 1) {
				System.out.print("¿How many passengers are?");
				capacity = sc.nextInt();
				verifyOption(capacity);
				System.out.print("¿What equipment do you need to carry?");
				equipment = sc.next();
				
				/**
				 * Creation of the object type MannedShip - ship created
				 * @param newShipMa
				 */
				MannedShip newShipMa = new MannedShip(capacity, equipment);

			} else {

				/**
				 * Unmanned Ship - Questions
				 * @param 
				 */

				System.out.print(
						"1 -  It's a satellite to explore planets   /    2  -  It's a satellite for space center support ");
				mission = sc.nextInt();
				verifyOption(mission);
				System.out.print("Please indicate the name of the site to reach");
				goal = sc.next();
				
				/**
				 * Creation of the object type UnmannedShip - ship created
				 * @param newShipUn
				 */
				UnmannedShip newShipUn = new UnmannedShip(mission, goal);

			}

			/**
			 * Final Question
			 * 
			 * @param again - param that defines if want a new ship or not
			 */
			System.out.print("¿Do you want assemble an additional spacecraft?");
			System.out.print("1  -  Yes     /     2   -  No");
			again = sc.nextInt();
			verifyOption(again);
			
			/**
			 * key for the loop
			 * if the answer is 1 the loop restars
			 */
			if (again == 1) {
				on = true;
			} else {
				on = false;
			}
		} while (on == true);
	}

}
