package com.bward;

import com.bward.bike.MountainBike;
import com.bward.bike.ShockType;
import com.bward.bike.ShockTypeException;

public class BicycleApplication {

	public static void main(String[] args) {
		MountainBike bike = new MountainBike("Cannondale", ShockType.FULL, true);
		try {
			bike.howsMyRide();
		} catch (ShockTypeException e) {
			e.printStackTrace();
		}
		System.out.println(bike.toString());
	}
}
