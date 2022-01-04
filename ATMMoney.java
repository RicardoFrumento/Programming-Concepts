
	public class ATMMoney {
		int twentyBill; /*Quantity of twenty dolars bills*/
		int tenBill; /*Quantity of ten dolars bills*/
		int fiveBill; /*Quantity of five dolars bills*/
		int oneBill; /*Quantity of one dolar bills*/
		int totalAmount; /*Total amount in the ATM*/
		
		
		/**
		* Method Name: setTotalInside
		* Description: Updates the total amount of money the ATM has
		*
		* @param Amount the client withdrew
		*/
		public void setTotalInside(int i) {
			   this.totalAmount = this.totalAmount - i;
			}
		/**
		* Method Name: setOne
		* Description: Updates the amount of one dollar bills the ATM has
		*
		* @param Number of one dolar bills withdrew
		*/
		public void setOne(int i) {
			   this.oneBill = this.oneBill - i;
			}
		/**
		* Method Name: setFive
		* Description: Updates the number of five dollar bills the ATM has
		*
		* @param Number of five dollar bills withdrew
		*/
		public void setFive(int i) {
			   this.fiveBill = this.fiveBill - i;
			}
		/**
		* Method Name: setTen
		* Description: Updates the amount of ten dollar bills the ATM has
		*
		* @param Number of ten dollar bills withdrew
		*/
		public void setTen(int i) {
			   this.tenBill = this.tenBill - i;
			}
		/**
		* Method Name: setTwenty
		* Description: Updates the amount of twenty dollar bills the ATM has
		*
		* @param Number of ten dollar bills withdrew
		*/
		public void setTwenty(int i) {
			   this.twentyBill = this.twentyBill - i;
			}
	
}
