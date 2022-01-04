
public class Security {
	
	static ATMCard[] dBase = CardServices.getData();
	static ATMMoney billQuantity = Money.getData();
	/**
	* Method Name: verifyBalance
	* Description: Checks if the account has balance to withdraw the amount the client wants, if it does calls the method that checks if there
	* if money inside the ATM to complete the transaction. If it doesnt says that the client does not have that amount 
	* (this ends the step inside the for loop)
	*
	* @param Amount the client wants to withdraw, index of the object in the array 
	* that has the information for the current client, Checking or Savings
	*/
	void verifyBalance(int j, int i, int k) { /*ensure that the card owner's account has enough money*/
		ATMCard[] dBase = CardServices.getData();
		if(k == 1) {	
			if(j<=dBase[i].checkingBalance) {
				verifyMachineBalance(j, billQuantity.totalAmount, k, i);		
			}
			else {
				System.out.println("Sorry, you do not have that amount.");
			}
		}	
		if(k == 2) {	
			if(j<=dBase[i].savingBalance) {
				verifyMachineBalance(j, billQuantity.totalAmount, k, i);			
			}
			else {
				System.out.println("Sorry, you do not have that amount.");
			}
		}	
	}
	/**
	* Method Name: verifyMachineBalance
	* Description: Checks if the ATM has the amount the client wants, if it does the method checks if the client wants to withdraw from 
	* the checking or savings account, after doing this id finds how many bills of each type the client is going to receive and calls
	* for methods to update the number of bulls inside, two that updates the total amount inside and the amount in the clients accounts, and
	* calls the functions that returns the card to the client. It the ATM does not have the amount the client wants it gives the option to 
	* reenter the amount by calling the method that does that 
	*
	* @param Amount the client wants to withdraw, amount of money the machine has, choice between checking and savings, index
	* of the object in the array that contains the information about the current client
	*/
	void verifyMachineBalance(int j, int i, int k, int l) { /*ensure that the ATM machine has enough money*/	
		if(j<=i) {
				if(k==1) {
					Dispense moneyWithdrawl = new Dispense();
					int twenty = ACME.decidedAmount/20;
					int ten = (ACME.decidedAmount-twenty*20)/10;
					int five = (ACME.decidedAmount-twenty*20-ten*10)/5;
					int one = (ACME.decidedAmount-twenty*20-ten*10-five*5);
					
					moneyWithdrawl.twentys(twenty);
					moneyWithdrawl.tens(ten);
					moneyWithdrawl.fives(five);
					moneyWithdrawl.ones(one);
					
					dBase[l].setCheckBalance(ACME.decidedAmount);
					billQuantity.setTotalInside(ACME.decidedAmount);
					
					CardServices end = new CardServices();
					end.returnCard(l, k);
				}
				
				if(k==2) {
					Dispense moneyWithdrawl = new Dispense();
					int twenty = ACME.decidedAmount/20;
					int ten = (ACME.decidedAmount-twenty*20)/10;
					int five = (ACME.decidedAmount-twenty*20-ten*10)/5;
					int one = (ACME.decidedAmount-twenty*20-ten*10-five*5);
										
					moneyWithdrawl.twentys(twenty);
					moneyWithdrawl.tens(ten);
					moneyWithdrawl.fives(five);
					moneyWithdrawl.ones(one);
					
					dBase[l].setSaviBalance(ACME.decidedAmount);
					billQuantity.setTotalInside(ACME.decidedAmount);
					
					CardServices end = new CardServices();
					end.returnCard(l, k);
				}
			}	
			else {
				System.out.println("Out of money – cannot complete transaction");
				Money amount = new Money();
	    		amount.enterAmount(k,l);
			}
	}	
}
