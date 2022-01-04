
import java.util.Scanner;

public class Account {
	/**
	* Method Name: select
	* Description: Asks the client what account it would like to withdraw and checks if the account exists. If it does exist calls the method
	* for asking how much is going to be withdraw. If it doesnt tells the user he cant do that (if this happens the for loop will 
	* end and the client must start over, an infinite while loop can be used if the program must run "forever")
	*
	* @param index of the object on the array that has the information about the current client
	*/
	void select(int i) { /*determines if the user wants to withdraw from checking or savings*/
		ATMCard[] dBase = CardServices.getData();
		
		Scanner checkOrSav = new Scanner(System.in);
		System.out.print("For withdrawl in cheking account type 1\nFor withdrawl in savings account type 2:");
	    int decision = checkOrSav.nextInt();
	    
	    if(decision==1) {
	    	if(dBase[i].checkingBalance!=-1) {
	    		Money amount = new Money();
	    		amount.enterAmount(1,i);
	    	}
	    	else {
	    		System.out.println("Sorry, you cant do that.");
	    }
	    if(decision==2) {
	    	if(dBase[i].savingBalance!=-1) {
	    		Money amount = new Money();
	    		amount.enterAmount(2,i);
	    	}
	    	else {
	    		System.out.println("Sorry, you cant do that.");
	    	}
	    }
	    }
	}
}
