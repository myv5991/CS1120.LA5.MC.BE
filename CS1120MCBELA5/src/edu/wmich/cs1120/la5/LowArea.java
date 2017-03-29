package edu.wmich.cs1120.la5;

import edu.wmich.cs1120.la5.gui.MainWindow;
import edu.wmich.cs1120.la5.TerrainScanner;

public class LowArea extends Area{

	/**
	 * constructors for low area
	 * @param basicEnergyCost holds energy cost
	 * @param elevation holds elevation
	 * @param radiation hold radiation.
	 */
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
