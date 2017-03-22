package edu.wmich.cs1120.la5;

import edu.wmich.cs1120.la5.gui.MainWindow;
import edu.wmich.cs1120.la5.TerrainScanner;

public class HighArea extends Area{
	
	public HighArea(double basicEnergyCost, double elevation, double radiation) {
		super(basicEnergyCost, elevation, radiation);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Calculates energy cost of high points
	 */
	public double calcConsumedEnergy() {
		double energy_cost = this.getBasicEnergyCost() * 4;
		return energy_cost;
	}
	

	
}
