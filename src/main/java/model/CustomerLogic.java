package model;

public class CustomerLogic {
	
	public double calculateTax(Customer customer) {
		double tax = .07;
		double a = (customer.getAmount()*tax) + customer.getAmount();
		double total = Math.round(a*100.00)/100.00;
		return total;
	}
	
	public boolean isMember(Customer customer) {
		if(customer.isMemberID()) {
			return true;
		}
		else {
			return false;
		}
	}

}
