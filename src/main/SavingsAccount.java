/**
 * 
 */
package main;

<<<<<<< HEAD
import java.io.FileNotFoundException;
import java.io.PrintWriter;

=======
>>>>>>> 94b021bc99045fad7604bec282fff51bb17bfdde
/**
 * @author elliottplack
 *
 */
public class SavingsAccount extends Account {
<<<<<<< HEAD

	public SavingsAccount(String name, int accountNumber, String phoneNumber,
			String ssn, double balance) {
		this.name = name;
		this.accountNumber = accountNumber;
		this.phoneNumber = phoneNumber;
		this.ssn = ssn;
		this.balance = balance;
	}

	public void doInterest() {
		// TODO Auto-generated method stub
		double interest = 0;
		if (balance<5000)
			balance = (1.04 * balance);
		else balance = (1.05 * balance);
		System.out.printf("%s %15d %15s %15s %15f %n",name,accountNumber,phoneNumber,ssn,balance);
=======
	
	public SavingsAccount (String startName,String startAccountNumber, String startPhoneNumber, String startSSN, String startBalance, String startType){
		super(startName, startAccountNumber, startPhoneNumber,startSSN, startBalance, startType);
	}
	
	public void  printAccountInfo(){
		super.printAccountInfo();
		double balanceConverted;
		balanceConverted = Double.parseDouble(balance);

		if (balanceConverted < 5000)
			balanceConverted = (1.04 * balanceConverted);
		else balanceConverted = (1.05 * balanceConverted);
		balance = "$" + String.format("%.2f", (double)balanceConverted); // convert to formatted string
	    System.out.printf("%-10s %-12s %-16s %-17s %s %n",name,accountNumber,phoneNumber,ssn,balance);
>>>>>>> 94b021bc99045fad7604bec282fff51bb17bfdde
	}

}
