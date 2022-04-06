package com.groupd.assignment5.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.groupd.assignment5.beans.Booking;
import com.groupd.assignment5.dao.BookingDaoD;

/**
 * Date: 05.04.2022 Group D Member1: Manpreet kaur Member2: Manpreet Kaur
 * Member3: Bhumikaben Manubhai Patel Member4: Ashikkumar Nareshbhai Patel
 * Member5: Hardeep Kaur Chahal
 * 
 * This controller is used to handle post and get methods for creating, updating
 *  reservation details by the visitor, staff and admin
 *  The Admin, staff and the visitor all three have different privilleges. 
 *  Admin can add staff, edit staff, add bookings, modify bookings and view the existing bookings
 */
@Controller
public class BookingController {
	@Autowired
	BookingDaoD bookingdao;// will inject dao from xml file

	/*
	 * It displays a form to input data, here "command" is a reserved request
	 * attribute which is used to display object data into form
	 */
	@RequestMapping("/addbooking")
	public String showform(Model m) {
		m.addAttribute("command", new Booking());
		return "booking";
	}

	/*
	 * It saves object into database. The @ModelAttribute puts request data into
	 * model object. You need to mention RequestMethod.POST method because default
	 * request is GET
	 */
	@RequestMapping(value = "/savebooking", method = RequestMethod.POST)
	public String save(@ModelAttribute("booking") Booking booking, HttpSession session) {
		booking.setCustomerId((int) session.getAttribute("id"));
		bookingdao.AddBooking(booking);

		String type = (String) session.getAttribute("type");
		if (type.equals("visitor")) {
			return "homeuser";
		} else if (type.equals("staff")) {
			return "homestaff";
		} else {
			return "homeadmin";
		}
	}

	/* It provides list of booking in model object for admin and staff */
	@RequestMapping("/viewbooking")
	public String viewbook(Model m, @ModelAttribute("bookings") Booking booking) {
		m.addAttribute("bookings", bookingdao.getBooking());
		return "viewbooking";
	}

	/* It provides list of bookings in model object for the visitor */
	@RequestMapping("/viewbooking_user")
	public String viewbook_user(Model m, @ModelAttribute("bookings") Booking booking, HttpSession session) {
		m.addAttribute("bookings", bookingdao.getBookingForUser((int) session.getAttribute("id")));
		return "viewbooking";
	}

	/*
	 * It displays object data into form for the given id. The @PathVariable puts
	 * URL data into variable.
	 */
	@RequestMapping(value = "/editbooking/{id}")
	public String edit(@PathVariable int id, Model m) {
		Booking booking = bookingdao.getBookingById(id);
		System.out.println(booking.toString());
		System.out.println();
		m.addAttribute("command", booking);
		return "bookingedit";
	}

	/* It updates model object for admin and staff only. */
	@RequestMapping(value = "/editsavebooking", method = RequestMethod.POST)
	public String editsave(@ModelAttribute("booking") Booking booking) {
		bookingdao.UpdateBooking(booking);
		return "redirect:/viewbooking";
	}

}
