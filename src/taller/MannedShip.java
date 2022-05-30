package taller;

/**
 * Class if the ship include passangers - MannedShip
 * @author steba
 *
 */

public class MannedShip implements RocketLauncher{
	
	public int peopleCapacity;
	public String equipment;
	
	
	/**
	 * Constructor
	 * @param typeOfTools
	 * @param goal
	 */
	public MannedShip(int peopleCapacity, String equipment) {
		this.peopleCapacity = peopleCapacity;
		this.equipment = equipment;
	}
	
	
	/**
	 * Interface methods "RocketLauncher" 
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
