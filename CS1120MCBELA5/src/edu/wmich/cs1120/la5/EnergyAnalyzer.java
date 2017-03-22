package edu.wmich.cs1120.la5;

import java.util.ArrayList;

import edu.wmich.cs1120.la5.gui.MainWindow;
import edu.wmich.cs1120.la5.TerrainScanner;

public class EnergyAnalyzer implements IRover{

	ArrayList<IArea> list;
	 String analysisLocal;
	
	@Override
	public ArrayList<IArea> getPath() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public void setPath(ArrayList<IArea> path) {

 list = path;

		
	}

	@Override
	public void analyzePath() {
		double totalenergy = 0;
		
		for(int i = 0; i < list.size(); i++){
			IArea temp = new Area();
			temp = list.get(i);
		totalenergy = totalenergy + temp.calcConsumedEnergy();	
		}
		
		analysisLocal = Double.toString(totalenergy);
	}

	@Override
	public String getAnalysis() {
		// TODO Auto-generated method stub
		return analysisLocal;
	}

	@Override
	public void setAnalysis(String analysis) {
		analysisLocal = analysis;
		
	}
	public String toString(){
		return "EnergyAnalyzer";
	}

}
