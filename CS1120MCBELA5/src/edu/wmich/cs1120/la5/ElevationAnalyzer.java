package edu.wmich.cs1120.la5;

import java.util.ArrayList;

import edu.wmich.cs1120.la5.gui.MainWindow;
import edu.wmich.cs1120.la5.TerrainScanner;

public class ElevationAnalyzer implements IRover{

	ArrayList<IArea> list;
	String analysisLocal;
	
	/**
	 * gets the array list of the path created by the jar file.
	 */
	@Override
	public ArrayList<IArea> getPath() {
		// TODO Auto-generated method stub
		return list;
	}
/**
 * setter for the path arraylist.
 */
	@Override
	public void setPath(ArrayList<IArea> path) {

 list = path;

		
	}
/**
 * processes the average elevation and sets it to the analysis variable
 */
	@Override
	public void analyzePath() {
		double avgelevation = 0;
		
		for(int i = 0; i < list.size(); i++){
			IArea temp = new Area(0,0,0);
			temp = list.get(i);
		avgelevation = avgelevation + temp.getElevation();	
		}
		
		avgelevation = avgelevation / list.size();
		
		analysisLocal = Double.toString(avgelevation);
	}
/**
 * getter for analysis var
 */
	@Override
	public String getAnalysis() {
		// TODO Auto-generated method stub
		return analysisLocal;
	}
/**
 * setter for analysis var.
 */
	@Override
	public void setAnalysis(String analysis) {
		analysisLocal = analysis;
		
	}
	/**
	 * returns the name of the analyzer
	 */
	public String toString(){
		return "ElevationAnalyzer";
	}

}
