package com.groupd.assignment5.beans;

import java.sql.Date;

/**
 * Date: 05.04.2022
 * Group D 
 * Member1: Manpreet kaur
 * Member2: Manpreet Kaur
 * Member3: Bhumikaben Manubhai Patel
 * Member4: Ashikkumar Nareshbhai Patel
 * Member5: Hardeep Kaur Chahal 
 * bean class for Book table
 */
//model class for RoomDetails
public class RoomDetails {
	
	private int RoomNumber;
	private String RoomType;
	private float Rates;
	private String RoomLocation;
	private int NumberofBeds;
	private int CustomerId;
	
	public int getRoomNumber() {
		return RoomNumber;
	}
	public void setRoomNumber(int roomNumber) {
		RoomNumber = roomNumber;
	}
	public String getRoomType() {
		return RoomType;
	}
	public void setRoomType(String roomType) {
		RoomType = roomType;
	}
	public float getRates() {
		return Rates;
	}
	public void setRates(float rates) {
		Rates = rates;
	}
	public String getRoomLocation() {
		return RoomLocation;
	}
	public void setRoomLocation(String roomLocation) {
		RoomLocation = roomLocation;
	}
	public int getNumberofBeds() {
		return NumberofBeds;
	}
	public void setNumberofBeds(int numberofBeds) {
		NumberofBeds = numberofBeds;
	}
	public int getCustomerId() {
		return CustomerId;
	}
	public void setCustomerId(int customerId) {
		CustomerId = customerId;
	}

	
}


