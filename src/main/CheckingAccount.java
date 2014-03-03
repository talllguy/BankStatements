/**
 * 
 */
package main;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * @author elliottplack
 *
 */
public class CheckingAccount extends Account {
	
	public CheckingAccount(String name, int accountNumber, String phoneNumber,
			String ssn, double balance) {
		this.name = name;
		this.accountNumber = accountNumber;
		this.phoneNumber = phoneNumber;
		this.ssn = ssn;
		this.balance = balance;
	}

	public void doInterest() {
		// TODO Auto-generated method stub
		balance = (1.025 * balance);
		System.out.printf("%s %15d %15s %15s %15f %n",name,accountNumber,phoneNumber,ssn,balance); // prints the array value for each iteration
		
	}

}
