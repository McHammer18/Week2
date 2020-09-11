package groceries;

import static org.junit.Assert.*;

import org.junit.Test;

import model.Customer;
import model.CustomerLogic;

public class TestCustomerLogic {
	CustomerLogic cL = new CustomerLogic();
	Customer customer = new Customer();
	public void setUp() throws Exception{
	}

	@Test
	public void testCalculateTax() {
		customer.setAmount(85.63);
		double total = cL.calculateTax(customer);
		assertEquals(91.62, total, 0.0);
	}
	
	@Test
	public void testIsMember() {
		customer.setMemberID(true);
		assertTrue(cL.isMember(customer));
	}

}
