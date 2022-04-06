package com.groupd.assignment5.beans;

import java.sql.Date;

/**
 * Date: 05.04.2022 Group D Member1: Manpreet kaur Member2: Manpreet Kaur
 * Member3: Bhumikaben Manubhai Patel Member4: Ashikkumar Nareshbhai Patel
 * Member5: Hardeep Kaur Chahal bean class for Book table
 */

//model class for booking
public class Booking {

	private int customerId;
	private int reservationNumber;
	private String checkinDate;
	private String checkoutDate;
	private String status;
	private int numberofGuests;
	private Date reservationDate;
	private int roomNumber;

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getReservationNumber() {
		return reservationNumber;
	}

	public void setReservationNumber(int reservationNumber) {
		this.reservationNumber = reservationNumber;
	}

	public String getCheckinDate() {
		return checkinDate;
	}

	public void setCheckinDate(String checkinDate) {
		this.checkinDate = checkinDate;
	}

	public String getCheckoutDate() {
		return checkoutDate;
	}

	public void setCheckoutDate(String checkoutDate) {
		this.checkoutDate = checkoutDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getNumberofGuests() {
		return numberofGuests;
	}

	public void setNumberofGuests(int numberofGuests) {
		this.numberofGuests = numberofGuests;
	}

	public Date getReservationDate() {
		return reservationDate;
	}

	public void setReservationDate(Date reservationDate) {
		this.reservationDate = reservationDate;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	@Override
	public String toString() {
		return "Booking [customerId=" + customerId + ", reservationNumber=" + reservationNumber + ", checkinDate="
				+ checkinDate + ", checkoutDate=" + checkoutDate + ", status=" + status + ", numberofGuests="
				+ numberofGuests + ", reservationDate=" + reservationDate + ", roomNumber=" + roomNumber + "]";
	}

}
