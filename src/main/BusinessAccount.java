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
		super.printAccountInfo();
		double balanceConverted;
		balanceConverted = Double.parseDouble(balance);
	    System.out.printf("%s %15s %15s %15s %15.2f %n",name,accountNumber,phoneNumber,ssn,balanceConverted);
	}

}
