/*****
 *  @author Elliott Plack
 *  COSC 600
 *  Problem: write a java program to make bank statements using polymorphism
 *  24 FEB 2014
 * 
 */

package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Driver {
	// global variables
	public static Scanner data; // global for loaded data that can be accessed anywhere
	
	public static void main(String[] args){
		printHeaders();
		processAccounts();
		
	}
	
	// Set up the top portion
	private static void printHeaders() {
		String col1Heading = "Name"; // set up defaults
		String col2Heading = "Account #";
		String col3Heading = "Phone Number";
		String col4Heading = "SSN";
		String col5Heading = "Balance";
		String divider = "----------------------------------------------------------------------";

		System.out.printf("%s %15s %15s %15s %15s %n",col1Heading,col2Heading,col3Heading,col4Heading,col5Heading); // print the top row
		System.out.printf("%s %n",divider); // divider
	}
	
	public static void processAccounts() {
		int i = 0;
		Driver.readData("src/main/resources/bank-data.dat"); // opens up the data using a method
		while(i<6) {
			Account.setName(Driver.data.next());
			Account.setAccountNumber(Driver.data.nextInt());
			Account.setPhoneNumber(Driver.data.next());
			Account.setSSN(Driver.data.next());
			Account.setBalance(Driver.data.nextDouble());
			Account.setType(Driver.data.next());
			Account.printAccountInfo();
		}
	}
	
	// file reading methods below here --------------------------

	static void readData(String datFileName) {
		// method to read in the file. throws error if fail
		try {
			setData(new Scanner(new File(datFileName)));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.print("File not found.");
		}
		
	}

	public static Scanner getData() {
		return data;
	}

	public static void setData(Scanner data) {
		Driver.data = data;
	}
}
