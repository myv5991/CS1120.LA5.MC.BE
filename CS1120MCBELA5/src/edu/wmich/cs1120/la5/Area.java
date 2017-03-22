package edu.wmich.cs1120.la5;

import edu.wmich.cs1120.la5.gui.MainWindow;
import edu.wmich.cs1120.la5.TerrainScanner;


public class Area implements IArea{
	private double basicEnergyCost;
	private double elevation;
	private double radiation;
	
	/**
	 * gets basic energy cost
	 */
	public double getBasicEnergyCost() {
		// TODO Auto-generated method stub
		return basicEnergyCost;
	}

	/**
	 * sets basic energy cost for class
	 */
	public void setBasicEnergyCost(double basicEnergyCost) {
		// TODO Auto-generated method stub
		this.basicEnergyCost = basicEnergyCost;
	}
	/**
	 * gets elevation
	 */
	public double getElevation() {
		// TODO Auto-generated method stub
		return elevation;
	}
	/**
	 * sets elevation for class
	 */
	public void setElevation(double elevation) {
		// TODO Auto-generated method stub
		this.elevation = elevation;
	}
	/**
	 * gets radiation
	 */
	public double getRadiation() {
		// TODO Auto-generated method stub
		return radiation;
	}
	/**
	 * sets radiation for class
	 */
	public void setRadiation(double radiation) {
		// TODO Auto-generated method stub
		this.radiation = radiation;
	}

	/**
	 * extra for calc energy cost
	 */
	public double calcConsumedEnergy() {
		double energy_cost =0; // temp for no errors
		
		return energy_cost;
	}

	public Area(double basicEnergyCost, double elevation, double radiation){
		setBasicEnergyCost(basicEnergyCost);
		setElevation(elevation);
		setRadiation(radiation);
	}
}
