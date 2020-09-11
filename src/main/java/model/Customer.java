package model;

public class Customer {
		private double amount;
		private boolean memberID;
		private int customerID;
		
		//Getters and Setters
		public double getAmount() {
			return amount;
		}
		public void setAmount(double amount) {
			this.amount = amount;
		}
		public boolean isMemberID() {
			return memberID;
		}
		public void setMemberID(boolean memberID) {
			this.memberID = memberID;
		}
		public int getCustomerID() {
			return customerID;
		}
		public void setCustomerID(int customerID) {
			this.customerID = customerID;
		}
		
		//Constructors
		public Customer() {
			super();
		}
		public Customer(double amount) {
			super();
			this.amount = amount;
		}
		
		
}
