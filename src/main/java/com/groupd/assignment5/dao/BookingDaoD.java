package com.groupd.assignment5.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import com.groupd.assignment5.beans.Booking;

/**
 * Date: 05.04.2022 Group D Member1: Manpreet kaur Member2: Manpreet Kaur
 * Member3: Bhumikaben Manubhai Patel Member4: Ashikkumar Nareshbhai Patel
 * Member5: Hardeep Kaur Chahal 
 * This class is having methods to insert the new reservation, update the reservation details
 */

public class BookingDaoD {

	JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public int AddBooking(Booking p) {
		// This method is inserting the records into the reservation table
		String sql = "insert into reservation (Customer_Id, Checkin_date, Checkout_date, Status, Number_of_guests, Reservation_date, Room_Number) values("
				+ p.getCustomerId() + ",'" + p.getCheckinDate() + "','" + p.getCheckoutDate() + "','" + p.getStatus()
				+ "'," + p.getNumberofGuests() + ", SYSDATE()," + p.getRoomNumber() + ")";
		return template.update(sql);
	}

	public int UpdateBooking(Booking p) { // This method updates the reservation table
		String sql = "update reservation set Checkin_date = '" + p.getCheckinDate() + "', Checkout_date='"
				+ p.getCheckoutDate() + "', Number_of_guests=" + p.getNumberofGuests() + ", room_number = "
				+ p.getRoomNumber() + " where Reservation_Number=" + p.getReservationNumber() + "";
		System.out.println(sql);
		return template.update(sql);
	}

	@SuppressWarnings("deprecation")
	public Booking getBookingById(int id) { // This method displays the reservation details
		String sql = "select * from reservation where Reservation_Number=?";
		return template.query(sql, new Object[] { id }, new RowMapper<Booking>() {
			public Booking mapRow(ResultSet rs, int row) throws SQLException {
				Booking e = new Booking();
				e.setReservationNumber(rs.getInt(1));
				e.setCustomerId(rs.getInt(2));
				e.setCheckinDate(rs.getString(3));
				e.setCheckoutDate(rs.getString(4));
				e.setStatus(rs.getString(5));
				e.setNumberofGuests(rs.getInt(6));
				e.setReservationDate(rs.getDate(7));
				e.setRoomNumber(rs.getInt(8));
				return e;
			}
		}).get(0);
	}

	public List<Booking> getBooking() { // This method displays reservation details
		return template.query("select * from reservation", new RowMapper<Booking>() {
			public Booking mapRow(ResultSet rs, int row) throws SQLException {
				Booking e = new Booking();
				e.setReservationNumber(rs.getInt(1));
				e.setCustomerId(rs.getInt(2));
				e.setCheckinDate(rs.getString(3));
				e.setCheckoutDate(rs.getString(4));
				e.setStatus(rs.getString(5));
				e.setNumberofGuests(rs.getInt(6));
				e.setReservationDate(rs.getDate(7));
				e.setRoomNumber(rs.getInt(8));
				return e;
			}
		});
	}
	
	public List<Booking> getBookingForUser(int customer_id) { // This method displays the reservation details
		return template.query("select * from reservation where customer_id = " + customer_id, new RowMapper<Booking>() {
			public Booking mapRow(ResultSet rs, int row) throws SQLException {
				Booking e = new Booking();
				e.setReservationNumber(rs.getInt(1));
				e.setCustomerId(rs.getInt(2));
				e.setCheckinDate(rs.getString(3));
				e.setCheckoutDate(rs.getString(4));
				e.setStatus(rs.getString(5));
				e.setNumberofGuests(rs.getInt(6));
				e.setReservationDate(rs.getDate(7));
				e.setRoomNumber(rs.getInt(8));
				return e;
			}
		});
	}
}
