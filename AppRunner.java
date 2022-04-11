public class AppRunner {

	public static void main(String[] args) {
		
		//create two instances of BaseballPlayer and BasketballPlayer
		BaseballPlayer bbP1 = new BaseballPlayer(20, "Mike Schmidt", "Phillies",
				"Third Base", 1000000.00, .02, 2234, 8352);
		BaseballPlayer bbP2 = new BaseballPlayer(40, "John Doe", "Yankees",
				"First Base", 60000.00, .01, 1020, 6034);
		BasketballPlayer bkP1 = new BasketballPlayer(14, "Luke Skywalker", "Thunder",
				"Point Guard", 50000.00, .02, 501, 2019);
		BasketballPlayer bkP2 = new BasketballPlayer(26, "Yoda", "Jedi",
				"Center", 1000000.00, .05, 2562, 6020);
	
		
		 //baseball player one output
		System.out.printf("Player ID: %d\nName: %s\nTeam: %s\nPosition: %s\n"
				+ "Salary: %8.2f\nCommission Rate: %3.2f\nCommission: %8.2f\nNumber of hits: %d\n"
				+ "Number of times at bat: %d\nStatistics: %3.2f\nKeeping status: %s", 
				bbP1.getId(), bbP1.getPlayerName(), bbP1.getTeamName(), bbP1.getPosition(), 
				bbP1.getSalary(), bbP1.getCommissionRate(),bbP1.calcCommission(), bbP1.getNumberOfHits(), 
				bbP1.getNumberOfTimesAtBat(), bbP1.calculateStatistics(), bbP1.determineStatus());
		
		
		//baseball player two output
		System.out.printf("\n\nPlayer ID: %d\nName: %s\nTeam: %s\nPosition: %s\n"
				+ "Salary: %8.2f\n"
				+ "Commission Rate: %3.2f\nCommission: %8.2f\nNumber of hits: %d\n"
				+ "Number of times at bat: %d\nStatistics: %3.2f\nKeeping status: %s", 
				bbP2.getId(), bbP2.getPlayerName(), bbP2.getTeamName(), bbP2.getPosition(),
				bbP2.getSalary(), 
				bbP2.getCommissionRate(),bbP2.calcCommission(), bbP2.getNumberOfHits(), 
				bbP2.getNumberOfTimesAtBat(), bbP2.calculateStatistics(), bbP2.determineStatus());
		
		
		//basketball player one output
		System.out.printf("\n\nPlayer ID: %d\nName: %s\nTeam: %s\nPosition: %s\n"
				+ "Salary: %8.2f\n"
				+ "Commission Rate: %3.2f\nCommission: %8.2f\nNumber of shots made: %d\n"
				+ "Number of shots attempted: %d\nStatistics: %3.2f\nKeeping status: %s", 
				bkP1.getId(), bkP1.getPlayerName(), bkP1.getTeamName(), bkP1.getPosition(),
				bkP1.getSalary(), 
				bkP1.getCommissionRate(),bkP1.calcCommission(), bkP1.getNumberOfShotsMade(), 
				bkP1.getNumberOfShotsAttempted(), bkP1.calculateStatistics(), bkP1.determineStatus());
		
		//basketball player two output
		System.out.printf("\n\nPlayer ID: %d\nName: %s\nTeam: %s\nPosition: %s\n"
				+ "Salary: %8.2f\n"
				+ "Commission Rate: %3.2f\nCommission: %8.2f\nNumber of shots made: %d\n"
				+ "Number of shots attempted: %d\nStatistics: %3.2f\nKeeping status: %s", 
				bkP2.getId(), bkP2.getPlayerName(), bkP2.getTeamName(), bkP2.getPosition(),
				bkP2.getSalary(), 
				bkP2.getCommissionRate(),bkP2.calcCommission(), bkP2.getNumberOfShotsMade(), 
				bkP2.getNumberOfShotsAttempted(), bkP2.calculateStatistics(), bkP2.determineStatus());
		
	}
}
