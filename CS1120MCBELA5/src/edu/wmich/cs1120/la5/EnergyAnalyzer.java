package edu.wmich.cs1120.la5;

import java.util.ArrayList;

import edu.wmich.cs1120.la5.gui.MainWindow;
import edu.wmich.cs1120.la5.TerrainScanner;

public class EnergyAnalyzer implements IRover{

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
 * processes and gets the total energy used for the path.
 */
	@Override
	public void analyzePath() {
		double totalenergy = 0;
		
		for(int i = 0; i < list.size(); i++){
			IArea temp = new Area(0,0,0);
			temp = list.get(i);
		totalenergy = totalenergy + temp.calcConsumedEnergy();	
		}
		
		analysisLocal = Double.toString(totalenergy);
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
	 * setter for analysis var
	 */
	@Override
	public void setAnalysis(String analysis) {
		analysisLocal = analysis;
		
	}
	/**
	 * returns name of analyzer
	 */
	public String toString(){
		return "EnergyAnalyzer";
	}

}
