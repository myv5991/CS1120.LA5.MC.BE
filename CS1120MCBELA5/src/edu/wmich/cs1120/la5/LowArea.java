package edu.wmich.cs1120.la5;

import edu.wmich.cs1120.la5.gui.MainWindow;
import edu.wmich.cs1120.la5.TerrainScanner;

public class LowArea extends Area{

	public LowArea(double basicEnergyCost, double elevation, double radiation) {
		super(basicEnergyCost, elevation, radiation);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Calculates energy cost of low points
	 */
	public double calcConsumedEnergy() {
		double energy_cost = this.getBasicEnergyCost() * 2;
		return energy_cost;
	}
	

}
