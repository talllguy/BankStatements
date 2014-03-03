/**
 * 
 */
package main;

/**
 * @author elliottplack
 *
 */
public class Account {
	
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
}
