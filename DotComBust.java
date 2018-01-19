import java.io.*;

public class SimpleDotComGame {
	
	public static void main (String[] args) {
		SimpleDotCom dot = new SimpleDotCom();
		int numOfGuesses = 0;
		GameHelper helper = new GameHelper();

		int startLoc = (int)Math.random() * 4; 
		int[] locations = {startLoc, startLoc+1, startLoc+2};
		dot.setLocationCells(locations);

		boolean isAlive = true;
		while (isAlive) {
			String userGuess = helper.getUserInput("enter a number");
			numOfGuesses++;
			if (dot.checkYourself(userGuess) == "kill") {
				isAlive = false;
				System.out.println("You took " + numOfGuesses + "guesses");
			} 
		}
	}
	
}