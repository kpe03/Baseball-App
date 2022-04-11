public class BaseballPlayer extends Player{

	private int numberOfHits, numberOfTimesAtBat;
	public static final double BATTING_AVERAGE_THRESHOLD = .25;
	
	public BaseballPlayer() {
		
	}
	 public BaseballPlayer(int id, String playerName, String teamName, String position,
			 double salary, double commissionRate, int numberOfHits, int numberOfTimesAtBat) {
		 super(id, playerName, teamName, position, salary, commissionRate);
		 this.numberOfHits = numberOfHits;
		 this.numberOfTimesAtBat = numberOfTimesAtBat;
		 
	 }
	/**
	 * @return the numberOfHits
	 */
	public int getNumberOfHits() {
		return numberOfHits;
	}
	/**
	 * @return the numberOfTimesAtBat
	 */
	public int getNumberOfTimesAtBat() {
		return numberOfTimesAtBat;
	}
	/**
	 * @param numberOfHits the numberOfHits to set
	 */
	public void setNumberOfHits(int numberOfHits) {
		this.numberOfHits = numberOfHits;
	}
	/**
	 * @param numberOfTimesAtBat the numberOfTimesAtBat to set
	 */
	public void setNumberOfTimesAtBat(int numberOfTimesAtBat) {
		this.numberOfTimesAtBat = numberOfTimesAtBat;
	}
	
	//effector methods
	public double calculateStatistics() {
		return (double)numberOfHits/numberOfTimesAtBat;

	}
	
	public boolean determineStatus() {
		if (calculateStatistics() > BATTING_AVERAGE_THRESHOLD) {
			return true;
		}
		else {
			return false;
		}
	}
}
