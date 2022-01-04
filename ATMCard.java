
public class ATMCard {
	String cardNum; /*holds a single ATM card's ID number*/
	String cardPIN; /*holds a single ATM card's PIN number*/
	int checkingBalance; /*amount of money in this person's checking account*/
	int savingBalance; /*amount of money in this person's savings account*/
	
	/**
	* Method Name: setCheckBalanc
	* Description: Updates the balance for the checking account that withdrew money 
	*
	* @param Amount the client withdrew
	*/
	public void setCheckBalance(int i) {
		   this.checkingBalance = this.checkingBalance - i;
		}
	
	/**
	* Method Name: setSavingBalance
	* Description: Updates the balance for the savings account that withdrew money
	*
	* @param Amount the client withdrew
	*/
	public void setSaviBalance(int i) {
		   this.savingBalance = this.savingBalance - i;
		}
}