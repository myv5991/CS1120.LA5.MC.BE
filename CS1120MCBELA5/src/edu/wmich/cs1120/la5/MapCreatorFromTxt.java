package edu.wmich.cs1120.la5;

import edu.wmich.cs1120.la5.gui.MainWindow;

import java.io.IOException;

import edu.wmich.cs1120.la5.TerrainScanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Scanner;

public class MapCreatorFromTxt implements IMapCreator{

	private static TerrainScanner inputFile;
	private Scanner file;
	private Area[][] Area = new Area[10][10];
	private Double[][] temp = new Double[100][3];
	private Area[] temp2 = new Area[100];
	public static TerrainScanner scanner2 = new TerrainScanner();
	
	/**
	 * In this method we are getting two inputs filename and threshold. file name will be a text file and threshold will 
	 * be an integer value. This method opens the file and places the data in a [10][10] array. This array is an
	 * array of objects either low or high area based off of the threshold and data provided in the txt.
	 */
	public void scanTerrain(String fileName, int threshold) throws IOException {

File filedata = new File(fileName);
		
		try{
			file = new Scanner(filedata);
		}
		catch (FileNotFoundException e){
	System.out.println(e);
}
		
		//1 = energy
		//2 = elevation
		//3 = radiation
		
		//fills temp array of data from text file
		for(int i = 0;i <100; i++){
			
			for(int j = 0;j <3; j++){
				
				temp[i][j] = file.nextDouble();	
				
			//	System.out.println(i); //debug
				
		}
			
			if(temp[i][2] >= 0.5 || temp[i][1] > threshold*.5){
				
				temp2[i] = new HighArea(0,0,0);
				temp2[i].setBasicEnergyCost(temp[i][0]);
				temp2[i].setElevation(temp[i][1]);
				temp2[i].setRadiation(temp[i][2]);
			}
			
			else{
				temp2[i] = new LowArea(0,0,0);
				temp2[i].setBasicEnergyCost(temp[i][0]);
				temp2[i].setElevation(temp[i][1]);
				temp2[i].setRadiation(temp[i][2]);
				
			}
			
		}

		//fills object array with high or low.
		int counter = 0;
		for(int k1 = 0;k1 <10; k1++){
			
			for(int d = 0;d <10; d++){
			//	System.out.println(k1); //debug
				Area[k1][d] = temp2[counter]; 
				counter++;
				
			}
		}
		
		scanner2.setTerrain(Area);
		
	}

/**
 * Getter for the scanner array. 
 */
	public TerrainScanner getScanner() {
		
		return scanner2;
	}

/**
 * Setter for the scanner array.
 */
	public void setScanner(TerrainScanner scanner) {

		scanner2 = scanner;
		
	}

}
