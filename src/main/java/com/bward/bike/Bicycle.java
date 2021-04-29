package com.bward.bike;

import com.bward.Branded;

/**
 * Just STUFF!!!
 * 
 * @author comps
 *
 */
abstract public class Bicycle implements Branded {

	/** A user's name */
	protected String brandName;
	protected int wheels;
	
	public Bicycle() {
		super();
	}
	
	public Bicycle(String brandName) {
		super();
		this.brandName = brandName;
	}
	
	/**
	 * Display the name given	
	 * 
	 * @param name - This is the name to display
	 */
	public String getBrandName() {
		return this.brandName;
	}
	
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	
	abstract void setNumberOfWheels(int wheels);
	
	public int getWheels() {
		return wheels;
	}

	@Override
	public String toString() {
		return "Bicycle [brandName=" + brandName + "]";
	}
	
}
