import java.util.Scanner;

public class Money {
	
	ATMCard[] dBase = CardServices.getData();
	static ATMMoney billQuantity = new ATMMoney();//Declared here so all methods in the class can access it
	/**
	* Method Name: ATMInside
	* Description: Creates the initial values for the number of bills the ATM has
	*
	* @param xxx
	*/
	public void ATMInside() {
		billQuantity.twentyBill = 20;
		billQuantity.tenBill = 25;
		billQuantity.fiveBill = 40;
		billQuantity.oneBill = 50;
		billQuantity.totalAmount = 25*20 + 25*10 + 40*5 + 50;
	}	
	/**
	* Method Name: enterAmount
	* Description: If the client decided to withdraw from the checking account asks how much money the client wants and calls
	* the method that is going to check if the account has enough balance. If the client decided to withdraw from the savings
	* if does the same thing
	*
	* @param Checking or Savings account AND index of the object in the array that contains the information about the current client
	*/
	void enterAmount(int j, int i) { /*– asks user to enter the amount that they want to withdraw*/
		
		if(j==1){
			Scanner amount = new Scanner(System.in);
			System.out.print("How much money do you wish to withdraw?");
		    ACME.decidedAmount = amount.nextInt();

			
			Security check = new Security();
			check.verifyBalance(ACME.decidedAmount, i, j);
		}
		if(j==2) {
			Scanner amount = new Scanner(System.in);
			System.out.print("How much money do you wish to withdraw?");
		    ACME.decidedAmount = amount.nextInt();
			
			Security check = new Security();
			check.verifyBalance(ACME.decidedAmount, i, j);
		}
	}
	/**
	* Method Name: getData
	* Description: Makes possible to reach the information from other classes
	*
	* @param xxx
	*/
	public static ATMMoney getData() { 
		return billQuantity;
	}
}
