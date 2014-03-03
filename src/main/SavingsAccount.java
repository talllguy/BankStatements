/**
 * 
 */
package main;

/**
 * @author elliottplack
 *
 */
public class SavingsAccount extends Account {
	
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
	}

}
