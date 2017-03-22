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
		
		do{
			for(int r = 0; r < area.length; r++)
				for(int c = 0; c < area[r].length; c++){
					//area[r][c] = new Area();
					
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
