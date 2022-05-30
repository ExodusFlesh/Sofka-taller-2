package taller;

/**
 * Class if the ship is for satellite- UnmannedShip
 * @author steba
 *
 */

public class UnmannedShip implements RocketLauncher{

	public int typeOfTools;
	public String goal;
	
	/**
	 * Constructor
	 * @param typeOfTools
	 * @param goal
	 */
	
	public UnmannedShip(int typeOfTools, String goal) {
		this.typeOfTools = typeOfTools;
		this.goal = goal;
	}

	
	/**
	 *  Interface methods "RocketLauncher" 
	 */
	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void separateLoad() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void changeDirection() {
		// TODO Auto-generated method stub
		
	}


}
