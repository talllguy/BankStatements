/**
 * 
 */
package main;

/**
 * @author elliottplack
 *
 */
public class CheckingAccount extends Account {
	
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
	}

}
