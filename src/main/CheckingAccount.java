/**
 * 
 */
package main;

/**
 * @author elliottplack
 *
 */
public class CheckingAccount extends Account {

	public CheckingAccount(String name, int accountNumber, String phoneNumber,
			String ssn, int balance) {
		// TODO Auto-generated constructor stub
		balance = 0;
	}

	public void addInterest() {
		// TODO Auto-generated method stub
		Account.balance = 3;
	}

}
