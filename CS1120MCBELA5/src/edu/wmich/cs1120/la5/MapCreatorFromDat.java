package edu.wmich.cs1120.la5;

import edu.wmich.cs1120.la5.gui.MainWindow;

import edu.wmich.cs1120.la5.TerrainScanner;

import java.io.*;
import java.util.ArrayList;

public class MapCreatorFromDat implements IMapCreator{

	private IArea area[][] = new Area[10][10];
	
	@Override
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
					area[r][c] = new Area(basicEnergyCost, elevation, radiation);
					
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
		
	}

	@Override
	public TerrainScanner getScanner() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setScanner(TerrainScanner scanner) {
		// TODO Auto-generated method stub
		
	}

	public IArea[][] getArea() {
		return area;
	}

	public void setArea(IArea area[][]) {
		this.area = area;
	}

}
