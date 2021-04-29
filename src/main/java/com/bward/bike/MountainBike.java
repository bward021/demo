package com.bward.bike;

import com.bward.*;

/**
 * This is an example of polymorphism.
 * 
 * @author bward
 *
 */
public class MountainBike extends Bicycle implements Branded {
	
	public Boolean seatDropper;
	private ShockType shockType;
	
	public MountainBike(String brandName, ShockType shockType, boolean hasSeatDropper) {
		setBrandName(brandName, hasSeatDropper);
		this.shockType = shockType;
		
	}
	
	public Boolean getSeatDropper() {
		return seatDropper;
	}
	
	public void setSeatDropper(Boolean seatDropper) {
		this.seatDropper = seatDropper;
	}
	
	public void setShockType(ShockType shockType) {
		this.shockType = shockType;
	}
	
	public ShockType getShockType() {
		return shockType;
	}
	
	public String howsMyRide() throws ShockTypeException {
		switch (this.shockType) {
		case NONE:
			return "This is gonna be a bumpy ride!";
		case FRONT:
			return "Not bad.";
		case FULL:
			return "Silky smooth!";
		default: 
			throw new ShockTypeException("Invalid shock!");
		}
	}

	@Override
	public void setBrandName(String brandName) {
		super.setBrandName(brandName + " Mountain Bike");
	}
	
	/**
	 * This is an example of an overloaded method <code>MountainBike.setBrandName</code>
	 * 
	 * @param brandName
	 * @param hasSeatDropper
	 */
	public void setBrandName(String brandName, boolean hasSeatDropper) {
		setBrandName(brandName);
		this.seatDropper = hasSeatDropper;
	}

	@Override
	public String toString() {
		return "MountainBike [seatDropper=" + seatDropper + ", shockType=" + shockType + ", brandName=" + brandName
				+ "]";
	}

	@Override
	void setNumberOfWheels(int wheels) {
		this.wheels = wheels;
	}
	
}
