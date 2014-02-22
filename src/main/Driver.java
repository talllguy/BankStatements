package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Driver {
	// global variables
	private static Scanner data; // global for loaded data that can be accessed anywhere

	public static void main(String[] args){
		// main method sets the program into action, leaving the various tasks to methods
		// and subclasses
		processAccounts();
	}

	private static void processAccounts() {
		// main method that will write statements
		readData("src/main/resources/bank-data.dat"); // opens up the data using a method
		
	}

	private static void readData(String datFileName) {
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
