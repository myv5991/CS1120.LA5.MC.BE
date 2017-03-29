package edu.wmich.cs1120.la5;

import edu.wmich.cs1120.la5.gui.MainWindow;

import edu.wmich.cs1120.la5.TerrainScanner;

import java.io.*;

public class MapCreatorFromDat implements IMapCreator{

	private IArea area[][] = new Area[10][10];
	private TerrainScanner scanner = new TerrainScanner();
	
	@Override
	/**
	 * In scanTerrain this method gets the inputs from user of the name of the dat file and the threshold.
	 * it then opens the file via randomaccessfile and parses out the data. since it is in an encrypted form
	 * it makes use of the expression objects to obtain the left and right integers and operator to calcuate the 
	 * integer value. Fill it fills a 10x10 array with area objects that contain high or low area objects depending 
	 * on the conditions of the values.
	 */
	public void scanTerrain(String fileName, int threshold) throws IOException {
		//Create objects for binary file read
		File file = new File(fileName);
		RandomAccessFile fileReader = new RandomAccessFile(file, "r");
		
		//Create boolean flag
		boolean endOfFile = false;
		
		//Create necessary variables
		int pos = 0;
		int startPos;
		double basicEnergyCost;
		double elevation;
		double radiation;
		char op;
		int val1;
		int val2;
		
		do{
			for(int r = 0; r < area.length; r++)
				for(int c = 0; c < area[r].length; c++){
					//Initialize the starting position
					startPos = pos * 34;
					
					//Read the double values into variables
					fileReader.seek(startPos);
					basicEnergyCost = fileReader.readDouble();
					
					fileReader.seek(startPos + 8);
					elevation = fileReader.readDouble();
					
					fileReader.seek(startPos + 16);
					radiation = fileReader.readDouble();
					
					//Create the area object
					if(elevation >= threshold)
						area[r][c] = new HighArea(basicEnergyCost, elevation, radiation);
					
					if(radiation >= 0.5)
						area[r][c] = new HighArea(basicEnergyCost, elevation, radiation);
					
					if(radiation < 0.5 && elevation > (threshold * 0.5))
						area[r][c] = new HighArea(basicEnergyCost, elevation, radiation);
					
					else
						area[r][c] = new LowArea(basicEnergyCost, elevation, radiation);
					
					//Calculate the next position
					ExpressionFactory factory = new ExpressionFactory(); //Create necessary objects
					
					fileReader.seek(startPos + 24);	//Read the operator
					op = fileReader.readChar();
					
					fileReader.seek(startPos + 26);	//Read value 1
					val1 = fileReader.readInt();
					
					fileReader.seek(startPos + 30);	//Read value 2
					val2 = fileReader.readInt();
					
					pos = factory.getExpression(op, val1, val2).getValue();
					if(pos == -1)
						endOfFile = true;
				}
		}
		while(!endOfFile);
		
	getScanner().setTerrain(area);
	}
	
	
	@Override
	/**
	 * getter for the scanner object
	 */
	public TerrainScanner getScanner() {
		return scanner;
	}

	@Override
	/**
	 * setter for the scanner object
	 */
	public void setScanner(TerrainScanner scanner) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * getter for the area array object.
	 * @return
	 */
	public IArea[][] getArea() {
		return area;
	}
/**
 * setter for the area array object.
 * @param area
 */
	public void setArea(IArea area[][]) {
		this.area = area;
	}

}
