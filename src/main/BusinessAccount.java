/**
 * 
 */
package main;

/**
 * @author elliottplack
 *
 */
public class BusinessAccount extends Account {
	
	public BusinessAccount (String startName,String startAccountNumber, String startPhoneNumber, String startSSN, String startBalance, String startType){
		super(startName, startAccountNumber, startPhoneNumber,startSSN, startBalance, startType);
	}
	
	public void  printAccountInfo(){
		super.printAccountInfo(); // inherited from super
		double balanceConverted; // set up a conversion variable since string is passed
		balanceConverted = Double.parseDouble(balance); // convert to double
		balance = "$" + String.format("%.2f", (double)balanceConverted); // convert to formatted string
	    System.out.printf("%-10s %-12s %-16s %-17s %s %n",name,accountNumber,phoneNumber,ssn,balance);
	}

}
