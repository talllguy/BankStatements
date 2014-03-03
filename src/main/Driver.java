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
		
		String[][] pAccounts = new String[6][6]; // set up a 2D array to hold the data
		Account[] accountLines = new Account[6]; // array to send data elsewhere
		
		printHeaders(); // print the top stuff
		pAccounts = processAccounts(); // set that array = to this method which fills it
		
		for (int i = 0; i < 6; i++) {
			switch (pAccounts[i][5].charAt(0)) {
				case 'C':	accountLines[i] = new CheckingAccount(pAccounts[i][0], pAccounts[i][1], pAccounts[i][2], pAccounts[i][3], pAccounts[i][4], pAccounts[i][5]);
							break;
				case 'S':	accountLines[i] = new SavingsAccount(pAccounts[i][0], pAccounts[i][1], pAccounts[i][2], pAccounts[i][3], pAccounts[i][4], pAccounts[i][5]);
							break;
				case 'B':	accountLines[i] = new BusinessAccount(pAccounts[i][0], pAccounts[i][1], pAccounts[i][2], pAccounts[i][3], pAccounts[i][4], pAccounts[i][5]);
							break;
			}
		}
			
		for (int j = 0; j < 6; j++) {
			accountLines[j].printAccountInfo();
		}
		
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
	
	public static String[][] processAccounts() {
		String[][] tempArray = new String[6][6];
		
		readData("src/main/resources/bank-data.dat"); // opens up the data using a method
		for(int i = 0; i < 6; i++) {
			tempArray[i][0] = (Driver.data.next());
			tempArray[i][1] = (Driver.data.next());
			tempArray[i][2] = (Driver.data.next());
			tempArray[i][3] = (Driver.data.next());
			tempArray[i][4] = (Driver.data.next());
			tempArray[i][5] = (Driver.data.next());
		}
		return tempArray;
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
