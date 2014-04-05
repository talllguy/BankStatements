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
public class CheckingAccount extends Account {
	
<<<<<<< HEAD
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
		
=======
	public CheckingAccount (String startName,String startAccountNumber, String startPhoneNumber, String startSSN, String startBalance, String startType){
		super(startName, startAccountNumber, startPhoneNumber,startSSN, startBalance, startType);
	}
	
	public void  printAccountInfo(){
		super.printAccountInfo();
		double balanceConverted;
		balanceConverted = Double.parseDouble(balance);
		balanceConverted = (1.025 * balanceConverted);
		balance = "$" + String.format("%.2f", (double)balanceConverted); // convert to formatted string
	    System.out.printf("%-10s %-12s %-16s %-17s %s %n",name,accountNumber,phoneNumber,ssn,balance);
>>>>>>> 94b021bc99045fad7604bec282fff51bb17bfdde
	}

}
