//
// COP 2510 – Spring Semester, 2020
//
// Homework #1: The New ACME Machines ATM Machine
//
// Ricardo Digiovanni Frumento
//
import java.util.Scanner;

	public class ACME {
		
		static int decidedAmount; //Declared here so it can be updated during the four loop
	
		/**
		* Method Name: main
		* Description: Initializes the card database, initialize the amount of money the ATM has and 
		* goes into a for loop 5 times so all test cases can be covered. In the for loop reads the account number
		* and starts the whole process by calling a method to check the card number.
		*
		* @param xxx
		*/
		public static void main(String[] args) {
			
			CardServices cardDB = new CardServices();
			cardDB.initializeCardDB();
			
			Money billInside = new Money();
			billInside.ATMInside();
			
			for (int i=0;i<5;i++) {
				Scanner account = new Scanner(System.in);
				System.out.print("Account Number: ");
			    String accountNumber = account.next();
				
				cardDB.insertCard(accountNumber);
				}
			}
	}