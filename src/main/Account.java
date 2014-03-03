/**
 * 
 */
package main;

/**
 * @author elliottplack
 *
 */
public class Account {
	// fields for Account class
	public  String name;
	public  String accountNumber;
	public  String phoneNumber;
	public  String ssn;
	public  String balance;
	public  String type;
	
	// constructor
	public Account(String startName,String startAccountNumber, String startPhoneNumber, String startSSN, String startBalance, String startType) {
        name = startName;
        accountNumber = startAccountNumber;
        phoneNumber = startPhoneNumber;
        ssn = startSSN;
        balance = startBalance;
        type = startType;
    }
	
	// methods
	
	public  void setName(String newName) {
		name = newName;
	}
	
	public  void setAccountNumber(String newAccountNumber) {
		accountNumber = newAccountNumber;
	}
	
	public  void setPhoneNumber(String newPhoneNumber) {
		phoneNumber = newPhoneNumber;
	}
	
	public  void setSSN(String newSSN) {
		ssn = newSSN;
	}
	
	public  void setBalance(String newBalance) {
		balance = newBalance;
	}
	
	public  void setType(String newType) {
		type = newType;
	}
	
	public void printAccountInfo(){
//	    System.out.printf("%s %15s %15s %15s %15s %n",name,accountNumber,phoneNumber,ssn,balance);
	}
	
}
