/**
 * 
 */
package main;

<<<<<<< HEAD
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

=======
>>>>>>> 94b021bc99045fad7604bec282fff51bb17bfdde
/**
 * @author elliottplack
 *
 */
public class Account {
<<<<<<< HEAD
	
	public String name;
	public int accountNumber;
	public String phoneNumber;
	public String ssn;
	public double balance;
	
	public static Account[] accounts = new Account[6];
	
	public static void processAccounts() {
		int i = 0;
		Driver.readData("src/main/resources/bank-data.dat"); // opens up the data using a method
		while(i<6) {
			String name = Driver.data.next();
			int accountNumber = Driver.data.nextInt();
			String phoneNumber = Driver.data.next();
			String ssn = Driver.data.next();
			double balance = Driver.data.nextDouble();
			String type = Driver.data.next();
			
			if ("C".equals(type)) {
	            accounts[i]= new CheckingAccount(name,accountNumber,phoneNumber,ssn,balance);
	            ((CheckingAccount)accounts[i]).doInterest();
			}
			if ("S".equals(type)) {
	            accounts[i]= new SavingsAccount(name,accountNumber,phoneNumber,ssn,balance);
	            ((SavingsAccount)accounts[i]).doInterest();
	        }
	         if ("B".equals(type)) {
	        	 accounts[i]= new BusinessAccount(name,accountNumber,phoneNumber,ssn,balance);
	            ((BusinessAccount)accounts[i]).doInterest();
	         }
			i++;
		}
	}
=======
	// fields for Account class
	public String name;
	public String accountNumber;
	public String phoneNumber;
	public String ssn;
	public String balance;
	public String type;
	
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
	
	public void setName(String newName) {
		name = newName;
	}
	
	public void setAccountNumber(String newAccountNumber) {
		accountNumber = newAccountNumber;
	}
	
	public void setPhoneNumber(String newPhoneNumber) {
		phoneNumber = newPhoneNumber;
	}
	
	public void setSSN(String newSSN) {
		ssn = newSSN;
	}
	
	public void setBalance(String newBalance) {
		balance = newBalance;
	}
	
	public void setType(String newType) {
		type = newType;
	}
	
	public void printAccountInfo(){
//	    System.out.printf("%s %15s %15s %15s %15s %n",name,accountNumber,phoneNumber,ssn,balance);
	}
	
>>>>>>> 94b021bc99045fad7604bec282fff51bb17bfdde
}
