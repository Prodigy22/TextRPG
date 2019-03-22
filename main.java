package TextRPG;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		String choice;
		boolean isRunning = true;
		
		welcomeMessage();
		
		while (isRunning) {
		
			choice = userInput();
		
			System.out.println("User inputed: " + choice);
			
			isRunning = menuDecisionManager(choice, isRunning);
	
		}
	
	}
	
	static String userInput() {
	
		Scanner keyboard = new Scanner(System.in);
		return keyboard.next();
		
	}
	
	static void welcomeMessage() {
		
		System.out.println("Welcome to TextRPG adventurer! Please select from the following menu items: " + "\n" +
				"Resume Play -> \"Resume\"" + "\n" +
				"Create Character -> \"Create\"" + "\n" +
				"Display Options -> \"Help\"" + "\n" +
				"Exit -> \"Exit\"");
		
	}
	
	static boolean menuDecisionManager(String choice, boolean isRunning) {
		
		if (choice.equals("Exit")) {
			System.out.println("Exiting TextRPG...");
			return isRunning = false;
		} else if (choice.equals("Resume")) {
			System.out.println("Resuming previous session.");
			return isRunning = true;
		} else if (choice.equals("Create")) {
			System.out.println("Loading character creation screen.");
			return isRunning = true;
		} else if (choice.equals("Help")) {
			welcomeMessage();
			return isRunning = true;
		} else {
			return isRunning = false;
		}
	}

}