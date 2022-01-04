
public class CardServices {

	static ATMCard[] dataBase = new ATMCard[5];//Declared here so every method inside the class can access it
	
	/**
	* Method Name: initializeCardDB
	* Description: Creates every object store in the array above and sets all the values inside
	*
	* @param xxx
	*/	
	void initializeCardDB() { /*creates an array containing ATM card numbers and PINs*/
		
		for (int i = 0; i < 5; i++) {
			dataBase[i] = new ATMCard();
		}
		
		dataBase[0].cardNum = "123456789";
		dataBase[0].cardPIN = "1111";
		dataBase[0].checkingBalance = 550;
		dataBase[0].savingBalance = 1275;
		
		dataBase[1].cardNum = "135792468";
		dataBase[1].cardPIN = "2097";
		dataBase[1].checkingBalance = 90;
		dataBase[1].savingBalance = -1;
		
		dataBase[2].cardNum = "019283746";
		dataBase[2].cardPIN = "6194";
		dataBase[2].checkingBalance = 715;
		dataBase[2].savingBalance = -1;
		
		dataBase[3].cardNum = "675849302";
		dataBase[3].cardPIN = "0071";
		dataBase[3].checkingBalance = 790;
		dataBase[3].savingBalance = 211;
		
		dataBase[4].cardNum = "347821904";
		dataBase[4].cardPIN = "9871";
		dataBase[4].checkingBalance = 113;
		dataBase[4].savingBalance = 78;
	}
	/**
	* Method Name: insertCard
	* Description: Receives the account number and checks if it exists within the database, is it does calls a method
	* to check the PIN. If it doesnt exist calls the method to return the card
	*
	* @param Account number
	*/
	void insertCard(String string1) { /*checks to see if the inserted card's ID number is recognized*/
		
		
		for(int i=0;i<5;i++) {
			if (string1.equals(dataBase[i].cardNum)) {
					PIN testPin = new PIN();
					testPin.processPIN(i);
					break;
			}
			if(i==4) {
				System.out.println("Unrecognized card");
				CardServices end = new CardServices();
				end.returnCard(-1,-1);
			}
		}
		
	}
	/**
	* Method Name: processCard
	* Description: Calls another method to request which account the user wants to withdraw money
	*
	* @param Index for the correct object inside the array of users
	*/	
	void processCard(int i) { /*allows a user to request funds to withdraw*/
		
		Account checkOrSavin = new Account();
		checkOrSavin.select(i);
	}
	/**
	* Method Name: returnCard
	* Description: Prints a receipt fort the transaction and returns the card to the client
	*
	* @param xxx
	*/
	void returnCard(int i, int j) { /*returns the inserted card to the user*/
		if(j==1) {
			System.out.println("Transaction approved. You now have "+dataBase[i].checkingBalance+" in your Cheking account");
			System.out.println("Remove your card");
		}
		else if(j==1) {
			System.out.println("Transaction approved. You now have "+dataBase[i].savingBalance+" in you Savings account");
			System.out.println("Remove your card");
		}
		else {
			System.out.println("Remove your card");
		}
	}
	/**
	* Method Name: getData
	* Description: makes avaiable to other classes the data base
	*
	* @param xxx
	*/
	public static ATMCard[] getData() { 
		return dataBase;
	}
}
