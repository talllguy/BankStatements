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
	public static String name;
	public static int accountNumber;
	public static String phoneNumber;
	public static String ssn;
	public static double balance;
	public static String type;
	
	// constructor
	public Account(String startName,int startAccountNumber, String startPhoneNumber, String startSSN, double startBalance, String startType) {
        name = startName;
        accountNumber = startAccountNumber;
        phoneNumber = startPhoneNumber;
        ssn = startSSN;
        balance = startBalance;
        type = startType;
    }
	
	// methods
	
	public static void setName(String newName) {
		name = newName;
	}
	
	public static void setAccountNumber(int newAccountNumber) {
		accountNumber = newAccountNumber;
	}
	
	public static void setPhoneNumber(String newPhoneNumber) {
		phoneNumber = newPhoneNumber;
	}
	
	public static void setSSN(String newSSN) {
		ssn = newSSN;
	}
	
	public static void setBalance(double newBalance) {
		balance = newBalance;
	}
	
	public static void setType(String newType) {
		type = newType;
	}
	
	public static void printAccountInfo(){
	    System.out.printf("%s %15d %15s %15s %15f %n",name,accountNumber,phoneNumber,ssn,balance);
	}
	
}
