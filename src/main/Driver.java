package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Driver {

	 public static void main(String[] args){
		 readData();
		 
	 }

	private static void readData() {
		// TODO Auto-generated method stub
		String inputPath = "resources/bank-data.dat"; //file input location
		try {
			// count the number of lines in a file
			Scanner lineCount = new Scanner(new File(inputPath));
			int lineCounter = 0; // var that will have the number of lines
			while(lineCount.hasNextLine())
			{
				lineCounter++;
				lineCount.hasNextLine();
			}
			
			// fill up a 2D array for processing
			Scanner populateArray = new Scanner(new File(inputPath));
			int rowTrack = 0; // variable to keep track of the current row
			String bankData[][] = null; // 2d array to hold data
			while(rowTrack<lineCounter)
			{
				for(int r = 0; r<6; r++)
				{
					for(int c = 0; c<lineCounter; c++)
					{
						bankData[r][c]=populateArray.findInLine(Pattern.compile(","));
					}
				}
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.print("File not found.");
		}
		
	}

}
