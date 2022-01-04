public class Dispense {
	
	ATMCard[] dBase = CardServices.getData();
	ATMMoney billQuantity = Money.getData();
	
	/**
	* Method Name: ones
	* Description: Updates the total amount of one dollar bills inside the ATM
	*
	* @param Amount of one dollar bills withdraw
	*/
	void ones(int i) { /*dispense ones*/
		billQuantity.setOne(i);
	}
	/**
	* Method Name: fives
	* Description: Updates the total amount of five dollar bills inside the ATM
	*
	* @param Amount withdrew of five dollar bills
	*/
	
	void fives(int i) { /*dispense fives*/
		billQuantity.setFive(i);
	}
	/**
	* Method Name: tens
	* Description: Updates the total amount of ten dollar bills inside the ATM
	*
	* @param Amount of ten dollar bills withdrew
	*/
	
	void tens(int i) { /*dispense tens*/
		billQuantity.setTen(i);
	}
	/**
	* Method Name: twentys
	* Description: Updates the total amount of tewnty dollar bills inside the ATM
	*
	* @param Amount withdrew of twenty dollar bills
	*/
	void twentys(int i) { /*dispense twentys*/
		billQuantity.setTwenty(i);
	}
}
