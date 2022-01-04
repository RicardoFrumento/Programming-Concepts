import java.util.Scanner;

public class PIN {
	
	/**
	* Method Name: processPIN
	* Description: Checks the entered PIN with the one stored in the data base. Allows four attempts, if they match
	* calls the method that processes the card. If four wrong attempts are made the method to retain the card is called
	*
	* @param index of the object on the array with the information of the current client
	*/
	void processPIN(int i) { /*compares the entered PIN to the PIN stored for this card*/
		
		int attempts=0;
		
		ATMCard[] dBase = CardServices.getData();
		
		while(attempts < 4) {	
			Scanner password = new Scanner(System.in);
			System.out.print("Password: ");
		    String passwordNumber = password.next();
		    	
				if (passwordNumber.equals(dBase[i].cardPIN)) {
					CardServices whichAccount = new CardServices();
					whichAccount.processCard(i);
					break;
				}
			System.out.println("Wrong PIN");
			attempts++;
		}
		if(attempts==4) {
			PIN.eatCard();
		}
	}
	/**
	* Method Name: eatCard
	* Description: Retains the card for security
	*
	* @param xxx
	*/
	static void eatCard() { /*if the PIN is incorrectly entered four times, this eats the card*/
		System.out.println("Sorry, you missed your PIN four times. Your card is retained.");
	}
}
