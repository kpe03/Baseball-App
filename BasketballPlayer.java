public class BasketballPlayer extends Player {

	private int numberOfShotsMade, numberOfShotsAttempted;
	public static final double SHOT_PERCENTAGE_THRESHOLD = .32;
	
	public BasketballPlayer() {
		
	}
	
	public BasketballPlayer(int id, String playerName, String teamName, String position,
			double salary, double commissionRate, int numberOfShotsMade,
			int numberOfShotsAttempted) {
		super(id, playerName, teamName, position, salary, commissionRate);
		this.numberOfShotsMade = numberOfShotsMade;
		this.numberOfShotsAttempted = numberOfShotsAttempted;
	}

	/**
	 * @return the numberOfShotsMade
	 */
	public int getNumberOfShotsMade() {
		return numberOfShotsMade;
	}

	/**
	 * @return the numberOfShotsAttempted
	 */
	public int getNumberOfShotsAttempted() {
		return numberOfShotsAttempted;
	}

	/**
	 * @param numberOfShotsMade the numberOfShotsMade to set
	 */
	public void setNumberOfShotsMade(int numberOfShotsMade) {
		this.numberOfShotsMade = numberOfShotsMade;
	}

	/**
	 * @param numberOfShotsAttempted the numberOfShotsAttempted to set
	 */
	public void setNumberOfShotsAttempted(int numberOfShotsAttempted) {
		this.numberOfShotsAttempted = numberOfShotsAttempted;
	}
	
	public double calculateStatistics() {
		return (double)numberOfShotsMade/numberOfShotsAttempted;
		
	}
	
	public boolean determineStatus() {
		if (calculateStatistics() > SHOT_PERCENTAGE_THRESHOLD) {
			return true;
		}
		else {
			return false;
		}
	}
}
