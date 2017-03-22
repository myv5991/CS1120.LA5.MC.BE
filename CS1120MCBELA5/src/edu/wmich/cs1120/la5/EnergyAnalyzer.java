package edu.wmich.cs1120.la5;

import java.util.ArrayList;

import edu.wmich.cs1120.la5.gui.MainWindow;
import edu.wmich.cs1120.la5.TerrainScanner;

public class EnergyAnalyzer implements IRover{

	ArrayList<IArea> list;
	
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getAnalysis() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setAnalysis(String analysis) {
		// TODO Auto-generated method stub
		
	}

}
